//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad04_condicionales;

/*Solicitar dos números  y mostrar cuál es el mayor, considerando el caso de que los números introducidos sean iguales.*/

import java.util.*;
public class U04_C_A05 {
    public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
        
    //Declaración de variables
    
    int num1,num2;
    
    System.out.println("Introduce un número");
    num1 = sc.nextInt();
    
    System.out.println("Introduce un número diferente al primero");
    num2 = sc.nextInt();
    
    if (num1>num2){
        System.out.println(num1+" es mayor que "+ num2);
    }else if (num1 == num2){
        System.out.println("Los dos números iguales");
    }else
    System.out.println(num2 + " es mayor que " + num1);
}
}
