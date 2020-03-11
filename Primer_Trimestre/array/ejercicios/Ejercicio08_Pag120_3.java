package array.ejercicios;

import java.util.Scanner;

/**
 * Programa: Ejercicio08_Pag120_3
 * 
 * @author Francisco
 *
 * Desarrollo/analisis:
 * En este ejercicio nos pide que insertemos por teclado hasta 10 números que guardaremos
 * en un array, despues de crearlo nos pide que lo mostremos de forma inversa.
 *
 * Variables:
 * int numeros [] = new int [9];
 */

public class Ejercicio08_Pag120_3 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int numeros[] = new int [10];
    
    System.out.println("El programa nos pedirá 10 números y después los imprimirá \n"
        + "a la inversa");
    
    System.out.println("---------------------------------------------------------");
    
    // Introducimos datos
    for (int i = 0; i<numeros.length; i++) {
      System.out.println("Introduce valor para posición " + (i+1) + ": ");
      numeros[i] = sc.nextInt();
    }
    // Salida de datos
    for (int i = numeros.length-1; i>=0;i--) { // Desde longitud del array al principio
      System.out.print(numeros[i] + " ");
    }

    
    
  }

}
