//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_bucles;

import java.util.*;

 /*-FOR-Implementar una aplicación que pida al usuario un número comprendido entre 1 y 10.
Hay que mostrar la tabla de multiplicar de dicho número, asegurándose de que
el número introducido se encuentra en el rango establecido.*/
public class U04_B_A09 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Dime un número del 1 al 10");
        int numero = sc.nextInt();
        
        if(numero<=0 || numero>=11){
            System.out.println("El numero introducido no se encuentra en el rango, vuelve a introducirlo");
        }else {
            System.out.println("La tabla de multiplicar del número "+numero + ":");
            for(int n = 0; n<=10; n++){ 
            System.out.println(numero +"x"+n+ "="+(numero*n));
        }  
        }           
    }
}