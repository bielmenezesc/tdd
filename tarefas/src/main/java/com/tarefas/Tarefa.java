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

    public Tarefa(String titulo, String descricao, LocalDate dataDeVencimento, PrioridadeTarefa prioridade) {
        this.titulo = titulo;
        this.descricao = descricao ;
        this.dataDeVencimento = dataDeVencimento;
        this.prioridade = prioridade;
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public void setPrioridade(PrioridadeTarefa prioridade) {
        this.prioridade = prioridade;
    }

}
