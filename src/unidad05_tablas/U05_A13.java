//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad05_tablas;

import java.util.*;

 /*INSERTAR TABLA ORDENADA:Escribe un programa que:
Cree una tabla de números enteros ordenada de forma ascendente, inicializada con valores predeterminados.
Por ejemplo: {1, 3, 5, 7, 9}.
Solicite al usuario un número entero para insertar en la tabla manteniendo el orden.
Encuentre el índice adecuado para insertar el número (llamado indiceInsercion).
Cree una nueva tabla con un espacio adicional y copie los elementos siguiendo las reglas de la inserción ordenada.
Imprima la tabla original y la tabla resultante tras la inserción.*/
public class U05_A13 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        int tablaOriginal[]={2,4,6,8,10};
        System.out.println("La tabla original es: "+ Arrays.toString(tablaOriginal));
        
        System.out.println("Qué numero es el que quieres insertar: ");
        int numeroInserto = sc.nextInt();
        
        int indiceInsercion= metodoEncontrarIndiceInsercion(tablaOriginal,numeroInserto);
        
        int nuevaTabla[]= new int [tablaOriginal.length + 1];
        
        //Para copiar elementos de la tabla Original a la nueva
        
        for(int i= 0; i <tablaOriginal.length; i++){
            if(i<indiceInsercion){
                nuevaTabla[i]= tablaOriginal[i];
            }else{
                nuevaTabla[i+1]=tablaOriginal[i]; //Muevo para hacer espacio
            }
        }
        
        nuevaTabla[indiceInsercion]=numeroInserto;
        
        System.out.println("Tabla con el número insertado: "+ Arrays.toString(nuevaTabla));
        
    }
    
    static int metodoEncontrarIndiceInsercion(int tabla[], int numero){
        int indice=0;
        while(indice <tabla.length && tabla[indice]< numero){
            indice++;
        }
        return indice;
    }
}
