//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad3;

import java.util.Scanner;
        
/** TAREA 2: Dise�ar un programa que pida un n�mero al usuario por teclado 
 * y a continuaci�n lo muestre. 
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
