/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Ej19IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un valor N, para la longitud del vector:");
        int n = leer.nextInt();

        int vectorA[] = new int[n];
        int vectorB[] = new int[n];

        llenarVectores(n, vectorA, vectorB);

        imprimirVectores(n, vectorA, vectorB);

        boolean iguales = verificarIgualdad(n, vectorA, vectorB);

        if (iguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }
    }

    public static void llenarVectores(int n, int[] vectorA, int[] vectorB) {

        for (int i = 0; i < n; i++) {
            vectorA[i] = (int) (Math.random() * 10);
            vectorB[i] = (int) (Math.random() * 10); //si se desea testear un caso de igualdad, se cambia esta linea por vectorB [i] = vectorA[i]//
            
        }

    }

    public static void imprimirVectores(int n, int[] vectorA, int[] vectorB) {

        for (int i = 0; i < n; i++) {
            System.out.print("[" + vectorA[i] + "]");
        }

        System.out.println("");

        for (int i = 0; i < n; i++) {
            System.out.print("[" + vectorB[i] + "]");
        }

        System.out.println("");
    }

    public static boolean verificarIgualdad(int n, int[] vectorA, int[] vectorB) {

        boolean iguales = true;

        for (int i = 0; i < n; i++) {
            if (vectorA[i] != vectorB[i]) {
                iguales = false;
                break;
            }
        }
        return iguales;
    }
}
