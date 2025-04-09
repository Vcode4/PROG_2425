//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad04_bucles;

import java.util.*;

 /*-WHILE-Codificar el juego �el n�mero secreto�, que consiste en acertar un n�mero
entre 1 y 100 (generado aleatoriamente). Para ello se introduce por teclado 
una serie de n�meros, para los que se indica: �mayor� o �menor�, seg�n sea mayor
o menor con respecto al n�mero secreto. EI proceso termina cuando el usuario 
acierta o cuando se rinde (introduciendo un -1).*/
public class U04_B_A03 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random ();
        
        int numeroAleatorio = random.nextInt(100) + 1 ;
        int pruebaNumero;
        
        System.out.println("JUEGO DE EL N�MERO SECRETO");
        
        System.out.println("Tienes que adivinar el n�mero entre 1 y 100.Para rendirte introduce -1");
        System.out.println("Introduce el n�mero por el que quieres empezar: ");
        pruebaNumero = sc.nextInt();
        
     while (pruebaNumero != -1 && pruebaNumero != numeroAleatorio){
         if (pruebaNumero < numeroAleatorio){
             System.out.println("Mayor");
         }else{
             System.out.println("Menor");
         }
         System.out.println("Prueba con otro n�mero");
         pruebaNumero = sc.nextInt();   
     }  
     
     if(pruebaNumero == numeroAleatorio){
         System.out.println("�Enhorabuena, has adivinado el n�mero secreto!. Es el: "+numeroAleatorio);
     }else{
         System.out.println("Has decidido abandonar y rendirte... El n�mero secreto era el: "+numeroAleatorio);
     }     
    }
}
