/*
Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Ej24IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número N para ver la cantidad equivalente de numeros de la serie de Fibonacci:");
        int n = leer.nextInt();

        int vector[] = new int[n];

        llenarVector(n, vector);
        
        imprimirVector(n, vector);

    }

    private static void llenarVector(int n, int[] vector) {

        for (int i = 0; i < n; i++) {
            vector[i] = serieFibonacci(i);
        }
    }

    public static int serieFibonacci(int i) {

        int fiboN;

        if (i <= 1) {
            fiboN = 1;
        } else {
            fiboN = serieFibonacci(i - 1) + serieFibonacci(i - 2);
        }
        return fiboN;
    }

    private static void imprimirVector(int n, int[] vector) {

        for (int i = 0; i < n; i++) {
            System.out.println("[" + vector[i] + "]");
        }
    }
}
