package org.iesvdm.transformer;

class JoinByAdding implements Joiner<Integer>
{
    public Integer join(Integer int1,Integer int2)
    {
        return int1+int2;
    }
}

/*
 * <------------------------- Explicacion JoinByAdding ------------------------->
 * En el archivo JoinByAdding, hay una clase que implementa la interfaz Joiner<Integer>,
 * junto a un metodo join, que recibe dos enteros, y devuelve la suma de ambos.
 */
