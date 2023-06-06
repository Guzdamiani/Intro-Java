/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej05IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un la letra correspondiente a su tipo de socio: (A,B o C)");
        String categoria = leer.nextLine();
        categoria = categoria.toUpperCase();

        while (!categoria.equals("A") && !categoria.equals("B") && !categoria.equals("C")) {
            System.out.println("Opción inválida, intente nuevamente");
            categoria = leer.nextLine();
            categoria = categoria.toUpperCase();
        }

        System.out.println("Ingrese el costo del tratamiento a abonar.");
        int costo = leer.nextInt();

        switch (categoria) {
            case "A":
                System.out.println("Por ser un socio tipo " + categoria + " usted posee un descuento del 50%, por lo que deberá abonar " + (double) costo*0.5 + "$.");
                break;
            case "B":
                System.out.println("Por ser un socio tipo " + categoria + " usted posee un descuento del 35%, por lo que deberá abonar " + (double) costo*0.65 + "$.");
                break;
            case "C":
                System.out.println("Por ser un socio tipo " + categoria + " usted no posee descuento. Por lo tanto, deberá abonar " + costo + "$.");
                break;
        }

    }
}
