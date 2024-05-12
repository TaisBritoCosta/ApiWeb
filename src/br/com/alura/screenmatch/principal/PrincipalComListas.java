package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 2023);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 1990);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("O pequeno principe", 2019);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação" + filme.getClassificacao());

            }


        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Tais");
        buscaPorArtista.add("Lais");
        buscaPorArtista.add("Jadson");
        buscaPorArtista.add("Lucas");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Buscando a lista com o método sort para ordenar alfabeticamente" + buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

    }
}
