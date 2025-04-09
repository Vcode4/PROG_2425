//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad05_tablas;

import java.util.*; //scanner y arrays

 /*BUSCAR-Escribe el método: int buscar(int t[], int clave) Que
busque de forma secuencial en la tabla t
el valor clave. En caso de encontrarlo, devuelve
en qué posición lo encuentra; y en caso contrario, devolverá -1 (inicializa
la tabla, no hace falta pedirla al usuario).*/

public class U05_A06 {
   public static void main (String[]args){
   Scanner sc = new Scanner(System.in);
   int tabla [] = {6,5,9,10,8,7,3,2,0}; //Con esto inicializo
   
   System.out.println("Dime el valor clave que quieres encontrar");
   int valorClave = sc.nextInt();
   int posicion = buscar(tabla, valorClave);
       System.out.println("Tabla: " + Arrays.toString(tabla));
 
   if (posicion != -1){
       System.out.println("\nEl valor " + valorClave + " se encuentra en la posición "+posicion);
   }else{
       System.out.println("\nEl valor "+ valorClave+ " no se encuentra en la tabla");
   }
  }
   static int buscar(int tabla[], int valorClave){
    int i = 0;
    while (i < tabla.length && tabla[i] != valorClave){
        i++; //se pasa asi a la siguiente posicion de la tabla
    }
    //si se sale del bucle:
    if(i < tabla.length){
        return i;
    }else{
        return -1;
    }  
}
} 

