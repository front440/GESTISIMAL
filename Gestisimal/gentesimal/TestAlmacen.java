package gentesimal;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import excepciones.CSVInvalidoError;
import excepciones.CantidadNegativaError;
import excepciones.CodigoNoExisteError;
import excepciones.JSONInvalidoError;
import excepciones.PrecioNegativoError;
import excepciones.XMLInvalidoError;
import gentesimal.almacen;
import utiles.Menu;
import utiles.Teclado;

public class TestAlmacen {

  static almacen almacen = new almacen();

  static Menu menu = new Menu("Almac�n de Art�culos", new String[] {
      "A�adir Art�culo", "Borrar Art�culo", "Modificar Art�culo",
      "Entrada Mercanc�a", "Salida Mercanc�a", "Mostrar Art�culos",
      "Exporta CSV", "importa CSV", "exporta XML", "importa XML",
      "exporta JSON", "importa JSON", "Salir"});

  public static void main(String[] args) throws XMLInvalidoError, 
  CSVInvalidoError, JSONInvalidoError, NumberFormatException, PrecioNegativoError, CantidadNegativaError, CodigoNoExisteError {

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
        exportaCSV();
        break;
      case 8:
        importaCSV();
        break;
      case 9:
        exportaXML();
        break;
      case 10:
        importaXML();
        break;
      case 11:
        exportaJSON();
        break;
      case 12:
        importaJSON();
        break;
      case 13:
        System.out.println("Has salido del menu");
        System.out.println("�Hasta la pr�xima!");
        System.exit(1);
      default:
        System.err.println("S�lo existen opciones entre 1 y 7.");
        System.out.println("--------------------------------------");
      }

    } while (true);


  }

  private static void annadirVarios() throws PrecioNegativoError, CantidadNegativaError {
    almacen.annadir("aaa", 10, 10, 10);
    almacen.annadir("bbb", 20, 20, 20);
    almacen.annadir("ccc", 30, 30, 30);
    
  }

  


  /**
   * M�todo que a�ade art�culos al ArrayList
   * @throws PrecioNegativoError 
   * @throws CantidadNegativaError 
   */
  private static void a�adir() throws PrecioNegativoError, CantidadNegativaError {
    try {

      String descripcion = Teclado.getTexto("A�ade la descripci�n del art�culo: ");
      Double precioC = Teclado.getDecimal("A�ade el precio de compra del art�culo: ");
      Double precioV = Teclado.getDecimal("A�ade el precio de venta del art�culo: ");
      int unidades = Teclado.getEntero("�Cuantos art�culos se van a a�adir?");
      almacen.annadir(descripcion, precioC, precioV, unidades);

    } catch (PrecioNegativoError e) {
      System.err.println("No se ha a�adido el art�culo: " + e.getMessage());
    } catch (CantidadNegativaError e) {
      System.err.println("No se ha a�adido el art�culo: " + e.getMessage());
    }

  }

  /**
   * M�todo que borra art�culos del ArrayList
   */
  private static void borrar() {
    int codigo = Teclado.getEntero("C�digo del producto que desee borrar:");
    if (!almacen.borrar(codigo)) System.err.println("C�digo inexistente");

  }
  
  /**
   * Este m�todo mofidifica la de descripci�n del art�culo.
   * @throws CodigoNoExisteError 
   * @throws CantidadNegativaError 
   */
  private static void modifica() {

    int codigo = 0;
    try {

      codigo = Teclado.getEntero("Codigo del producto que desea modificar: ");
      String descripcion = Teclado.getTexto("Nueva descripci�n: ");
      double precioC = Teclado.getDecimal("Introduce el nuevo precio de compra: ");
      double precioV = Teclado.getDecimal("Introduce el nuevo precio de venta: ");
      int numUnidades = Teclado.getEntero("Introduce el nuevo n�mero de unidades: ");

      almacen.modifica(codigo, descripcion, precioC, precioV, numUnidades);

    } catch (CodigoNoExisteError e) {
      System.err.println("No se ha podido modificar el art�culo " + e.getMessage());
    } catch (PrecioNegativoError e) {
      System.err.println("El precio no puede ser negativo " + e.getMessage());
    } catch (CantidadNegativaError e) {
      System.err.println("La cantidad a decrementar no puede ser negativa " + e.getMessage());
    }


  }

  /**
   * El siguiente m�todo incrementa las unidades del art�culo
   * @throws CodigoNoExisteError 
   * @throws CantidadNegativaError 
   */
  private static void incrementa() throws CodigoNoExisteError {

    try {

      int codigo = Teclado.getEntero("C�digo del producto que desea incrementar: ");
      int cantidad = Teclado.getEntero("Cantidad a incrementar: ");


      almacen.incrementa(codigo, cantidad);


    } catch (CodigoNoExisteError e) {
      System.err.println("No se ha podido incrementar art�culo: " + e.getMessage());
    } catch (CantidadNegativaError e) {
      System.err.println("No se ha podido incrementar art�culo: " + e.getMessage());
    }


  }

  /**
   * El siguiente m�todo decrementa las unidades del art�culo.
   * @throws CodigoNoExisteError 
   * @throws CantidadNegativaError 
   */
  private static void decrementa() {

    try {

      int codigo = Teclado.getEntero("Codigo del producto que desea decrementar: ");
      int cantidad = Teclado.getEntero("Cantidad a decrementar: ");
      almacen.decrementa(codigo, cantidad);

    } catch (CodigoNoExisteError e) {
      System.err.println("No se ha podido decrementar el art�culo: " + e.getMessage());
    } catch (CantidadNegativaError e) {
      System.err.println("No se ha podido decrementar el art�culo: " + e.getMessage());
    }


  }
  
  /**
   * M�todo que imprime por pantalla los art�culos del arraylist de almacen
   */
  private static void muestra() {
    almacen.muestra();
  
  }
  
  /**
   * M�todo que exportar� los art�culos que haya en el almacen a un fichero JSON
   * @param fichero
   * @throws JSONInvalidoError
   */
  private static void exportaJSON() throws JSONInvalidoError {

    String fichero = Teclado.getTexto("Introduce el nombre del fichero");
    try {

      almacen.exportaJSON(fichero);

    } catch (JSONInvalidoError e) {
      System.err.println("Error al crear el fichero JSON " + fichero + ": " + e.getMessage());
    }

  }

  /**
   * M�todo que importar� un archivo JSON con art�culos que a�adiremos al almacen.
   * @throws JSONInvalidoError
   */
  private static void importaJSON() throws JSONInvalidoError {

    String json = Teclado.getTexto("Introduce el nombre del fichero CSV.");
    try {
      almacen.importaJSON(json);
    } catch (JSONInvalidoError e) {
      throw new JSONInvalidoError("No se ha podido leer el archivo" + json + ": " + e.getMessage());
    }

  }

  /**
   * M�todo que importar� un archivo XML con art�culos que a�adiremos al almacen.
   * @throws XMLInvalidoError
   */
  private static void importaXML() throws XMLInvalidoError {
    String xml = Teclado.getTexto("Introduce el nombre del fichero CSV.");
    try {
      almacen.importaXML(xml);
    } catch (XMLInvalidoError e) {
      System.err.println("No se ha podido crear el archivo" + xml + ". " + e.getMessage());
    }


  }

  private static void exportaXML() throws XMLInvalidoError {
    String xml = Teclado.getTexto("Introduce el nombre del fichero XML.");
    try {
      almacen.exportaXML(xml);
    } catch (XMLInvalidoError e) {
      System.err.println("No se ha podido leer el archivo" + xml + ": " + e.getMessage());
    }

  }

  /**
   * M�todo que importar� un archivo XML con art�culos que a�adiremos al almacen.
   * @throws CSVInvalidoError 
   * @throws PrecioNegativoError 
   * @throws NumberFormatException 
   * @throws CantidadNegativaError 
   */
  private static void importaCSV() throws CSVInvalidoError, NumberFormatException, PrecioNegativoError, CantidadNegativaError {
    String csv = Teclado.getTexto("Introduce el nombre del fichero CSV.");
    try {
      almacen.importarCSV(csv);
    } catch (CSVInvalidoError e) {
      System.err.println("No se ha podido leer el archivo " + csv +": " + e.getMessage());
    }

  }

  /**
   * M�todo que exportar� art�culos de almacen a documento CSV
   * @throws CSVInvalidoError 
   */
  private static void exportaCSV() throws CSVInvalidoError {
    String csv = Teclado.getTexto("Introduce el nombre del fichero CSV.");
    try {
      almacen.exportaCSV(csv);
    } catch (CSVInvalidoError e) {
      System.err.println("No se ha podido leer el archivo" + csv + ": " + e.getMessage());
    }

  }

}
