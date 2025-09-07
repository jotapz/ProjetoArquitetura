package entidades;

public class Playlist {
    private String nome;
    private List<Musica> musicas;
    
    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }
    
    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }
    
    public void removerMusica(Musica musica) {
        musicas.remove(musica);
    }
    
    public List<Musica> getMusicas() {
        return new ArrayList<>(musicas);
    }
    
    public String getNome() { return nome; }
}