package entidades;

import interfaces.IAutenticacao;
import interfaces.IBancoCredenciais;

import java.util.List;
import java.util.UUID;

public class ServicoAutenticacao implements IAutenticacao {
    private IBancoCredenciais bancoCredenciais;


    public ServicoAutenticacao(IBancoCredenciais bancoCredenciais){
        this.bancoCredenciais = bancoCredenciais;
    }

    @Override
    public boolean registrar(String nome, String email, String senha){
        if (bancoCredenciais.existeEmail(email)){
            return false;
        }

        Credenciais crend = new Credenciais(
                UUID.randomUUID().toString(),
                email,
                senha
        );



        return false;


    }

    @Override
    public boolean logar(Usuario user, Credenciais senha){
        List<Credenciais> buscar = bancoCre
        for (Credenciais c: credenciais){
            if (c.getEmail().equals(user.getEmail())
                    &&
                    c.validarSenha(senha.getSenha())){
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean deslogar(){
        return false;
    }
}
