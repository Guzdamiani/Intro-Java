/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej06Intro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero para determinar si es par:");
        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par.");

        } else {
            System.out.println("El numero " + num + " es impar.");

        }
    }

}
