package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1- Llençar daus");
        System.out.println("2- Finalitzar partida");
        System.out.println("Tria:");
        int opcion = teclado.nextInt();
        JocDeDaus partida = new JocDeDaus();
        while (opcion==1) {
            if (opcion == 1) {
                partida.jugar();
            }
            else if (opcion == 2) {
                System.out.println("Has sortit del Joc");
            }
            opcion = teclado.nextInt();
        }
    }
}
