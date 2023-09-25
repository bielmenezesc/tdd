package com.tarefas.junit5Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.tarefas.GerenciadorDeTarefas;
import com.tarefas.PrioridadeTarefa;
import com.tarefas.Tarefa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParticoesEquivalentesTests {
    private GerenciadorDeTarefas gerenciador;

    @BeforeEach
    public void setup() {
        this.gerenciador = new GerenciadorDeTarefas();
    }

    @ParameterizedTest
    @MethodSource("testData")
    @DisplayName("Listar Tarefas Ordenadas")
    public void testListarTarefasOrdenadas(Tarefa tarefa1, Tarefa tarefa2, String expectedFirst,
            String expectedSecond) {
        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);
        ArrayList<Tarefa> lista = gerenciador.listarTarefasOrdenadas();

        assertEquals(expectedFirst, lista.get(0).getTitulo());
        assertEquals(expectedSecond, lista.get(1).getTitulo());
    }

    private static Collection<Object[]> testData() {
        Tarefa tarefa1 = new Tarefa("Titulo1", "Descricao1", LocalDate.parse("2022-02-02"), PrioridadeTarefa.BAIXA);
        Tarefa tarefa2 = new Tarefa("Titulo2", "Descricao2", LocalDate.parse("2022-02-03"), PrioridadeTarefa.ALTA);

        Tarefa tarefa3 = new Tarefa("Titulo1", "Descricao1", LocalDate.parse("2022-02-02"), PrioridadeTarefa.BAIXA);
        Tarefa tarefa4 = new Tarefa("Titulo2", "Descricao2", LocalDate.parse("2022-02-03"), PrioridadeTarefa.BAIXA);

        Tarefa tarefa5 = new Tarefa("Titulo1", "Descricao1", LocalDate.parse("2022-02-02"), PrioridadeTarefa.BAIXA);
        Tarefa tarefa6 = new Tarefa("Titulo2", "Descricao2", LocalDate.parse("2022-02-02"), PrioridadeTarefa.ALTA);

        Tarefa tarefa7 = new Tarefa("Titulo1", "Descricao1", LocalDate.parse("2022-02-02"), PrioridadeTarefa.BAIXA);
        Tarefa tarefa8 = new Tarefa("Titulo2", "Descricao2", LocalDate.parse("2022-02-02"), PrioridadeTarefa.BAIXA);

        return Arrays.asList(
                new Object[] { tarefa1, tarefa2, "Titulo1", "Titulo2" },
                new Object[] { tarefa3, tarefa4, "Titulo1", "Titulo2" },
                new Object[] { tarefa5, tarefa6, "Titulo2", "Titulo1" },
                new Object[] { tarefa7, tarefa8, "Titulo1", "Titulo2" });
    }
}
