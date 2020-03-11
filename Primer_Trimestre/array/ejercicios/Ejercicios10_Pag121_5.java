package array.ejercicios;

import java.util.Scanner;

/**
 * Programa: Ejercicios10_Pag121_5.java
 * 
 * @author Francisco
 * 
 * Fecha: 28/11/2019
 * 
 * Enunciado: Escribe un programa que pida 10 n�meros por teclado y que luego muestre los
 * n�meros introducidos junto con las palabras �m�ximo� y �m�nimo� al lado del
 * m�ximo y del m�nimo respectivamente.
 * 
 * Desarrollo/Analisis:
 * Para crear este programa, lo primero que debemos de hacer es crear un array de 10
 * n�meros de longitud. Seguidamente debemos de almacenar la variables max y minimo y
 * calcularlas.
 * Cuando ya tenemos m�ximos y m�nimos solo tenemos que decir el a que n�mero corresponde
 * en el �ndice del array.
 * 
 * Variables:
 * int maximo       <-- Valor m�ximo
 * int m�nimo       <-- Valor m�nimo
 *
 */
public class Ejercicios10_Pag121_5 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] numero = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    
    //Explicaci�n del programa
    System.out.println("El programa nos pide 10 n�meros y nos indica m�ximo y m�nimo");
    System.out.println("------------------------------------------------------------");
    
    // Insertamos n�meros
    for (int i=1;i<numero.length;i++) {
      System.out.println("inserte n�mero " + i + ": "); // Entrada de datos
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
      
      if (numero[i] == maximo) {    // Asignamos max a el n�mero del indice correspondiente
        // Imprimimos por pantalla con print normal para evitar salto de linea
        System.out.print(" N�mero m�ximo");
      }
      if (numero[i] == minimo) {    // Asignamos min a el n�mero del indice correspondiente
          // Imprimimos por pantalla con print normal para evitar salto de linea
        System.out.print(" N�mero m�nimo"); 
      }
      System.out.println();
    }
    
     
    
  }

}
