package array.bidimensionales;

/**
 * Programa: Ejercicio05_MaxYMin
 * 
 * @author Francisco
 * 
 * Enunciado: Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * n�meros enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuaci�n, el programa deber� dar la posici�n tanto del m�ximo como del
 * m�nimo.
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
    int max = 0;        // N�mero maximo
    int min = 1000;     // N�mero m�nimo
    int filaMax = 0;    // �ndice de la fila de n�mero m�ximo
    int filaMin = 0;    // �ndice de la fila de n�mero m�nimo
    int columnaMax = 0; // �ndice de la columna de n�mero m�ximo
    int columnaMin = 0; // �ndice de la columna de n�mero m�nomo

    for (int i = 0; i < FILA; i++) {
      for (int j = 0; j < COLUMNA; j++) {
        // Generamos n�mero aleatorio para cada indice de la matriz
        matriz[i][j] = (int) (Math.random()*1001);
        // Comprobamos que no halla ning�n n�mero repetido
        if (matriz[i][j] == matriz[i][j]) {
          matriz[i][j] = (int) (Math.random()*1001);
        }
        // Hallamos m�ximo
        if (matriz[i][j] < min) {
          min = matriz[i][j];
          filaMin = i;
          columnaMin = j;
        }
        // Hallamos m�nimo
        if (matriz[i][j] > max) {
          max = matriz[i][j];
          filaMax = i;
          columnaMax = j;
        }        
      }     
    }
    // Salida de datos
    System.out.println("El n�mero m�ximo es:"+max +"\n Se encuentra en la fila: "
        +filaMax + " y en la columna:"+columnaMax );
    System.out.println("El n�mero m�ximo es:"+min +"\n Se encuentra en la fila: "
        +filaMin + " y en la columna:"+columnaMin );
    //System.out.println("N�mero m�ximo"+max);



  }

}
