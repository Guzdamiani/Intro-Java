/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package javaintroextra;



/**
 *
 * @author guzma
 */
public class EJ02IntroExtra {
    public static void main(String[] args) {

        int A, B, C, D, aux;
        
       A = 5;
       B = 7;
       C = 2;
       D = 3;
       
        System.out.println("Variables:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        System.out.println("");
        System.out.println("");
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
                System.out.println("Variables después del cambio:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        System.out.println("");
        System.out.println("");
      
    }
}
