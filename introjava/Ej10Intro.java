/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej10Intro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un valor como limite positivo de la suma:");
        int limite = leer.nextInt();
        int suma = 0;
        
        do {

            if (suma == 0) {
                System.out.println("Ingrese el primer numero para sumar");
                int num = leer.nextInt();
                suma = suma + num;
            } else {
                System.out.println("La suma hasta el momento equivale a " + suma);
                System.out.println("Ingrese el próximo numero a ser sumado:");
                int num = leer.nextInt();
                suma = suma + num;
            }

        } while (suma <= limite);
        
        System.out.println("La suma equivalente a " + suma + " ha superado el limite de " + limite + ".");
    }
}
