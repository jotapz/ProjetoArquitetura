package entidades;

public class Album {
    private String nome;
    private Date dataLancamento;
    private Artista artista;
    private List<Musica> musicas;
    
    public Album(String nome, Date dataLancamento, Artista artista) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.artista = artista;
        this.musicas = new ArrayList<>();
    }
    
    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }
    
    public List<Musica> getMusicas() {
        return new ArrayList<>(musicas);
    }
    
    public String getNome() { return nome; }
    public Date getDataLancamento() { return dataLancamento; }
    public Artista getArtista() { return artista; }
}

