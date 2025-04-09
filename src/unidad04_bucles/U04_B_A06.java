//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_bucles;

import java.util.*;

 /*-FOR-Escribir una aplicación para aprender a contar, 
que pedirá un número n y mostrará todos los números del 1 a n.*/
public class U04_B_A06 {
    public static void main (String[]args){
       Scanner sc = new Scanner(System.in);
        
       System.out.println("Esto es una aplicación para aprender a contar");
       System.out.println("Escribe un numero");
       int n = sc.nextInt();
        
       System.out.println("Vamos a contar del 1 al "+ n);
        
       for (int numero=1; numero<=n; numero++){ //inicialización+condición+incremento
           System.out.println(numero+"");
       }
    }
}
