package entidades;


import java.util.UUID;

public class Usuario {
    private String id;
    private String nome;
    private String email;

    public Usuario(String nome, String senha) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
}
