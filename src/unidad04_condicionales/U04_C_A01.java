//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad04_condicionales;

/*Dise�ar una aplicaci�n que solicite al usuario un n�mero e indique si es par o impar.*/

import java.util.*;
public class U04_C_A01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declaraci�n de variables
        int numero;
        boolean par;
        
        System.out.println("Escribe un n�mero:");
        numero = sc.nextInt();
        
        par = numero % 2 == 0;
        
        if (par) {
            System.out.println("El n�mero " + numero + " es par.");
        } else {
            System.out.println("El n�mero " + numero + " es impar.");
        }
        
    }
}
