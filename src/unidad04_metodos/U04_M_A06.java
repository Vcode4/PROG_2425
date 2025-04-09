//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_metodos;

import java.util.*;

 /*METODOS(Return)Crea el metodo muestraPares(int n) que muestre por consola 
los primeros n números pares.*/

public class U04_M_A06 {
    
    static void  muestraPares(int n){
            for (int pares=2; n>0 ; pares+=2, n--){
            System.out.println(pares);
        }               
    } 
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime cuantos numeros pares quieres mostrar: ");
        int numero = sc.nextInt();
        
        muestraPares(numero);
    }
}
