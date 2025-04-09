//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad05_tablas;

import java.util.*;

 /*INSERTAR TABLA NO ORDENADA: Implementar el método: int[] sinRepetidos (int t[]),
que construye y devuelve una tabla (con longitud apropiada), con los elementos de t,
donde se han eliminado los datos repetidos.*/
public class U05_A11 {
    public static void main (String[]args){
        
        int t []= {1,2,3,4,4,5,6,6,7,8,8,9,9,10,10,11,12,12};
        int resultado []= sinRepetidos(t);
        System.out.println(Arrays.toString(t));
        System.out.println(Arrays.toString(resultado));
    }
    
    static int [] sinRepetidos(int t[]){ //este metodo lo que hace es eliminar cualquier duplicado de t
       int tablaTemporal[] = new int[0]; //inicializo
       
       for (int elemento: t){
           
           if(buscar(tablaTemporal,elemento)== -1){
               tablaTemporal = Arrays.copyOf(tablaTemporal, tablaTemporal.length + 1);
               tablaTemporal[tablaTemporal.length - 1]=elemento;
           }
       }
       return tablaTemporal;
    }
    
    static int buscar(int tabla [], int valorClave){ //busco un elemento(ValorClave) en tabla y devuelve su posicion si está o -1 si no está
        int i = 0;
        while(i<tabla.length && tabla[i] !=valorClave){
            i++;
        }
        return(i<tabla.length)? i: -1;
    }
}
