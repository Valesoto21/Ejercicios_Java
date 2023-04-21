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
public class Pedir_Nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escribir un programa que pida tu nombre, 
        //lo guarde en una variable y lo muestre por pantalla.
        Scanner teclado = new Scanner(System.in);
        
        String nom,ape;
        
        System.out.println("Ingrese nombre");
        
        nom = teclado.nextLine();
        
        System.out.println("Ingrese apellido");
        
        ape = teclado.nextLine();
        
        System.out.println("Usted se llama " + nom +" "+ ape);
    }
    
}
