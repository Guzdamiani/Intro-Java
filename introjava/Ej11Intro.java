/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej11Intro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        menu(num1, num2);

    }

    public static void menu(int num1, int num2) {

        Scanner leer = new Scanner(System.in);

        int eleccion = 0;

        do {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("");
            System.out.println("Elija una opcion:");
            System.out.println("");
            System.out.println("1.Sumar");
            System.out.println("2.Restar ");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");

            eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma de " + num1 + " + " + num2 + " es " + suma + ".");
                    System.out.println("");
                    volver();
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta de " + num1 + " - " + num2 + " es " + resta + ".");
                    volver();
                    break;
                case 3:
                    int multi = num1 * num2;
                    System.out.println("La multiplicacion de " + num1 + " * " + num2 + " es " + multi + ".");
                    volver();
                    break;
                case 4:
                    double divi = (double) num1 / (double) num2;
                    System.out.println("La division de " + num1 + " / " + num2 + " es " + divi + ".");
                    volver();
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir? Conteste con s/n");
                    String opcion = leer.next();
                    opcion = opcion.toLowerCase();

                    if ("n".equals(opcion)) {
                        eleccion = 0;
                    } else {
                        System.out.println("Has salido con éxito.");
                        System.out.println("");
                    }
                    break;
                default:
                    System.out.println("La opcion elegida no es válida, intente nuevamente");
                    volver();
            }
        } while (eleccion != 5);
    }

    public static void volver() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Presione enter para volver al menu principal:");
        String volver = leer.nextLine();

    }
}
