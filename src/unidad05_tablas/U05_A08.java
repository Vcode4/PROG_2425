//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad05_tablas;

import java.util.*;

 /*COPIAR-Escribe un programa que solicite al usuario que introduzca el tama�o 
y los valores de una tabla de n�meros enteros, cree una copia de la tabla original
con un tama�o sum�ndole 5 elementos usando el m�todo copyOf e imprima la tabla original
y su copia, mostrando los elementos inicializados por defecto en la copia.*/

public class U05_A08 {
   public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
   
    System.out.println("Dime de que tama�o quieres la tabla ");
    int longitud = sc.nextInt();
       
    int tabla[] = new int[longitud];
       
    System.out.println("Dime los valores que quieres introducir la tabla");
        for(int indice=0; indice< longitud; indice++){
         tabla [indice]= sc.nextInt();
        }
       
    int tablacopia[] = Arrays.copyOf(tabla, longitud+5);
       
    System.out.println("\nEsta es la tabla original: "+ Arrays.toString(tabla));
       
    System.out.println("\nEsta es la copia de la tabla con 5 elementos a�adidos"+ Arrays.toString(tablacopia));
        
       }    
    }

