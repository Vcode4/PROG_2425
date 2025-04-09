//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_bucles;

import java.util.*;

 /*-FOR-Pedir diez números enteros por teclado y mostrar la media.*/
public class U04_B_A08 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        int sumaMedia = 0;
        System.out.println("Introducir diez números");
        
        for (int n = 0; n < 10 ; n++){
            System.out.println("Introduce un numero: ");
            int numero = sc.nextInt();
            sumaMedia += numero; //Se suman los numeros introducidos a esta variable con el +=
        }
        double media = sumaMedia/10.0;
        
        System.out.println("La suma de todos los números introducidos es: "+ sumaMedia);
        System.out.println("La media de los 10 numeros introducidos es: "+media);
    }
}