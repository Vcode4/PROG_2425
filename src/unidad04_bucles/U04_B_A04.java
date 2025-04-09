//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad04_bucles;

import java.util.*;

 /*-WHILE-Un centro de investigaci�n de la flora urbana necesita una aplicaci�n 
que muestre cu�l es el �rbol m�s alto. Para ello se introducir� por teclado 
la altura (en cent�metros) de cada �rbol (terminando la introducci�n de datos
cuando se utilice -1 como altura). Los �rboles se identifican mediante etiquetas
con n�meros �nicos correlativos, comenzando en 0. Dise�ar una aplicaci�n que
resuelva el problema planteado.*/
public class U04_B_A04 {
     public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        int alturaArbol= 0; //altura en cm arbol
        int etiqueta = 0;
        int alturaMaximaArbol=0; //altura m�xima de todos los arboles que se pongan
        int etiquetaArbol= 0 ;
        
        System.out.println("Introduce la altura del arbol, en cm (Para terminar introduce -1)");
        alturaArbol = sc.nextInt();
        
        while(alturaArbol != -1){  
            etiqueta++;
            if(alturaArbol >alturaMaximaArbol){
                etiquetaArbol = etiqueta;
                alturaMaximaArbol = alturaArbol;   
            }
            
            System.out.println("Introduce la altura del siguiente �rbol");
            alturaArbol = sc.nextInt();
            }
        
            if(etiquetaArbol != -1){
             System.out.println("El �rbol m�s alto mide "+alturaMaximaArbol+ " centimetros, y tiene la etiqueta "+etiquetaArbol);
            }else {
             System.out.println("No se ha introducido unas alturas v�lidas");
         }           
    }     
}

