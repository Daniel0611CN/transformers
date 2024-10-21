package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();


        System.out.println("\nIntroduce una opción: \n1. Introducir Número\n2. Salir");
        int opt = sc.nextInt();

        while (opt == 1) {
            System.out.println("\nIntroduce un numero: ");
            int num1 = sc.nextInt();
            t1.add(num1);
            System.out.println("Lista 1: " + t1);
            System.out.println("\nIntroduce una opción: \n1. Introducir Número\n2. Salir");
            opt = sc.nextInt();
        }

        System.out.println("\nIntroduce una opción: \n1. Introducir Número\n2. Salir");
        int opt2 = sc.nextInt();

        while (opt2 == 1) {
            System.out.println("\nIntroduce un numero: ");
            int num2 = sc.nextInt();
            t2.add(num2);
            System.out.println("Lista 2: " + t2);
            System.out.println("\nIntroduce una opción: \n1. Introducir Número\n2. Salir");
            opt2 = sc.nextInt();
        }

        List<Integer> result;

        Joiner<Integer> adder = new JoinByAdding();
        result = Joiners.zipArrayLists(adder,t1,t2);

        // Lo unico que deberia ser que ambos arrays tengan la misma longitud;
        // Implementar programa más tarde;

        System.out.println("Resultado: " + result);
        sc.close();
    }

}
