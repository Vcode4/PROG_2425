//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad05_tablas;

import java.util.*;

 /*ORDENAR-Escribir el método: int[] rellenaPares(int longitud, int fin) 
Que crea y devuelve una tabla ordenada de la longitud especificada, 
que se encuentra rellena con números pares aleatorios comprendidos en 
el rango desde 2 hasta fin (inclusive)*/

public class U05_A05 {
   static int [] rellenaPares(int longitud, int fin){
       Random aleatorio = new Random();
       int ordenada[] = new int [longitud];
       
       for (int i=0;i<longitud; i++){
           ordenada[i]= 2+ aleatorio.nextInt(fin/ 2)*2;
       }
       Arrays.sort(ordenada);
       return ordenada;
   }
        
   public static void main (String[]args){
       Scanner sc = new Scanner (System.in);
       
       System.out.println("Dime que longitud quieres que tenga la tabla: ");
       int longitud = sc.nextInt();
       
       System.out.println("Dime el valor máximo - fin ");
       int fin = sc.nextInt();
       
       int arreglo[] = rellenaPares(longitud,fin);
       System.out.println(Arrays.toString(arreglo));
    }
} 