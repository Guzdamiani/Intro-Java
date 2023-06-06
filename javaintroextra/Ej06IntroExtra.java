/*
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej06IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double sumaPromedio, sumaBajo;
        int nBajo;

        sumaPromedio = 0;
        sumaBajo = 0;
        nBajo = 0;

        System.out.println("Ingrese una cantidad determinada de personas");
        int n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese la altura de la persona " + i + " en metros (ej: 1.65)");
            double altura = leer.nextDouble();
            if (altura < 1.60) {
                sumaBajo = sumaBajo + altura;
                nBajo++;
                sumaPromedio = sumaPromedio + altura;
            } else {
                sumaPromedio = sumaPromedio + altura;
            }
        }

        double promedio = sumaPromedio / n;
        double promedioBajo = sumaBajo / nBajo;

        System.out.println("El promedio de las " + nBajo + " personas menores a 1.60 mts es " + promedioBajo + " mts. ");
        System.out.println("");
        System.out.println("El promedio del total de las " + n + " personas es " + promedio + " mts. ");

    }
}
