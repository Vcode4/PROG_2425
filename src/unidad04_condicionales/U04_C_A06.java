//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad04_condicionales;

/*Pedir tres n�meros y mostrarlos ordenados de mayor a menor.*/

import java.util.*;
public class U04_C_A06 {
    public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    int numero1, numero2 , numero3;
    
    System.out.println("Introduce el primer n�mero");
    numero1 = sc.nextInt();
    
    System.out.println("Introduce el segundo n�mero");
    numero2 = sc.nextInt();
    
    System.out.println("Introduce el tercer n�mero");
    numero3 = sc.nextInt();
    
    //se comparan todas las cobinaciones posibles de n�meros y se ordena de mayor a menor.
    if (numero1>numero2 && numero2>numero3){
        System.out.println("Los n�meros ordenados de mayor a menor quedan as�: " + numero1 + " , " + numero2 + " , " + numero3);
    }else if (numero1>numero3 && numero3>numero2 ){
        System.out.println("Los n�meros ordenados de mayor a menor quedan as�: " + numero1 + " , " + numero3 + " , " + numero2);
    }else if (numero2 > numero1 && numero1 > numero3){
        System.out.println("Los n�meros ordenados de mayor a menor quedan as�: " + numero2 + " , " + numero1 + " , " + numero3);
    }else if (numero2 > numero3 && numero3>numero1){
        System.out.println("Los n�meros ordenados de mayor a menor quedan as�: " + numero2 + " , " + numero3 + " , " + numero1);
    }else if (numero3 > numero1 && numero1 > numero2){
        System.out.println("Los n�meros ordenados de mayor a menor quedan as�: " + numero3 + " , " + numero1 + " , " + numero2);
    }else if (numero3>numero2 && numero2>numero1){
        System.out.println("Los n�meros ordenados de mayor a menor quedan as�: " + numero3 + " , " + numero2 + " , " + numero1);
    }
   
    }
}
    
    
    
