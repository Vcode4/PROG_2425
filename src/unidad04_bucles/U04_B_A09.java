//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad04_bucles;

import java.util.*;

 /*-FOR-Implementar una aplicaci�n que pida al usuario un n�mero comprendido entre 1 y 10.
Hay que mostrar la tabla de multiplicar de dicho n�mero, asegur�ndose de que
el n�mero introducido se encuentra en el rango establecido.*/
public class U04_B_A09 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Dime un n�mero del 1 al 10");
        int numero = sc.nextInt();
        
        if(numero<=0 || numero>=11){
            System.out.println("El numero introducido no se encuentra en el rango, vuelve a introducirlo");
        }else {
            System.out.println("La tabla de multiplicar del n�mero "+numero + ":");
            for(int n = 0; n<=10; n++){ 
            System.out.println(numero +"x"+n+ "="+(numero*n));
        }  
        }           
    }
}