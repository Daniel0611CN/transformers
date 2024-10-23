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
        int opcion, opt, opcionCadena;
        String cadena, elemento;

        System.out.println("\nElige que tipo de dato quieres introducir: \n1. Cadena \n2. Entero");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("\nIntroduce una cadena: ");
                cadena = sc.next();
                LispList<T> aux = LispList.empty();
                aux = aux.cons((T) cadena);
                System.out.println("\nLispList: " + aux);
                System.out.println("\n1. Introducir Cadena\n2. Salir");
                opt = sc.nextInt();
                for (int i = 0; opt == 1; i++) {
                    System.out.println("\nIntroduce una cadena: ");
                    cadena = sc.next();
                    aux = aux.cons((T) cadena);
                    System.out.println("\nLispList: " + aux);
                    System.out.println("\n1. Introducir Cadena\n2. Salir");
                    opt = sc.nextInt();
                }
                System.out.println("\nIntroduce en la posición donde quieres introducir la cadena: \n1. Delante ('Cadena' + Elemento Lista)\n2. Detrás (Elemento Lista + 'Cadena')");
                opcionCadena = sc.nextInt();
                System.out.println("\nIntroduce la cadena que quieras añadir a los elementos de la lista: ");
                elemento = sc.next();
                Transformer<String> transformer = new AddMessage(elemento, opcion);
                ArrayList<T> a = Transformers.transformList((Transformer<T>) transformer, aux);
                System.out.println("ArrayList Modificado: " + a);
                break;

            case 2:
                System.out.println("\nIntroduce un número: ");
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
                System.out.println("\nIntroduce la cadena que quieras añadir a los elementos de la lista: ");
                int elementoInt = sc.nextInt();
                System.out.println("\nIntroduce la operación que quieres realizar: \n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division");
                int operacion = sc.nextInt();
                Transformer<Integer> prueba2 = new Transformer<>() {
                    @Override
                    public Integer transform(Integer obj) {
                        T a = (T) obj;
                        switch (operacion) {
                            case 1:
                                return (Integer) (obj)+elementoInt;
                            case 2:
                                return (Integer) (obj)-elementoInt;
                            case 3:
                                return (Integer) (obj)*elementoInt;
                            case 4:
                                return (Integer) (obj)/elementoInt;
                        }
                        return (Integer) (obj); // Aquí indicar el valor para la transformación;
                    }
                };
                ArrayList<T> b = Transformers.transformList((Transformer<T>) prueba2, aux2);
                System.out.println("\nArrayList Modificado: " + b);
                break;
        }

    }

}
