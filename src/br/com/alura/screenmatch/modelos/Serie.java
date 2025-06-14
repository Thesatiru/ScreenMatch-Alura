package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }
    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada=episodiosPorTemporada;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio){
        this.minutosPorEpisodio=minutosPorEpisodio;
    }
    public int getTemporadas() {
        return temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    @Override
    public int getDuracaoEmMinuto() {
        return temporadas*episodiosPorTemporada*minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "O nome da série é: "+getNome()+"("+getAnoDeLancamento()+")";
    }
}
