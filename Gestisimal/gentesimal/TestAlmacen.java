package gentesimal;


import gentesimal.almacen;
import utiles.Menu;
import utiles.Teclado;

public class TestAlmacen {

  static almacen almacen = new almacen();
  
  static Menu menu = new Menu("Almac�n de Art�culos", new String[] {
      "A�adir Art�culo", "Borrar Art�culo", "Modificar Descripci�n",
      "Entrada Mercanc�a", "Salida Mercanc�a", "Mostrar Art�culos", "Salir"});

  public static void main(String[] args) {
    
    annadirVarios();
    
    
    do {
      switch (menu.gestionar()) {
      case 1:
          a�adir();
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
          System.out.println("�Hasta la pr�xima!");
          System.exit(1);
      default:
          System.err.println("S�lo existen opciones entre 1 y 7.");
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
   * M�todo que imprime por pantalla los art�culos del arraylist de almacen
   */
  private static void muestra() {
    almacen.muestra();
    
  }

  /**
   * M�todo que a�ade art�culos al ArrayList
   */
  private static void a�adir() {
    String descripcion = Teclado.getTexto("A�ade la descripci�n del art�culo: ");
    Double precioC = Teclado.getDecimal("A�ade el precio de compra del art�culo: ");
    Double precioV = Teclado.getDecimal("A�ade el precio de venta del art�culo: ");
    int unidades = Teclado.getEntero("�Cuantos art�culos se van a a�adir?");
    almacen.annadir(descripcion, precioC, precioV, unidades);
  }

  /**
   * M�todo que borra art�culos del ArrayList
   */
  private static void borrar() {
    int codigo = Teclado.getEntero("C�digo del producto que desee borrar:");
    if (!almacen.borrar(codigo)) System.err.println("C�digo inexistente");

  }

  /**
   * El siguiente m�todo incrementa las unidades del art�culo
   */
  private static void incrementa() {
    int codigo = Teclado.getEntero("C�digo del producto que desea incrementar: ");
    int cantidad = Teclado.getEntero("Cantidad a incrementar: ");
    if (cantidad < 0) {
      System.err.println("La cantidad a incrementar no puede ser menor que 0.");
    }
    else {
      almacen.incrementa(codigo, cantidad);
    }

  }

  /**
   * El siguiente m�todo decrementa las unidades del art�culo.
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
   * Este m�todo mofidifica la de descripci�n del art�culo.
   */
  private static void modifica() {
    int codigo = Teclado.getEntero("Codigo del producto que desea modificar: ");
    String descripcion = Teclado.getTexto("Nueva descripci�n: ");
    almacen.modifica(codigo, descripcion);

  }

}
