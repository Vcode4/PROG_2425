//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad04_metodos;

import java.util.*;

 /*SOBRECARGA DE METODOS- Repetir la Actividad 4 (Dise�ar un m�todo que recibe como par�metros 
dos n�meros enteros y devuelve el m�ximo de ambos) con una versi�n que calcule 
el m�ximo de tres n�meros.*/

public class U04_M_A08{
    
    static int numeroMaximo(int primerNumero, int segundoNumero, int tercerNumero){
        int mayor = numeroMaximo(primerNumero, segundoNumero);
        return (numeroMaximo(mayor,tercerNumero));
    }
    
    static int numeroMaximo(int primerNumero, int segundoNumero){
        int maximo;
        if (primerNumero>= segundoNumero){
            maximo = primerNumero;  
        } else{ 
            maximo = segundoNumero;
        }  
        return(maximo);
    }
    
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce el primer n�mero:");
        int primerNumero = sc.nextInt();
        
        System.out.println("Introduce el segundo n�mero");
        int segundoNumero = sc.nextInt();
        
        System.out.println("Introduce el tercer n�mero");
        int tercerNumero = sc.nextInt();
        
        
        System.out.println("El m�ximo de los n�meros introducidos "+primerNumero+" , " +segundoNumero+ " y "+tercerNumero+ " es: "+ numeroMaximo(primerNumero, segundoNumero, tercerNumero));
} 
}

