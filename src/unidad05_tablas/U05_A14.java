//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad05_tablas;

import java.util.*;

 /*ELIMINAR-TABLA NO ORDENADA: Escribe el método: int[] eliminarMayores(int t[], int valor)
Que crea y devuelve una copia de la tabla t donde se han eliminado todos los elementos que son mayores que valor. */
public class U05_A14 {
    public static void main (String[]args){
        
        int t[]={8,15,10,4,2};
        int valor = 10;
        
        int tablaNueva[]= eliminarMayores(t,valor);
        
        System.out.println(Arrays.toString(tablaNueva));
    }
    
    static int [] eliminarMayores(int t[],int valor){
        
        int indice = 0; //Inicializo la variable
        
        while(indice < t.length){
            if(t[indice]>valor){
                t[indice]=t[t.length - 1]; //Reemplaza t[indice] con el último elemento
                t = Arrays.copyOf(t, t.length - 1); //Reduce el tamaño del array
                System.out.println(Arrays.toString(t));
            } else {
                indice++;
                System.out.println(Arrays.toString(t));
            }
        }
        return t;
    }
}
