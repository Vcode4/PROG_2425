//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad03;

import java.util.Scanner;

/*Escribir un programa que pida un número al usuario e indique mediante 
un literal booleano (true o false) si el número es par.*/

public class U03_A09 {
    public static void main(String[]args){
    
        System.out.println("Dime un número ");
        
        Scanner sc = new Scanner(System.in);
        
        int numero = sc.nextInt();
        
        boolean numeropar = numero % 2 ==0; /*con % se obtiene el resto de la división. El número que yo ponga se divide entre 2. 
        Y si da de resto 0 es que se trata de un número par*/
        
        System.out.println("¿Este número que me has dicho es par? " + numeropar);
    }
}
