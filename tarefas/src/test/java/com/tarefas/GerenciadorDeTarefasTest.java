package com.tarefas;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
