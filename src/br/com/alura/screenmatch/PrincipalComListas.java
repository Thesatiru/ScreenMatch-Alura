package br.com.alura.screenmatch;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Clube da luta",1999);
        meuFilme.avalia(9);
        Serie breakingBad = new Serie("Breaking Bad",2008);
        breakingBad.avalia(7);
        Filme outroFilme = new Filme("John wiki",2013);
        outroFilme.avalia(10);
        Filme filme3 = new Filme("Escape room",2020);
        filme3.avalia(2);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filme3);
        lista.add(breakingBad);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
                System.out.println("Classificação: "+filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorAartistas = new ArrayList<>();
        buscaPorAartistas.add("Ryan Reinold");
        buscaPorAartistas.add("The Rock");
        buscaPorAartistas.add("Adam Sandler");

        System.out.println(buscaPorAartistas);
        Collections.sort(buscaPorAartistas);
        System.out.println(buscaPorAartistas);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);
    }
}
