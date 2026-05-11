package model;

import jata.time.LocalDateTime;

public class Show extends Experiencia {

    private String artistaPrincipal;

    public Show(String titulo, String descricao, LocalDateTime dataHora, int capacidade, double precoBase, String artistaPrincipal) {
        super(titulo, descricao, dataHora, capacidade, precoBase);
        this.artistaPrincipal = artistaPrincipal;
    }

    public String getArtistaPrincipal() {
        return artistaPrincipal;
    }

    @Override
    public String gerarResumo() {
        return "Show: " + getTitulo() + " - Artista Principal: " + artistaPrincipal + " - Data/Hora: " + getDataHoraFormatada();
    }
}