//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad04_bucles;

import java.util.*;

 /*-FOR-Pedir un n�mero y calcular su factorial. 
Por ejemplo, el factorial de 5 se denota 5! y es igual a 5x4x3x2x1 = 120. */
public class U04_B_A11 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un n�mero");
        int num = sc.nextInt();
        
        int numeroFactorial = 1;
        
        for(int n = num; n > 0; n--){
            numeroFactorial *=n;
        }
        System.out.println("El factorial del n�mero "+num+ " es: "+ numeroFactorial);
    }     
}
