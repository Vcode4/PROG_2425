//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad04_condicionales;

/*Escribir una aplicaci�n que indique cu�ntas cifras tiene un n�mero entero introducido por teclado, 
que estar� comprendido entre 0 y 99.999*/

import java.util.*;
public class U04_C_A07 {
    public static void main(String[]args){
    
         Scanner sc = new Scanner(System.in);
    
    int numero;
    
    System.out.println("Dime un numero entre 0 y 99.999");
    numero = sc.nextInt();
    
    
    if (numero < 10){
        System.out.println("Este n�mero tiene 1 cifras");
    } else if (numero < 100){
        System.out.println("Este n�mero tiene 2 cifras");
    } else if (numero < 1000){
        System.out.println("Este n�mero tiene 3 cifras");   
    } else if (numero < 10000){
        System.out.println("Este n�mero tiene 4 cifras");
    } else if (numero >100000){
        System.out.println("Este n�mero tiene 5 cifras");
    }
    }
}