//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad04_bucles;

import java.util.*;

 /*-WHILE-Codificar el juego «el número secreto», que consiste en acertar un número
entre 1 y 100 (generado aleatoriamente). Para ello se introduce por teclado 
una serie de números, para los que se indica: «mayor» o «menor», según sea mayor
o menor con respecto al número secreto. EI proceso termina cuando el usuario 
acierta o cuando se rinde (introduciendo un -1).*/
public class U04_B_A03 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random ();
        
        int numeroAleatorio = random.nextInt(100) + 1 ;
        int pruebaNumero;
        
        System.out.println("JUEGO DE EL NÚMERO SECRETO");
        
        System.out.println("Tienes que adivinar el número entre 1 y 100.Para rendirte introduce -1");
        System.out.println("Introduce el número por el que quieres empezar: ");
        pruebaNumero = sc.nextInt();
        
     while (pruebaNumero != -1 && pruebaNumero != numeroAleatorio){
         if (pruebaNumero < numeroAleatorio){
             System.out.println("Mayor");
         }else{
             System.out.println("Menor");
         }
         System.out.println("Prueba con otro número");
         pruebaNumero = sc.nextInt();   
     }  
     
     if(pruebaNumero == numeroAleatorio){
         System.out.println("¡Enhorabuena, has adivinado el número secreto!. Es el: "+numeroAleatorio);
     }else{
         System.out.println("Has decidido abandonar y rendirte... El número secreto era el: "+numeroAleatorio);
     }     
    }
}
