/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Ej14IntroExtra {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("¿Cuantas familias desea ingresar?");
        int n = leer.nextInt();
        int totalEdad = 0;
        int totalHijos = 0; 
                
        for (int i = 1; i <= n; i++) {
            
            System.out.println("Cuantos hijos tiene la familia nº " + i);
            int m = leer.nextInt();
            totalHijos = totalHijos + m;
            
            for (int j = 1; j <= m; j++) {
                System.out.println("Ingrese la edad del hijo nº " + j + " de la familia " + i);
                int edad = leer.nextInt();
                totalEdad = totalEdad + edad;
            }
        }
        
        double promedioEdad = (double) totalEdad / (double) totalHijos;
        
        System.out.println("El promedio de edad del total de los hijos es " + promedioEdad);
    }
}
