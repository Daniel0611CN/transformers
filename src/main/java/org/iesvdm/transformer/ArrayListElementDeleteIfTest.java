package org.iesvdm.transformer;

import java.util.ArrayList;

public class ArrayListElementDeleteIfTest {

    public static <T> void main(String[] args) {
        CheckParameter<T> aux = new CheckParameter<>();
        ArrayList<T> list = new ArrayList<>();
        arrayListDeleteElements(aux, list);
    }

    public static <T> T arrayListDeleteElements(CheckParameter<T> aux, ArrayList<T> list) {

        System.out.println("\nAñadiendo elementos a la lista ... ");

        for (int i = 0; i < 12; i++) {
            Integer nums = (int) (Math.random()*50);
            list.add((T) nums);
        }

        System.out.println("\nLista Original: " + list);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (!aux.checkParamIsAplicated(list.get(i))) {
                list.remove(i);
            }
        }

        System.out.println("\nComprobando valores ... ");

        System.out.println("\nLista Modificada: " + list);

        return null;
    }

}
