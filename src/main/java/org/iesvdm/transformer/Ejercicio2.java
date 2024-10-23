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

        AddMessage ad1 = null;

        for (int i = 0; opt == 1; i++) {
            System.out.println("\nIntroduce una cadena: ");
            cadena = sc.next();
            b.add(cadena);
            System.out.println("\n1. Introducir otra cadena\n2. Salir");
            opt = sc.nextInt();
        }

        System.out.println("\nElige donde introducir la cadena: \n1. Delante\n2. Detrás");
        int op = sc.nextInt();

        System.out.println("\nIntroduce el elemento que quieres añadir a cada posicion de la lista: ");
        String cadenaImplementada = sc.next();
        ad1 = new AddMessage(cadenaImplementada, op);
        ArrayList<String> array = Transformers.applyDest(ad1, b);

//        ArrayList<Integer> arraytransformer = Transformers.applyDest(b, a);

        System.out.println("\nArray Transformado ...");
//        for (Integer i : arraytransformer) {
//            System.out.println(i);
//        }

        System.out.println(array);

        sc.close();
    }
}
