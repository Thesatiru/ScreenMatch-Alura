package br.com.alura.screenmatch.Calculos;

public class FiltroDeRecomendacao {
    private String recomendacao;

    public void filtra(Classificacao classificacao){
        if (classificacao.getClassificacao()>=4){
            System.out.println("Está entre os preferidos");
        } else if (classificacao.getClassificacao()>=2){
            System.out.println("Bem avaliado");
        } else {
            System.out.println("Coloque na sua lista para assistir depois!");
        }
    }
}
