package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            a.add(i);
        };

        ArrayList<String> b = new ArrayList<>();

        b.add("A");
        b.add("B");
        b.add("C");
        b.add("D");
        b.add("E");
        b.add("F");
        b.add("G");
        b.add("H");
        b.add("I");
        b.add("J");

        System.out.println(a);
        System.out.println(b);
        Joiners j = new Joiners();
        JoinByAdding j2 = new JoinByAdding();
        j.fold(j2, a);
        JoinSpace j3 = new JoinSpace();
        j.fold(j3, b);

        sc.close();
    }

}
