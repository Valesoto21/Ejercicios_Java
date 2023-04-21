/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subprogramas_Guia_4;

import java.util.Scanner;

/**
 *
 * @author PlusmoComodin
 */
public class NewClass {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase a codificar");
        String frase=leer.nextLine();
        String retorno=codificar(frase);
        
        System.out.println("===La frase codificada queda así====");
        System.out.println("");
        System.out.println(retorno); 
        
    }
    public static String codificar (String frase){
        String codigo ="";
        for (int i = 0; i<(frase.length()); i++) {
            switch(frase.substring(i,i+1)){
                case "a":
                    codigo=codigo.concat("@");
                    break;
                case "e":
                    codigo=codigo.concat("#");
                    break;
                case "i":
                    codigo=codigo.concat("$"); 
                    break;
                case "o":
                    codigo=codigo.concat("%"); 
                    break;
                case "u":
                    codigo=codigo.concat("*");  
                    break;
                default:
                    codigo=codigo.concat(frase.substring(i,i+1));
                    
            }
          //  System.out.println(codigo);
        }
        return codigo;
    }
}
    

