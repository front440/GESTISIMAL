package utiles;

/**
 * 
 * Algunas especificaciones sobre Menú:
 * Clase utilizada para la gestión de un menú. Se dedica a mostrar las 
 * opciones del menú y a recoger y devolver las opciones de un menú
 * Su estado serán las opciones a mostrar (array de cadenas) y el título (se muestra al principio)
 * Su comportamiento será:
 * 1. Mostrará el menu (mostrar()). Será privado.
 * 2. Recogerá la opción válida (entre las opciones del menú). Se usará
 * un bucle para que devuelva una opción válida. Será privado.
 * 3. Gestionará el menú. A la vez se mostrarán las opciones y se recogerá
 * la opción  seleccionada por el usuario. Invocará a las dos anteriores. Será el único método público (switch(menu.gestionar()){...}
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
   *            título del menú
   * @param opciones
   *            opciones del menú
   */
  public Menu(String titulo, String[] opciones) {
      this.titulo = titulo;
      this.opciones = opciones;
      this.numOpciones = this.opciones.length;
  }

  /**
   * Gestiona el menú. Consiste en mostrar las opcines y recoger la opción
   * seleccionada por el usuario
   * 
   * @return opción válida del menú
   */
  public int gestionar() {
      mostrar();
      return recogerOpcion();
  }

  /**
   * Muestra las opciones del menú
   */
  private void mostrar() {
      int i = 1;
      System.out.println("**" + titulo + "**");
      System.out.println();
      for (String elemento : opciones)
          System.out.println( + (i++) + ") " + elemento);
  }

  /**
   * Recoge la opción válida del menú
   * 
   * @return opción válida
   */
  private int recogerOpcion() {
      int opcion;
      do {
        System.out.println("introduce una opción: ");
          opcion = Teclado.getEntero();
      } while (opcion < 1 || opcion > numOpciones);
      return opcion;
  }
}
