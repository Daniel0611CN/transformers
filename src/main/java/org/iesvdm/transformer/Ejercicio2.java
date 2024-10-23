package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

    // Probamos las modificaciones realizadas en la clase Transformers;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        ArrayList<Integer> a = new ArrayList<>();
//        a.add(4);
//        a.add(5);
//        a.add(6);
//
//        Transformer<Integer> b = new Transformer<>() {
//            @Override
//            public Integer transform(Integer obj) {
//                return obj*2;
//            }
//        };


        ArrayList<String> b = new ArrayList<>();
        System.out.println("\nIntroduce una cadena: ");
        String cadena = sc.next();
        b.add(cadena);

        System.out.println("\n1. Introducir otra cadena\n2. Salir");
        int opt = sc.nextInt();

        for (int i = 0; opt == 1; i++) {
            System.out.println("\nIntroduce una cadena: ");
            cadena = sc.next();
            b.add(cadena);
            System.out.println("\n1. Introducir otra cadena\n2. Salir");
            opt = sc.nextInt();
        }

        Transformer<String> tran = new Transformer<>() {
            @Override
            public String transform(String obj) {
                return obj;
            }
        };

        ArrayList<String> array = Transformers.applyDest(tran, b);

//        ArrayList<Integer> arraytransformer = Transformers.applyDest(b, a);

        System.out.println("\nArray Transformado ...");
//        for (Integer i : arraytransformer) {
//            System.out.println(i);
//        }

        for (String i : array) {
            System.out.println(i);
        }

        sc.close();
    }
}
