//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad05_tablas;

import java.util.*;

 /*MOSTRAR-Dise�ar un programa que solicite al usuario que introduzca por teclado 5 n�meros decimales.
A continuaci�n, mostrar los n�meros en el mismo orden que se han introducido.*/

public class U05_A02 {
   public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    
    double tabla[] = new double [5];
    
    
    System.out.println("Introduce por teclado 5 n�meros decimales");
    
    for (int numero = 0; numero < tabla.length; numero++){
        tabla[numero]= sc.nextDouble();
    }
    
    System.out.println("Los n�meros que has introducido son: " +Arrays.toString(tabla));
   
   }
        
     }   
