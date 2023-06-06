/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej04IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String romano = "";
       
        System.out.println("Ingrese un número entre el 1 y el 10");
        int numero = leer.nextInt();

        while (numero < 1 || numero > 10) {
            System.out.println("El numero ingresado no es válido. Intente nuevamente");
            numero = leer.nextInt();
        }

        switch (numero) {
            case 1:
                romano = "I";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
            case 10:
                romano = "X";
                break;
            default:
        }
        System.out.println("El numero " + numero + " se escribe " + romano + " en números romanos.");
    }
    
    
}
