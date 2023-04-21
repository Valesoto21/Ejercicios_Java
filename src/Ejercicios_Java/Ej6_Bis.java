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
public class Ej6_Bis {

  
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int opcion,suma=0,resta=0, div=0, mult=0, num, num2;
    String milanesa="n";
    do{
    System.out.println("ingrese dos valores");
    num = leer.nextInt();
    num2 = leer.nextInt();
    }while (num<0 ||num2<0);
    do {
        System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion");
            opcion=leer.nextInt();
            switch(opcion){
                case 1: 
                    suma=num1 + num2;
                    System.out.println("la suma de los numeros es: " + suma);
                    break;
                case 2:
                    resta=num1 - num2;
                    System.out.println("la resta de los numeros es: " + resta);
                    break;
                case 3:
                    mult=num1 * num2;
                    System.out.println("la multiplicación de los numeros es: " + mult);
                    break;
                case 4:
                    div=num1 % num2;
                    System.out.println("la división de los numeros es: " + div);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    milanesa=leer.next();
                    break;
                default:
                    System.out.println("la opción no es valida");
                    break;
            }
    }while (milanesa.equalsIgnoreCase("n"));
}
}
    }
    

