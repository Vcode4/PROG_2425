//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad04_condicionales;

/*Solicitar dos n�meros distintos y mostrar cu�l es el mayor.*/

import java.util.*;
public class U04_C_A03 {
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    
    int numero1, numero2;
    int esMayor;
    
    System.out.println("Dime un n�mero");
    numero1 = sc.nextInt();
    
    System.out.println("Dime un n�mero diferente del primero");
    numero2 = sc.nextInt();
    
    //ternario, si es true numero1, si es false numero2
    esMayor= numero1>numero2 ? numero1 : numero2;
    
    System.out.println("El valor mayor es "+ esMayor);
    
    
    
    }
    
    
    }