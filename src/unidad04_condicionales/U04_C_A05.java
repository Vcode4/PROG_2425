//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad04_condicionales;

/*Solicitar dos n�meros  y mostrar cu�l es el mayor, considerando el caso de que los n�meros introducidos sean iguales.*/

import java.util.*;
public class U04_C_A05 {
    public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
        
    //Declaraci�n de variables
    
    int num1,num2;
    
    System.out.println("Introduce un n�mero");
    num1 = sc.nextInt();
    
    System.out.println("Introduce un n�mero diferente al primero");
    num2 = sc.nextInt();
    
    if (num1>num2){
        System.out.println(num1+" es mayor que "+ num2);
    }else if (num1 == num2){
        System.out.println("Los dos n�meros iguales");
    }else
    System.out.println(num2 + " es mayor que " + num1);
}
}
