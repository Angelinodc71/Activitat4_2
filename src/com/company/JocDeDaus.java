package com.company;

public class JocDeDaus {
    Dau dau1;
    Dau dau2;
    Dau dau3;
    int victorias = 0;

    public JocDeDaus() {
        dau1 = new Dau();
        dau2 = new Dau();
        dau3 = new Dau();
    }

    public void jugar() {
        System.out.println("JocDeDaus{");
        dau1.tirar();
        dau1.getValor();
        dau1.imprimir();

        System.out.print(", ");

        dau2.tirar();
        dau2.getValor();
        dau2.imprimir();

        System.out.print(", ");

        dau3.tirar();
        dau3.getValor();
        dau3.imprimir();

        System.out.print("]}");

        if (dau1.getValor() == dau2.getValor() && dau2.getValor() == dau3.getValor()) {
            victorias++;
            System.out.println();
            System.out.println("El numero de victorias es: "+victorias);
        }
    }
}
