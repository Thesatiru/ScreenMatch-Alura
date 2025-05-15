package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.Calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String diretor;


    public  Filme(String nome, int anoDeLancamento){
        super(nome,anoDeLancamento);
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public String getDiretor(){
        return diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)pegaMedia()/2;
    }

    @Override
    public String toString() {
        return "O nome do filme é: "+getNome()+" ("+getAnoDeLancamento()+")";
    }
}
