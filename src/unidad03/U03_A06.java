//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad03;

import java.util.Scanner;

/*Crear una aplicación que calcule la media aritmética de 2 notas enteras.
Hay que tener en cuenta que la media puede contener decimales.*/

public class U03_A06 {
    public static void main(String[]args){
        System.out.println("Dime la 1ª nota que has sacado en el primer examen ");
        Scanner sc = new Scanner(System.in);
        int nota1 = sc.nextInt();
        
        System.out.println("Dime la 2ª nota que has sacado en el segundo examen ");
     
        int nota2 = sc.nextInt();
        
        double media = (nota2 + nota1)/2.0; //se pone el 2.0 para que de decimal en vez de entero
                
        System.out.println("La nota media aritmética de los dos examenes es de : " + media);
        
        
    }
    
}
