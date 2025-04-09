//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad06_cadenas;

import java.util.*;

/*CADENAS Y TABLAS DE CARÁCTERES- Diseñar un algoritmo que lea del teclado una frase e indique,
para cada letra que aparece en la frase, cuántas veces se repite. Se consideran iguales
las letras mayúsculas y las minúsculas para realizar la cuenta.
Un ejemplo sería:
Frase: En un lugar de La Mancha.
Resultado:
a: 4 veces
c: 1 vez
d: 1 vez
e: 2 veces*/

public class U06_A11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Escribe la frase que quieras: ");
        String frase = sc.nextLine().toLowerCase();
        
        char caracteres []= frase.toCharArray();
        
        for(char c='a'; c <= 'z'; c++){
            int contador =0;   
            
            for(char letra : caracteres){
            if(letra == c){
                contador++;
            }
            }
            if(contador > 0){
            System.out.println(c+ ": "+ contador+(contador ==1 ? " vez" : " veces"));
            }
        }             
    }
}
