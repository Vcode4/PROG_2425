//REALIZADO POR: VIRGINIA DEL MORAL S�NCHEZ

package unidad3;

/*EI tipo short permite almacenar valores comprendidos entre -32.768 y 32.767. 
Escribir un programa que compruebe que el rango de valores de un tipo se 
comporta de forma c�clica, es decir, el valor siguiente al m�ximo es el valor m�nimo.*/

public class U03_A05 {
    public static void main(String[]args){
        short valormaximo = 32767;
        short valorminimo = -32768;
        
        System.out.println("El valor m�ximo es " + valormaximo);
        System.out.println("El valor m�nimo es " + valorminimo);
        
        System.out.println("El valor siguiente al m�ximo es " + (valormaximo+1));
        //Nos da de resultado el valor minimo sin -
    }
}
