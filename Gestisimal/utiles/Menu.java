package utiles;

/**
 * 
 * Algunas especificaciones sobre Men�:
 * Clase utilizada para la gesti�n de un men�. Se dedica a mostrar las 
 * opciones del men� y a recoger y devolver las opciones de un men�
 * Su estado ser�n las opciones a mostrar (array de cadenas) y el t�tulo (se muestra al principio)
 * Su comportamiento ser�:
 * 1. Mostrar� el menu (mostrar()). Ser� privado.
 * 2. Recoger� la opci�n v�lida (entre las opciones del men�). Se usar�
 * un bucle para que devuelva una opci�n v�lida. Ser� privado.
 * 3. Gestionar� el men�. A la vez se mostrar�n las opciones y se recoger�
 * la opci�n  seleccionada por el usuario. Invocar� a las dos anteriores. Ser� el �nico m�todo p�blico (switch(menu.gestionar()){...}
 * 
 * @author Francisco
 *
 */

public class Menu {
  String titulo = null;
  String opciones[] = null;
  int numOpciones = 0;

  /**
   * 
   * @param titulo
   *            t�tulo del men�
   * @param opciones
   *            opciones del men�
   */
  public Menu(String titulo, String[] opciones) {
      this.titulo = titulo;
      this.opciones = opciones;
      this.numOpciones = this.opciones.length;
  }

  /**
   * Gestiona el men�. Consiste en mostrar las opcines y recoger la opci�n
   * seleccionada por el usuario
   * 
   * @return opci�n v�lida del men�
   */
  public int gestionar() {
      mostrar();
      return recogerOpcion();
  }

  /**
   * Muestra las opciones del men�
   */
  private void mostrar() {
      int i = 1;
      System.out.println("**" + titulo + "**");
      System.out.println();
      for (String elemento : opciones)
          System.out.println( + (i++) + ") " + elemento);
  }

  /**
   * Recoge la opci�n v�lida del men�
   * 
   * @return opci�n v�lida
   */
  private int recogerOpcion() {
      int opcion;
      do {
        System.out.println("introduce una opci�n: ");
          opcion = Teclado.getEntero();
      } while (opcion < 1 || opcion > numOpciones);
      return opcion;
  }
}
