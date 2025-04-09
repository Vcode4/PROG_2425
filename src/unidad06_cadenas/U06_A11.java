//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad06_cadenas;

import java.util.*;

/*CADENAS Y TABLAS DE CAR�CTERES- Dise�ar un algoritmo que lea del teclado una frase e indique,
para cada letra que aparece en la frase, cu�ntas veces se repite. Se consideran iguales
las letras may�sculas y las min�sculas para realizar la cuenta.
Un ejemplo ser�a:
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
