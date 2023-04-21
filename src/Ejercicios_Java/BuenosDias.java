/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Java;

import java.util.Scanner;

/**
 *
 * @author PlusmoComodin
 */
public class BuenosDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        
        //se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner (System.in);
        //Se crea una variable Cadena (String) que se utiliza para leer datos del usuario
        String nombre;
        //muestra un mensaje por pantalla
      System.out.println("Ingresa tu nombre");
                //Leemos el nombre de la persona en la variable nombre
                 nombre=leer.next();
                //mostramos por consolaun saludo personalizado
                System.out.println("Buenos días! Soy " + nombre+ " y estoy programando en Java");
       
    }
}
    

 
