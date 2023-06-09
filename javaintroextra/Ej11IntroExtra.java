/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Ej11IntroExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int num = leer.nextInt();
        int aux = num;
        int contDigitos = 0;
        
        do{
            num = (int) Math.round((double) num / 10);
            contDigitos++;
        } while(num >= 1);
        
        System.out.println("El número " + aux + " posee " + contDigitos + " digitos.");
    }
}
