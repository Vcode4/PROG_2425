//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_metodos;

import java.util.*;

 /*SOBRECARGA DE METODOS- Repetir la Actividad 4 (Diseñar un método que recibe como parámetros 
dos números enteros y devuelve el máximo de ambos) con una versión que calcule 
el máximo de tres números.*/

public class U04_M_A08{
    
    static int numeroMaximo(int primerNumero, int segundoNumero, int tercerNumero){
        int mayor = numeroMaximo(primerNumero, segundoNumero);
        return (numeroMaximo(mayor,tercerNumero));
    }
    
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
        
        System.out.println("Introduce el tercer número");
        int tercerNumero = sc.nextInt();
        
        
        System.out.println("El máximo de los números introducidos "+primerNumero+" , " +segundoNumero+ " y "+tercerNumero+ " es: "+ numeroMaximo(primerNumero, segundoNumero, tercerNumero));
} 
}

