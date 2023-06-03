/*
 Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej21Intro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int matrizGrande[][] = new int[10][10];
        int matrizChica[][] = new int[3][3];

        llenarMatrizGrande(matrizGrande);

        imprimirMatrizGrande(matrizGrande);

        System.out.println("");
        System.out.println("");

        llenarMatrizChica(matrizChica);

        imprimirMatrizChica(matrizChica);

        boolean esta = verificarSiEsta(matrizGrande, matrizChica);

        if (esta) {
            System.out.println("La matriz de 3x3 sí se encuentra dentro de la de 10x10");
        } else {
            System.out.println("La matriz de 3x3 no se encuentra dentro de la de 10x10");

        }
    }

    public static void llenarMatrizGrande(int matrizGrande[][]) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizGrande[i][j] = (int) (Math.random() * 100);
            }

        }
    }

    public static void imprimirMatrizGrande(int matrizGrande[][]) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matrizGrande[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void llenarMatrizChica(int matrizChica[][]) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un valor entero entre 1 y 99 para la posición [" + i + "][" + j + "]:");
                matrizChica[i][j] = leer.nextInt();
            }

        }
    }

    public static void imprimirMatrizChica(int matrizChica[][]) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizChica[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static boolean verificarSiEsta(int matrizGrande[][], int matrizChica[][]) {

        //Primero voy a recorrer la matriz grande hasta encontrar el primer valor de la matriz chica
        int posicionI = 0;
        int posicionJ = 0;
        boolean esta = false;

        // voy a iterar hasta la posicion 8, tanto de i como de j, porque si encuentro el matrizChica[o][o] en i`s o j´s mayores,
        //ya no me va a dar el espacio para que entre la matriz entera.
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (matrizGrande[i][j] == matrizChica[0][0]) {

                    int posGrandeI = i;
                    int posGrandeJ = j;
                    int posChicaI = 0;
                    int posChicaJ = 0;
                    int aux = posChicaJ;
                    int sumaJChica = 0;

                    esta = true;

                    for (int k = posGrandeI; k < posGrandeI + 3; k++) {
                        for (int l = posGrandeJ; l < posGrandeJ + 3; l++) {

                            if (matrizGrande[k][l] == matrizChica[posChicaI][posChicaJ]) { //ACA ESTA EL PROBLEMA!!!!!
                                posChicaJ++;
                                sumaJChica++;

                                if (sumaJChica == 3) {
                                    posChicaI++;
                                    posChicaJ = aux;
                                    sumaJChica = 0;
                                }

                            } else {
                                esta = false;
                                break;
                            }
                        }
                        if (!esta) {
                            break;
                        }
                    }
                }
                if (esta) {
                    break;
                }
            }
            if (esta) {
                break;
            }
        }
        return esta;
    }

}
