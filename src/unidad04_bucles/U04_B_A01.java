//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_bucles;

import java.util.*;

/*-WHILE-Diseñar un programa que muestre, para cada número introducido por teclado, 
si es par, si es positivo y su cuadrado. EI proceso se repetirá hasta que el número introducido sea 0.*/

public class U04_B_A01 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número");
        int numero = sc.nextInt(); 
        
        while (numero != 0){ //Se repetirá este bucle siempre que el número que pongamos no sea igual a 0. Si es igual a 0 se sale del bucle.
            
            if(numero % 2 ==0){
                System.out.println("El número "+ numero + " es par.");
            } else{
                System.out.println("El número "+ numero + " es impar.");
            }
            
            if(numero > 0){
                System.out.println("El número "+ numero + " es positivo.");
            } else if (numero < 0){
                System.out.println("El número "+ numero + " es negativo.");
            }
            
            System.out.println("El cuadrado del número introducido es: " + (numero*numero));
            
            System.out.println("Introduce el siguiente número si quiere continuar. Sino pulse 0 para salir.");
            numero = sc.nextInt();
        }
      
        System.out.println("Se ha terminado el proceso.");
    }
}
