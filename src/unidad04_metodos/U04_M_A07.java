//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad04_metodos;

import java.util.*;

 /*Escribe una funci�n a la que se pase como par�metros de entrada una cantidad de d�as,
horas y minutos. La funci�n calcular� y devolver� el n�mero de segundos que existen en 
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
        
       
        
        System.out.println("Dime la cantidad de a�os");
        double anos =sc.nextInt();
        
        System.out.println("Dime la cantidad de d�as");
        int dias = sc.nextInt();
        
        System.out.println("Dime las horas");
        int horas = sc.nextInt();
         
        System.out.println("Dime los minutos");
        int minutos = sc.nextInt();
        
        int segundos = segundosDatosEntrada (dias,horas,minutos,anos);
        System.out.println("El total en segundos de los datos introducidos es: " + segundos);    
    }
}