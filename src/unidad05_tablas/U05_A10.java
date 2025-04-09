//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad05_tablas;

import java.util.*;

 /*COPIAR-Implementa un programa que declare dos tablas de caracteres de tama�o 
10: una llamada origen inicializada con las letras 'a' a 'j', y otra llamada 
destino inicializada con valores por defecto. Despu�s usar arraycopy para copiar
5 elementos desde el �ndice 2 de origen al �ndice 3 de destino y por �ltimo imprima 
ambas tablas antes y despu�s de realizar la copia.*/

public class U05_A10 {
   public static void main (String[]args){
   
   char origen[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
   char destino[] = new char [10];
        
       System.out.println("TABLAS ANTES DE LA COPIA: ");
       System.out.println("Tabla Origen: " + Arrays.toString(origen));
       System.out.println("Tabla Destino: " + Arrays.toString(destino));
       
       System.arraycopy(origen,2,destino,3,5);
       
       System.out.println("\nTABLAS DESPU�S DE LA COPIA: ");
       System.out.println("Tabla Origen: " + Arrays.toString(origen));
       System.out.println("Tabla Destino: " + Arrays.toString(destino));
        
    }
} 

