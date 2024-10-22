package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // También podríamos poner un menú, en el que el usuario elija si añadir la palabra antes o después
        // del valor en la lista; x Hola | Hola x;

        System.out.println("\nIntroduce algunas cadenas (Separadas por espacio): ");
        String cadenas = sc.nextLine();
        String[] cadenasArray = cadenas.split(" ");
        ArrayList<String> a = new ArrayList<>();
        for (String cadena : cadenasArray) {a.add(cadena);}
        System.out.println("\nLista de Cadenas: " + a);
        System.out.println("\nIntroduce la cadena que quieres añadir a todos los elementos de la lista: ");
        String cadenaExtra = sc.next(); // Aquí ya dependiendo si el usuario quiere introducir más de una palabra, será nextLine();
        AddMessage ad1 = new AddMessage(cadenaExtra);
        a = Transformers.applyConst(ad1, a);
        System.out.println("\nResultado de añadir " + cadenaExtra + " a todos los elementos: " + a);

        sc.close();
    }

}
