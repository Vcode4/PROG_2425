//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad3;

import java.util.*;


/*Dise�ar una aplicaci�n que calcule la longitud y el �rea de una circunferencia.
Para ello, el usuario debe introducir el radio (que puede contener decimales).*/

public class U03_A07 {
    public static void main(String[]args){
        
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    
      System.out.print("Escribe el radio de la circunferencia: ");
      
      double radio = sc.nextDouble();
      
      double longitud = 2 * Math.PI * radio;
      
      double area = Math.PI * Math.pow(radio,2); 
      
        System.out.println("El c�rculo tiene un area de " + area);
        System.out.println("La circunferencia tiene una longitud de " + longitud);
        
    }
}
