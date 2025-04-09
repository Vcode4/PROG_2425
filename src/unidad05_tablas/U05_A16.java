//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad05_tablas;

import java.util.*;

 /*COMPARAR: Desarrollar el juego �la c�mara secreta�, que consiste en abrir una c�mara mediante su combinaci�n secreta,
que est� formado por una combinaci�n de d�gitos del 1 al 5:
El jugador especificar� cu�l es la longitud de la combinaci�n; a mayor longitud, mayor ser� la dificultad del juego.
La aplicaci�n genera, de forma aleatoria, una combinaci�n secreta que el usuario tendr� que acertar.
En cada intento se muestra como pista, para cada d�gito de la combinaci�n introducido por el jugador 
(si es mayor, menor o igual que el correspondiente en la combinaci�n secreta).*/

public class U05_A16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BIENVENID@ AL JUEGO DE LA C�MARA SECRETA");

        
        System.out.println("�De qu� longitud quieres que sea la combinaci�n? - A m�s longitud, m�s dificultad");
        int longitudCombinacion = sc.nextInt();

        // COMBINACI�N SECRETA
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
                    System.out.println("N�mero no v�lido. Introduce un n�mero entre 1 y 5:");
                    jugador[i] = sc.nextInt();
                }
            }

            // Ver si es correcto el intento del jugador
       
            if (Arrays.equals(combinacionSecreta, jugador)) {
        acertado = true; // concluye el bucle
        System.out.println("�Lo has conseguido, has abierto la c�mara secreta!.");
    } else {
        System.out.println("�Intento incorrecto! Aqu� tienes pistas:");
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
        System.out.println("Esta es la combinaci�n secreta - para ver si funciona bien: ");
        for (int num : tabla) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // PISTAS
    static void darPistas(int combinacion[], int valor[]) {
        for (int i = 0; i < combinacion.length; i++) {
            if (valor[i] < combinacion[i]) {
                System.out.println("El n�mero 3"
                        + "" + (valor[i]) + " es MENOR");
            } else if (valor[i] > combinacion[i]) {
                System.out.println("El n�mero " + (valor[i]) + " es MAYOR");
            } else {
                System.out.println("El n�mero " + (valor[i]) + " es correcto.");
            }
        }
    }
}
