package array.ejercicios;

/**
 * Programa: Ejercicio08_Pag120_4.java
 * 
 * @author Francisco
 * 
 * fecha: 28/11/2019
 * 
 * Enunciado: Define tres arrays de 20 n�meros enteros cada una, con nombres numero, cuadrado
 * y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
 * cuadrado se deben almacenar los cuadrados de los valores que hay en el array
 * numero. En el array cubo se deben almacenar los cubos de los valores que hay en
 * numero. A continuaci�n, muestra el contenido de los tres arrays dispuesto en tres
 * columnas.
 *
 * Desarrollo/Analisis:
 * Para la realizaci�n de este ejercicio crearemos 3 bucles, uno para la creaci�n de
 * los n�meros aleatorios, otro para elevar al cuadrado el n�mero generado y el �ltimo
 * para elevar al cubo el n�mero generado
 *
 */

public class Ejercicio09_Pag120_4 {

  public static void main(String[] args) {
    
    int n;
    
    int   numero[] = new int[20]; //
    int cuadrado[] = new int[20];
    int     cubo[] = new int[20];
    
    for (int i = 0; i<numero.length;i++) {
      n = (int) (Math.random()*100);                // Generamos n�mero aleatorio
      numero[i] = n;
      
      cuadrado[i] = (int) Math.pow(numero[i], 2);   // Elevamos al cuadrado
      
      cubo [i] = (int) Math.pow(numero[i], 3);      // Elevamos al cubo
      
      System.out.println("N�mero aleatorio: " + numero[i] + ", resultado de elvarlo \n"
          + "al cuadrado: " + cuadrado[i] + " y al cubo: " + cubo[i]);
    
    System.out.println("-------------------------------------------------");
    
    }

  }

}
