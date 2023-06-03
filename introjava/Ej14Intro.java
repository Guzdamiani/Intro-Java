/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ej14Intro {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros que desee convertir:");
        int n = leer.nextInt();
        System.out.println("Especifique a que moneda desea convertir este monto: (dolares, yenes o libras)");
        String moneda = leer.next();
        
        Convertir(n, moneda);
        
    }
    
    
    public static void Convertir(int n, String moneda) {
        
        double dolar = 1.2861;
        double libra = 0.86;
        double yen = 129.852;
        
        switch (moneda) {
            case "dolares":
                System.out.println(n + "€ equivalen a " + (double)n*dolar + "$.");
                break;
            case "libras":
                System.out.println(n + "€ equivalen a " + (double)n*libra + " libras.");
                break;
            case "yenes":
                System.out.println(n + "€ equivalen a " + (double)n*yen + " yenes.");
                break;
            default:
                System.out.println("No se reconoce la moneda ingresada.");
                break;
        }
    }
}
