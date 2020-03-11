package array.ejercicios;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Programa: Ejercicio11_Pag121_10.java
 * 
 * @author Francisco
 * 
 *         Enunciado: Escribe un programa que genere 20 n�meros enteros
 *         aleatorios entre 0 y 100 y que los almacene en un array. El programa
 *         debe ser capaz de pasar todos los n�meros pares a las primeras
 *         posiciones del array (del 0 en adelante) y todos los n�meros impares
 *         a las celdas restantes. Utiliza arrays auxiliares si es necesario.
 *         
 * Variables:
 * int aleatorio[] = new int[MAXIMO]    <-- Array de n�meros aleatorios
 * MAXIMO = 20                          <-- Valor del array de n�meros aleatorios
 * int nPar = 0                         <-- Contador para n�meros pares
 * int nImpar = 0                       <-- Contador para n�meros impares
 *         
 *
 */

public class Ejercicio11_Pag121_10 {

  private static final int MAXIMO = 5;

  public static void main(String[] args) {

    int aleatorio[] = new int[MAXIMO];
    // int par[] = new int[MAXIMO];
    // int impar[] = new int[MAXIMO];
    int nPar = 0;               // Contador para n�meros pares
    int nImpar = 0;             // Contador para n�meros impares
    
    System.out.println("El programa crear� un array con n�meros aleatorios y mostrar� los pares \n"
        + "al principio y los impares al final");
    System.out.println("-----------------------------------------------------------------------");

    int arrayOrdenado[] = new int[MAXIMO];

    // Generamos n�meros aleatorios en el array
    for (int i = 0, j = 0, k = aleatorio.length - 1; i < aleatorio.length; i++) {
      aleatorio[i] = (int) (Math.random() * 101);   // Asignaci�n de n�meros aleatorio para cada �ndice

      if (aleatorio[i] % 2 == 0) {                  // Cuando sea par incrementamos contador de nPar
        // par[nPar++] = aleatorio[i];
        
        // Si el n�mero es par lo asignamos al �ndice correspondiente empezando por el principio del array
        // ordenado e incrementamos para a�adir el siguiente n�mero en caso de que halla
        arrayOrdenado[j++] = aleatorio[i];          
      }
      
      else {                                        // Cuando sea impar incrementamos contador nImpar
        // impar[nImpar++] = aleatorio[i];
        
        // Si el n�mero es impar lo asignamos al indice correspondiete empezando por el final, y
        // decrementamos para a�adir el siguiente valor en caso de que lo halla
        arrayOrdenado[k--] = aleatorio[i];
      }

    }
    
    // Mostramos array
    muestraMatriz(arrayOrdenado);
    //    muestraMatriz(par);
    //    muestraMatriz(impar);
    //
    //    for (int i = 0; i < nPar; i++) {
    //      arrayOrdenado[i] = par[i];
    //    }
    //
    //    for (int i = nPar, j = 0; i < arrayOrdenado.length; i++) {
    //      arrayOrdenado[i] = impar[j++];
    //    }

    // muestraMatriz(arrayOrdenado);
  }

  // Creamos m�todo para mostrar valores de una matriz/array
  private static void muestraMatriz(int[] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      System.out.print(matriz[i] + "\t");
    }
    System.out.println();
  }

}
