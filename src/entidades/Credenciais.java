package entidades;

public class Credenciais {
    private String idUsuario;
    private String email;
    private String senha;

    public Credenciais(String idUsuario, String email, String senha){
        this.idUsuario = idUsuario;
        this.senha = senha;
        this.email = email;

    }

    public boolean validarSenha(String senhaTentada){
        return this.senha.equals(senhaTentada);
    }

    public String getIdUsuario() {
        return this.idUsuario;
    }
    public String getSenha(){
        return this.senha;
    }

    public String getEmail() {
        return email;
    }
}
