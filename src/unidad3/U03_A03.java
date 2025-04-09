//REALIZADO POR: VIRGINIA DEL MORAL Sï¿½NCHEZ

package unidad3;

//Pedir al usuario su edad y mostrar la que tendria el próximo año

import java.util.Scanner;

public class U03_A03 {
    public static void main(String[]args){
        System.out.println("Introduce tu edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        int total;
        total = edad+1;
        System.out.println("Tu edad el próximo año será de " + total + " años." );
        
    
    }
    
}
