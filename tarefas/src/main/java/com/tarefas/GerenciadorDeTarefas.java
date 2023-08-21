package com.tarefas;

import java.util.ArrayList;

public class GerenciadorDeTarefas {
    private ArrayList<Tarefa> tarefas;

    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public ArrayList<Tarefa> listarTarefas() {
        return tarefas;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }
}
