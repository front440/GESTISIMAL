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
 * 3. No tiene estado todo es est�tico. Las invocaciones ser�n Teclado.leerCaracter() 
 *    o Teclado.leerEntero("Introduce la cantidad de art�culos: ")
 * 4. Sobrecargar�is los m�todos. Uno s�lo leer� del teclado y otro
 *    leer� de teclado y mostrar� un mensaje. Este invocar� al anterior. 
 *    No se puede duplicar c�digo. Hay que reutilizarlo.
 * 5. En caso de error habr� que capturar las excepciones. Evita capturar
 *     Exception. Tendr�s que ser m�s espec�fico (InputMismatchException)
 *     
 * @author Francisco
 *
 */

public class Teclado {

  private static Scanner sc = new Scanner(System.in);

  /**
   * Lee teclado cuando se introduce cadena.
   * 
   * @param mensaje
   * @return lee cadena
   */
  public static String getTexto(String mensaje) {
      System.out.println(mensaje);
      return getTexto();

  }

  /**
   * 
   * @return
   */
  public static String getTexto() {
      do {

          try {
              return sc.nextLine();

          } catch (InputMismatchException e) {
              System.err.println("�ERROR! Tienes que introducir una cadena");
          }

      } while (true);

  }

  /**
   * Lee teclado cuando se introduce entero.
   * 
   * @param mensaje
   * @return lee entero
   */
  public static int getEntero(String mensaje) {
      System.out.println(mensaje);
      return getEntero();

  }
  

  /**
   * 
   * @return
   */
  public static int getEntero() {
      do {

          try {
              return Integer.parseInt(sc.nextLine());
              
          } catch (NumberFormatException e) {

              System.err.println("�ERROR! Debes introducir un n�mero entero.");

          }

      } while (true);
  }

  /**
   * 
   * @param mensaje
   * @return
   */
  public static double getDecimal(String mensaje) {
      System.out.println(mensaje);
      return getDecimal();

  }

  /**
   * Lee teclado cuando se introduce decimal.
   * 
   * @param mensaje
   * @return lee decimal.
   */
  public static double getDecimal() {
      do {

          try {
              return Double.parseDouble(sc.nextLine());

          } catch (NumberFormatException e) {

              System.err.println("�ERROR! Vuelve a introducir un numero.");

          }

      } while (true);
  }



}
