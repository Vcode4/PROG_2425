//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad06_cadenas;

import java.util.*;

/*Introducir por teclado dos frases e indicar cuál de ellas es la más corta,
es decir, la que contiene menos caracteres.*/
public class U06_A01 {
    public static void main (String[] args) {
    
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Introduce por teclado la primera frase: ");
        String frase1 =sc.nextLine();
        
        System.out.println("Introduce por teclado la segunda frase");
        String frase2= sc.nextLine();
        
        comparacionFrases(frase1, frase2);
        
    }
    
    static void comparacionFrases(String frase1, String frase2){
        
        if(frase1.length()<frase2.length()){
            System.out.println("La primera frase es más corta que la segunda.");
            
        }else if (frase1.length() > frase2.length()){
            System.out.println("La segunda frase es más corta que la primera.");
            
        }else{
            System.out.println("Las dos frases tienen la misma longitud.");
        }
    }
}
