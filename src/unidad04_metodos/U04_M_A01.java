//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad04_metodos;

import java.util.*;

 /*Dise�ar el m�todo eco() a la que se le pasa como par�metro un n�mero n, y muestra por pantalla n veces el mensaje �Eco...�.*/

public class U04_M_A01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce cuantas veces quieres que se muestre el mensaje");
        int repeticion = sc.nextInt();
        
        ecoMetodo(repeticion);            
    }
    
    static void ecoMetodo ( int repeticion){
        int i;
        for( i = 0; i< repeticion; i++){
            System.out.println("Eco");       
        } 
            
        }  
}
