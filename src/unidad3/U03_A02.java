//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad3;

import java.util.Scanner;
        
/** TAREA 2: Diseñar un programa que pida un número al usuario por teclado 
 * y a continuación lo muestre. 
 */
public class U03_A02 {
    public static void main(String[]args){
        System.out.print("Escriba un numero:");
        Scanner sc = new Scanner(System.in);
        int numero;
        numero = sc.nextInt();
        System.out.println("Has escrito:" + numero);
        
    }
      
}
