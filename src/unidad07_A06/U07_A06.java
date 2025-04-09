
package unidad07_A06;

import java.util.*;

/**
 *
 * @author VIRGINIA DEL MORAL SÁNCHEZ
 */

/**
EJERCICIO 6. Escribir un programa que lea por teclado una hora, minutos y segundos y un número n de
veces:

• EI programa mostrará la hora completa introducida y las n siguientes, que se diferencian
en más un segundo.
• Para ello hemos de diseñar previamente la clase Hora que dispone de los atributos hora,
minuto y segundo.
• Los valores de los atributos se controlarán mediante métodos set/get.
 */

public class U07_A06 {    
    static class Hora {
        private int hora;
        private int minuto;
        private int segundo;

        public Hora(int hora, int minuto, int segundo) {
            setHora(hora);
            setMinuto(minuto);
            setSegundo(segundo);
        }   

        public void setHora(int hora) {
            if (hora >= 0 && hora < 24) {
                this.hora = hora;
            } else {
                this.hora = 0;
            }
        }

        public void setMinuto(int minuto) {
            if (minuto >= 0 && minuto < 60) {
                this.minuto = minuto;
            } else {
                this.minuto = 0;
            }
        }

        public void setSegundo(int segundo) {
            if (segundo >= 0 && segundo < 60) {
                this.segundo = segundo;
            } else {
                this.segundo = 0;
            }
        }

        public int getHora() {
            return hora;
        }

        public int getMinuto() {
            return minuto;
        }

        public int getSegundo() {
            return segundo;
        }

        public void incrementarSegundo() {
            segundo++;
            if (segundo == 60) {
                segundo = 0;
                minuto++;
                if (minuto == 60) {
                    minuto = 0;
                    hora++;
                    if (hora == 24) {
                        hora = 0;
                    }  
                }
            }
        }

        public void mostrarHora() {
            System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Introduce la hora: ");
        int h = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int m = sc.nextInt();
        System.out.print("Introduce los segundos: ");
        int s = sc.nextInt();
        System.out.print("Introduce cuántas veces incrementar: ");
        int n = sc.nextInt();
        
        Hora miHora = new Hora(h, m, s);
        
      
        System.out.println("Hora inicial:");
        miHora.mostrarHora();
        
        for (int i = 0; i < n; i++) {
            miHora.incrementarSegundo();
            miHora.mostrarHora();
        }
    }
}


    

