//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad03;

import java.util.*;
/*
 * Un frutero necesita calcular los beneficios anuales que obtiene de la venta 
de manzanas y peras. Por este motivo, es necesario diseñar una aplicación que 
solicite las ventas (en kilos) de cada semestre para cada fruta. La aplicación 
mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado en 2,35€ 
y el kilo de peras en 1,95€
 */

public class U03_A11 {
     public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        
        //Declaración de variables
        
        double semestre1Peras, semestre2Peras,semestre1Manzanas,semestre2Manzanas;
        double importeTotal;
        
        //Precio por kg de peras y manzanas - constantes, ya que son valores inmutables
        final double PRECIOPERAS = 1.95;
        final double PRECIOMANZANAS = 2.35;
        
        //Ventas semestrales en Kg de PERAS
        System.out.println("Introduce las ventas de PERAS en Kg para cada semestre");
        System.out.println("Primer semestre ");
        semestre1Peras = sc.nextDouble();
        System.out.println("Segundo semestre ");
        semestre2Peras = sc.nextDouble();
        
        //Ventas semestrales en Kg de MANZANAS
        System.out.println("¿Qué ventas se han obtenido en Kg, de MANZANAS, para cada semestre?");
        System.out.println("Primer semestre ");
        semestre1Manzanas = sc.nextDouble();
        System.out.println("Segundo semestre ");
        semestre2Manzanas = sc.nextDouble();
        
        //Importe total de los 2 semestres de PERAS
        
        importeTotal = (semestre1Peras + semestre2Peras) * PRECIOPERAS;
        
        //Importe total de los 2 semestres de MANZANAS
        
        importeTotal += (semestre1Manzanas + semestre2Manzanas) * PRECIOMANZANAS;
       
        
         System.out.println("El importe total de ventas de PERAS es de: " + (semestre1Peras + semestre2Peras)*PRECIOPERAS + "€");
         
         System.out.println("El importe total de ventas de MANZANAS es de: " + (semestre1Manzanas + semestre2Manzanas)*PRECIOMANZANAS + "€");
         
         System.out.println("El importe total de ventas anual de PERAS Y MANZANAS es de : " + importeTotal + "€");
        
        
        
        
        
        
        
     }
    
    
    
}
