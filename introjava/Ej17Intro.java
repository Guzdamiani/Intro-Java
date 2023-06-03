/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej17Intro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un valor de N para el largo del vector:");
        int n = leer.nextInt();

        int[] vector = new int[n];

        llenarVector(vector, n);

        recorrerEImprimir(vector, n);
       
    }

    public static void llenarVector(int[] vector, int n) {

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * (99999 - 1) + 1);
        }
    }

    public static void recorrerEImprimir(int[] vector, int n) {

        int suma1, suma2, suma3, suma4, suma5;
        
        suma1 = 0;
        suma2 = 0;
        suma3 = 0;
        suma4 = 0;
        suma5 = 0;

        for (int i = 0; i < n; i++) {
            if (vector[i] >= 1 && vector[i] < 10) {
                suma1++;
            } else if (vector[i] >= 10 && vector[i] < 100) {
                suma2++;
            } else if (vector[i] >= 100 && vector[i] < 1000) {
                suma3++;
            } else if (vector[i] >= 1000 && vector[i] < 10000) {
                suma4++;
            } else if (vector[i] >= 10000 && vector[i] < 100000) {
                suma5++;
            }
            System.out.println(vector[i]);
        }
        
        System.out.println("En el vector recorrido existen los siguientes numeros:" );
        System.out.println(suma1 + " numeros de 1 digito.");
        System.out.println(suma2 + " numeros de 2 digitos.");
        System.out.println(suma3 + " numeros de 3 digitos.");
        System.out.println(suma4 + " numeros de 4 digitos.");
        System.out.println(suma5 + " numeros de 5 digitos.");
    }
}
