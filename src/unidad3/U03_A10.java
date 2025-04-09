//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad3;

import java.util.*;

/*Dise�ar un algoritmo que nos indique si podemos salir a la calle:
Existen aspectos que influir�n en esta decisi�n: si est� lloviendo y si hemos terminado nuestras tareas.
Solo podremos salir a la calle si no est� lloviendo y hemos finalizado nuestras tareas.
Existe una opci�n en la que, indistintamente de lo anterior, podremos salir a la calle: El hecho de que tengamos que ir a 
la biblioteca (para realizar alg�n trabajo, entregar un libro, etc.).
Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca.
EI algoritmo debe mostrar mediante un booleano (true o false) si es posible que se le otorgue permiso para ir a la calle.*/
public class U03_A10 {
    public static void main(String[]args){
  
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Responde con True o False las siguientes preguntas");
    
    //Se solicita si est� lloviendo
    System.out.println("�Est� lloviendo? ");
    boolean llueve = sc.nextBoolean();
    
    System.out.println("�Has terminado tus tareas? ");
    boolean tarea= sc.nextBoolean();
    
    System.out.println("�Necesitas ir a la biblioteca? ");
    boolean biblioteca= sc.nextBoolean();
    
    boolean salir= !llueve && tarea || biblioteca; //si no llueve 
    
    System.out.println("�Vas a poder salir?: " + salir);
   
    }
}
