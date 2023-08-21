package com.tarefas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GerenciadorDeTarefasTest {

    private GerenciadorDeTarefas gerenciador;

    @BeforeEach
    public void setup() {
        this.gerenciador = new GerenciadorDeTarefas();
    }

    @Test
    public void listarTarefas_TamanhoVazio() {
        assertEquals(0, gerenciador.listarTarefas().size());
    }

    @Test
    public void listarTarefas_ConteudoVazio() {
        assertEquals(new ArrayList<Tarefa>(), gerenciador.listarTarefas());
    }

    @Test
    public void listarTarefas_TamanhoNaoVazio() {
        gerenciador.adicionarTarefa(new Tarefa());
        assertEquals(1, gerenciador.listarTarefas().size());
    }

    @Test
    public void listarTarefas_ConteudoNaoVazio() {
        Tarefa tarefa = new Tarefa("Titulo", "Descricao", LocalDate.parse("2023-09-09"), PrioridadeTarefa.ALTA);
        gerenciador.adicionarTarefa(tarefa);
        Tarefa tarefaInserida = gerenciador.listarTarefas().get(0);

        assertEquals(tarefa.getTitulo(), tarefaInserida.getTitulo());
        assertEquals(tarefa.getDescricao(), tarefaInserida.getDescricao());
        assertEquals(tarefa.getDataDeVencimento(), tarefaInserida.getDataDeVencimento());
        assertEquals(tarefa.getPrioridade(), tarefaInserida.getPrioridade());
    }

    @Test
    public void atualizarTituloTarefa() {
        Tarefa tarefa = new Tarefa("Titulo", "Descricao", LocalDate.parse("2023-09-09"), PrioridadeTarefa.ALTA);
        gerenciador.adicionarTarefa(tarefa);
        gerenciador.atualizarTituloTarefa("Titulo", "NovoTitulo");
        assertEquals("NovoTitulo", gerenciador.listarTarefas().get(0).getTitulo());
    }

    @Test
    public void atualizarDescricaoTarefa() {
        Tarefa tarefa = new Tarefa("Titulo", "Descricao", LocalDate.parse("2023-09-09"), PrioridadeTarefa.ALTA);
        gerenciador.adicionarTarefa(tarefa);
        gerenciador.atualizarDescricaoTarefa("Titulo", "NovaDescricao");
        assertEquals("NovaDescricao", gerenciador.listarTarefas().get(0).getDescricao());
    }

    @Test
    public void atualizarDataDeVencimentoTarefa() {
        Tarefa tarefa = new Tarefa("Titulo", "Descricao", LocalDate.parse("2023-09-09"), PrioridadeTarefa.ALTA);
        LocalDate novaData = LocalDate.parse("2023-11-11");
        gerenciador.adicionarTarefa(tarefa);
        gerenciador.atualizarDataDeVencimentoTarefa("Titulo", novaData);
        assertEquals(novaData, gerenciador.listarTarefas().get(0).getDataDeVencimento());
    }

    @Test
    public void atualizarPrioridadeTarefa() {
        Tarefa tarefa = new Tarefa("Titulo", "Descricao", LocalDate.parse("2023-09-09"), PrioridadeTarefa.ALTA);
        gerenciador.adicionarTarefa(tarefa);
        gerenciador.atualizarPrioridadeTarefa("Titulo", PrioridadeTarefa.MEDIA);
        assertEquals(PrioridadeTarefa.MEDIA, gerenciador.listarTarefas().get(0).getPrioridade());
    }
}
