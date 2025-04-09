//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad06_cadenas;

import java.util.*;

/*Diseñar el juego «Acierta la contraseña». La mecánica del juego es la siguiente:
el primer jugador introduce la contraseña; a continuación, el segundo jugador debe 
teclear palabras hasta que la acierte.

Realizar dos versiones:
4 v1 -> El programa indicará si la palabra introducida es mayor o menor alfabéticamente
que la contraseña.
4 v2 -> El programa mostrará la longitud de la contraseña y una cadena con los caracteres
acertados en sus lugares respectivos y asteriscos en los no acertados.*/


//V1
public class U06_A04 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("JUGADOR 1: Inserte la contraseña que quieras");
        String contrasena = sc.nextLine();
     
        boolean acertada = false;
        
        while(!acertada){
            System.out.println("JUGADOR 2: Introduzca una palabra");
            String palabra = sc.nextLine();
            
            if(palabra.equals(contrasena)){
                System.out.println("Has acertado la contraseña, enhorabuena");
                acertada= true;
                
            }else if(palabra.compareTo(contrasena)<0){
                System.out.println("La palabra es menor alfabéticamente");
                
            }else{
                System.out.println("La palabra es mayor alfabéticamente");
            }
        }   
    }
}

//V2
/*public class U06_A4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("JUGADOR 1: Inserte la contraseña que quieras");
        String contrasena = sc.nextLine();
        
        System.out.println("JUGADOR 2: Introduzca una palabra");
        String palabra = sc.nextLine();
        
        System.out.println("Longitud de la contraseña: "+ contrasena.length());
            
            
        }   
    }*/

