package org.iesvdm.transformer;

/*
 * En el código, realmente no es necesario los instanceof, porque
 * en el Ejercicio7.java, ya le forzamos a que al introducir un valor,
 * dependiendo de la opción, el scanner sea de una manera o de otra;
 * Aunque los pongo para delimitar, y que no se ejecute el programa entero;
 * Si quisiéramos quitarlo, debemos usar distintos métodos en la interfaz
 * para poder dividirlos, y que no den error de casteo.
 */

public class CheckParameter<T> implements CheckMethod<T> {
    @Override
    public boolean checkParamIsAplicated(T param) {
        if (param instanceof Integer) {
//            System.out.println("\nComprobando el tipo Integer de la variable ... ");
            if ((Integer) param%2!=0) {
                System.out.println("\nEl número " + param + " es impar.");
                System.out.println("\nResultado del Parámetro Aplicado -> " + true);
                return true;
            } else if ((Integer) param%2==0) {
                System.out.println("\nEl número " + param + " es par.");
                System.out.println("\nResultado del Parámetro Aplicado -> " + false);
            }
        } else if (param instanceof Double) {
            System.out.println("\nComprobando el tipo Double de la variable ... ");
            if (param.toString().contains("2")) {
                System.out.println("\nEl número " + param + " contiene al menos un 2.");
                System.out.println("\nResultado del Parámetro Aplicado -> " + true);
                return true;
            } else if (!param.toString().contains("2")) {
                System.out.println("\nEl número " + param + " no contiene ningún 2.");
                System.out.println("\nResultado del Parámetro Aplicado -> " + false);
            }
        } else if (param instanceof String) {
            System.out.println("\nComprobando el tipo String de la variable ... ");
            if (((String) param).length()<8) {
                System.out.println("\nLa cadena " + param + " tiene menos de 8 carácteres.");
                System.out.println("\nResultado del Parámetro Aplicado -> " + true);
                return true;
            } else if (((String) param).length()>8) {
                System.out.println("\nLa cadena " + param + " tiene más de 8 carácteres.");
                System.out.println("\nResultado del Parámetro Aplicado -> " + false);
            }
        }
        return false;
    }
}
