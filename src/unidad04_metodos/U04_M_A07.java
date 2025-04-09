//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_metodos;

import java.util.*;

 /*Escribe una función a la que se pase como parámetros de entrada una cantidad de días,
horas y minutos. La función calculará y devolverá el número de segundos que existen en 
los datos de entrada.*/

public class U04_M_A07 {
    
    static int segundosDatosEntrada (int dias, int horas, int minutos,double anos){
        
        
        double anosSegundos= anos *31536000;
        int diasSegundos= dias *86400;
        int horasSegundos= horas * 3600;
        int minutosSegundos= minutos * 60;
        
        double segundos = minutosSegundos+diasSegundos+horasSegundos+anosSegundos;
        return (int) segundos;
    }
    
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
       
        
        System.out.println("Dime la cantidad de años");
        double anos =sc.nextInt();
        
        System.out.println("Dime la cantidad de días");
        int dias = sc.nextInt();
        
        System.out.println("Dime las horas");
        int horas = sc.nextInt();
         
        System.out.println("Dime los minutos");
        int minutos = sc.nextInt();
        
        int segundos = segundosDatosEntrada (dias,horas,minutos,anos);
        System.out.println("El total en segundos de los datos introducidos es: " + segundos);    
    }
}