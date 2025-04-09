//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad3;

/*Escribir una aplicación que pida el año actual y el de nacimiento del usuario. 
Debe calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido años.*/

import java.util.Scanner;
public class U03_A04 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); //se declara una vez y ya está
        System.out.println("Dime en que año estamos");
       
        int año = sc.nextInt();//declaramos la variable y pedimos que lea lo que hemos puesto por teclado
        
        System.out.println("Dime tu año de nacimiento");
        int nacimiento = sc.nextInt();
        
        int edad = año-nacimiento;
        System.out.println("Tu edad actualmente es de " + edad + " años.");
    }
    
}
