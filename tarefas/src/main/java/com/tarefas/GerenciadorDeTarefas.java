package com.tarefas;

import java.util.ArrayList;
import java.util.HashMap;

public class GerenciadorDeTarefas {
    private HashMap<String, Tarefa> tarefas;

    public GerenciadorDeTarefas() {
        this.tarefas = new HashMap<String, Tarefa>();
    }

    public ArrayList<Tarefa> listarTarefas() {
        return new ArrayList<Tarefa>(this.tarefas.values());
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.put(tarefa.getTitulo(), tarefa);
    }

    public void removerTarefa(String tituloTarefa) {
        this.tarefas.remove(tituloTarefa);
    }

    public void atualizarTituloTarefa(String tituloTarefa, String novoTitulo) {
        Tarefa tarefa = this.tarefas.get(tituloTarefa);
        removerTarefa(tituloTarefa);
        tarefa.setTitulo(novoTitulo);
        adicionarTarefa(tarefa);
    }
}
