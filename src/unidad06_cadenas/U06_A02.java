//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad06_cadenas;

import java.util.*;

/*Diseñar una aplicación que pida al usuario que introduzca una frase por teclado
e indique cuántos espacios en blanco tiene.*/

public class U06_A02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
      System.out.println("Introduce la frase que tu quieras por teclado");
      String fraseUsuario = sc.nextLine();
        
      int espaciosBlanco = contarEspacios(fraseUsuario);
       
        System.out.println("La frase del usuario tiene los siguientes espacios en blanco: "+espaciosBlanco );
      
    }
    
    static int contarEspacios(String frase){
        int contadorEspacios= 0;
        
        for(int i=0 ;i  < frase.length(); i++){
            if(Character.isWhitespace(frase.charAt(i))){
                contadorEspacios++;
            }
        }
        return contadorEspacios;
    }
}
