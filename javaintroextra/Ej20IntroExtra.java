/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package javaintroextra;

import java.util.Scanner;


/**
 *
 * @author Invitado
 */
public class Ej20IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int vector[] = new int[5];

        llenarVector(vector);

        imprimirVector(vector);

    }

    public static void llenarVector(int[] vector) {

        for (int i = 0; i < 5; i++) {
            vector[i] = (int) (Math.random() * 10);

        }

    }

    public static void imprimirVector(int[] vector) {

        for (int i = 0; i < 5; i++) {
            System.out.print("[" + vector[i] + "]");
        }

        System.out.println("");

    }
}
