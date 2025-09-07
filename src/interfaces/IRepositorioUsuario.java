package interfaces;

import entidades.Usuario;
import java.util.List;

public interface IRepositorioUsuario {
    Usuario buscarPorId(String id);
    Usuario buscarPorEmail(String email);
    void salvar(Usuario usuario);
    boolean existeEmail(String email);
    List<Usuario> listarTodos();
}