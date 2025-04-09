//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ
package unidad05_tablas;

import java.util.*;

 /*COMPARAR: Desarrollar el juego «la cámara secreta», que consiste en abrir una cámara mediante su combinación secreta,
que está formado por una combinación de dígitos del 1 al 5:
El jugador especificará cuál es la longitud de la combinación; a mayor longitud, mayor será la dificultad del juego.
La aplicación genera, de forma aleatoria, una combinación secreta que el usuario tendrá que acertar.
En cada intento se muestra como pista, para cada dígito de la combinación introducido por el jugador 
(si es mayor, menor o igual que el correspondiente en la combinación secreta).*/

public class U05_A16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BIENVENID@ AL JUEGO DE LA CÁMARA SECRETA");

        
        System.out.println("¿De qué longitud quieres que sea la combinación? - A más longitud, más dificultad");
        int longitudCombinacion = sc.nextInt();

        // COMBINACIÓN SECRETA
        int combinacionSecreta[] = new int[longitudCombinacion];
        numerosAleatorios(combinacionSecreta);

        // PRUEBAS
        
        imprimirCombinacion(combinacionSecreta);
        
        int jugador[] = new int[longitudCombinacion]; 
        boolean acertado = false;

        while (!acertado) {
            
            System.out.println("Jugador, introduce un valor del 1 al 5: ");
            for (int i = 0; i < longitudCombinacion; i++) {
                jugador[i] = sc.nextInt();
                
                while (jugador[i] < 1 || jugador[i] > 5) {
                    System.out.println("Número no válido. Introduce un número entre 1 y 5:");
                    jugador[i] = sc.nextInt();
                }
            }

            // Ver si es correcto el intento del jugador
       
            if (Arrays.equals(combinacionSecreta, jugador)) {
        acertado = true; // concluye el bucle
        System.out.println("¡Lo has conseguido, has abierto la cámara secreta!.");
    } else {
        System.out.println("¡Intento incorrecto! Aquí tienes pistas:");
        darPistas(combinacionSecreta, jugador);
    }
  }
}
    static void numerosAleatorios(int tablaAleatorio[]) {
        final int MAX=5;
        for (int i = 0; i < tablaAleatorio.length; i++) {
            tablaAleatorio[i] = (int) (Math.random() * MAX) + 1;
        }
    }

    static void imprimirCombinacion(int tabla[]) {
        System.out.println("Esta es la combinación secreta - para ver si funciona bien: ");
        for (int num : tabla) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // PISTAS
    static void darPistas(int combinacion[], int valor[]) {
        for (int i = 0; i < combinacion.length; i++) {
            if (valor[i] < combinacion[i]) {
                System.out.println("El número 3"
                        + "" + (valor[i]) + " es MENOR");
            } else if (valor[i] > combinacion[i]) {
                System.out.println("El número " + (valor[i]) + " es MAYOR");
            } else {
                System.out.println("El número " + (valor[i]) + " es correcto.");
            }
        }
    }
}
