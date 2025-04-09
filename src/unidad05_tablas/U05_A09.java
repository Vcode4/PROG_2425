//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad05_tablas;

import java.util.*;

 /*COPIAR-Crea un programa que genere una tabla de números enteros aleatorios
entre 1 y 100 con un tamaño de 20 elementos y solicite al usuario dos índices 
(desde y hasta) y use copyOfRange para crear una nueva tabla con los elementos
dentro de ese rango y después imprima ambas tablas, indicando el rango copiado.*/

public class U05_A09 {
   public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
     int tablaOriginal[] = new int [20];
     
     for (int i = 0; i < 20; i++){
         tablaOriginal[i] = (int)(Math.random()*100)+1;
     }
    
       System.out.println("Tabla original: ");
       System.out.println(Arrays.toString(tablaOriginal));
       
       System.out.println("Dime el índice desde(se cuenta): ");
       int desde = sc.nextInt();
       System.out.println("Dime el índice hasta (No se incluye): ");
       int hasta = sc.nextInt();
       
       if (desde >= tablaOriginal.length || desde < 0 || desde > hasta || hasta >= tablaOriginal.length || hasta < 0 ){
           System.out.println("Indices no validos. Intentalo de nuevo");
           return;
       }
       
       int tablaCopia []= Arrays.copyOfRange(tablaOriginal,desde,hasta);
       System.out.println("Tabla Copiada: "+Arrays.toString(tablaCopia));
        
    }
} 

