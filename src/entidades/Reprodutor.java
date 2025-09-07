package entidades;

import java.util.List;
import interfaces.ITocavel;

public class Reprodutor {

    public void tocarItem(ITocavel item) {
        System.out.println("▶️ Iniciando reprodução...");
        List<Musica> musicasParaTocar = item.obterMusicas();
        for (Musica musica : musicasParaTocar) {
            System.out.println("Tocando agora: " + musica);
         
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("⏹️ Fim da reprodução.");
    }

    public void pausar() {
        System.out.println("⏸️ Reprodução pausada.");
    }

    public void parar() {
        System.out.println("⏹️ Reprodução parada.");
    }
}