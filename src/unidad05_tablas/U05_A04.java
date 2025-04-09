//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad05_tablas;

import java.util.*;

 /*MOSTRAR-Diseñar la función: int maximo (int t[]),
que devuelva el máximo valor contenido en la tabla t.*/

public class U05_A04 {
  
public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    
    System.out.println("¿Cuántos números deseas introducir?: ");
    int cantidad = sc.nextInt();
    
    int t[] = new int [cantidad];
    
    for(int i = 0 ;i < cantidad;i++){
        System.out.println("Introduce el valor "+(i+1));
        t[i]=sc.nextInt();
    }
      
    System.out.println("\nLos números que has introducido son: "+ Arrays.toString(t));   
   
    System.out.println("\nEl máximo valor contenido en la tabla t es: "+ maximo(t));
   }   
      static int maximo (int t[]){
       int max = t[0];
       
       for (int numero = 1; numero < t.length; numero++){
       if (t[numero]>max){
           max = t[numero];
       }
    }   
         return max;
   }          
   }   
