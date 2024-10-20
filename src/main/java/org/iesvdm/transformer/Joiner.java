package org.iesvdm.transformer;

public interface Joiner<T>
{
    public T join(T obj1,T obj2);
}

/*
 * <------------------------- Explicación Joiner ------------------------->
 * Clase que define un tipo genérico, que tiene un único parámetro T, y un metodo
 * join, que recibe dos objetos de tipo T, y devuelve un objeto de tipo T.
 */
