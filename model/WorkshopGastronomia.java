package model;

import java.time.LocalDateTime;

public class WorkshopGastronomia extends Experiencia {
    
    private String materiais;

    public WorkshopGastronomia(String titulo, String descricao, LocalDateTime dataHora, int capacidade, double precoBase, String materiais) {
        super(titulo, descricao, dataHora, capacidade, precoBase);
        this.materiais = materiais;
    }

    public String getMateriais() {
        return materiais;
    }

    @Override
    public String gerarResumo() {
        return "Workshop de Gastronomia: " + getTitulo() + " - Materiais: " + this.materiais + " - Data/Hora: " + getDataHoraFormatada();
    }
}