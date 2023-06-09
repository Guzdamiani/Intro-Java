/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Ej23IntroExtra {

    public static void main(String[] args) {

        String palabras[] = new String[5];
        String matriz[][] = new String[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = " ";
            }
        }

        leerPalabras(palabras);

        llenarMatriz(palabras, matriz);

        imprimirMatriz(matriz);
    }

    /**
     *
     * @param palabras
     */
    public static void leerPalabras(String[] palabras) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            do {
                System.out.println("Ingrese una palabra de entre 3 y 5 caracteres para la posicion " + i);
                palabras[i] = leer.next();
            } while (palabras[i].length() > 5 || palabras[i].length() < 3);

        }
    }

    /**
     *
     * @param palabras
     * @param matriz
     */
    public static void llenarMatriz(String[] palabras, String[][] matriz) {

        for (int i = 0; i < 5; i++) { //para cada palabra va a haber una iteracion

            boolean ocupada = false;
            int filaRandom, columnaRandom;

            do {

                //Lo primero es definir una posicion de [i][j] random para ingresar la palabra, asegurnadose que al ingresar digito por digito, no se exceda del limite de la matriz.
                filaRandom = (int) (Math.random() * 20 - 1); // con el -1 me aseguro que la posicion 0 sea una posibilidad y que la 20 no lo sea.
                columnaRandom = (int) (Math.random() * 16 - 1);

                for (int j = 0; j < 20; j++) {
                    if (!matriz[filaRandom][j].equals(" ")) {
                        //si en alguna de las posiciones de esa fila hay letras, quiere decir que ya fue ocupada por otra palabra.
                        ocupada = true;
                        break;
                    } else {
                        ocupada = false;
                    }
                }

            } while (ocupada); //Lo que hice fue asegurarme de que la palabra va a ser ingresda en una fila que esté vacía

            
            for (int j = columnaRandom; j < columnaRandom + palabras[i].length(); j++) {
                matriz[filaRandom][j] = palabras[i].substring(j - columnaRandom, (j - columnaRandom) + 1);
            }
        }
        
        //Lo que queda es rellenar los espacios vacios con numeros aleatorios del 0 al 9.
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j].equals(" ")) {
                    matriz[i][j] =  Integer.toString((int) (Math.random() * 9));
                }
            }
        }

    }

    /**
     *
     * @param matriz
     */
    public static void imprimirMatriz(String[][] matriz) {

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

    }
}
