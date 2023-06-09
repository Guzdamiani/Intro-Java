/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Ej17IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int num = leer.nextInt();

        boolean esPrimo = verificarPrimo(num);

        if (esPrimo) {
            System.out.println("El numero " + num + " es primo.");
        } else {
            System.out.println("El numero " + num + " no es primo.");
        }
    }

    public static boolean verificarPrimo(int num) {

        boolean esPrimo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                esPrimo = false;
            }
            if (!esPrimo) {
                break;
            }
        }
        return esPrimo;
    }
}
