import br.com.alura.screenmatch.Calculos.CalculadoraDoTempo;
import br.com.alura.screenmatch.Calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Clube da luta",1999);
        meuFilme.setDuracaoEmMinuto(200);
        System.out.println(meuFilme.getNome());
        //System.out.println(meuFilme.somaDasAvaliacoes);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliaçoes: "+ meuFilme.getTotalDeAvaliacoes());
        //System.out.println(meuFilme.somaDasAvaliacoes);
        //System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.printf("A média das notas é %.1f", meuFilme.pegaMedia());

        Serie breakingBad = new Serie("Breaking Bad",2008);
        breakingBad.exibeFichaTecnica();
        breakingBad.setTemporadas(5);
        breakingBad.setEpisodiosPorTemporada(12);
        breakingBad.setMinutosPorEpisodio(50);
        System.out.println("Duração da série: "+breakingBad.getDuracaoEmMinuto()+" minutos");

        Filme outroFilme = new Filme("John wiki",2013);
        outroFilme.setDuracaoEmMinuto(170);

        CalculadoraDoTempo calculadora = new CalculadoraDoTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(breakingBad);

        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro1 = new FiltroDeRecomendacao();
        filtro1.filtra(meuFilme);
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(breakingBad);
        episodio.setTotalVisualizacoes(1000);
        filtro1.filtra(episodio);

        Filme filme3 = new Filme("Escape room",2020);
        filme3.setDuracaoEmMinuto(200);
        filme3.avalia(8);

        ArrayList<Filme> listaDefilmes = new ArrayList<>();
        listaDefilmes.add(meuFilme);
        listaDefilmes.add(filme3);
        listaDefilmes.add(outroFilme);
        System.out.println("Tamanho da lista "+listaDefilmes.size());
        System.out.println("Primeiro filme "+listaDefilmes.get(1).getNome());
        System.out.println(listaDefilmes);
        System.out.println("ToString da lista de filmes: "+listaDefilmes.get(0).toString());
    }
}
