package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private boolean ativa;
    private int episodioPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEspisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEspisodioPorTemporada(int espisodioPorTemporada) {
        this.episodioPorTemporada = espisodioPorTemporada;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodio = minutosPorEpisodios;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodioPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
