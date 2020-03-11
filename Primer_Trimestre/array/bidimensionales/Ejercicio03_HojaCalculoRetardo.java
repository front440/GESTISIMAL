package array.bidimensionales;

/**
 * 
 * Programa: Ejercicio02_HojaCalculoAleatoria
 * 
 * @author Francisco
 * 
 * Enunciado: Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 *
 * Desarrollo/Analisis
 * La creación de este programa totalmente igual, tan solo, a la hora de mostrar
 * los números tendremos un retardo de 1s.
 */


public class Ejercicio03_HojaCalculoRetardo {

  private static final int FILA = 2; // Constante para fila
  private static final int COLUMNA = 4; // Constante para columna

  public static void main(String[] args) throws InterruptedException {

    /// Definimos array bidimensional
    int hojaCalculo[][] = new int [FILA][COLUMNA];
    int sumaFila[] = new int [FILA];              // Sumatorio de fila
    int sumaColumna[] = new int [COLUMNA];        // Sumatorio Columna
    int sumaTotal = 0;                      // Sumatorio fila y columna

    // Breve explicación del programa 
    System.out.println("El pograma mostrará las sumas parciales y totales de las \n"
        + "y de las columas");
    System.out.println("--------------------------------------------------------");

    for (int i = 0 ; i < FILA ; i++) {
      for (int j = 0 ; j < COLUMNA ; j++ ) {
        // Generamos números aleatorios entre 100 y 200 y lo asignamos a cada
        // índice de la matriz        
        hojaCalculo[i][j] = (int) ((Math.random()*200)+100);

        // A medida que tenemos la entrada de datos vamos calculando los valores
        // para filas y columnas
        sumaFila[i] += hojaCalculo[i][j];
        sumaColumna[j] += hojaCalculo[i][j];
      }
    }

    // Ciclo para sumatorio de fila
    for (int i = 0 ; i < FILA; i++) {
      for (int j = 0; j < COLUMNA; j++) {
        // Imprimimos los números introducidos con tabulaciones
        System.out.print("\t"+hojaCalculo[i][j]);
      }
      // Creamos retardo de 1s
      Thread.sleep(1000);    
      // Hacemos una impresión del sumatorio de cada fila
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
      Thread.sleep(1000);     
      System.out.print("\t"+sumaColumna[i]);
      // Creamos retardo de 1s     
      // La suma total sera la suma de todas las columnas
      sumaTotal += sumaColumna[i];
    }
    // Creamos retardo de 1s
    Thread.sleep(1000);    
    // Una vez calculado el total hacemos la impresión
    System.out.print("\t|" + sumaTotal +"\n");

  }

}
