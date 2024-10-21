package org.iesvdm.transformer;

import java.util.ArrayList;

public class Ejercicio5 {

    public static <T> void main(String[] args) {

        LispList<T> aux = (LispList<T>) LispList.empty().cons(1).cons(2).cons(3);
        System.out.println("\nLispList: " + aux);

        // <---------------------- CAMBIAR A T EL @OVERRIDE SI EL LISPLIST ES DE STRING ---------------------->

        Transformer<Integer> prueba = new Transformer<>() {
            @Override
            public Integer transform(Integer obj) {
                T a = (T) obj;
                return (Integer) (obj)/2;
            }
        };

        ArrayList<T> a = Transformers.transformList((Transformer<T>) prueba, aux);
        System.out.println("ArrayList Modificado: " + a);
    }

}
