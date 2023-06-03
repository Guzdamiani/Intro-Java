/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java. 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej03Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        String mayuscula = frase.toUpperCase();
        String minuscula = frase.toLowerCase();
        
        System.out.println("Frase en mayúscula: " + mayuscula);
        System.out.println("Frase en minúscula: " + minuscula);

    }

}
