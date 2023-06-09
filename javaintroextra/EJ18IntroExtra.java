/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class EJ18IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un valor para la longitud del vector:");
        int n = leer.nextInt();

        int[] vector = new int[n];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un valor para la posición " + i);
            vector[i] = leer.nextInt();
            suma = suma + vector[i];
        }

        System.out.println("La suma de todos los valores ingresados es " + suma);
    }
}
