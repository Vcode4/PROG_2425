//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad05_tablas;

import java.util.*;

 /*ELIMINAR-TABLA ORDENADA:
Escribe un programa que:
-Cree una tabla de números enteros ordenada de forma ascendente, inicializada con valores predeterminados (Ejemplo: {1, 3, 5, 7, 9}).
-Solicite al usuario un número entero para eliminar de la tabla.
-Busque el índice del número a eliminar usando el método Arrays.binarySearch().
-Si el número existe, elimínalo desplazando los elementos que están después hacia la izquierda usando System.arraycopy().
-Ajusta la longitud de la tabla usando Arrays.copyOf().
-Si el número no está en la tabla, informa al usuario.
-Imprime la tabla original y la tabla resultante tras la eliminación.*/

public class U05_A15 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int tabla[]= new int[10];
        
        numerosAleatorios(tabla);
        Arrays.sort(tabla);
        
        System.out.println("La tabla original con números aleatorios: " + Arrays.toString(tabla));
        
        System.out.println("Dime el número entero que quieres eliminar de la tabla: ");
        int numeroBorrar = sc.nextInt();
        
        int indiceBorrado = Arrays.binarySearch (tabla, numeroBorrar);
        
        if(indiceBorrado >= 0){
            System.arraycopy(tabla, indiceBorrado + 1, tabla, indiceBorrado, tabla.length - indiceBorrado - 1);
            tabla = Arrays.copyOf(tabla, tabla.length -1);
            System.out.println("Tabla eliminando el número "+ numeroBorrar +Arrays.toString(tabla));
        }else{
            System.out.println("El número " +numeroBorrar+ " no se encuentra en la tabla.");
        }
    }
    
    static int numerosAleatorios(int tabla[]){
        for(int i=0; i<tabla.length;i++){
            tabla[i] = (int)(Math.random()*100)+1;
        }
        return 0;
    }
}
