package Arreglos_Guia_5;


import static java.lang.Math.random;
import java.util.Random;

/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

package Arreglos_Guia_5;

/**
 *
 * @author PlusmoComodin
 */
public class Guia_5_Ej_4 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(int[] args) {
        // TODO code application logic here
        Random Random = new Random();         
    int[][] matriz = new int[4][4];        
    int[][] matriz2 = new int[4][4];        
        for (int i = 0; i < 4; i++) {             
        } for (int j = 0; j < 4; j++) {                 
         matriz[i][j] = random.nextInt(101) - 50;                  
         System.out.print(" " + matriz[i][j] + " ");            
}             
          System.out.println("");        
    
/*matriz[0][0]=0;         
matriz[0][1]=-2;         
matriz[0][2]=4;         
matriz[1][0]=2;         
matriz[1][1]=0;        
matriz[1][2]=2;         
matriz[2][0]=-4;         
matriz[2][1]=-2;         
matriz[2][2]=0;         
//imprime matriz original   */      
 
for (int i = 0; i < 4; i++);
{             
for (int j = 0; j < 4; j++);
        }              
 int j = 0;
System.out.print(" " + matriz[i][ j ] + " ");             
}             
System.out.println("");         
System.out.println("--------------------");         
}        
//rellenado e impresion matriz2                  
for (int j = 0; j < 3; j++) {             
for (int i = 0; i < 3; i++) {                 
matriz2[i][j] = matriz[j][i]*-1;                 
System.out.print(" " + matriz2[i][j] + " ");            
}             System.out.println(" ");        
}        
//rellenado de vectores         
int[] vecAux = new int[9];        
int[] vecAux1 = new int[9];        
int k = 0;         
for (int i = 0; i < 3; i++) {             
for (int j = 0; j < 3; j++) {                 
vecAux[k] = matriz[i][j];                 
vecAux1[k] = (matriz2[i][j]);                 ++k;              
}        
}        
//verificacion sin son iguales         
int cont = 0;         
for (int i = 0; i < 9; i++) {             
if ((vecAux[i]) == ((vecAux1[i]))) {                 ++cont;           
}        
}        
if (cont == 9) {             
System.out.println("Las Matrices son antisismicas");        
} else {             
System.out.println("Las matrices no son antisimicas");        
}     


    }



