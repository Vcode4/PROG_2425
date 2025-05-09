
package unidad10_Excepciones;

import java.io.*;
import java.util.*;


/**
 *
 * @author V
 */

/**
EJERCICIO 2
*Leer el archivo de texto Main.java de uno de los proyectos que hayamos terminado
* y mostrarlo por pantalla. (NOTA: utiliza FileReader)

NOTA: Para cada una de las actividades utiliza: try-catch-finally.**/


public class U10_A02 {
    public static void main(String[] args) {
        leerArchivo();
    }

    public static void leerArchivo() {
        BufferedReader archivo = null;   
        try {
            archivo = new BufferedReader(new FileReader("C:\\Users\\V\\Documents\\NetBeansProjects\\programacion\\src\\unidad10_Excepciones\\Main.java"));
            String linea;            
            System.out.println("El contenido del archivo es: ");
            
            while ((linea = archivo.readLine()) != null) {
                System.out.println(linea);
            }
        } 
        catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } 
        finally {
            try {
                if (archivo != null) {
                    archivo.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}