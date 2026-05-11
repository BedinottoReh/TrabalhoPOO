package model

import jata.time.LocalDateTime;
import jata.time.format.DateTimeFormatter;

public abstract class Experiencia {

    private String titulo;
    private String descricao;
    private LocalDateTime dataHora;
    private int capacidade;
    private double precoBase;

    public Experiencia(String titulo, String descricao, LocalDateTime dataHora, int capacidade, double precoBase) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.capacidade = capacidade;
        this.precoBase = precoBase;
    }

public abstract String gerarResumo();

public String getTitulo() {
    return titulo;
}

public String getDescricao() {
    return descricao;
}

public LocalDateTime getDataHora() {
    return dataHora;
}

public int getCapacidade() {
    return capacidade;
}

public double getPrecoBase() {
    return precoBase;
}

    public String getDataHoraFormatada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return dataHora.format(formatter);
    }

}