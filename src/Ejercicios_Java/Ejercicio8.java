/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*        *
*        *
* * * *

 */
package Ejercicios_Java;

import java.util.Scanner;

/**
 *
 * @author PlusmoComodin
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos por lado ");
                      
        int num =leer.nextInt();
                
          for (int i = 0; i < num; i++) {
              for (int j = 0; j < num; j++) {
                  if(i==0 || i== num-1 ||j==0 || j== num-1){
                      System.out.print("*");  
                  }else{
                      System.out.print(" ");
                  }
                  
              }
              System.out.println();
        }
      
                
              
    }

}
