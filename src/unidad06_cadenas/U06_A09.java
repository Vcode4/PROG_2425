//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad06_cadenas;

import java.util.*;

/*CONVERSIÓN- Realizar un programa que lea una frase del teclado y nos indique
si es palíndroma, es decir, que la frase sea igual leyendo de izquierda a derecha,
que de derecha a izquierda, sin tener en cuenta los espacios. Un ejemplo de frase
palíndroma es: «Dábale arroz a la zorra el abad». Las vocales con tilde hacen que
los algoritmos consideren una frase palíndroma como si no lo fuese. 
Por esto, supondremos que el usuario introduce la frase sin tildes.*/

public class U06_A09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escribe una frase: ");
        String frase = sc.nextLine();
        
        //elimino espacios y convierto a minusculas
        String fraseSinEspacios = frase.replaceAll("\\s", "").toLowerCase();
        String invertida ="";
        
        //invierto la cadena
        for (int i = fraseSinEspacios.length()- 1; i>= 0; i--) {
            invertida += fraseSinEspacios.charAt(i);
        }

        if (fraseSinEspacios.equals(invertida)) {
            System.out.println("La frase es palíndroma.");
        } else {
            System.out.println("La frase no es palíndroma.");
        }
    }
 }

