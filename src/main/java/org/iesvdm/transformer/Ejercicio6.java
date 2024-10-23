package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        message(sc);
        sc.close();
    }

    private static void message(Scanner sc) {

        System.out.println("\nIntroduce algunas cadenas (Separadas por espacio): ");
        String cadenas = sc.nextLine();

        String[] cadenasArray = cadenas.split(" ");
        ArrayList<String> a = new ArrayList<>();
        Collections.addAll(a, cadenasArray);
        System.out.println("\nLista de Cadenas: " + a);

        System.out.println("\nIntroduce la cadena que quieres añadir a todos los elementos de la lista: ");
        String cadenaExtra = sc.next();
        System.out.println("Introduce en la posición donde quieres introducir la cadena: \n1. Delante ('Cadena' + Elemento Lista)\n2. Detrás (Elemento Lista + 'Cadena')");
        int opcion = sc.nextInt();

        AddMessage ad1 = new AddMessage(cadenaExtra, opcion);
        a = Transformers.applyConst(ad1, a);

        System.out.println("\nResultado de añadir " + cadenaExtra + " a todos los elementos: " + a);
    }

}
