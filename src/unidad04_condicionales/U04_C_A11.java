//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad04_condicionales;

import java.util.*;
/*Escribir un programa que pida una hora de la siguiente forma: hora, minutos 
y segundos. EI programa debe mostrar qué hora será un segundo más tarde. 
Por ejemplo: hora actual [10:41:59] hora actual +1 segundo: [10:42:00]
 */
public class U04_C_A11 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        int hora, minutos, segundos;
        
        System.out.println("Dime la hora [xx:  :  ] (1 a 23) ") ;
        hora = sc.nextInt();
        
        System.out.println("Dime los minutos [  :xx:  ] (1 a 59) ");
        minutos = sc.nextInt();
        
        System.out.println("Dime los segundos [  :  :xx] (1 a 59)  ");
        segundos = sc.nextInt();
        
        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59){ 
        
        
        if (segundos == 59){
            segundos=0;
            minutos++;  
        }if (minutos == 59 && segundos == 59 || minutos == 60){
            minutos = 0;
            hora ++;   
        }if (hora == 24 || hora ==25 || hora == 23 && minutos == 59 && segundos == 59){
            hora = 0;
        }
        
        System.out.println("La hora actual sumando 1 segundo es: [" + hora + ":" + minutos + ":" + segundos + "]");
        }else {
        System.out.println("La hora que has ingresado no es válida.");
        }
    }
}   