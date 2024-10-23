package org.iesvdm.transformer;

import java.util.Scanner;

public class Ejercicio7<T> {

    public static <T> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkType(sc);
        sc.close();
    }

    private static <T> void checkType(Scanner sc) {
        T param;
        System.out.println("\nQue tipo de valor quieres introducir: \n1. Entero\n2. Decimal\n3. Cadena");
        int opcion = sc.nextInt();

        CheckParameter<T> checkVarTypeAndApplyParameter = new CheckParameter<>();

        switch (opcion) {
            case 1:
                System.out.println("\nIntroduce un número: ");
                Integer valorInteger = sc.nextInt();
                param = (T) valorInteger;
                checkVarTypeAndApplyParameter.checkParamIsAplicated(param);
                break;
            case 2:
                System.out.println("\nIntroduce un número: ");
                Double valorDouble = sc.nextDouble();
                param = (T) valorDouble;
                checkVarTypeAndApplyParameter.checkParamIsAplicated(param);
                break;
            case 3:
                System.out.println("\nIntroduce una cadena:");
                param = (T) sc.next();
                checkVarTypeAndApplyParameter.checkParamIsAplicated(param);
                break;
        }
    }

}
