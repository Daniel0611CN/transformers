package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();

        // PRUEBA 1 ----------------------------------------

        System.out.println("\n¿Cuantos números quieres introducir?");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Introduce un número: ");
            array.add(sc.nextInt());
        }

        Transformer<Integer> transformers = new Transformer<>() {
            @Override
            public Integer transform(Integer obj) {
                return obj*2; // Multiplicamos cada uno de los elementos del array por 2;
            }
        };

        ArrayList<Integer> arrayTransformado = Transformers.applyConst(transformers, array);

        System.out.println("\nImprimiendo Array Transformado ...");
        StringBuilder arrayTransformadoString = new StringBuilder();

        for (Integer i : arrayTransformado) {
            arrayTransformadoString.append(i);

            if (!i.equals(arrayTransformado.getLast())) {
                arrayTransformadoString.append(", ");
            }
        }

        System.out.println(arrayTransformadoString);

        // ------------------------------------------------- PRUEBA 1 Finalizada

        // PRUEBA 2 ----------------------------------------

        // Este ejercicio, para simular el TenTimes.java, sería modificar el apartado anterior del Override,
        // Y cambiar la opción del return, por obj*10; Para multiplicar 10 veces el elemento del array;

        // ------------------------------------------------- PRUEBA 2 Finalizada

        // PRUEBA 3 ----------------------------------------

        // Este ejercicio, es bastante similar al anterior, pero implementa una cadena que añade a
        // cada uno de los elementos del array; Aquí en el Override, el metodo en vez de devolver Integer, devolvería
        // String, y así podríamos indicar en el return obj+"hola";

        // ------------------------------------------------- PRUEBA 3 Finalizada

        sc.close();
    }

}
