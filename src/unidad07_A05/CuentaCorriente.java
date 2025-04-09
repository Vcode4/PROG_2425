
package unidad07_A05;

import unidad07_A05.*;
import java.util.*;

/**
 *
 * @author VIRGINIA DEL MORAL S�NCHEZ
 */

/**
EJERCICIO 5. Existen gestores que administran las cuentas bancarias y atienden a sus propietarios.

-Cada cuenta, en caso de tenerlo, cuenta con un �nico gestor.
-Dise�ar la clase Gestor de la que interesa guardar su nombre, tel�fono y el importe m�ximo
autorizado con el que pueden operar.
-Con respecto a los gestores, existen las siguientes restricciones:
� Un gestor tendr� siempre un nombre y un tel�fono.
� Si no se asigna, el importe m�ximo autorizado por operaci�n ser� de 10000 euros.
� Un gestor, una vez asignado, no podr� cambiar su n�mero de tel�fono. Y todo el mundo
podr� consultarlo.

-EI nombre ser� p�blico y el importe m�ximo solo ser� visible por clases vecinas.

-Modificar la clase Cuentacorriente para que pueda disponer de un objeto Gestor. Modifica
tambi�n su constructor. Escribir los m�todos necesarios y crea la clase Main para interactuar
con Cuentacorriente y Gestor.
 */
public class CuentaCorriente {
 
    /*Este es el a�adido de la actividad 3*/
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
               System.out.println("El ingreso ha sido de "+ cantidad + " �"+".El saldo actual es de: "+ saldoCuenta );
           }else{
               System.out.println("No puede ingresar una cantidad menor de 0.");
           }
       }
       public boolean sacarDinero(double cantidad){
          boolean operacionExito = false;
           if (cantidad <=0){
               System.out.println("La cantidad tiene que ser mayor a 0.");
            }else if (cantidad > saldoCuenta){
               System.out.println("No se puede retirar "+cantidad+" �"+".Saldo insuficiente");  
           }else{
                saldoCuenta = saldoCuenta - cantidad;
                System.out.println("Se ha retirado "+cantidad+" �"+".El saldo actual es de: "+saldoCuenta);
                operacionExito=true;
            }
           return operacionExito;
       }
       
       public void mostrarInfo(){
           System.out.println("Nombre del Titular: "+ nombreTitular);
           System.out.println("Su DNI es: "+dni);
           System.out.println("Saldo es de: "+ saldoCuenta + " �");
       }
    }

