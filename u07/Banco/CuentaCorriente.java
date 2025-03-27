package unidad07_A01;

import java.util.*;

/**
 *
 * @author VIRGINIA DEL MORAL SÁNCHEZ
 */

/**
 1. Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así como el
saldo. Las operaciones típicas con una cuenta corriente son:

• Crear una cuenta: se necesita el DNI y nombre del titular. EI saldo inicial será 0.
• Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo
suficiente.
• Ingresar dinero: se incrementa el saldo.
• Mostrar información: muestra la información disponible de la cuenta corriente.

NOTA: Crear una clase Main.java de donde se cree y maneje el objeto de tipo CuentaCorriente.
 */
public class CuentaCorriente {  
          
       String nombreTitular, dni;
       Double saldoCuenta;
       
       public CuentaCorriente(String nombreTitular,String dni ){
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldoCuenta = 0.0;
    }
       public void ingresarDinero(double cantidad){
           if(cantidad > 0){
               saldoCuenta = saldoCuenta +cantidad;
               System.out.println("El ingreso ha sido de "+ cantidad + " €"+".El saldo actual es de : "+ saldoCuenta );
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
                System.out.println("Se ha retirado"+cantidad+" €"+".El saldo actual es de "+saldoCuenta);
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

