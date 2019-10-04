package com.company;

import java.util.Random;

public class Dau {
    Random numRandom;
    int valor;

    Dau() {
        numRandom = new Random();
    }

    void tirar() {
        valor = numRandom.nextInt(6)+1;
    }
    void imprimir () {
        System.out.print("dau=[Dau{valor="+getValor()+"}");
    }

    int getValor () {
        return valor;
    }
}
