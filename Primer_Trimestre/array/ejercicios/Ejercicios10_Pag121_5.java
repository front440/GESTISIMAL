package array.ejercicios;

import java.util.Scanner;

/**
 * Programa: Ejercicios10_Pag121_5.java
 * 
 * @author Francisco
 * 
 * Fecha: 28/11/2019
 * 
 * Enunciado: Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 * 
 * Desarrollo/Analisis:
 * Para crear este programa, lo primero que debemos de hacer es crear un array de 10
 * números de longitud. Seguidamente debemos de almacenar la variables max y minimo y
 * calcularlas.
 * Cuando ya tenemos máximos y mínimos solo tenemos que decir el a que número corresponde
 * en el índice del array.
 * 
 * Variables:
 * int maximo       <-- Valor máximo
 * int mínimo       <-- Valor mínimo
 *
 */
public class Ejercicios10_Pag121_5 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] numero = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    
    //Explicación del programa
    System.out.println("El programa nos pide 10 números y nos indica máximo y mínimo");
    System.out.println("------------------------------------------------------------");
    
    // Insertamos números
    for (int i=1;i<numero.length;i++) {
      System.out.println("inserte número " + i + ": "); // Entrada de datos
      numero[i] = sc.nextInt();
      
      if (numero[i] < minimo) {     // Buscamos max
        minimo = numero[i];
      }
      if (numero[i] > maximo) {     // Buscamos min
        maximo = numero[i];
      }
    }
    
    System.out.println("------------------------------------------------------------");
    
    for (int i=1; i<numero.length;i++) {
      System.out.print(numero[i]);
      
      if (numero[i] == maximo) {    // Asignamos max a el número del indice correspondiente
        // Imprimimos por pantalla con print normal para evitar salto de linea
        System.out.print(" Número máximo");
      }
      if (numero[i] == minimo) {    // Asignamos min a el número del indice correspondiente
          // Imprimimos por pantalla con print normal para evitar salto de linea
        System.out.print(" Número mínimo"); 
      }
      System.out.println();
    }
    
     
    
  }

}
