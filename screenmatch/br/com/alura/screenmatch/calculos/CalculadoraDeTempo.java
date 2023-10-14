package br.com.alura.screenmatch.calculos;
//import br.com.alura.screenmatch.modelo.Filme;
//import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal; //o mesmo que private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) { //sobrecarga, se for passado filme vai em um, se for serie vai na outra
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) { //chama a classe titulo porque já engloba filme e serie
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
