//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad03;

import java.util.Scanner;

/*Escribir un programa que pida un n�mero al usuario e indique mediante 
un literal booleano (true o false) si el n�mero es par.*/

public class U03_A09 {
    public static void main(String[]args){
    
        System.out.println("Dime un n�mero ");
        
        Scanner sc = new Scanner(System.in);
        
        int numero = sc.nextInt();
        
        boolean numeropar = numero % 2 ==0; /*con % se obtiene el resto de la divisi�n. El n�mero que yo ponga se divide entre 2. 
        Y si da de resto 0 es que se trata de un n�mero par*/
        
        System.out.println("�Este n�mero que me has dicho es par? " + numeropar);
    }
}
