/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Ej22IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor de M y N para la matriz:");
        int m = leer.nextInt();
        int n = leer.nextInt();

        int matriz[][] = new int[m][n];

        llenarMatriz(matriz, m, n);

        imprimirMatriz(matriz, m, n);

    }

    public static void llenarMatriz(int[][] matriz, int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }

        }

    }

    public static void imprimirMatriz(int[][] matriz, int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

    }

}
