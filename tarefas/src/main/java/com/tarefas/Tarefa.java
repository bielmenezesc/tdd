package com.tarefas;

import java.time.LocalDate;

public class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataDeVencimento;
    private PrioridadeTarefa prioridade;

    public Tarefa() {
        this.titulo = "";
        this.descricao = "";
        this.dataDeVencimento = null;
        this.prioridade = PrioridadeTarefa.BAIXA;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public LocalDate getDataDeVencimento() {
        return this.dataDeVencimento;
    }

    public PrioridadeTarefa getPrioridade() {
        return this.prioridade;
    }
}
