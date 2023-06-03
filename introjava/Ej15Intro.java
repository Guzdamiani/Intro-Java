/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package introjava;



/**
 *
 * @author guzma
 */
public class Ej15Intro {
    
    public static void main(String[] args){
        
       
        int[] vector = new int[100];
        
        llenarVector(vector);
        
        mostrarVector(vector);
        
        System.out.println("");
        
        
    }
    
    
     public static void llenarVector(int[] vector){
        
         for (int i = 0; i < 100; i++) {
             vector[i] = i;
         }
    }
     
      public static void mostrarVector(int[] vector){
        
         for (int i = 99; i >= 0; i--) {
             System.out.print(vector[i] + ", ");
         }
    }
}
