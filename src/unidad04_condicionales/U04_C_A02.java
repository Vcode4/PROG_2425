//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad04_condicionales;

/*Pedir dos n�meros enteros y decir si son iguales o no*/

import java.util.*;
public class U04_C_A02 {
    public static void main(String[]args){
    
        //Declaraci�n de variables con sus respectivos tipados
    int numero1, numero2;
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Introduce el primer numero");
    numero1 = sc.nextInt();
    
    System.out.println("Introduce el segundo numero");
    numero2 = sc.nextInt();
    
    //Si los n�meros son iguales saldr� un true
    
    
    if (numero1 == numero2){
        System.out.println("Los numeros son iguales");
    } else {
        System.out.println("Los numeros no son iguales");
    }
    
    }
}