//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_bucles;

import java.util.*;

 /*-FOR-Diseñar un programa que muestre la suma de los 10 primeros números impares*/
public class U04_B_A10 {
    public static void main (String[]args){
       
        int sumatorio= 0;
        int contadorImpar=0;
        
        System.out.println("Suma los 10 primeros números impares");
        for(int n=1;contadorImpar < 10; n +=2){//empieza en 1+el contador llega a 10+ a esa variable se le suma 2, para que sea impar
            
           sumatorio += n; //la variable sumatorio va sumando los valores de n
           
           contadorImpar++; //En cada vuelta cuenta hasta que llega a 10
           
           System.out.println(n);
        }
        System.out.println("Sumamos los 10 primeros números impares y de resultado nos da: "+sumatorio);
    }
}