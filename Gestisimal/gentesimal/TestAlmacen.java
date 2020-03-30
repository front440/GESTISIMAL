package gentesimal;


import gentesimal.almacen;
import utiles.Menu;
import utiles.Teclado;

public class TestAlmacen {

  static almacen almacen = new almacen();
  
  static Menu menu = new Menu("Almacén de Artículos", new String[] {
      "Añadir Artículo", "Borrar Artículo", "Modificar Descripción",
      "Entrada Mercancía", "Salida Mercancía", "Mostrar Artículos", "Salir"});

  public static void main(String[] args) {
    
    annadirVarios();
    
    
    do {
      switch (menu.gestionar()) {
      case 1:
          añadir();
          break;
      case 2:
          borrar();
          break;
      case 3:
          modifica();
          break;
      case 4:
          incrementa();
          break;
      case 5:
          decrementa();
          break;
      case 6:
          muestra();
          break;
      case 7:
          System.out.println("Has salido del menu");
          System.out.println("¡Hasta la próxima!");
          System.exit(1);
      default:
          System.err.println("Sólo existen opciones entre 1 y 7.");
          System.out.println("--------------------------------------");
      }

  } while (true);


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
    String descripcion = Teclado.getTexto("Añade la descripción del artículo: ");
    Double precioC = Teclado.getDecimal("Añade el precio de compra del artículo: ");
    Double precioV = Teclado.getDecimal("Añade el precio de venta del artículo: ");
    int unidades = Teclado.getEntero("¿Cuantos artículos se van a añadir?");
    almacen.annadir(descripcion, precioC, precioV, unidades);
  }

  /**
   * Método que borra artículos del ArrayList
   */
  private static void borrar() {
    int codigo = Teclado.getEntero("Código del producto que desee borrar:");
    if (!almacen.borrar(codigo)) System.err.println("Código inexistente");

  }

  /**
   * El siguiente método incrementa las unidades del artículo
   */
  private static void incrementa() {
    int codigo = Teclado.getEntero("Código del producto que desea incrementar: ");
    int cantidad = Teclado.getEntero("Cantidad a incrementar: ");
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
    int codigo = Teclado.getEntero("Codigo del producto que desea decrementar: ");
    int cantidad = Teclado.getEntero("Cantidad a decrementar: ");

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
    int codigo = Teclado.getEntero("Codigo del producto que desea modificar: ");
    String descripcion = Teclado.getTexto("Nueva descripción: ");
    almacen.modifica(codigo, descripcion);

  }

}
