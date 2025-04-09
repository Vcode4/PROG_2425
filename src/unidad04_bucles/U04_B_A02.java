//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad04_bucles;

import java.util.*;

 /*-WHILE-Implementar una aplicaci�n para calcular datos estad�sticos de las edades de 
los alumnos de un centro educativo. Se introducir�n datos hasta que uno de ellos 
sea negativo, y se mostrar�: la suma de todas las edades introducidas, la media, 
el n�mero de alumnos y cu�ntos son mayores de edad.*/
public class U04_B_A02 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la aplicaci�n de calculo de datos estadisticos de los alumnos de este centro");
        System.out.println("Introduce la edad del primer alumno (Para terminar introduce un n�mero negativo)");
        int edad = sc.nextInt();
        
        int sumaEdad= 0, totalAlumnos = 0, mayorEdad = 0; //Se le asigna a cada variable un valor inicial, siempre fuera del bucle
        double media;
        
        while (edad >= 0){
            sumaEdad += edad; //La edad se va sumando en la variable mayorEdad
            
            if (edad >=18){
                mayorEdad ++; 
            } //Si el alumno es mayor de edad se incrementa la variable, va contando quien cumple esa condici�n
            
            totalAlumnos++; //Se va incrementando el numero de alumnos a medida que vamos metiendo edades
            
            System.out.println("Introduce la edad del siguiente alumno");
            edad = sc.nextInt();
        }
        
        media = sumaEdad / totalAlumnos;
        
        System.out.println("La suma de todas las edades que se han introducido: "+sumaEdad);
        System.out.println("N�mero de alumnos del centro educativo: "+ totalAlumnos);
        System.out.println("N�mero de los alumnos mayores de edad: "+ mayorEdad);
        System.out.println("Media de las edades de los alumnos: "+media);
    }
}
