//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad04_metodos;

import java.util.*;

 /*Escribir un m�todo a la que se le pasen dos enteros y muestre 
todos los n�meros comprendidos entre ellos.*/

public class U04_M_A02 {
    Scanner sc = new Scanner (System.in);
      public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el primer n�mero");
        int primerNumero = sc.nextInt();
        System.out.println("Introduce el segundo n�mero");
        int segundoNumero = sc.nextInt();
        
        metodoNumeros (primerNumero, segundoNumero);
    }
    
    static void metodoNumeros ( int primerNumero, int segundoNumero){
        
        if (primerNumero > segundoNumero){
        
            int valorPrimerNumero = primerNumero;
            primerNumero = segundoNumero;
            segundoNumero = valorPrimerNumero;    
        }
        
        int n;
        for (n = primerNumero +1; n < segundoNumero; n++){
            System.out.println(""+n);
                    
        }  
        System.out.println(" ");
    }   
}   