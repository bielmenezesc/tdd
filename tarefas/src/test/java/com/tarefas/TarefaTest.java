package com.tarefas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TarefaTest {
    @Test
    public void novaTarefa() {
        Tarefa tarefa = new Tarefa("Titulo", "Descricao", LocalDate.parse("2023-09-09"), PrioridadeTarefa.ALTA);
        assertEquals("Titulo", tarefa.getTitulo());
        assertEquals("Descricao", tarefa.getDescricao());
        assertEquals(LocalDate.parse("2023-09-09"), tarefa.getDataDeVencimento());
        assertEquals(PrioridadeTarefa.ALTA, tarefa.getPrioridade());
    }
}
