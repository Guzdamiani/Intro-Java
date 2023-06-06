/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej07IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String opcion;

        System.out.println("Ingrese la cantidad de numeros deseada:");
        int n = leer.nextInt();

        do {
            System.out.println("¿Que bucle desea utilizar? Ingrese D (Do while) o W (While)");
            opcion = leer.next();
            opcion = opcion.toUpperCase();

            if (!opcion.equals("D") && !opcion.equals("W")) {
                System.out.println("Opcion inválida. Intente nuevamente.");
            }
        } while (!opcion.equals("D") && !opcion.equals("W"));

        switch (opcion) {
            case "D":
                double promedioD = promedioConDoWhile(n);
                System.out.println("El promedio de los " + n + " numeros ingresados es " + promedioD);
                break;
            case "W":
                double promedioW = promedioConDoWhile(n);
                System.out.println("El promedio de los " + n + " numeros ingresados es " + promedioW);
                break;
        }

    }

    public static double promedioConDoWhile(int n) {

        Scanner leer = new Scanner(System.in);

        int suma = 0;
        int contador = 1;

        do {
            System.out.println("Ingrese el valor para el número " + contador);
            int valor = leer.nextInt();

            if (valor > 0) {
                suma = suma + valor;
                contador++;
            } else {
                System.out.println("Valor inválido. Ingrese solamente numeros positivos.");
            }

        } while (contador <= n);

        double promedio = suma / n;

        return promedio;
    }

    public static double promedioConWhile(int n) {

        Scanner leer = new Scanner(System.in);

        int suma = 0;
        int contador = 1;

        while (contador <= n) {
            System.out.println("Ingrese el valor para el número " + contador);
            int valor = leer.nextInt();

            if (valor > 0) {
                suma = suma + valor;
                contador++;
            } else {
                System.out.println("Valor inválido. Ingrese solamente numeros positivos.");
            }

        }
        double promedio = suma / n;

        return promedio;
    }
}
