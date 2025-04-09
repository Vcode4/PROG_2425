//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad04_condicionales;

/*Pedir tres números y mostrarlos ordenados de mayor a menor.*/

import java.util.*;
public class U04_C_A06 {
    public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    int numero1, numero2 , numero3;
    
    System.out.println("Introduce el primer número");
    numero1 = sc.nextInt();
    
    System.out.println("Introduce el segundo número");
    numero2 = sc.nextInt();
    
    System.out.println("Introduce el tercer número");
    numero3 = sc.nextInt();
    
    //se comparan todas las cobinaciones posibles de números y se ordena de mayor a menor.
    if (numero1>numero2 && numero2>numero3){
        System.out.println("Los números ordenados de mayor a menor quedan así: " + numero1 + " , " + numero2 + " , " + numero3);
    }else if (numero1>numero3 && numero3>numero2 ){
        System.out.println("Los números ordenados de mayor a menor quedan así: " + numero1 + " , " + numero3 + " , " + numero2);
    }else if (numero2 > numero1 && numero1 > numero3){
        System.out.println("Los números ordenados de mayor a menor quedan así: " + numero2 + " , " + numero1 + " , " + numero3);
    }else if (numero2 > numero3 && numero3>numero1){
        System.out.println("Los números ordenados de mayor a menor quedan así: " + numero2 + " , " + numero3 + " , " + numero1);
    }else if (numero3 > numero1 && numero1 > numero2){
        System.out.println("Los números ordenados de mayor a menor quedan así: " + numero3 + " , " + numero1 + " , " + numero2);
    }else if (numero3>numero2 && numero2>numero1){
        System.out.println("Los números ordenados de mayor a menor quedan así: " + numero3 + " , " + numero2 + " , " + numero1);
    }
   
    }
}
    
    
    
