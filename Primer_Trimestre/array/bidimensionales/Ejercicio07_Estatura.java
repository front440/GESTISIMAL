package array.bidimensionales;

/**
 * 
 * Programa: Ejercicio07_Estatura.java
 * 
 * @author Francisco
 *
 * Enunciado: Realiza un programa que calcule la estatura media, m�nima y m�xima en
 * cent�metros de personas de diferentes pa�ses. El array que contiene los
 * nombres de los paises es el siguiente: pais = {�Espa�a�, �Rusia�, �Jap�n�,
 * �Australia�}. Los datos sobre las estaturas se deben simular mediante un
 * array de 4 filas por 10 columnas con n�meros aleatorios generados al azar entre
 * 140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
 * los pa�ses se deben mostrar utilizando el array de pa�ses (no se pueden escribir
 * directamente).
 * 
 * Variables:
 * String pais[] = {"Espa�a","Rusia","Jap�n","Australia"};
 * int estatura[][] = new int[FILA][COLUMNA];
 * int max = 0;
 * int min = 210;
 * int media = 0;
 * 
 */

public class Ejercicio07_Estatura {

  private static final int FILA = 4; // Constante para fila
  private static final int COLUMNA = 10; // Constante para columna

  public static void main(String[] args) {

    String pais[] = {"Espa�a","Rusia","Jap�n","Austral"};
    int estatura[][] = new int[FILA][COLUMNA];
    int max[] = new int [FILA];
    int min[] = new int [FILA];
    int media[] = new int[FILA];

    for (int i = 0; i < FILA; i++) {
      for (int j = 0; j < COLUMNA; j++) {
        // A�adimos n�meros aleatorios para cada �ndice
        estatura[i][j] = (int) ((Math.random()*(210 - 140 + 1) + 140));
        // Calculamos media
        media[i] += estatura[i][j]/COLUMNA;     
        // Calculamos n�mero m�ximo y m�nimo
        if (estatura[i][j] < min[i]) {
          max[i] = estatura[i][j];
        }
        if (estatura[i][j] > min[i]) {
          max[i] = estatura[i][j];
        }
      }
    }
    // Sacamos por pantalla los resultados
    for (int i = 0; i < FILA; i++) {
      // Mostramos el pais de 
      System.out.printf(pais[i]);
      for (int j = 0; j < COLUMNA; j++) {
        System.out.print("\t" +  estatura[i][j]);
      }
      System.out.println("\t|" + media[i] + " " + max[i]+ " " + min[i]  );
    }

  }

}
