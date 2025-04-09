//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_bucles;

import java.util.*;

 /*-DO WHILE- Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. 
EI jugador tendrá que introducir la solución de la suma de dos números
aleatorios comprendidos entre 1 y 100. Mientras la solución introducida 
sea correcta, el juego continuará. En caso contrario, el programa terminará
y mostrará el número de operaciones realizadas correctamente.*/

public class U04_B_A05 {
     public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int contadorCorrectas=0;
        int resultadoJugador;
        boolean solucionCorrecta = true;
        
        do{
            //Si no añadimos el + 1 genera un numero entre el 0 y 99, por eso le sumamos 1 para que sea de 1 a 100
            int numeroaleatorio1 = random.nextInt(100)+ 1; 
            int numeroaleatorio2 = random.nextInt(100)+ 1;
        
            int solucionSuma = numeroaleatorio1 + numeroaleatorio2;
            
            System.out.println("¿Cúal es el resultado de la suma de: "+numeroaleatorio1+" + "+numeroaleatorio2+"?" );
            
            System.out.println("\nJugador, introduce el resultado de la suma de los dos números propuestos: ");
            resultadoJugador = sc.nextInt();
            
            if (resultadoJugador == solucionSuma){
                System.out.println("Tu respuesta es correcta\n");
                contadorCorrectas++;
            }else{
                System.out.println("Tu respuesta es incorrecta\n");
                solucionCorrecta = false;
            }            
        }while (solucionCorrecta);
          
         System.out.println("El total de respuestas correctas del Jugador han sido: "+ contadorCorrectas);
    }
}
