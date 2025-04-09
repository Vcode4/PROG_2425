//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_bucles;

import java.util.*;

 /*-WHILE-Un centro de investigación de la flora urbana necesita una aplicación 
que muestre cuál es el árbol más alto. Para ello se introducirá por teclado 
la altura (en centímetros) de cada árbol (terminando la introducción de datos
cuando se utilice -1 como altura). Los árboles se identifican mediante etiquetas
con números únicos correlativos, comenzando en 0. Diseñar una aplicación que
resuelva el problema planteado.*/
public class U04_B_A04 {
     public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        int alturaArbol= 0; //altura en cm arbol
        int etiqueta = 0;
        int alturaMaximaArbol=0; //altura máxima de todos los arboles que se pongan
        int etiquetaArbol= 0 ;
        
        System.out.println("Introduce la altura del arbol, en cm (Para terminar introduce -1)");
        alturaArbol = sc.nextInt();
        
        while(alturaArbol != -1){  
            etiqueta++;
            if(alturaArbol >alturaMaximaArbol){
                etiquetaArbol = etiqueta;
                alturaMaximaArbol = alturaArbol;   
            }
            
            System.out.println("Introduce la altura del siguiente árbol");
            alturaArbol = sc.nextInt();
            }
        
            if(etiquetaArbol != -1){
             System.out.println("El árbol más alto mide "+alturaMaximaArbol+ " centimetros, y tiene la etiqueta "+etiquetaArbol);
            }else {
             System.out.println("No se ha introducido unas alturas válidas");
         }           
    }     
}

