package interfaces;

import entidades.Credenciais;
import entidades.Usuario;

public interface IAutenticacao {
    boolean registrar(String nome, String email, String senha);
    boolean logar(Usuario usuario, Credenciais senha);
    boolean deslogar();
}
