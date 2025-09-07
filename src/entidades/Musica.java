package entidades;

public class Musica implements Tocavel {
    private String titulo;
    private double duracao;

    public Musica(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    @Override
    public void tocar() {
        System.out.println("▶ Tocando música: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("⏸ Pausando música: " + titulo);
    }

    @Override
    public void parar() {
        System.out.println("⏹ Parando música: " + titulo);
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public double getDuracao() {
        return duracao;
    }
}
