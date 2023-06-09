/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Ej10IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Intente adivinar el número aleatorio generado por el programa.");
        System.out.println("");
        int eleccion = 0;

        double num = Math.random() * 10;

        do {

            do {
                System.out.println("Ingresa un número del 1 al 10");
                eleccion = leer.nextInt();
                if (eleccion < 0 || eleccion > 10) {
                    System.out.println("Numero inválido, intente nuevamente.");
                }
            } while (eleccion < 0 || eleccion > 10);

            if (eleccion == (int) num) {
                System.out.println("¡Felicitaciones! " + eleccion + " es el número correcto.");
            } else {
                System.out.println("Lo lamento. " + eleccion + " no es el numero correcto. Intenta nuevamente.");
                System.out.println("");
            }
        } while (eleccion != (int) num);
    }
}
