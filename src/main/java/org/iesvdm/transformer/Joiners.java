package org.iesvdm.transformer;


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








