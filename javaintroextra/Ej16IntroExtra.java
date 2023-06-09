/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Ej16IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas:");
        int n = leer.nextInt();

        for (int i = 1; i <= n; i++) {

            llenarEImprimir(i, n);

            boolean eleccion = verificarSeguir();

            if (!eleccion) {
                break;
            }
        }
        System.out.println("Has salido con éxito.");
    }

    public static void llenarEImprimir(int i, int n) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona nº " + i);
        String nombre = leer.next();
        System.out.println("Ingrese la edad de la persona nº " + i);
        int edad = leer.nextInt();

        System.out.println("");
        System.out.println("Datos persona nº " + i);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

    }

    public static boolean verificarSeguir() {

        Scanner leer = new Scanner(System.in);
        boolean opcion = false;
        boolean invalida = false;

        do {
            System.out.println("");
            System.out.println("¿Desea continuar ingresando datos? Conteste con si/no");
            String respuesta = leer.next();
            respuesta = respuesta.toLowerCase();

            switch (respuesta) {
                case "si":
                    opcion = true;
                    break;
                case "no":
                    opcion = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente");
                    System.out.println("");
                    invalida = true;
                    break;
            }

        } while (invalida == true);
        
        return opcion;
    }
}
