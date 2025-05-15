package br.com.alura.screenmatch.Calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDoTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal+= f.getDuracaoEmMinuto();
//    }
//    public void inclui(Serie s){
//        tempoTotal+= s.getDuracaoEmMinuto();
//    }

    public void inclui(Titulo titulo){
        this.tempoTotal+= titulo.getDuracaoEmMinuto();

    }
}
