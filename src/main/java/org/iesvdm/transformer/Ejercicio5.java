package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static <T> void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        applyTransformList(sc);
        sc.close();
    }

    private static <T> void applyTransformList(Scanner sc) {
        System.out.println("\nElige que tipo de dato quieres introducir: \n1. Cadena \n2. Entero");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("\nIntroduce una cadena: ");
                String cadena = sc.next();
                LispList<T> aux = LispList.empty();
                aux = aux.cons((T) cadena);
                System.out.println("\nLispList: " + aux);
                System.out.println("\n1. Introducir Cadena\n2. Salir");
                int opt = sc.nextInt();
                for (int i = 0; opt == 1; i++) {
                    System.out.println("\nIntroduce una cadena: ");
                    cadena = sc.next();
                    aux = aux.cons((T) cadena);
                    System.out.println("\nLispList: " + aux);
                    System.out.println("\n1. Introducir Cadena\n2. Salir");
                    opt = sc.nextInt();
                }
                Transformer<T> prueba = new Transformer<>() {
                    @Override
                    public T transform(T obj) {
                        T a = (T) obj;
                        return (T) ((obj)+" hola");
                    }
                };
                ArrayList<T> a = Transformers.transformList((Transformer<T>) prueba, aux);
                System.out.println("ArrayList Modificado: " + a);
                break;
            case 2:
                System.out.println("Introduce un número: ");
                Integer numero = sc.nextInt();
                LispList<T> aux2 = LispList.empty();
                aux2 = aux2.cons((T) numero);
                System.out.println("\nLispList: " + aux2);
                System.out.println("\n1. Introducir Entero\n2. Salir");
                int opt2 = sc.nextInt();
                for (int i = 0; opt2 == 1; i++) {
                    System.out.println("\nIntroduce un número: ");
                    numero = sc.nextInt();
                    aux2 = aux2.cons((T) numero);
                    System.out.println("\nLispList: " + aux2);
                    System.out.println("\n1. Introducir Entero\n2. Salir");
                    opt2 = sc.nextInt();
                }
                Transformer<Integer> prueba2 = new Transformer<>() {
                    @Override
                    public Integer transform(Integer obj) {
                        T a = (T) obj;
                        return (Integer) (obj)*3; // Aquí indicar el valor para la transformación;
                    }
                };
                ArrayList<T> b = Transformers.transformList((Transformer<T>) prueba2, aux2);
                System.out.println("ArrayList Modificado: " + b);
                break;
        }

    }

}
