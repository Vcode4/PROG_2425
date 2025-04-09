
package unidad07_A05;

import unidad07_A05.*;
import java.util.*;
/**
 *
 * @author VIRGINIA DEL MORAL SÁNCHEZ
 */

/**
 EJERCICIO 5
 */
public class Main {
     public static void main(String[]args){
        
        //Creación cuenta con DNI y saldo inicial
        unidad07_A02.CuentaCorriente cuenta1 = new unidad07_A02.CuentaCorriente("03147867J",200);
        
        //Creacion cuenta con DNI, nombre y saldo inicial
        unidad07_A02.CuentaCorriente cuenta2 = new unidad07_A02.CuentaCorriente("76352493A","Juan", 1200);
        
        System.out.println("\nLa información es: ");
        cuenta1.mostrarInfo();
        cuenta2.mostrarInfo();
        
        System.out.println("\nINGRESO DE DINERO: ");
        cuenta1.ingresarDinero(1000);
        cuenta2.ingresarDinero(200);
        
        System.out.println("\nSACAR DINERO: ");
        cuenta1.sacarDinero(350);
        cuenta2.sacarDinero(0);
           
    }  
}

