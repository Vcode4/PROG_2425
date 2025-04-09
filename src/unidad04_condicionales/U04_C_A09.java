//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad04_condicionales;

import java.util.*;
/*Idear un programa que solicite al usuario un número comprendido entre 1 y 7,
correspondiente a un día de la semana. Se debe mostrar el nombre del día de la
semana al que corresponde. Por ejemplo, el número 1 corresponde a «lunes» y el 6 a «sábado»*/

public class U04_C_A09 {
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    int dia;
    
    System.out.println("Introduce un número comprendido entre 1 y 7");
    dia = sc.nextInt();
    
    switch (dia) {
        case 1 -> {
            System.out.println("Lunes");
        }
        case 2 -> {
            System.out.println("Martes");
        }
        case 3 -> {
            System.out.println("Miércoles");
        }
        case 4 -> {
            System.out.println("Jueves");
        }
        case 5 ->{
            System.out.println("Viernes");
        }
        case 6 ->{
            System.out.println("Sábado");
        }
        case 7 ->{
            System.out.println("Domingo");
        }
        default ->{
            System.out.println("No existe ese día");
        }
    }
    
    }
}
