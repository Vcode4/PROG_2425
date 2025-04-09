//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad06_cadenas;

import java.util.*;

/*COMPROBACIONES- Los habitantes de Javalandia tienen un idioma algo extraño; 
cuando hablan siempre comienzan sus frases con «Javalin, javalon», para después hacer
una pausa más o menos larga (la pausa se representa mediante espacios en blanco o tabuladores)
y a continuación expresan el mensaje.
Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan con un silencio,
más o menos prolongado y la coletilla «javalen, len, len».
Se pide diseñar un traductor que, en primer lugar, nos diga si la frase introducida
está escrita en el idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo,
nos muestre solo el mensaje sin muletillas.*/

public class U06_A07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una frase para ver si está en el idioma de Javalandia: ");
        String frase = sc.nextLine();

        String prefijo = "Javalín, javalón";
        String sufijo = "javalén, len, len";

     
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
            System.out.println("Tu frase no está en el idioma de Javalandia.");
        } else {
            System.out.println("Esta es la traducción: " + mensajeTraducido);
        }
    }
}