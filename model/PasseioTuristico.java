package model;

import java.time.LocalDateTime;

public class PasseioTuristico extends Experiencia {
    
    private String pontoEncontro;
    private String guia;

    public PasseioTuristico(String titulo, String descricao, LocalDateTime dataHora, int capacidade, double precoBase, String pontoEncontro, String guia) {
        super(titulo, descricao, dataHora, capacidade, precoBase);
        this.pontoEncontro = pontoEncontro;
        this.guia = guia;
    }

    public String getPontoEncontro() {
        return pontoEncontro;
    }

    public String getGuia() {
        return guia;
    }

    @Override
    public String gerarResumo() {
    return "Passeio Turístico: " + getTitulo() + " - Guia: " + this.guia + " - Encontro: " + this.pontoEncontro + " - Data/Hora: " + getDataHoraFormatada();
    }
}