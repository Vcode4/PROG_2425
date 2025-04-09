//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad06_cadenas;

import java.util.*;

/*COMPROBACIONES- Los habitantes de Javalandia tienen un idioma algo extra�o; 
cuando hablan siempre comienzan sus frases con �Javalin, javalon�, para despu�s hacer
una pausa m�s o menos larga (la pausa se representa mediante espacios en blanco o tabuladores)
y a continuaci�n expresan el mensaje.
Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan con un silencio,
m�s o menos prolongado y la coletilla �javalen, len, len�.
Se pide dise�ar un traductor que, en primer lugar, nos diga si la frase introducida
est� escrita en el idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo,
nos muestre solo el mensaje sin muletillas.*/

public class U06_A07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una frase para ver si est� en el idioma de Javalandia: ");
        String frase = sc.nextLine();

        String prefijo = "Javal�n, javal�n";
        String sufijo = "javal�n, len, len";

     
        String mensajeTraducido = "";

       
        boolean empieza = frase.startsWith(prefijo);
        boolean termina = frase.endsWith(sufijo);
        
        if (empieza || termina) {
            if (empieza) {
                frase = frase.substring(prefijo.length());
            }
            if (termina) {
                frase = frase.substring (0, frase.length()-sufijo.length());
            }
            mensajeTraducido = frase.strip();
        }

        if (mensajeTraducido.isEmpty()) {
            System.out.println("Tu frase no est� en el idioma de Javalandia.");
        } else {
            System.out.println("Esta es la traducci�n: " + mensajeTraducido);
        }
    }
}