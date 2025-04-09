//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad06_cadenas;

import java.util.*;

/*CONVERSI�N- Crear un programa que solicite palabras una a una. 
Terminar cuando alguna de las palabras introducidas sea la cadena �fin� escrita
con cualquier combinaci�n de may�sculas y min�sculas. 
Mostrar la frase completa con todas las palabras introducidas separando las palabras introducidas con espacios
en blanco. La cadena �fin� no aparecer� en la frase final.*/

public class U06_A08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String palabra;
        boolean continuar = true;
        String fraseCompleta="";
        
        System.out.println("Escribe palabras de una en una. Para terminar escribe fin.");
        
        while(continuar){
            System.out.println("Escribe una palabra: ");
            palabra = sc.nextLine();
           
            if(palabra.toLowerCase().equals("fin")){
                continuar = false;
            } else{
                if(fraseCompleta.isEmpty()){
                    fraseCompleta = palabra;
                }else{
                    fraseCompleta = fraseCompleta +" "+palabra;
                } 
            }
            System.out.println("Frase completa: "+fraseCompleta);
        }
     }
}
