package utiles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * Algunas especificaciones sobre Teclado:
 * 
 * 1. Permite la lectura desde teclado
 * 2. Teclado es un envoltorio de scanner, que es un analizador de texto
 *    que puede analizar tipos y cadenas primitivas usando expresiones regulares
 * 3. No tiene estado todo es estático. Las invocaciones serán Teclado.leerCaracter() 
 *    o Teclado.leerEntero("Introduce la cantidad de artículos: ")
 * 4. Sobrecargaréis los métodos. Uno sólo leerá del teclado y otro
 *    leerá de teclado y mostrará un mensaje. Este invocará al anterior. 
 *    No se puede duplicar código. Hay que reutilizarlo.
 * 5. En caso de error habrá que capturar las excepciones. Evita capturar
 *     Exception. Tendrás que ser más específico (InputMismatchException)
 *     
 * @author Francisco
 *
 */

public class Teclado {

  private static Scanner sc = new Scanner(System.in);

  /**
   * 
   * @param cadena
   * @return
   */
  public static String leerCadena (String cadena) {

    do {

      try {

        System.out.println(cadena);
        cadena = sc.next();
        return cadena; 

      } catch (InputMismatchException ee) {
        System.out.println("Introduce una cadena: ");
      }
      
    } while (true);


  }

  /**
   * 
   * @param cadena
   * @return
   */
  public static int leerEntero (String cadena) {

    do {


      try {

        System.out.println(cadena);

        int entero = sc.nextInt();
        return entero;


      } catch (InputMismatchException ee){
        System.out.println("Introduce un número: ");
      }


    } while (true); 



  }

  /**
   * 
   * @param cadena
   * @return
   */
  public static double leerDouble (String cadena) {

    do {
      try {

        System.out.println(cadena);
        double decimal = sc.nextDouble();
        return decimal;



      } catch (InputMismatchException ee) {
        System.out.println("Introduce número decimal: ");
      }

    } while (true);


  }


}
