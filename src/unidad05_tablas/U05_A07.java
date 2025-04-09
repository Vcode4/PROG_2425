//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad05_tablas;

import java.util.*;

 /*BUSCAR-Definir un método que tome como
parámetros 2 tablas, la primera con los 6 números de una apuesta de la
primitiva, y la segunda (ordenada) con los 6 números de la
combinación ganadora. La función devolverá el número de aciertos.*/

public class U05_A07 {
   public static void main (String[]args){
   
   int apuestaPrimitiva []= {4,3,2,1,5,6};
   int combinacionGanadora []= {2,4,6,7,8,10};
   int aciertos = busquedaAciertos(apuestaPrimitiva,combinacionGanadora);
   
       System.out.println("Los aciertos son: " + aciertos);
   }
   
   static int busquedaAciertos(int apuestaPrimitiva[], int combinacionGanadora[]){
       int aciertos = 0;
       Arrays.sort(apuestaPrimitiva); //este array ordena la tabla de forma creciente
       Arrays.sort(combinacionGanadora);
       for (int i= 0; i<apuestaPrimitiva.length;i++){
           if(Arrays.binarySearch(combinacionGanadora,apuestaPrimitiva[i]) >= 0){
               aciertos++;
           }
       }
       return aciertos;
   }
} 