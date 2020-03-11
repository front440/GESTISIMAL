package gentesimal;


import gentesimal.almacen;
import utiles.Teclado;

public class TestAlmacen {

  static almacen almacen = new almacen();

  public static void main(String[] args) {

    boolean salir = true;
    
    annadirVarios();
    
    
    while (salir) {

      System.out.println("PRÁCTICA DE GENTISIMAL");
      System.out.println();
      System.out.println("¿Qué deseas hacer?");
      System.out.println("1) Añadir artículo:"); // Añadir artículo
      System.out.println("2) Borrar artículo:"); // Borrar artículo
      System.out.println("3) Modificar artículo: ");
      System.out.println("4) Entrada mercancía: "); // Incremetar unidades
      System.out.println("5) Salida mercancía: "); // Decrementar unidades
      System.out.println("6) Mostrar artículos de almacen: ");
      System.out.println("7) Salir: ");
      int opcion = Teclado.leerEntero("Introduce opción: ");

      switch (opcion) {
      case 1: // Añadir artículo:
        añadir();
        break;
      case 2: // Borrar artículo
        borrar();
        break;
      case 3: // Modifica descripción de artículo
        modifica();
        break;
      case 4: // Incrementar artículo
        incrementa();
        break;
      case 5: // Decrementar artículo
        decrementa();
        break;
      case 6: // Artículos de almacen
        System.out.println(almacen);
        // almacen.muestra();
        break;
      case 7:
        salir = false;
        break;

      }
    }

  }

  private static void annadirVarios() {
    almacen.annadir("aa", 11, 11, 11);
    almacen.annadir("bb", 22, 22, 22);
    almacen.annadir("cc", 33, 33, 33);
  }

  /**
   * Método que imprime por pantalla los artículos del arraylist de almacen
   */
  private static void muestra() {
    almacen.muestra();
    
  }

  /**
   * Método que añade artículos al ArrayList
   */
  private static void añadir() {
    String descripcion = Teclado.leerCadena("Añade la descripción del artículo: ");
    Double precioC = Teclado.leerDouble("Añade el precio de compra del artículo: ");
    Double precioV = Teclado.leerDouble("Añade el precio de venta del artículo: ");
    int unidades = Teclado.leerEntero("¿Cuantos artículos se van a añadir?");
    almacen.annadir(descripcion, precioC, precioV, unidades);
  }

  /**
   * Método que borra artículos del ArrayList
   */
  private static void borrar() {
    int codigo = Teclado.leerEntero("Código del producto que desee borrar:");
    if (!almacen.borrar(codigo)) System.err.println("Código inexistente");

  }

  /**
   * El siguiente método incrementa las unidades del artículo
   */
  private static void incrementa() {
    int codigo = Teclado.leerEntero("Código del producto que desea incrementar: ");
    int cantidad = Teclado.leerEntero("Cantidad a incrementar: ");
    if (cantidad < 0) {
      System.err.println("La cantidad a incrementar no puede ser menor que 0.");
    }
    else {
      almacen.incrementa(codigo, cantidad);
    }

  }

  /**
   * El siguiente método decrementa las unidades del artículo.
   */
  private static void decrementa() {
    int codigo = Teclado.leerEntero("Codigo del producto que desea decrementar: ");
    int cantidad = Teclado.leerEntero("Cantidad a decrementar: ");

    if (cantidad < 0) {
      System.err.println("La cantidad a decrementar no puede ser menor que 0.");
    }
    else {
      almacen.decrementa(codigo, cantidad);
    }

  }

  /**
   * Este método mofidifica la de descripción del artículo.
   */
  private static void modifica() {
    int codigo = Teclado.leerEntero("Codigo del producto que desea modificar: ");
    String descripcion = Teclado.leerCadena("Nueva descripción: ");
    almacen.modifica(codigo, descripcion);

  }

}
