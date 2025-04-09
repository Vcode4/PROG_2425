//REALIZADO POR: VIRGINIA DEL MORAL SÁNCHEZ

package unidad3;

/*EI tipo short permite almacenar valores comprendidos entre -32.768 y 32.767. 
Escribir un programa que compruebe que el rango de valores de un tipo se 
comporta de forma cíclica, es decir, el valor siguiente al máximo es el valor mínimo.*/

public class U03_A05 {
    public static void main(String[]args){
        short valormaximo = 32767;
        short valorminimo = -32768;
        
        System.out.println("El valor máximo es " + valormaximo);
        System.out.println("El valor mínimo es " + valorminimo);
        
        System.out.println("El valor siguiente al máximo es " + (valormaximo+1));
        //Nos da de resultado el valor minimo sin -
    }
}
