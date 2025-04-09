//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_metodos;

import java.util.*;

 /*METODOS(Return)Diseñar un método que recibe como parámetros dos números enteros 
y devuelve el máximo de ambos*/
public class U04_M_A04 {
    
    static int numeroMaximo(int primerNumero, int segundoNumero){
        int maximo;
        if (primerNumero>= segundoNumero){
            maximo = primerNumero;  
        } else{ 
            maximo = segundoNumero;
        }  
        return(maximo);
    }
    
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce el primer número:");
        int primerNumero = sc.nextInt();
        
        System.out.println("Introduce el segundo número");
        int segundoNumero = sc.nextInt();
    
        System.out.println("El máximo de los números introducidos "+primerNumero+" y " +segundoNumero+ " es: "+ numeroMaximo(primerNumero, segundoNumero));
}   
}