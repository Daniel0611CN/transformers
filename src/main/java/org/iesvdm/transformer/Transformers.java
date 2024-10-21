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

        List<T> lista = (List<T>) Arrays.asList(list.toString()
                .replaceAll("[\\[\\]]", "")
                .split(",\\s*"));

        ArrayList<T> result = new ArrayList<>();
        for (T s : lista) { result.add((T) Integer.valueOf((String) s));}

        for (int i = 0; i < result.size(); i++) {
            tran.transform(result.get(i));
        }

        ArrayList<T> b = Transformers.applyConst(tran, result);
        return b;
    }

}

