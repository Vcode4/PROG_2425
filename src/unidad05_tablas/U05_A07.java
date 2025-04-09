//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad05_tablas;

import java.util.*;

 /*BUSCAR-Definir un m�todo que tome como
par�metros 2 tablas, la primera con los 6 n�meros de una apuesta de la
primitiva, y la segunda (ordenada) con los 6 n�meros de la
combinaci�n ganadora. La funci�n devolver� el n�mero de aciertos.*/

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