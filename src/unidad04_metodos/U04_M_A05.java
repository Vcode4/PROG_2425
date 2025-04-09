//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_metodos;

import java.util.*;

 /*METODOS(Return)Crear un método que, mediante un booleano, 
indique si el carácter que se pasa como parámetro de entrada 
corresponde con una vocal*/

public class U04_M_A05 {
    
    static boolean letraVocal(char letra){
        
        switch (letra){
            
            case 'a','e','i','o','u','A','E','I','O','U' ->{
                return true;
            }
            default ->{
                return false;
        }
    }
    }
    
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una letra para saber si es vocal: ");
        char letra = sc.next().charAt(0);
        
        if(letraVocal(letra)){
            System.out.println("La letra introducida es una vocal.");
        }else{
            System.out.println("La letra que has introducido no es una vocal.");
        }
    }
}
