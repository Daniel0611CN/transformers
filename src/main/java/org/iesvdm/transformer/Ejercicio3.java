package org.iesvdm.transformer;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LispList<Integer> lispList = LispList.empty(), lispList2 = LispList.empty(), result;

        lispList = getIntegerLispList(sc, lispList);
        lispList2 = getIntegerLispList(sc, lispList2);

        Joiner<Integer> adder = new JoinByAdding();
        result = Joiners.zipLists(adder,lispList,lispList2);

        System.out.println("\nEl resultado es: " + result);
        System.out.println("LispList 1: " + lispList);
        System.out.println("LispList 2: " + lispList2);

        sc.close();
    }

    private static LispList<Integer> getIntegerLispList(Scanner sc, LispList<Integer> lispList) {

        System.out.println("\nIntroduce una opción: \n1. Introducir número\n2. Salir");
        int opt = sc.nextInt();

        for (int i = 0; opt == 1; i++) {
            System.out.print("\nIntroduce un numero: ");
            int num = sc.nextInt();
            lispList = lispList.cons(num);
            System.out.println(lispList);

            System.out.println("\nIntroduce una opción: \n1. Introducir número\n2. Salir");
            opt = sc.nextInt();
        }
        return lispList;
    }
}
