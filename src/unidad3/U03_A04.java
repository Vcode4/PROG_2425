//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad3;

/*Escribir una aplicaci�n que pida el a�o actual y el de nacimiento del usuario. 
Debe calcular su edad, suponiendo que en el a�o en curso el usuario ya ha cumplido a�os.*/

import java.util.Scanner;
public class U03_A04 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); //se declara una vez y ya est�
        System.out.println("Dime en que a�o estamos");
       
        int a�o = sc.nextInt();//declaramos la variable y pedimos que lea lo que hemos puesto por teclado
        
        System.out.println("Dime tu a�o de nacimiento");
        int nacimiento = sc.nextInt();
        
        int edad = a�o-nacimiento;
        System.out.println("Tu edad actualmente es de " + edad + " a�os.");
    }
    
}
