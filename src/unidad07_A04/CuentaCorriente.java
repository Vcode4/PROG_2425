
package unidad07_A04;

import unidad07_A04.*;
import java.util.*;

/**
 *
 * @author VIRGINIA DEL MORAL SÁNCHEZ
 */

/**
EJERCICIO 4. Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco.

• Añadir un atributo que almacene el nombre del banco (que es único) en la clase
CuentaCorriente.

• Diseñar un método que permita recuperar y modificar el nombre del banco (al que
pertenecen todas las cuentas corrientes).
 */
public class CuentaCorriente {
 
       static private String nombre_Banco="BBVA";
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
       
       //METODOS GET Y SET PARA ACCEDER Y MODIFICAR EL NOMBRE DEL BANCO
       public static String getNombreBanco(){
            return nombre_Banco;                  
        }
       public static void setNombreBanco(String nuevoNombre){
           CuentaCorriente.nombre_Banco=nuevoNombre;
       }
    }

