package pruebarecursividad;

import java.util.Arrays;

public class PruebaRecursividad {

    public static void main(String[] args) {
        System.out.println("Fibonacci de 5: " + Recursividad.fibonacci(5));
        System.out.println("Fibonacci de 40: " + Recursividad.fibonacci(40));

        System.out.println("MCD de 45 y 75: " + Recursividad.mcd(45, 75));
        System.out.println("MCD de 47 y 91: " + Recursividad.mcd(47, 91));

        Object[] arr1 = {1, 2, 3, 3, 2, 3, 1};
        System.out.println("Ocurrencias de 3: " + Recursividad.count(arr1, arr1.length, 3));
        System.out.println("Ocurrencias de 1: " + Recursividad.count(arr1, arr1.length, 1));

        Object[] arr2 = {'A', 'B', 'C', 'B', 'A', 'B', 'D'};
        System.out.println("Ocurrencias de 'C': " + Recursividad.count(arr2, arr2.length, 'C'));
        System.out.println("Ocurrencias de 'E': " + Recursividad.count(arr2, arr2.length, 'E'));

        Object[] arr3 = {1, 2, 3, 4, 5};
        Recursividad.reverse(arr3, 0, arr3.length - 1);
        System.out.println("Arreglo 3 invertido: " + Arrays.toString(arr3));

        Object[] arr4 = {'A', 'B', 'C', 'D'};
        Recursividad.reverse(arr4, 0, arr4.length - 1);
        System.out.println("Arreglo 4 invertido: " + Arrays.toString(arr4));
    }
}
