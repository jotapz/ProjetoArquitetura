package interfaces;

import entidades.Musica;
import java.util.List;

public interface ITocavel {
    void tocar();
    void pausar();
    void parar();
    String getTitulo();
    double getDuracao();

}
