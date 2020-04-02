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

  static Menu menu = new Menu("Almacén de Artículos", new String[] {
      "Añadir Artículo", "Borrar Artículo", "Modificar Artículo",
      "Entrada Mercancía", "Salida Mercancía", "Mostrar Artículos",
      "Exporta CSV", "importa CSV", "exporta XML", "importa XML",
      "exporta JSON", "importa JSON", "Salir"});

  public static void main(String[] args) throws XMLInvalidoError, 
  CSVInvalidoError, JSONInvalidoError, NumberFormatException, PrecioNegativoError, CantidadNegativaError, CodigoNoExisteError {

    //annadirVarios();


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
        System.out.println("¡Hasta la próxima!");
        System.exit(1);
      default:
        System.err.println("Sólo existen opciones entre 1 y 7.");
        System.out.println("--------------------------------------");
      }

    } while (true);


  }

  /**
   * Método que exportará los artículos que haya en el almacen a un fichero JSON
   * @param fichero
   * @throws JSONInvalidoError
   */
  private static void exportaJSON() throws JSONInvalidoError {

    String fichero = Teclado.getTexto("Introduce el nombre del fichero");
    try {

      almacen.exportaJSON(fichero);

    } catch (JSONInvalidoError e) {
      throw new JSONInvalidoError("Error al crear el fichero JSON " + fichero + ": " + e.getMessage());
    }

  }

  /**
   * Método que importará un archivo JSON con artículos que añadiremos al almacen.
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
   * Método que importará un archivo XML con artículos que añadiremos al almacen.
   * @throws XMLInvalidoError
   */
  private static void importaXML() throws XMLInvalidoError {
    String xml = Teclado.getTexto("Introduce el nombre del fichero CSV.");
    try {
      almacen.importaXML(xml);
    } catch (XMLInvalidoError e) {
      throw new XMLInvalidoError("No se ha podido leer el archivo" + xml + ": " + e.getMessage());
    }


  }

  private static void exportaXML() throws XMLInvalidoError {
    String xml = Teclado.getTexto("Introduce el nombre del fichero XML.");
    try {
      almacen.exportaXML(xml);
    } catch (XMLInvalidoError e) {
      throw new XMLInvalidoError("No se ha podido leer el archivo" + xml + ": " + e.getMessage());
    }

  }

  /**
   * Método que importará un archivo XML con artículos que añadiremos al almacen.
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
      throw new CSVInvalidoError("No se ha podido leer el archivo " + csv +": " + e.getMessage());
    }

  }

  /**
   * Método que exportará artículos de almacen a documento CSV
   * @throws CSVInvalidoError 
   */
  private static void exportaCSV() throws CSVInvalidoError {
    String csv = Teclado.getTexto("Introduce el nombre del fichero CSV.");
    try {
      almacen.exportaCSV(csv);
    } catch (CSVInvalidoError e) {
      throw new CSVInvalidoError("No se ha podido leer el archivo" + csv + ": " + e.getMessage());
    }

  }

  //  private static void annadirVarios() {
  //    almacen.annadir("aa", 11, 11, 11);
  //    //almacen.annadir("bb", 22, 22, 22);
  //    //almacen.annadir("cc", 33, 33, 33);
  //  }

  /**
   * Método que imprime por pantalla los artículos del arraylist de almacen
   */
  private static void muestra() {
    almacen.muestra();

  }

  /**
   * Método que añade artículos al ArrayList
   * @throws PrecioNegativoError 
   * @throws CantidadNegativaError 
   */
  private static void añadir() throws PrecioNegativoError, CantidadNegativaError {
    try {

      String descripcion = Teclado.getTexto("Añade la descripción del artículo: ");
      Double precioC = Teclado.getDecimal("Añade el precio de compra del artículo: ");
      Double precioV = Teclado.getDecimal("Añade el precio de venta del artículo: ");
      int unidades = Teclado.getEntero("¿Cuantos artículos se van a añadir?");
      almacen.annadir(descripcion, precioC, precioV, unidades);

    } catch (PrecioNegativoError e) {
      System.err.println("No se ha añadido el artículo: " + e.getMessage());
    } catch (CantidadNegativaError e) {
      System.err.println("No se ha añadido el artículo: " + e.getMessage());
    }

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
   * @throws CodigoNoExisteError 
   * @throws CantidadNegativaError 
   */
  private static void incrementa() throws CodigoNoExisteError {

    try {

      int codigo = Teclado.getEntero("Código del producto que desea incrementar: ");
      int cantidad = Teclado.getEntero("Cantidad a incrementar: ");


      almacen.incrementa(codigo, cantidad);


    } catch (CodigoNoExisteError e) {
      throw new CodigoNoExisteError("No se ha podido incrementar artículo: " + e.getMessage());
    } catch (CantidadNegativaError e) {
      throw new CodigoNoExisteError("No se ha podido incrementar artículo: " + e.getMessage());
    }


  }

  /**
   * El siguiente método decrementa las unidades del artículo.
   * @throws CodigoNoExisteError 
   * @throws CantidadNegativaError 
   */
  private static void decrementa() {
    
    try {
      
      int codigo = Teclado.getEntero("Codigo del producto que desea decrementar: ");
      int cantidad = Teclado.getEntero("Cantidad a decrementar: ");
      almacen.decrementa(codigo, cantidad);
      
    } catch (CodigoNoExisteError e) {
      System.err.println("No se ha podido decrementar el artículo: " + e.getMessage());
    } catch (CantidadNegativaError e) {
      System.err.println("No se ha podido decrementar el artículo: " + e.getMessage());
    }

    
  }

  /**
   * Este método mofidifica la de descripción del artículo.
   * @throws CodigoNoExisteError 
   * @throws CantidadNegativaError 
   */
  private static void modifica() {

    int codigo = 0;
    try {

      codigo = Teclado.getEntero("Codigo del producto que desea modificar: ");
      String descripcion = Teclado.getTexto("Nueva descripción: ");
      double precioC = Teclado.getDecimal("Introduce el nuevo precio de compra: ");
      double precioV = Teclado.getDecimal("Introduce el nuevo precio de venta: ");
      int numUnidades = Teclado.getEntero("Introduce el nuevo número de unidades: ");

      almacen.modifica(codigo, descripcion, precioC, precioV, numUnidades);

    } catch (CodigoNoExisteError e) {
      System.err.println("No se ha podido modificar el artículo " + e.getMessage());
    } catch (PrecioNegativoError e) {
      System.err.println("El precio no puede ser negativo " + e.getMessage());
    } catch (CantidadNegativaError e) {
      System.err.println("La cantidad a decrementar no puede ser negativa " + e.getMessage());
    }


  }

}
