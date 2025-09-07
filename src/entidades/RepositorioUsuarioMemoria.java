package entidades;

import interfaces.IRepositorioUsuario;

import java.util.*;

public class RepositorioUsuarioMemoria implements IRepositorioUsuario {

    private final Map<String, Usuario> porId = new HashMap<>();
    private final Map<String, String> idPorEmail = new HashMap<>();

    @Override
    public Usuario buscarPorId(String id) {
        return porId.get(id);
    }

    @Override
    public Usuario buscarPorEmail(String email) {
        String id = idPorEmail.get(email);
        return id == null ? null : porId.get(id);
    }

    @Override
    public void salvar(Usuario usuario) {
        porId.put(usuario.getId(), usuario);
        idPorEmail.put(usuario.getEmail(), usuario.getId());
    }

    @Override
    public boolean existeEmail(String email) {
        return idPorEmail.containsKey(email);
    }

    @Override
    public List<Usuario> listarTodos() {
        return new ArrayList<>(porId.values());
    }
}