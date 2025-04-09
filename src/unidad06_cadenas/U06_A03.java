//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad06_cadenas;

import java.util.*;

/*Diseñar un método al que se le pase una cadena de caracteres
y la devuelva invertida. Un ejemplo, la cadena «Hola mundo» quedaría «odnum aloH».*/
public class U06_A03 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
        System.out.println("Dime una frase");
        String cadena = sc.nextLine();
        
        String cadenaInvertida = invertirCadena(cadena);
        
        System.out.println("Cadena sin invertir"+cadena);
        System.out.println("Cadena invertida "+cadenaInvertida);
        
    }
    static String invertirCadena(String cadena){
        String resultado = "";
        
        for(int i= cadena.length()-1; i>=0;i--){
        resultado += cadena.charAt(i);
    }
        return resultado;
    }
}
