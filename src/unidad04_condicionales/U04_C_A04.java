//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad04_condicionales;

/*Pedir dos números y mostrarlos ordenados de forma decreciente.*/

import java.util.*;
public class U04_C_A04 {
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    
    int num1, num2;
    
    System.out.println("Introduce el primer número");
    num1 = sc.nextInt();
    
    System.out.println("Introduce el segundo número");
    num2 = sc.nextInt();
    
    if (num1>num2){ //Si el num1 es mayor que num2 se muestra lo que está dentro de las llaves. 
        System.out.println("Los numeros introducidos ordenados de forma decreciente: " + num1 +" , "+ num2);
    }else{
        System.out.println("Los numeros introducidos ordenados de forma decreciente: " + num2 +" , "+ num1);
    }
    //Si esto no se cumple se va directamente al else
    
    }
}