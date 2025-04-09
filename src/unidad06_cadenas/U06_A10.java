//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad06_cadenas;

import java.util.*;

/*CADENAS Y TABLAS DE CARÁCTERES- Un anagrama es una palabra que resulta del cambio del orden de los caracteres de otra.
Ejemplos de anagramas para la palabra roma son: amor, ramo o mora. Construir un programa que solicite al usuario 
dos palabras e indique si son anagramas una de otra.*/

public class U06_A10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime la primera palabra: ");
        String palabra1 = sc.nextLine().toLowerCase().strip();
        
        System.out.println("Dime la segunda palabra: ");
        String palabra2 = sc.nextLine().toLowerCase().strip();
        
        char tabla1[] = palabra1.toCharArray();
        char tabla2[] = palabra2.toCharArray();
        
        Arrays.sort(tabla1);
        Arrays.sort(tabla2);
        
        String ordenar1 = String.valueOf(tabla1);
        String ordenar2 = String.valueOf(tabla2);
        
        if(ordenar1.equals(ordenar2)){
            System.out.println("Tus palabras son anagramas.");
        }else{
            System.out.println("Tus palabras no son anagramas.");
        }     
    }
}
