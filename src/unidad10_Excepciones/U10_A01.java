package unidad10_Excepciones;

import java.util.*;

/**
 * @author VIRGINIA DEL MORAL S�NCHEZ
 */

/**
EJERCICIO 1. 

Escribir el m�todo:

Integer leerEntero()
�Que pida un entero por consola, lo lea del teclado y lo devuelva.
�Si la cadena introducida por consola no tiene el formato correcto, muestra un mensaje de error y vuelve a pedirlo.**/


public class U10_A01 {
    
   public static void main(String[] args) {
        Integer numero = leerEntero();
        System.out.println("El n�mero que has puesto es: " + numero);
    }

    public static Integer leerEntero() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Introduce un n�mero entero: ");
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Tienes que introducir un n�mero entero.");
            }
        }
    }
  }


