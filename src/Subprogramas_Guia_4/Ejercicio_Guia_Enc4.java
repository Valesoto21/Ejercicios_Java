/*
 Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el 
carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) 
se mantienen sin cambios.
a e i o u
@ # $ % &
 */
package Subprogramas_Guia_4;

import static Subprogramas_Guia_4.NewClass.codificar;
import java.util.Scanner;

/**
 *
 * @author PlusmoComodin
 */
public class Ejercicio_Guia_Enc4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        do {
            System.out.println("Ingrese una secuencia de caracteres que termine en punto ");
           Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase a codificar");
        String frase=leer.nextLine();
        String retorno=codificar(frase);
     }
        while (palabra.endsWith("."));
        
        System.out.println("La palabra modificada es ");

    public static void codificar(String palabra){
        String auxiliar = "";
        //palabra
        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.substring(i, i + 1)) {
                case "a":
                case "A":
                    auxiliar = auxiliar.concat("@");
                    break;
                case "e":
                case "E":
                    auxiliar = auxiliar.concat("#");
                    break;
                case "i":
                case "I":
                    auxiliar = auxiliar.concat("$");
                    break;
                case "o":
                case "O":
                    auxiliar = auxiliar.concat("%");
                    break;
                case "u":
                case "U":
                    auxiliar = auxiliar.concat("&");
                default:
                    auxiliar = auxiliar.concat(palabra.substring(i, i + 1));
            }
        }
        return auxiliar
  }
}

         
    
     

