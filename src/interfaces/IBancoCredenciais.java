package interfaces;

import entidades.Credenciais;

import java.util.List;

public interface IBancoCredenciais {
    List<Credenciais> buscarEmail(String email);
    void salvar(Credenciais credencial);
    boolean existeEmail(String email);
}
