
package unidad07_A01;
import java.util.*;
/**
 *
 * @author VIRGINIA DEL MORAL S�NCHEZ
 */

/**
EJERCICIO 1
 */
public class Main {
    public static void main(String[]args){
        
        CuentaCorriente cuenta1 = new CuentaCorriente("03147867J","Paco");
        CuentaCorriente cuenta2 = new CuentaCorriente("76352493A","Juan");
        
        System.out.println("\nLa informaci�n es:");
        cuenta1.mostrarInfo();
        cuenta2.mostrarInfo();
        
        System.out.println("\nINGRESO DE DINERO");
        cuenta1.ingresarDinero(1000);
        cuenta2.ingresarDinero(200);
        
        System.out.println("\nSACAR DINERO");
        cuenta1.sacarDinero(350);
        cuenta2.sacarDinero(0);
           
    }  
}
