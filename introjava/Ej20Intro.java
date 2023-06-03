/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej20Intro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        llenarMatriz(matriz);

        imprimirMatriz(matriz);

        boolean esMagica = verificarMagica(matriz);

        if (esMagica) {
            System.out.println("La matriz es mágica.");
        } else {
            System.out.println("La matriz no es mágica.");

        }

    }

    public static void llenarMatriz(int[][] matriz) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un valor entero entre 0 y 9 para la posición [" + i + "][" + j + "]:");
                matriz[i][j] = leer.nextInt();
                if (matriz[i][j] < 0 || matriz[i][j] > 9) {
                    System.out.println("El número ingresado es inválido. Intente nuevamente.");
                    matriz[i][j] = 0;
                    j--;
                }
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

    }

    public static boolean verificarMagica(int[][] matriz) {

        boolean esMagica = true; //inicalizo esMagica como true. En caso de que la suma de alguna de las filas no sea igual a la anterior, se corta el bucle.

        int suma = matriz[0][0] + matriz[0][1] + matriz[0][2];

        //Aca voy a verificar que todas las filas sumen los mismo que la primera, cuyo valor ya guardé.
        for (int i = 1; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila = sumaFila + matriz[i][j];
            }
            if (sumaFila != suma) {
                esMagica = false;
                break;
            }

        }
        if (esMagica) {
            //Aca verifico lo mismo pero para todas las columnas.
            for (int i = 0; i < 3; i++) {
                int sumaColumna = 0;
                for (int j = 0; j < 3; j++) {
                    sumaColumna = sumaColumna + matriz[j][i];
                }
                if (sumaColumna != suma) {
                    esMagica = false;
                    break;
                }

            }

        }

        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;

        if (esMagica) {
            for (int i = 0; i < 3; i++) {

                sumaDiagonal1 = sumaDiagonal1 + matriz[i][i];
                sumaDiagonal2 = sumaDiagonal2 + matriz[i][-i + 2];
            }

            if (sumaDiagonal1 != suma || sumaDiagonal2 != suma) {
                esMagica = false;
            }
        }

        return esMagica;
    }

}
