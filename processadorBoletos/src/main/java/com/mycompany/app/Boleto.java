package com.mycompany.app;

import java.time.LocalDate;

public class Boleto {

    private String codigo;
    private LocalDate data;
    Double valor;

    public Boleto(String codigo, LocalDate data, Double valor) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
    }

}
