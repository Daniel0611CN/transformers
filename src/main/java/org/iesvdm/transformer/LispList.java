package org.iesvdm.transformer;

public class LispList<E>
{
    private Cell<E> myList;

    private LispList(Cell<E> list)
    {
        myList=list;
    }

    public boolean isEmpty()
    {
        return myList==null;
    }

    public E head()
    {
        return myList.first;
    }

    public LispList<E> tail()
    {
        return new LispList<E>(myList.rest);
    }

    public LispList<E> cons(E item)
    {
        return new LispList<E>(new Cell<E>(item,myList));
    }

    public static <T> LispList<T> empty()
    {
        return new LispList<T>(null);
    }

    public boolean equals(Object other)
    {
        LispList<E> otherList = (LispList<E>) other;
        if(this.isEmpty())
            return otherList.isEmpty();
        else
            return this.head().equals(otherList.head()) &&
                    this.tail().equals(otherList.tail());
    }

    public String toString()
    {
        if(isEmpty())
            return "[]";
        else
            return "["+head()+restToString(tail());
    }

    private static <T> String restToString(LispList<T> l)
    {
        if(l.isEmpty())
            return "]";
        else
            return ","+l.head()+restToString(l.tail());
    }

    private static class Cell <T>
    {
        T first;
        Cell<T> rest;

        Cell(T h,Cell<T> t)
        {
            first=h;
            rest=t;
        }
    }

}


// En esta clase, vamos a probar el funcionamiento de la clase LispList, para
// entender cada uno de sus metodos.
//
//
// <---------------- EXPLICACIÓN GENERAL CLASE LISPLIST ------------------> //
//
// La clase LispList, implementa el genérico <E>;
//
// Dentro vemos que tiene un atributo privado de la clase Cell,
// que implementa el genérico <E>, llamado myList;
//
// La clase Cell, es una clase estática privada,
// que se encuentra dentro de la clase LispList;
// Esta tiene un atributo T 'first', y otro como
// objeto de Cell, que implementa T, 'rest';
//
// En la clase LispList, también tenemos el constructor,
// y los siguientes métodos.
//
// isEmpty() -> Comprueba si la lista es null, y retorna true o false;
// E head() -> Devuelve el primer elemento de la lista,
// Lo que hay que destacar, que no retorna el primero que añades,
// ya que actua como una pila;
// El primero que entra es el ultimo que sale;
// Por lo que retornara el ultimo elemento introducido;
// LispList<E> tail() -> Devuelve una nueva LispList<E>,
// Con el resto de elementos de la lista,
// quitando el primero;
// LispList<E> cons(E item) -> retorna una nueva
// LispList<E>, añadiendo el E item;
// Básicamente lo que hace es crear un nuevo Cell, al que
// asigna los valores, item, y miList, con esto hace
// que el valor first, que será el que se añada, apunte al elemento
// anterior, y así se pueda formar la lista. A través de un
// conjunto de celdas;
// <T> LispList<T> empty() -> devuelve una nueva lista vacía;
// <T> String restToString(LispList<T> l) -> se encarga
// de convertir el resto de la lista en una cadena;
// Y por último tenemos el metodo equals y toString;

