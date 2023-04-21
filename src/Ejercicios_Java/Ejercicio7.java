/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera 
incorrecta.
Al finalizar el proceso, se imprime un informe indicando
la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan 
las siguientes funciones de Java Substring(), Length(), equals().
 */
package Ejercicios_Java;

import java.util.Scanner;

/**
 *
 * @author PlusmoComodin
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        int correctas;
        int incorrectas;
        correctas = 0;
        incorrectas = 0;

        while (true) {
            System.out.println("Ingrese una cadena que comience con x y termine con o");
            System.out.println("Si ingresa &&&&&");
            String cadena = leer.next();
            if (cadena.equals("&&&&&")) {
                break;
            }
            if (cadena.length() == 5 && cadena.substring(0, 1).equals("x") && cadena.substring(4, 5).equals("o")) {
                correctas++;
            } else {
                incorrectas++;
            }
            
}
     System.out.println("Las palabras correctas son " + correctas);
            System.out.println("Las palabras incorrectas son " + incorrectas);
        }
    }
