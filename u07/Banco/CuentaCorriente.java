
package unidad07_A03;

import unidad07_A03.*;
import java.util.*;

/**
 *
 * @author VIRGINIA DEL MORAL SÁNCHEZ
 */

/**
EJERCICIO 3. Modificar la visibilidad de la clase Cuentacorriente para que sea visible desde clases
externas y la visibilidad de sus atributos para que:

• saldo no sea visible para otras clases.
• nombre sea público para cualquier clase.
• dni solo sea visible por clases vecinas.

Realizar un programa para comprobar la visibilidad de los atributos.
 */
public class CuentaCorriente {
 
    /*Este es el añadido de la actividad 3*/
       public String nombreTitular;
       private Double saldoCuenta;
       String dni;
       
       public CuentaCorriente(String nombreTitular,String dni ){
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldoCuenta = 0.0;
    }
       public CuentaCorriente(String dni,double saldoInicial){
           this(dni,"");
           this.saldoCuenta = saldoInicial;
       }
       
       public CuentaCorriente(String dni, String nombreTitular, double saldoInicial){
           this(dni, "");
           this.nombreTitular = nombreTitular;
           this.saldoCuenta = saldoInicial;
       }
       public void ingresarDinero(double cantidad){
           if(cantidad > 0){
               saldoCuenta = saldoCuenta +cantidad;
               System.out.println("El ingreso ha sido de "+ cantidad + " €"+".El saldo actual es de: "+ saldoCuenta );
           }else{
               System.out.println("No puede ingresar una cantidad menor de 0.");
           }
       }
       public boolean sacarDinero(double cantidad){
          boolean operacionExito = false;
           if (cantidad <=0){
               System.out.println("La cantidad tiene que ser mayor a 0.");
            }else if (cantidad > saldoCuenta){
               System.out.println("No se puede retirar "+cantidad+" €"+".Saldo insuficiente");  
           }else{
                saldoCuenta = saldoCuenta - cantidad;
                System.out.println("Se ha retirado "+cantidad+" €"+".El saldo actual es de: "+saldoCuenta);
                operacionExito=true;
            }
           return operacionExito;
       }
       
       public void mostrarInfo(){
           System.out.println("Nombre del Titular: "+ nombreTitular);
           System.out.println("Su DNI es: "+dni);
           System.out.println("Saldo es de: "+ saldoCuenta + " €");
       }
    }

