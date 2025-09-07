package entidades;

public class Artista {
    private String nome;
    private List<Album> discografia;
    
    public Artista(String nome) {
        this.nome = nome;
        this.discografia = new ArrayList<>();
    }
    
    public void adicionarAlbum(Album album) {
        discografia.add(album);
    }
    
    public List<Album> getDiscografia() {
        return new ArrayList<>(discografia); 
    }
}
