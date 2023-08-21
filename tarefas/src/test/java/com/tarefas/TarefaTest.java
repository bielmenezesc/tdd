package com.tarefas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TarefaTest {
    @Test
    public void novaTarefa_Vazia() {
        Tarefa tarefa = new Tarefa();
        assertEquals("", tarefa.getTitulo());
        assertEquals("", tarefa.getDescricao());
        assertEquals(null, tarefa.getDataDeVencimento());
        assertEquals(PrioridadeTarefa.BAIXA, tarefa.getPrioridade());
    }
}
