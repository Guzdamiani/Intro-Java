/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class EJ04Intro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese una temperatura en ºC");
        int tempC = leer.nextInt();
        
        int tempF = 32 + (9 + tempC / 5);
        
        System.out.println("La temperatura correspondiente a " + tempC + "ºC es " + tempF + "ºF.");
        
    }
}
