/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej16Intro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un valor de N para el largo del vector:");
        int n = leer.nextInt();

        int[] vector = new int[n];

        llenarVector(vector, n);

        System.out.println("Ingrese un valor entre 0 y 100 que desea buscar en el vector");
        int valor = leer.nextInt();

        buscarEnVector(vector, n, valor);

    }

    public static void llenarVector(int[] vector, int n) {

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
    }

    public static void buscarEnVector(int[] vector, int n, int valor) {

        int suma = 0;
        int posicion = 0;

        for (int i = 0; i < n; i++) {
            if (vector[i] == valor) {
                if (suma == 0) {
                    posicion = i;
                }
                suma++;
            }
        }

        switch (suma) {
            case 0:
                System.out.println("El número " + valor + " no se encuentra dentro del algoritmo.");
                break;
            case 1:
                System.out.println("El número " + valor + " se encuentra dentro del algoritmo en la posicion " + posicion);
                break;
            default:
                System.out.println("El número " + valor + " se encuentra " + suma + " veces dentro del algoritmo, la primera de ellas siendo " + posicion);

        }
    }
}
