//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad04_metodos;

import java.util.*;

 /*METODOS(Return)Dise�ar un m�todo que recibe como par�metros dos n�meros enteros 
y devuelve el m�ximo de ambos*/
public class U04_M_A04 {
    
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
    
        System.out.println("El m�ximo de los n�meros introducidos "+primerNumero+" y " +segundoNumero+ " es: "+ numeroMaximo(primerNumero, segundoNumero));
}   
}