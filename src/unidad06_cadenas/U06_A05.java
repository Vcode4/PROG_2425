//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ
package unidad06_cadenas;

import java.util.*;

/*BUSQUEDA- Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales
(may�sculas, min�sculas y acentuadas). Por ejemplo, �Don Quijote de la Mancha" se mostrar� �Dn Qjt d l Mnch�*/

public class U06_A05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String sinVocales ="";
        char r;
        
        System.out.println("Dime tu nombre completo: ");
        String nombre = sc.nextLine();
        
        for (int i =0 ; i < nombre.length(); i++){
            r= nombre.charAt(i);
            
            if(!esVocal(r)){
                sinVocales +=r;
            }
        }
        System.out.println("El nombre sin las vocales es: "+ sinVocales);
     }
    
    static boolean esVocal (char r){
        r = Character.toLowerCase(r);
        String vocales = "aeiou�����";
       
        return vocales.indexOf(r) != -1;
    }
}
