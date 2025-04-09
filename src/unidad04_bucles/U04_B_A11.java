//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_bucles;

import java.util.*;

 /*-FOR-Pedir un número y calcular su factorial. 
Por ejemplo, el factorial de 5 se denota 5! y es igual a 5x4x3x2x1 = 120. */
public class U04_B_A11 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un número");
        int num = sc.nextInt();
        
        int numeroFactorial = 1;
        
        for(int n = num; n > 0; n--){
            numeroFactorial *=n;
        }
        System.out.println("El factorial del número "+num+ " es: "+ numeroFactorial);
    }     
}
