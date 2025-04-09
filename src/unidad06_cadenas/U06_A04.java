//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad06_cadenas;

import java.util.*;

/*Dise�ar el juego �Acierta la contrase�a�. La mec�nica del juego es la siguiente:
el primer jugador introduce la contrase�a; a continuaci�n, el segundo jugador debe 
teclear palabras hasta que la acierte.

Realizar dos versiones:
4 v1 -> El programa indicar� si la palabra introducida es mayor o menor alfab�ticamente
que la contrase�a.
4 v2 -> El programa mostrar� la longitud de la contrase�a y una cadena con los caracteres
acertados en sus lugares respectivos y asteriscos en los no acertados.*/


//V1
public class U06_A04 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("JUGADOR 1: Inserte la contrase�a que quieras");
        String contrasena = sc.nextLine();
     
        boolean acertada = false;
        
        while(!acertada){
            System.out.println("JUGADOR 2: Introduzca una palabra");
            String palabra = sc.nextLine();
            
            if(palabra.equals(contrasena)){
                System.out.println("Has acertado la contrase�a, enhorabuena");
                acertada= true;
                
            }else if(palabra.compareTo(contrasena)<0){
                System.out.println("La palabra es menor alfab�ticamente");
                
            }else{
                System.out.println("La palabra es mayor alfab�ticamente");
            }
        }   
    }
}

//V2
/*public class U06_A4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("JUGADOR 1: Inserte la contrase�a que quieras");
        String contrasena = sc.nextLine();
        
        System.out.println("JUGADOR 2: Introduzca una palabra");
        String palabra = sc.nextLine();
        
        System.out.println("Longitud de la contrase�a: "+ contrasena.length());
            
            
        }   
    }*/

