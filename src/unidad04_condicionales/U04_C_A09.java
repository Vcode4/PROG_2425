//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad04_condicionales;

import java.util.*;
/*Idear un programa que solicite al usuario un n�mero comprendido entre 1 y 7,
correspondiente a un d�a de la semana. Se debe mostrar el nombre del d�a de la
semana al que corresponde. Por ejemplo, el n�mero 1 corresponde a �lunes� y el 6 a �s�bado�*/

public class U04_C_A09 {
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    int dia;
    
    System.out.println("Introduce un n�mero comprendido entre 1 y 7");
    dia = sc.nextInt();
    
    switch (dia) {
        case 1 -> {
            System.out.println("Lunes");
        }
        case 2 -> {
            System.out.println("Martes");
        }
        case 3 -> {
            System.out.println("Mi�rcoles");
        }
        case 4 -> {
            System.out.println("Jueves");
        }
        case 5 ->{
            System.out.println("Viernes");
        }
        case 6 ->{
            System.out.println("S�bado");
        }
        case 7 ->{
            System.out.println("Domingo");
        }
        default ->{
            System.out.println("No existe ese d�a");
        }
    }
    
    }
}
