//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad05_tablas;

import java.util.*;

 /*Construye una tabla de 10 elementos del tipo que desees. Declara diferentes variables de tabla que
referenciarán la tabla creada. Comprueba, imprimiendo por pantalla, que todas las variables
contienen la misma referencia.*/

public class ejemplo1 {
    public static void main (String[]args){
        
        int a[], b[], c[];
        int tablaElementos[] = new int [10]; 
        
        a = tablaElementos;
        b=tablaElementos;
        c=tablaElementos;
        
        System.out.println(a);   
        System.out.println(b); 
        System.out.println(c); 
    }  
}