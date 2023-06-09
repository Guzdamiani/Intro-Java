/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Ej12IntroExtra {

    public static void main(String[] args) {
        
        System.out.println("Contador:");
        System.out.println("");
        
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if (i == 3 || j == 3 || k == 3) {
                        System.out.println(reemplazarDigitos(i) + "-" + reemplazarDigitos(j) + "-" + reemplazarDigitos(k));
                    } else {
                        System.out.println(i + "-" + j + "-" + k);
                    }
                }
            }
        }
    }

    public static String reemplazarDigitos(int num) {
        if (num == 3) {
            String letra = "E";
            return letra;
        } else {
            return Integer.toString(num);
        }
    }
}
