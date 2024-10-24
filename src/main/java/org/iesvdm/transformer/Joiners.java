package org.iesvdm.transformer;


import java.util.ArrayList;

public class Joiners
{
    public static <T> LispList<T> zipLists(Joiner<T> joiner,LispList<T> ls1,LispList<T> ls2)
    {
        if(ls1.isEmpty()||ls2.isEmpty())
            return LispList.empty();
        else
        {
            T h = joiner.join(ls1.head(),ls2.head());
            LispList<T> t = zipLists(joiner,ls1.tail(),ls2.tail());
            return t.cons(h);
        }
    }

    public static <T> ArrayList<T> zipArrayLists(Joiner<T> joiner,ArrayList<T> l1,ArrayList<T> l2)
    {
        if(l1.isEmpty()||l2.isEmpty())
            return new ArrayList<>();
        else
        {
            T h;
            ArrayList<T> t = new ArrayList<>();
            for (int i = 0; i < l1.size(); i++) {
                    h = joiner.join(l1.get(i),l2.get(i));
                    t.add(h);
            }
            return t;
        }
    }

    public static <T> ArrayList<T> fold(Joiner<T> joiner,ArrayList<T> l1) {
        ArrayList<T> t1 = new ArrayList<>();
        ArrayList<T> t2 = new ArrayList<>();
        if (joiner instanceof JoinByAdding) {
            t1.clear();

            System.out.println("\nTransformando Arraylist ... ");

            for (int i = 0; i < l1.size(); i++) {
                if (i != l1.size() - 1) {
                    t1.add(joiner.join(l1.get(i), l1.get(i+1)));
                }
                i++;
            }

            l1.clear();
            l1.addAll(t1);

            for (int i = 0; i < l1.size(); i++) {
                if (i != l1.size() - 1 && i < l1.size()) {
                    l1.add(joiner.join(l1.get(i), l1.get(i+1)));
                }
                i++;
            }

            System.out.println("La suma de todos los elementos del array es: " + l1.get(l1.size()-1));
        }

        if (joiner instanceof JoinSpace) {
            t2.clear();

            for (int i = 0; i < l1.size(); i++) {
                if (i != l1.size() - 1) {
                    t2.add(joiner.join(l1.get(i), l1.get(i+1)));
                }
                i++;
            }

            l1.clear();
            l1.addAll(t2);

            for (int i = 0; i < l1.size(); i++) {
                if (i != l1.size() - 1 && i < l1.size()) {
                    l1.add(joiner.join(l1.get(i), l1.get(i+1)));
                }
                i++;
            }

            String result = (String) l1.get(l1.size()-1);

            System.out.println("La unión de todas las string de la lista es: " + result);

        }




        return t1;
    }

}

/*
 * <-------------------------------- Explicación Joiners -------------------------------->
 * En la clase Joiners.java, hay un metodo genérico estático, zipLists.
 * Este recibe un objeto Joiner, y dos LispList, y devuelve una LispList
 * cuyo primer ítem, se obtiene de unir los dos primeros elementos de la lista,
 * y el segundo, de unir los dos segundos elementos de la lista.
 * Usando el metodo 'join', de la clase Joiner.java.

 * En el metodo zipLists, encontramos una condición, en la que nos encontramos
 * un if, en el que si alguna de las dos LispLists están vacías, retornara un LispList vacío;

 * Si esa condición no existe, pasamos al else. En este, nos encontramos una variable genérica
 * T, que implementa el metodo join a las dos listas.head;
 * Además, crea un LispList generico. Este le pasa el valor del metodo zipLists,
 * que implementa el joiner, y las dos listas. Finalmente, retorna la LispList
 * que ha creado, y le añade el valor h, de la variable genérica, con el metodo cons.
 */








