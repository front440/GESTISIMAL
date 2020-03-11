package array.ejercicios;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 * Programa : Ejercicio14_Pag131_2.java
 * 
 * @author Francisco
 * 
 *         Enunciado: Escribe un programa que pida 20 n�meros enteros. Estos
 *         n�meros se deben introducir en un array de 4 filas por 5 columnas. El
 *         programa mostrar� las sumas parciales de filas y columnas igual que
 *         si de una hoja de c�lculo se tratara. La suma total debe aparecer en
 *         la esquina inferior derecha.
 *
 */
public class Ejercicio14_Pag131_2 {

  private static final int FILA = 2; // Constante para fila
  private static final int COLUMNA = 4; // Constante para columna

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // Definimos array bidimensional
    int hojaCalculo[][] = new int [FILA][COLUMNA];
    int sumaFila[] = new int [FILA];              // Sumatorio de fila
    int sumaColumna[] = new int [COLUMNA];        // Sumatorio Columna
    int sumaTotal = 0;                      // Sumatorio fila y columna

    // Breve explicaci�n del programa 
    System.out.println("El pograma mostrar� las sumas parciales y totales de las \n"
        + "y de las columas");
    System.out.println("--------------------------------------------------------");

    for (int i = 0 ; i < FILA ; i++) {
      for (int j = 0 ; j < COLUMNA ; j++ ) {
        // Entrada de datos
        System.out.println("Inserte valor para fila " + (i+1) + " y columna " + (j+1)+ ":");
        hojaCalculo[i][j] = sc.nextInt();
        // A medida que tenemos la entrada de datos vamos calculando los valores
        // para filas y columnas
        sumaFila[i] += hojaCalculo[i][j];
        sumaColumna[j] += hojaCalculo[i][j];
      }
    }

    // Ciclo para sumatorio de fila
    for (int i = 0 ; i < FILA; i++) {
      for (int j = 0; j < COLUMNA; j++) {
        // Imprimimos los n�meros introducidos con tabulaciones
        System.out.print("\t"+hojaCalculo[i][j]);
      }
      // Hacemos una impresi�n del sumatorio de cada fila
      System.out.print("\t|" + sumaFila[i] +"\n");
    }

    // Separamos la tabla de los resultados de la suma
    for (int i = 0; i < COLUMNA; i++) {
      System.out.print("-----------");
    }
    System.out.println("");

    //Ciclo para sumatorio de columna
    for (int i = 0; i < COLUMNA; i++) {
      // Calculamos la suma de cada columna
      System.out.print("\t"+sumaColumna[i]);
      // La suma total sera la suma de todas las columnas
      sumaTotal += sumaColumna[i];
    }

    // Una vez calculado el total hacemos la impresi�n
    System.out.print("\t|" + sumaTotal +"\n");


  }

}
