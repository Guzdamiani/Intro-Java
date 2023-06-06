/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package javaintroextra;

import static java.lang.Math.floor;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej01IntroExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una cantidad de tiempo en minutos:");
        int minutos = leer.nextInt();

        int dias = (int) floor(minutos / 1440);
        int horas = (int) floor((minutos % 1440) / 60);

        System.out.println(dias + " dias, " + horas + " horas");
      
    }
}
