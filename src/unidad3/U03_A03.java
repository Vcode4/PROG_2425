//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad3;

//Pedir al usuario su edad y mostrar la que tendria el pr�ximo a�o

import java.util.Scanner;

public class U03_A03 {
    public static void main(String[]args){
        System.out.println("Introduce tu edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        int total;
        total = edad+1;
        System.out.println("Tu edad el pr�ximo a�o ser� de " + total + " a�os." );
        
    
    }
    
}
