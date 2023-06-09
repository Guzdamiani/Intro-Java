/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Ej09IntroExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros, asegurándose que el primero sea mayor que el segundo:");
        System.out.println("");

        int num = leer.nextInt();
        int div = leer.nextInt();
        int cociente = 0;

        if (num > div) {
            do {
                int resta = num - div;
                cociente++;
                System.out.println(num + " - " + div + " = " + resta);
                System.out.println("");
                num = resta;
            } while (num > div);

            System.out.println("Dado que " + div + " es mayor que " + num + ", entonces: el residuo es " + num + " y el cociente es " + cociente + ".");

        } else {
            System.out.println("Ingreso inválido. El primer número debe ser mayor que el segundo.");
        }

    }
}
