//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad03;

import java.util.Scanner;

/*Realizar una aplicación que solicite al usuario su edad y le indique si es mayor 
de edad (mediante un literal booleano: true o false).*/

public class U03_A08 {
    public static void main(String[]args){
        
    System.out.println("¿Qué edad tienes? ");
        Scanner sc = new Scanner(System.in);
        
        int edadusuario = sc.nextInt();
        
        boolean mayoredad = edadusuario >= 18;
        
        System.out.println("¿Es mayor de edad? " + mayoredad);
        
    }
}
