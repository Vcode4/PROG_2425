//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad05_tablas;

import java.util.*;

/*MATRICES: Crear una tabla bidimensional (matriz) de longitud 5 x 5 y rellenarla de la siguiente forma:
El elemento de la posición [n][m] debe contener el valor 10 x n + m.
Después se debe mostrar su contenido.
NOTA: Realizarlo con bucles anidados y con deepToString().
¿puedes hacerlo con for-each?*/
public class U05_A17 {
    public static void main(String[] args) {
    
      int bidimensional[][]=new int [5][5];
      
        rellenarDatos(bidimensional);
        mostrarMatriz(bidimensional);
    }
    
    static void rellenarDatos(int bidimensional[][]){
        System.out.println("BUCLES ANIDADOS");
        
    for(int x = 0; x <bidimensional.length;x++){
        for(int y = 0; y <bidimensional[x].length; y++){
            bidimensional[x][y]=10* x + y;
            
            System.out.print(bidimensional[x][y] + "\t");
        }
        System.out.println();
    }
}
    //FOR-EACH
    
    static void mostrarMatriz(int matriz[][]) {
        System.out.println("\nBUCLE FOR-EACH");
        for (int fila[] : matriz) {        
            for (int valorFila : fila) {  
                
                System.out.print(valorFila + "\t "); 
            }
            System.out.println(); //saltar de linea
        }
    }
}
