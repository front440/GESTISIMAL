package array.bidimensionales;

/**
 * Programa: Ejercicio05_MaxYMin
 * 
 * @author Francisco
 * 
 * Enunciado: Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 * 
 * Variables:
 *     int matriz[][] = new int [FILA][COLUMNA];
 *     int max = 0;
 *     int min = 1000;
 *     int filaMax = 0;
 *     int filaMin = 0;
 *     int columnaMax = 0;
 *     int columnaMin = 0;
 *
 */

public class Ejercicio06_MaxYMinNoRepetido {

  private static final int FILA = 6; // Constante para fila
  private static final int COLUMNA = 10; // Constante para columna

  public static void main(String[] args) {

    int matriz[][] = new int [FILA][COLUMNA];   // Matriz bidimensional
    int max = 0;        // Número maximo
    int min = 1000;     // Número mínimo
    int filaMax = 0;    // Índice de la fila de número máximo
    int filaMin = 0;    // Índice de la fila de número mínimo
    int columnaMax = 0; // Índice de la columna de número máximo
    int columnaMin = 0; // Índice de la columna de número mínomo

    for (int i = 0; i < FILA; i++) {
      for (int j = 0; j < COLUMNA; j++) {
        // Generamos número aleatorio para cada indice de la matriz
        matriz[i][j] = (int) (Math.random()*1001);
        // Comprobamos que no halla ningún número repetido
        if (matriz[i][j] == matriz[i][j]) {
          matriz[i][j] = (int) (Math.random()*1001);
        }
        // Hallamos máximo
        if (matriz[i][j] < min) {
          min = matriz[i][j];
          filaMin = i;
          columnaMin = j;
        }
        // Hallamos mínimo
        if (matriz[i][j] > max) {
          max = matriz[i][j];
          filaMax = i;
          columnaMax = j;
        }        
      }     
    }
    // Salida de datos
    System.out.println("El número máximo es:"+max +"\n Se encuentra en la fila: "
        +filaMax + " y en la columna:"+columnaMax );
    System.out.println("El número míximo es:"+min +"\n Se encuentra en la fila: "
        +filaMin + " y en la columna:"+columnaMin );
    //System.out.println("Número máximo"+max);



  }

}
