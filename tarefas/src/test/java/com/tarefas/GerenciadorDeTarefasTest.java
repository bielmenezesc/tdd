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

    @Test
    public void removerTarefa() {
        Tarefa tarefa1 = new Tarefa("Titulo1", "Descricao1", LocalDate.parse("2001-01-01"), PrioridadeTarefa.ALTA);
        Tarefa tarefa2 = new Tarefa("Titulo2", "Descricao2", LocalDate.parse("2002-02-02"), PrioridadeTarefa.MEDIA);
        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);
        gerenciador.removerTarefa(tarefa1.getTitulo());

        Tarefa tarefaRestante = gerenciador.listarTarefas().get(0);
        assertEquals(1, gerenciador.listarTarefas().size());
        assertEquals(tarefa2.getTitulo(), tarefaRestante.getTitulo());
        assertEquals(tarefa2.getDescricao(), tarefaRestante.getDescricao());
        assertEquals(tarefa2.getDataDeVencimento(), tarefaRestante.getDataDeVencimento());
        assertEquals(tarefa2.getPrioridade(), tarefaRestante.getPrioridade());
    }

    @Test
    public void listarTarefasOrdenadasPorDataDeVencimento() {
        Tarefa tarefa1 = new Tarefa("Titulo1", "Descricao1", LocalDate.parse("2011-11-11"), PrioridadeTarefa.ALTA);
        Tarefa tarefa2 = new Tarefa("Titulo2", "Descricao2", LocalDate.parse("2002-02-02"), PrioridadeTarefa.MEDIA);
        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);
        ArrayList<Tarefa> lista = gerenciador.listarTarefasOrdenadasPorDataDeVencimento();

        assertEquals(tarefa2.getTitulo(), lista.get(0).getTitulo());
        assertEquals(tarefa1.getTitulo(), lista.get(1).getTitulo());
    }

    @Test
    public void listarTarefasOrdenadasPorPrioridade() {
        Tarefa tarefa1 = new Tarefa("Titulo1", "Descricao1", LocalDate.parse("2011-11-11"), PrioridadeTarefa.ALTA);
        Tarefa tarefa2 = new Tarefa("Titulo2", "Descricao2", LocalDate.parse("2002-02-02"), PrioridadeTarefa.MEDIA);
        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);
        ArrayList<Tarefa> lista = gerenciador.listarTarefasOrdenadasPorPrioridade();

        assertEquals(tarefa1.getTitulo(), lista.get(0).getTitulo());
        assertEquals(tarefa2.getTitulo(), lista.get(1).getTitulo());
    }

    @Test
    public void listarTarefasOrdenadasPorDataDeVencimentoEPrioridade() {
        Tarefa tarefa1 = new Tarefa("Titulo1", "Descricao1", LocalDate.parse("2011-11-11"), PrioridadeTarefa.BAIXA);
        Tarefa tarefa2 = new Tarefa("Titulo2", "Descricao2", LocalDate.parse("2011-11-11"), PrioridadeTarefa.MEDIA);
        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);
        ArrayList<Tarefa> lista = gerenciador.listarTarefasOrdenadasPorDataDeVencimentoEPrioridade();

        assertEquals(tarefa2.getTitulo(), lista.get(0).getTitulo());
        assertEquals(tarefa1.getTitulo(), lista.get(1).getTitulo());
    }

    @Test
    public void listarTarefasOrdenadasPorDataDeVencimentoEPrioridade_DataNula() {
        Tarefa tarefa1 = new Tarefa("Titulo1", "Descricao1", null, PrioridadeTarefa.BAIXA);
        Tarefa tarefa2 = new Tarefa("Titulo2", "Descricao2", LocalDate.parse("2011-11-11"), PrioridadeTarefa.MEDIA);
        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);
        ArrayList<Tarefa> lista = gerenciador.listarTarefasOrdenadasPorDataDeVencimentoEPrioridade();

        assertEquals(tarefa2.getTitulo(), lista.get(0).getTitulo());
        assertEquals(tarefa1.getTitulo(), lista.get(1).getTitulo());
    }
}
