
package unidad07_A02;
import unidad07_A02.*;
import java.util.*;
/**
 *
 * @author VIRGINIA DEL MORAL SÁNCHEZ
 */

/**
EJERCICIO 2
 */

public class Main {
    public static void main(String[]args){
        
        //Creación cuenta con DNI y saldo inicial
        CuentaCorriente cuenta1 = new CuentaCorriente("03147867J",200);
        
        //Creacion cuenta con DNI, nombre y saldo inicial
        CuentaCorriente cuenta2 = new CuentaCorriente("76352493A","Juan", 1200);
        
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
