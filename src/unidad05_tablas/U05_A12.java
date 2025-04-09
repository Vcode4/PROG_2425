//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad05_tablas;

import java.util.*;

 /*INSERTAR TABLA NO ORDENADA:  Leer y almacenar n números enteros en una tabla,
a partir de la que se construirán otras dos tablas con los elementos con valores
pares e impares de la primera, respectivamente. Las tablas pares e impares deben
mostrarse ordenadas.*/
public class U05_A12 {
    public static void main (String[]args){
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Dime la cantidad de números que quieres que tenga la tabla: ");
        int n = sc.nextInt();
        int numerosTabla[]= new int[n];
        
        System.out.println("Dime los valores para rellenar la tabla: ");
        for(int i = 0; i<numerosTabla.length;i++){
            numerosTabla[i]=sc.nextInt();
        }
        
        int pares[]= new int[0];
        
        int impares []= new int[0];
        
        for(int numero : numerosTabla){
            if (numero % 2==0){
                pares = Arrays.copyOf(pares, pares.length + 1); 
                pares[pares.length - 1]=numero; 
            }else{
                impares = Arrays.copyOf(impares,impares.length + 1);
                impares[impares.length - 1]= numero;
            }
        }
        
        Arrays.sort(pares);
        Arrays.sort(impares);
        
        System.out.println("\nLos numeros que has introducido son: "+ Arrays.toString(numerosTabla));
        System.out.println("\nLos números pares : "+Arrays.toString(pares));
        System.out.println("Los números impares : "+Arrays.toString(impares));
    }
}
