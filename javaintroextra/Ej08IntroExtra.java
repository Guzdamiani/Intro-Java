/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej08IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int totalNumeros = 1;
        int pares = 0;
        int impares = 0;
        int valor;

        do {
            System.out.println("Ingrese el valor para el número " + totalNumeros + ":");
            valor = leer.nextInt();
            if (valor % 5 == 0) {
                totalNumeros--;
                break;
            }

            if (valor % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            totalNumeros++;
        } while (valor % 5 != 0);

        System.out.println("Se ha ingresado " + totalNumeros + " numeros, de los cuales " + pares + " son pares y " + impares + " son impares.");
    }
}
