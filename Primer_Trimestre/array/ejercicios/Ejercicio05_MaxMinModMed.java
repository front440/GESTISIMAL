/*
 * Programa: Ejercicio05_MaxMinModMed.java
 * 
 * Autor: Francisco Javier Campos Gutiérrez
 * 
 * Enunciado: Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) 
 * separados por espacios. Muestra también el máximo,el mínimo, la moda, la media, 
 * la mediana y la desviación típica de esos números.
 * 
 * Analisis/Desarrollo:
 * El programa nos pide que generamos aleatoriamente 50 números entre 100 y 199, 
 * seguidamente haremos una serie de cálculos:
 * Hallar máximo
 * hallar mínimo
 * hallar media
 * hallar mediana
 * hallar desviación
 */
package array.ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio05_MaxMinModMed {

  public static void main(String[] args) {

    // Breve explicación de lo que hace el programa
    System.out.println("Este programa generará 50 números aleatorios entre 100 y 199 ");
    System.out.println("y hallará el máximo, mínimo, moda, mediana y desviacíon típica");
    System.out.println("--------------------------------------------------------------");

    int[] aleatorio = new int [50];     // Creación de array de 50 numeros

    int max = 100;                        // Número máximo
    int min = 199;                        // Número mínimo
    double media = 0;                        // Media
    int mediana = (aleatorio[25]+aleatorio[24])/2;
    int moda = 0;
    double desviacion = 0;
    
    // Bucle para añadir número aleatorio a cada posición del array
    for (int i=0 ; i<aleatorio.length; i++) {
      int n = (int) (Math.random()*100)+100;
      aleatorio[i] = n;
      System.out.print(n + " ");

      // Máximo y mínimo
      if (max < n) {        // Calculamos valor máximo 
        max = n;
      }
      if (min>n)  {               // Calculamos valor mínimo
        min = n;
      }

      // Cálculo media
      media +=  n/aleatorio.length;

      // Cálculo de moda
      int maxRep = 0;
      int rep = 0;

      for (int j = 0;j<aleatorio.length; j++) {

        if (aleatorio[i] == aleatorio[j]) {

          rep++;

          if (rep > maxRep) {
            maxRep=rep;
            //moda;

            // Desviación típica
            int sumaNum = 0;
            sumaNum += Math.pow(aleatorio[j]-media, 2);
            sumaNum += sumaNum/aleatorio.length;
            desviacion = Math.sqrt(sumaNum); // calculo de la desviación
          }
        }
      }

    }
    Arrays.sort(aleatorio);
    
    System.out.println("");
    System.out.println("--------------------------------------------------------------");
    System.out.println("Valor máximo: " + min);
    System.out.println("Valor mínimo: " + max);
    System.out.println("La moda es: " + "no me sale");
    System.out.println("la media es: " + media);
    System.out.println("la mediana es: " + (aleatorio[25]+aleatorio[24])/2);



  }

}
