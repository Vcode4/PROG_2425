//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_bucles;

import java.util.*;

 /*Bucles Anidados- Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.*/
public class U04_B_A12 {
    public static void main(String[] args) {
        
        for (int a = 1; a <= 10; a++) { //variable a
            System.out.println("\n\n La tabla de multiplicar de " + a + " es:");
            
        for (int b = 1; b <= 10; b++) { //variable b
            System.out.println(a + " x " + b + " = " + (a * b));    
            }
        }       
    }
 }