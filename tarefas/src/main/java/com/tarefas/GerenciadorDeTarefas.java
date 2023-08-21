package com.tarefas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class GerenciadorDeTarefas {
    private HashMap<String, Tarefa> tarefas;

    public GerenciadorDeTarefas() {
        this.tarefas = new HashMap<String, Tarefa>();
    }

    public ArrayList<Tarefa> listarTarefas() {
        return new ArrayList<Tarefa>(this.tarefas.values());
    }

    public ArrayList<Tarefa> listarTarefasOrdenadasPorDataDeVencimento() {
        ArrayList<Tarefa> tarefasOrdenadas = listarTarefas();
        Collections.sort(tarefasOrdenadas, Comparator.comparing(Tarefa::getDataDeVencimento));
        return tarefasOrdenadas;
    }

    public ArrayList<Tarefa> listarTarefasOrdenadasPorPrioridade() {
        ArrayList<Tarefa> tarefasOrdenadas = listarTarefas();
        Collections.sort(tarefasOrdenadas, Comparator.comparing(Tarefa::getPrioridade));
        return tarefasOrdenadas;
    }

    public ArrayList<Tarefa> listarTarefasOrdenadasPorDataDeVencimentoEPrioridade() {
        ArrayList<Tarefa> tarefasOrdenadas = listarTarefas();
        Collections.sort(tarefasOrdenadas, new Comparator<Tarefa>() {
            @Override
            public int compare(Tarefa tarefa1, Tarefa tarefa2) {
                int comparaDatas = tarefa1.getDataDeVencimento().compareTo(tarefa2.getDataDeVencimento());
                if (comparaDatas != 0) {
                    return comparaDatas;
                }

                return tarefa1.getPrioridade().compareTo(tarefa2.getPrioridade());
            }
        });
        return tarefasOrdenadas;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.put(tarefa.getTitulo(), tarefa);
    }

    public void removerTarefa(String tituloTarefa) {
        this.tarefas.remove(tituloTarefa);
    }

    public Tarefa getTarefa(String tituloTarefa) {
        return this.tarefas.get(tituloTarefa);
    }

    public void atualizarTituloTarefa(String tituloTarefa, String novoTitulo) {
        Tarefa tarefa = getTarefa(tituloTarefa);
        removerTarefa(tituloTarefa);
        tarefa.setTitulo(novoTitulo);
        adicionarTarefa(tarefa);
    }

    public void atualizarDescricaoTarefa(String tituloTarefa, String novaDescricao) {
        Tarefa tarefa = getTarefa(tituloTarefa);
        tarefa.setDescricao(novaDescricao);
    }

    public void atualizarDataDeVencimentoTarefa(String tituloTarefa, LocalDate novaDataDeVencimento) {
        Tarefa tarefa = getTarefa(tituloTarefa);
        tarefa.setDataDeVencimento(novaDataDeVencimento);
    }

    public void atualizarPrioridadeTarefa(String tituloTarefa, PrioridadeTarefa novaPrioridade) {
        Tarefa tarefa = getTarefa(tituloTarefa);
        tarefa.setPrioridade(novaPrioridade);
    }
}
