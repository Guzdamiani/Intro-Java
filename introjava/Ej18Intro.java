/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author guzma
 */
public class Ej18Intro {

    public static void main(String[] args) {

        int matrizA[][] = new int[4][4];
        int matrizB[][] = new int[4][4];

        llenarMatrices(matrizA, matrizB);

        imprimirMatrices(matrizA, matrizB);

    }

    public static void llenarMatrices(int[][] matrizA, int[][] matrizB) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
                matrizB[j][i] = matrizA[i][j];
            }

        }

    }

    public static void imprimirMatrices(int[][] matrizA, int[][] matrizB) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
       
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizB[i][j]+ "]");
            }
            System.out.println("");

        }
    }
}
