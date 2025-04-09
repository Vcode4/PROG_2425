//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_metodos;

import java.util.*;

 /*RECURSIVIDAD-Diseñar una función recursiva que calcule el enésimo término de la serie de Fibonacci.
En esta serie el enésimo valor se calcula sumando los 2 valores anteriores de la serie.
    Es decir:
    fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)
    fibonacci(0) = 1
    fibonacci(1) = 1*/

public class U04_M_A10{
    
    static int fibonacci(int n){
        int resultado;
        if(n==0 || n==1){ 
            resultado=1;
        }else{
            resultado = fibonacci(n - 1)+ fibonacci(n - 2);
        }
        return(resultado);
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime que valor quieres que le de a n ");
        int n = sc.nextInt();
       
        System.out.println("El enésimo valor de Fibonacci " + n + " es: " + fibonacci(n));
    }
}