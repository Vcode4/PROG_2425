//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad04_condicionales;

import java.util.*;
/*Pedir el d�a, mes y a�o de una fecha e indicar si la fecha es correcta. 
Hay que tener en cuenta que existen meses con 28, 30 y 31 d�as 
(no se considerar� los a�os bisiestos) */

public class U04_C_A10 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    
    int dia, mes, anio;
    
        System.out.println("Dime el d�a que es");
        dia = sc.nextInt();
        
        System.out.println("Dime que mes es (1 al 12)");
        mes = sc.nextInt();
        
        System.out.println("Dime que a�o es (2023-2025)");
        anio = sc.nextInt();
        
       
        boolean fechaValida = true;
        
        //Si el mes es menor de 1 o si es mayor de 12 es falso.
        if (mes < 1 || mes > 12){
            fechaValida = false;
            System.out.println("El mes que has introducido no es v�lido");
        }
        
        //Si el a�o es menor a 2023 o si el a�o es mayor de 2025, es falso.
        if (anio <2023 && anio > 2025){
            fechaValida = false;
            System.out.println("El a�o que has introducido no es v�lido");
        }
        
       
         int diasMes=0; //asignandole 0 a la variable se le asigna un valor inicial.
        switch (mes) {
            case 1,3,5,7,8,10,12 -> diasMes = 31;
            case 4,6,9,11 -> diasMes = 30;
            case 2 -> diasMes = 28;
            default -> {
            }
        }
         
         //Si el d�a es menor que 1 o mayor a los dias del mes que se ha especificado anteriormente es falso.
         if (dia < 1 || dia > diasMes){
             fechaValida = false;
             System.out.println("El d�a no es valido para el mes que se ha introducido");
         }
         
         if (fechaValida){
            System.out.println("La fecha introducida es correcta: " + dia + " de " + mes + " del " + anio);
         }else{
             System.out.println("No se ha introducido una fecha correcta");

         } 
    }
}
