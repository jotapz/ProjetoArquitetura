package entidades;

import interfaces.IAutenticacao;
import interfaces.IBancoCredenciais;
import interfaces.IRepositorioUsuario;

import java.util.List;
import java.util.UUID;

public class ServicoAutenticacao implements IAutenticacao {

    private final IBancoCredenciais bancoCredenciais;
    private final IRepositorioUsuario repositorioUsuario;

    public ServicoAutenticacao(IBancoCredenciais bancoCredenciais,
                               IRepositorioUsuario repositorioUsuario) {
        this.bancoCredenciais = bancoCredenciais;
        this.repositorioUsuario = repositorioUsuario;
    }

    @Override
    public boolean registrar(String nome, String email, String senha) {
        if (bancoCredenciais.existeEmail(email) || repositorioUsuario.existeEmail(email)) {
            return false;
        }

        Usuario usuario = new Usuario(UUID.randomUUID().toString(), nome, email);
        repositorioUsuario.salvar(usuario);

        Credenciais cred = new Credenciais(usuario.getId(), email, senha);
        bancoCredenciais.salvar(cred);

        return true;
    }

    @Override
    public boolean logar(Usuario user, Credenciais senha) {
        if (user == null || senha == null) return false;

        List<Credenciais> lista = bancoCredenciais.buscarEmail(user.getEmail());
        if (lista == null || lista.isEmpty()) return false;

        for (Credenciais c : lista) {
            if (c.getEmail().equals(user.getEmail()) && c.validarSenha(senha.getSenha())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deslogar() {
        return true;
    }
}