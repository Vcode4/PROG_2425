//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad04_bucles;

import java.util.*;

 /*Pedir por consola un n�mero n y dibujar un tri�ngulo rect�ngulo de n elementos de lado, utilizando
para ello asteriscos (*). Por ejemplo, para n = 4:*/

public class U04_B_A13 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un n�mero");
        int num = sc.nextInt();
        
        for(int n = num; n >= 1; n--){ //FILA VA DECRECIENDO
            
            for(int i = 0 ;i<= n ; i++){ //COLUMNA, VA SUMANDO
                System.out.print("*");
            }     
            System.out.println(); //esto lo pongo para que me salte de linea, sino me salen los asteriscos seguidos
        }
    }
}
