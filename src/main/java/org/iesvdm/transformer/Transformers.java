package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Transformers
{
    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a)
    {
        ArrayList<T> b = new ArrayList<>();
        for(T t : a)
            b.add(tran.transform(t));
        return b;
    }

    public static <T> ArrayList<T> applyDest(Transformer<T> tran, ArrayList<T> a) {
        for (int i = 0; i < a.size(); i++) {
            T t = a.get(i);
            a.set(i, tran.transform(t));
        }
        return a;
    }

    public static <T> ArrayList<T> transformList(Transformer<T> tran, LispList<T> list) {

        ArrayList<T> result = new ArrayList<>();
        while (!list.isEmpty()) { // Aqui lo que hace es iterar la LispList, comprobando si no está vacía.
            result.add(list.head()); // Aquí añadimos a la nueva lista el primer elemento (head).
            list = list.tail(); // Modificamos la LispList, y le quitamos el head anterior, por lo que el nuevo head será el
            // primer elemento del tail. Así se continúa hasta que la lista esté vacía.
        }

        System.out.println("Lista: " + result);
        for (int i = 0; i < result.size(); i++) { tran.transform(result.get(i));}
        ArrayList<T> b = Transformers.applyConst(tran, result);
        return b;
    }

}

