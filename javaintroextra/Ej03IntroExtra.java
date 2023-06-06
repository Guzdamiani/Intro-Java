/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej03IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una letra:");
        String letra = leer.nextLine();

        while (letra.length() != 1) {
            System.out.println("El texto ingresado no es válido. Intente nuevamente");
            letra = leer.nextLine();
        }

        letra = letra.toLowerCase();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {

            System.out.println("La letra es una vocal.");
        } else {
            System.out.println("La letra es consonante.");
        }
    }
}
