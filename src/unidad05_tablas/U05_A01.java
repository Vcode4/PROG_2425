//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad05_tablas;

import java.util.*;

 /* RECORRER- Crear una tabla de longitud 10 que se inicializará con números aleatorios 
comprendidos entre 1 y 100. Mostrar la suma de todos los números aleatorios     
que se guardan en la tabla.*/

public class U05_A01 {
    public static void main (String[]args){

     Random random = new Random ();
     
     int tablaNueva[] = new int [10]; 
     
     int suma = metodoNumerosAleatorios(tablaNueva); 
     
     System.out.println("La suma de todos los números aleatorios que se guardan en la tabla es: "+ suma);
     }     
        
    static int metodoNumerosAleatorios(int tablaNueva[]){
        Random random = new Random ();
        System.out.println("Estos son los 10 números generados aleatoriamente: ");
        int suma =0;
        for (int i = 0; i < tablaNueva.length; i++){
        tablaNueva[i] = (int)(Math.random()*100+1);
                
        System.out.println(tablaNueva[i]+"");
        }
        for (int valor : tablaNueva){
            suma += valor;    
        }
        System.out.println();
        return suma;     
    }  
       }
        
        
            
    

