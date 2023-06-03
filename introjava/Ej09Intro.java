/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej09Intro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase que empiece con A");
        String frase = leer.nextLine();

        String letra = "A";
        String primerCaracter = frase.substring(0, 1);

        if (primerCaracter.equals(letra)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");

        }

    }
}
