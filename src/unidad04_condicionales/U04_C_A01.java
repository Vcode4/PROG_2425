//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad04_condicionales;

/*Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.*/

import java.util.*;
public class U04_C_A01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declaración de variables
        int numero;
        boolean par;
        
        System.out.println("Escribe un número:");
        numero = sc.nextInt();
        
        par = numero % 2 == 0;
        
        if (par) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        
    }
}
