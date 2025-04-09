//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad06_cadenas;

import java.util.*;

/*BUSQUEDA- Diseñar un programa que solicite al usuario una frase y una palabra. 
A continuación, buscará cuántas veces aparece la palabra en la frase.*/

public class U06_A06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Usuario dime una frase: ");
        String frase = sc.nextLine();
        
        System.out.println("Dime una palabra para buscarla en la frase: ");
        String palabra = sc.next(); //lee la palabra sin espacios
        
        int apariciones =buscarPalabra(frase, palabra);
        
        System.out.println ("Aparece " + palabra + " " + apariciones + " veces en la frase.");
        
            }
    static int buscarPalabra (String frase, String palabra){
        int contadorVeces=0, posicion= frase.indexOf(palabra);
        
        while(posicion != -1){ //mientras la palabra se encuentre
            contadorVeces ++;
            posicion = frase.indexOf(palabra, posicion + palabra.length());
        }
        return contadorVeces;
    }
}
