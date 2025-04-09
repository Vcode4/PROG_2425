//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad05_tablas;

import java.util.*;

 /*MOSTRAR-Escribir una aplicaci�n que solicite al usuario cu�ntos n�meros desea introducir.
  A continuaci�n, introducir por teclado esa cantidad de n�meros enteros, 
  y por �ltimo, mostrar en el orden inverso al introducido.*/

public class U05_A03 {
   public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
   
    int cantidad;
    
    System.out.println("�Cu�ntos n�meros deseas introducir?: ");
    cantidad = sc.nextInt();
    
    int tabla[] = new int [cantidad];
    
    for (int numero = 0; numero < cantidad; numero++){
       System.out.println("Introduce el valor "+ (numero + 1)+ ": ");
       tabla[numero]= sc.nextInt();
    }   
       System.out.println("Los n�meros que has introducido son: "+ Arrays.toString(tabla));
    
    int tablaOrdenInvertido[] = new int [cantidad];
    
    for(int numero = cantidad-1 ;numero >= 0; numero--){
        tablaOrdenInvertido[cantidad - 1 - numero]=tabla[numero];  
    }
    
       System.out.println("Los valores introducidos en el orden inverso son: " + Arrays.toString(tablaOrdenInvertido));
    }
        
    }   
