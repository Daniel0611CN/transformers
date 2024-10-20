package org.iesvdm.transformer;

import java.util.ArrayList;

public class Ejercicio2 {

    // Probamos las modificaciones realizadas en la clase Transformers;

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(5);
        a.add(6);

        Transformer<Integer> b = new Transformer<>() {
            @Override
            public Integer transform(Integer obj) {
                return obj*2;
            }
        };

        ArrayList<Integer> arraytransformer = Transformers.applyDest(b, a);

        System.out.println("\nArray Transformado ...");
        for (Integer i : arraytransformer) {
            System.out.println(i);
        }

    }


}
