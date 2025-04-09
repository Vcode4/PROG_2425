//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad04_bucles;

import java.util.*;

/*-WHILE-Dise�ar un programa que muestre, para cada n�mero introducido por teclado, 
si es par, si es positivo y su cuadrado. EI proceso se repetir� hasta que el n�mero introducido sea 0.*/

public class U04_B_A01 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un n�mero");
        int numero = sc.nextInt(); 
        
        while (numero != 0){ //Se repetir� este bucle siempre que el n�mero que pongamos no sea igual a 0. Si es igual a 0 se sale del bucle.
            
            if(numero % 2 ==0){
                System.out.println("El n�mero "+ numero + " es par.");
            } else{
                System.out.println("El n�mero "+ numero + " es impar.");
            }
            
            if(numero > 0){
                System.out.println("El n�mero "+ numero + " es positivo.");
            } else if (numero < 0){
                System.out.println("El n�mero "+ numero + " es negativo.");
            }
            
            System.out.println("El cuadrado del n�mero introducido es: " + (numero*numero));
            
            System.out.println("Introduce el siguiente n�mero si quiere continuar. Sino pulse 0 para salir.");
            numero = sc.nextInt();
        }
      
        System.out.println("Se ha terminado el proceso.");
    }
}
