package array.bidimensionales;

/**
 * 
 * Programa: Ejercicio07_Estatura.java
 * 
 * @author Francisco
 *
 * Enunciado: Realiza un programa que calcule la estatura media, mínima y máxima en
 * centímetros de personas de diferentes países. El array que contiene los
 * nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
 * “Australia”}. Los datos sobre las estaturas se deben simular mediante un
 * array de 4 filas por 10 columnas con números aleatorios generados al azar entre
 * 140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
 * los países se deben mostrar utilizando el array de países (no se pueden escribir
 * directamente).
 * 
 * Variables:
 * String pais[] = {"España","Rusia","Japón","Australia"};
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

    String pais[] = {"España","Rusia","Japón","Austral"};
    int estatura[][] = new int[FILA][COLUMNA];
    int max[] = new int [FILA];
    int min[] = new int [FILA];
    int media[] = new int[FILA];

    for (int i = 0; i < FILA; i++) {
      for (int j = 0; j < COLUMNA; j++) {
        // Añadimos números aleatorios para cada índice
        estatura[i][j] = (int) ((Math.random()*(210 - 140 + 1) + 140));
        // Calculamos media
        media[i] += estatura[i][j]/COLUMNA;     
        // Calculamos número máximo y mínimo
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
