
package unidad07_A05;

import unidad07_A05.*;
import java.util.*;

/**
 *
 * @author VIRGINIA DEL MORAL SÁNCHEZ
 */

/**
EJERCICIO 5. Existen gestores que administran las cuentas bancarias y atienden a sus propietarios.

-Cada cuenta, en caso de tenerlo, cuenta con un único gestor.
-Diseñar la clase Gestor de la que interesa guardar su nombre, teléfono y el importe máximo
autorizado con el que pueden operar.
-Con respecto a los gestores, existen las siguientes restricciones:
• Un gestor tendrá siempre un nombre y un teléfono.
• Si no se asigna, el importe máximo autorizado por operación será de 10000 euros.
• Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todo el mundo
podrá consultarlo.

-EI nombre será público y el importe máximo solo será visible por clases vecinas.

-Modificar la clase Cuentacorriente para que pueda disponer de un objeto Gestor. Modifica
también su constructor. Escribir los métodos necesarios y crea la clase Main para interactuar
con Cuentacorriente y Gestor.
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

