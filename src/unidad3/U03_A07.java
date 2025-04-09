//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad3;

import java.util.*;


/*Diseñar una aplicación que calcule la longitud y el área de una circunferencia.
Para ello, el usuario debe introducir el radio (que puede contener decimales).*/

public class U03_A07 {
    public static void main(String[]args){
        
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    
      System.out.print("Escribe el radio de la circunferencia: ");
      
      double radio = sc.nextDouble();
      
      double longitud = 2 * Math.PI * radio;
      
      double area = Math.PI * Math.pow(radio,2); 
      
        System.out.println("El círculo tiene un area de " + area);
        System.out.println("La circunferencia tiene una longitud de " + longitud);
        
    }
}
