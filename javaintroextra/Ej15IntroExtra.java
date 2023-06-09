/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Ej15IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros");
        int num1, num2;

        num1 = leer.nextInt();
        num2 = leer.nextInt();

        System.out.println("Elija una opción:");
        System.out.println("");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividar");
        System.out.println("");

        int eleccion;

        do {

            eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + dividir(num1, num2));
                    break;
                default:
                    System.out.println("El número elegido es inválido.");
                    System.out.println("Ingrese otra opción:");
            }
        } while (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4);

    }

    public static int sumar(int num1, int num2) {

        int suma = num1 + num2;
        return suma;

    }

    public static int restar(int num1, int num2) {

        int resta = num1 - num2;
        return resta;

    }

    public static int multiplicar(int num1, int num2) {

        int multi = num1 * num2;
        return multi;

    }

    public static double dividir(int num1, int num2) {

        double divi = num1 / num2;
        return divi;

    }
}
