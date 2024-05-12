package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 2023);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 1990);
        outroFilme.setDuracaoEmMinutos(200);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());



        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        double media = meuFilme.pegaMedia();
        System.out.println(media); //faz a mesma coisa que o trecho da linha abaixo:
        //System.out.println(meuFilme.pegaMedia());


        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEspisodioPorTemporada(10);
        lost.setMinutosPorEpisodios(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());


        CalculadoraTempo calculadoraSomaTotal = new CalculadoraTempo();
        calculadoraSomaTotal.inclui(meuFilme);
        calculadoraSomaTotal.inclui(outroFilme);
        calculadoraSomaTotal.inclui(lost);
        System.out.println(calculadoraSomaTotal.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("O pequeno principe", 2019);
        //filmeDoPaulo.setNome("O pequeno Principe"); a linha acima substitui essa
        filmeDoPaulo.setDuracaoEmMinutos(100);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        //var listaFilmes = new ArrayList<>(); PODE SER ASSIM TAMBÉM. VEMOS MAIS ASSIM NO TRABALHO
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());


    }

}

