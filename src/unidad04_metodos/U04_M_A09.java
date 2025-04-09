//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad04_metodos;

import java.util.*;

 /*RECURSIVIDAD-Dise�ar una funci�n que calcule an, donde a es real y n es entero no negativo.
Realizar una versi�n iterativa y otra recursiva.*/

//FUNCI�N ITERATIVA

public class U04_M_A09{
    
   /* static double versionIterativa(double a, int n){
        double resultado = 1.0;
        for (int b = 0; b < n ; b++){
            resultado *= a;
        }
        return resultado;
}
    
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime cuanto vale a");
        double a = sc.nextDouble();
        
        System.out.println("Dime cuanto vale n");
        int n = sc.nextInt();
        
        System.out.println(a+" ^ "+ n + " es igual a : " + versionIterativa(a,n));
    }*/

//FUNCION RECURSIVA

    static double versionRecursiva(double a, int n){
        double resultado;
        if(n ==0){
        resultado=1;
        }else{
        resultado = a* versionRecursiva(a, n-1);
        }
        return(resultado);
    
    }

    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime cuanto vale a");
        double a = sc.nextDouble();
        
        System.out.println("Dime cuanto vale n");
        int n = sc.nextInt();
        
        System.out.println(a+" ^ "+ n + " es igual a : " + versionRecursiva(a,n));
    }
}
