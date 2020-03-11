package gentesimal;


import gentesimal.almacen;
import utiles.Teclado;

public class TestAlmacen {

  static almacen almacen = new almacen();

  public static void main(String[] args) {

    boolean salir = true;
    
    annadirVarios();
    
    
    while (salir) {

      System.out.println("PR�CTICA DE GENTISIMAL");
      System.out.println();
      System.out.println("�Qu� deseas hacer?");
      System.out.println("1) A�adir art�culo:"); // A�adir art�culo
      System.out.println("2) Borrar art�culo:"); // Borrar art�culo
      System.out.println("3) Modificar art�culo: ");
      System.out.println("4) Entrada mercanc�a: "); // Incremetar unidades
      System.out.println("5) Salida mercanc�a: "); // Decrementar unidades
      System.out.println("6) Mostrar art�culos de almacen: ");
      System.out.println("7) Salir: ");
      int opcion = Teclado.leerEntero("Introduce opci�n: ");

      switch (opcion) {
      case 1: // A�adir art�culo:
        a�adir();
        break;
      case 2: // Borrar art�culo
        borrar();
        break;
      case 3: // Modifica descripci�n de art�culo
        modifica();
        break;
      case 4: // Incrementar art�culo
        incrementa();
        break;
      case 5: // Decrementar art�culo
        decrementa();
        break;
      case 6: // Art�culos de almacen
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
   * M�todo que imprime por pantalla los art�culos del arraylist de almacen
   */
  private static void muestra() {
    almacen.muestra();
    
  }

  /**
   * M�todo que a�ade art�culos al ArrayList
   */
  private static void a�adir() {
    String descripcion = Teclado.leerCadena("A�ade la descripci�n del art�culo: ");
    Double precioC = Teclado.leerDouble("A�ade el precio de compra del art�culo: ");
    Double precioV = Teclado.leerDouble("A�ade el precio de venta del art�culo: ");
    int unidades = Teclado.leerEntero("�Cuantos art�culos se van a a�adir?");
    almacen.annadir(descripcion, precioC, precioV, unidades);
  }

  /**
   * M�todo que borra art�culos del ArrayList
   */
  private static void borrar() {
    int codigo = Teclado.leerEntero("C�digo del producto que desee borrar:");
    if (!almacen.borrar(codigo)) System.err.println("C�digo inexistente");

  }

  /**
   * El siguiente m�todo incrementa las unidades del art�culo
   */
  private static void incrementa() {
    int codigo = Teclado.leerEntero("C�digo del producto que desea incrementar: ");
    int cantidad = Teclado.leerEntero("Cantidad a incrementar: ");
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
   * Este m�todo mofidifica la de descripci�n del art�culo.
   */
  private static void modifica() {
    int codigo = Teclado.leerEntero("Codigo del producto que desea modificar: ");
    String descripcion = Teclado.leerCadena("Nueva descripci�n: ");
    almacen.modifica(codigo, descripcion);

  }

}
