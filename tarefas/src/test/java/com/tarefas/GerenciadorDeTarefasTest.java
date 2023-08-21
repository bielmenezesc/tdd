package com.tarefas;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GerenciadorDeTarefasTest {

    private GerenciadorDeTarefas gerenciador;

    @BeforeEach
    public void setup() {
        this.gerenciador = new GerenciadorDeTarefas();
    }

    @Test
    public void listarTarefas_Vazio() {
        assertTrue(gerenciador.listarTarefas().size() == 0);
    }
}
