/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package introjava;

/**
 *
 * @author guzma
 */
public class Ej19Intro {

    public static void main(String[] args) {

        int matriz[][] = new int[3][3];
        int matrizTrans[][] = new int[3][3];

        llenarMatrices(matriz, matrizTrans);

        imprimirMatrices(matriz, matrizTrans);

        boolean esAnti = verificarAntiSimetrica(matriz, matrizTrans);

        if (esAnti) {
            System.out.println("La matriz es Anti Simétrica");
        } else {
            System.out.println("La matriz NO es Anti Simétrica");

        }
    }

    public static void llenarMatrices(int[][] matriz, int[][] matrizTrans) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 5);
                matrizTrans[j][i] = matriz[i][j];
            }

        }

        /*matriz[0][0] = 0;
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = 2;
        matriz[2][0] = -4;
        matriz[2][1] = -2;
        matriz[2][2] = 0;
        
        matrizTrans[0][0] = 0;
        matrizTrans[0][1] = 2;
        matrizTrans[0][2] = -4;
        matrizTrans[1][0] = -2;
        matrizTrans[1][1] = 0;
        matrizTrans[1][2] = -2;
        matrizTrans[2][0] = 4;
        matrizTrans[2][1] = 2;
        matrizTrans[2][2] = 0;
        
         */
    }

    public static void imprimirMatrices(int[][] matriz, int[][] matrizTrans) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizTrans[i][j] + "]");
            }
            System.out.println("");

        }
    }

    public static boolean verificarAntiSimetrica(int[][] matriz, int[][] matrizTrans) {

        boolean esAnti = true;

        for (int i = 0; i < 3; i++) {
            if (esAnti) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] != (matrizTrans[i][j] * -1)) {
                        esAnti = false;
                        break;
                    }

                }
            } else {
                break;
            }

        }
        return esAnti;
    }
}
