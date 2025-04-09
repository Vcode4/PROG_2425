//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad04_condicionales;

import java.util.*;
/*Crear una aplicación que solicite al usuario una fecha (día, mes y año)
y muestre la fecha correspondiente al día siguiente.*/

public class U04_C_A12 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    
    int dia, mes, anio;
    
        System.out.println("Dime el día que es (1 al 31)");
        dia = sc.nextInt();
        
        System.out.println("Dime que mes es (1 al 12)");
        mes = sc.nextInt();
        
        System.out.println("Dime que año es");
        anio = sc.nextInt();
        
        //Para ver si la fecha ingresada es válida
       if (dia < 1 || dia > 31 || mes < 1 || mes > 12){
         System.out.println("La fecha que has ingresado no es valida");
     } else {
         dia++;
     } 
     
     //NÚMERO DE DÍAS DEPENDIENDO DEL MES ELEGIDO    
    int diasMes=0; //asignandole 0 a la variable se le asigna un valor inicial.
        switch (mes) {
            case 1,3,5,7,8,10,12 -> diasMes = 31;
            case 4,6,9,11 -> diasMes = 30;
            case 2 -> diasMes = 28;
            default -> {
            }
        }  
            
      if (dia > diasMes){
         dia = 1;
         mes ++;
     }if (mes >12){ 
         mes = 1;
         anio++;
     }
     
    System.out.println("La fecha correspondiente al día siguiente es: [" + dia + "-" + mes + "-"+ anio + "]");                   
}}
