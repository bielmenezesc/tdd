package com.tarefas.functionalTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import com.tarefas.GerenciadorDeTarefas;
import com.tarefas.PrioridadeTarefa;
import com.tarefas.Tarefa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParticoesEquivalentesTests {
    private GerenciadorDeTarefas gerenciador;

    @BeforeEach
    public void setup() {
        this.gerenciador = new GerenciadorDeTarefas();
    }

    @Test
    public void datasDiferentesPrioridadesDiferentes() {
        Tarefa tarefa1 = new Tarefa("Titulo1", "Descricao1", LocalDate.parse("2022-02-02"), PrioridadeTarefa.BAIXA);
        Tarefa tarefa2 = new Tarefa("Titulo2", "Descricao2", LocalDate.parse("2022-02-03"), PrioridadeTarefa.ALTA);
        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);
        ArrayList<Tarefa> lista = gerenciador.listarTarefasOrdenadas();

        assertEquals(tarefa1.getTitulo(), lista.get(0).getTitulo());
        assertEquals(tarefa2.getTitulo(), lista.get(1).getTitulo());
    }

    @Test
    public void datasDiferentesPrioridadesIguais() {
        Tarefa tarefa1 = new Tarefa("Titulo1", "Descricao1", LocalDate.parse("2022-02-02"), PrioridadeTarefa.BAIXA);
        Tarefa tarefa2 = new Tarefa("Titulo2", "Descricao2", LocalDate.parse("2022-02-03"), PrioridadeTarefa.BAIXA);
        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);
        ArrayList<Tarefa> lista = gerenciador.listarTarefasOrdenadas();

        assertEquals(tarefa1.getTitulo(), lista.get(0).getTitulo());
        assertEquals(tarefa2.getTitulo(), lista.get(1).getTitulo());
    }

    @Test
    public void datasIguaisPrioridadesDiferentes() {
        Tarefa tarefa1 = new Tarefa("Titulo1", "Descricao1", LocalDate.parse("2022-02-02"), PrioridadeTarefa.BAIXA);
        Tarefa tarefa2 = new Tarefa("Titulo2", "Descricao2", LocalDate.parse("2022-02-02"), PrioridadeTarefa.ALTA);
        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);
        ArrayList<Tarefa> lista = gerenciador.listarTarefasOrdenadas();

        assertEquals(tarefa1.getTitulo(), lista.get(1).getTitulo());
        assertEquals(tarefa2.getTitulo(), lista.get(0).getTitulo());
    }

    @Test
    public void datasIguaisPrioridadesIguais() {
        Tarefa tarefa1 = new Tarefa("Titulo1", "Descricao1", LocalDate.parse("2022-02-02"), PrioridadeTarefa.BAIXA);
        Tarefa tarefa2 = new Tarefa("Titulo2", "Descricao2", LocalDate.parse("2022-02-02"), PrioridadeTarefa.BAIXA);
        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);
        ArrayList<Tarefa> lista = gerenciador.listarTarefasOrdenadas();

        assertEquals(tarefa1.getTitulo(), lista.get(0).getTitulo());
        assertEquals(tarefa2.getTitulo(), lista.get(1).getTitulo());
    }
}
