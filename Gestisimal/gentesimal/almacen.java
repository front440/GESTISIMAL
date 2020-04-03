package gentesimal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import excepciones.CSVInvalidoError;
import excepciones.CantidadNegativaError;
import excepciones.CodigoNoExisteError;
import excepciones.JSONInvalidoError;
import excepciones.PrecioNegativoError;
import excepciones.XMLInvalidoError;

//import excepciones.CSVInvalidoError;
//import excepciones.CantidadNegativaError;
//import excepciones.CodigoNoExisteError;
//import excepciones.JSONInvalidoError;
//import excepciones.PrecioNegativoError;
//import excepciones.XMLInvalidoError;

/**
 * 
 * @author Francisco
 *
 * Clase Almacen que realice el alta, baja, modificación, entrada de  mercancí
 *  (incrementa unidades), salida de mercancía (decrementa unidades) 
 *  El estado será un ArrayList de artículos. Esta clase es un envoltorio de un
 *  ArrrayList
 *  pero su diseño es distinto al de GESTISIMAL. No te copies, sencillamente entiéndelo.
 *  Su comportamiento será: añadir  artículos (no puede haber dos artículos iguales)
 *  eliminar artículos,  incrementar las existencias de un artículo (se delega en la
 *  clase artículo),  decrementar las existencias de un artículo (nunca por debajo de
 *  cero, se  delega en la clase artículo), devolver un artículo (para mostrarlo). Para
 *  listar el almacén podría devolverse una cadena con todos los artículos del almacén 
 *  (toString)
 */

public class almacen {

  /**
   * En este ArrayList almacenaremos los artículos que vayamos añadiendo
   */
  private ArrayList<Articulo> almacen = new ArrayList<Articulo>();

  /**
   * Este método añadirá al ArrayList Almacen el artículo con los datos que
   * pasemos
   * 
   * @param descripcion
   * @param precioC
   * @param precioV
   * @param unidades
   * @throws PrecioNegativoError 
   * @throws CantidadNegativaError 
   */
  public void annadir(String descripcion, double precioC, double precioV, int unidades) throws PrecioNegativoError, CantidadNegativaError {
    almacen.add(new Articulo(descripcion, precioC, precioV, unidades));
  }

  /**
   * Con este método borraremos los artículos de ArrayList de almacen
   * 
   * @param codigo
   * @return
   */
  public boolean borrar(int codigo) {
    return almacen.remove(new Articulo(codigo));

  }

  /**
   * Método que incrementará las unidades del artículo almacenadas en el ArrayList
   * 
   * @param codigo
   * @param numUnidades
   * @throws CodigoNoExisteError 
   * @throws CantidadNegativaError 
   */
  public void incrementa(int codigo, int cantidad) throws CodigoNoExisteError, CantidadNegativaError {
    // Articulo articulo = get(codigo);
    get(codigo).incrementaStock(cantidad);
    // Almacen.get(codigo).setUnidades(Almacen.get(codigo).getUnidades() +
    // cantidad);
  }

  /**
   * Este método nos extrae el índice del código del artículo en el ArrayList.
   * @param codigo
   * @return
   * @throws CodigoNoExisteError 
   */
  private Articulo get(int codigo) throws CodigoNoExisteError {
    try {
      return almacen.get(almacen.indexOf(new Articulo(codigo)));

    } catch (IndexOutOfBoundsException e) {
      throw new CodigoNoExisteError("Código: " + codigo + " inexistente, " + e.getMessage());
    }

  }

  /**
   * Método que decrementará las unidades del articulo almacenadas en el ArrayList
   * 
   * @param codigo
   * @param cantidad
   * @throws CantidadNegativaError 
   * @throws CodigoNoExisteError 
   */
  public void decrementa(int codigo, int cantidad) throws CantidadNegativaError, CodigoNoExisteError {

    get(codigo).decrementaStock(cantidad);

  }

  /**
   * Este método modificará la descripción del artículo por una nueva.
   * 
   * @param codigo
   * @param descripcion
   * @throws CodigoNoExisteError 
   * @throws CantidadNegativaError 
   * @throws PrecioNegativoError 
   */
  public void modifica(int codigo, String descripcion, double precioC, double precioV, int numUnidades) throws CodigoNoExisteError, CantidadNegativaError, PrecioNegativoError {

    get(codigo).set(descripcion, precioC, precioV, numUnidades);



  }

  /**
   * Método que, mediante un for-each recorremos el todos los artículos del
   * ArrayList y nos lo muestra.
   */
  public void muestra() {
    System.out.println("** Artículos en el Almacen **");
    System.out.println();
    for (Articulo articulo : almacen) {
      System.out.println(articulo);
    }

  }

  @Override
  public String toString() {
    return "" + almacen;
  }

  /**
   * Método que exporta e csv un fichero
   * @param fichero
   * @throws CSVInvalidoError
   */
  public void exportaCSV(String fichero) throws CSVInvalidoError {

    try {

      BufferedWriter csv = new BufferedWriter(new FileWriter(fichero));
      csv.write("Código, Descripción, Precio Compra, Precio Venta, Unidades");
      csv.newLine();
      for (Articulo articulo : almacen) {
        csv.write(articulo.getCodigo() + ",\"" + articulo.getDescripcion() + "\"," + articulo.getPrecioC() + ","
            + articulo.getPrecioV()  + "," + articulo.getUnidades());
        csv.newLine();

      }
      csv.close();

    } catch (Exception e) {
      throw new CSVInvalidoError("Error en la escritura del fichero " + fichero);
    }

  }

  /**
   * Método que importará artículos de un fichero CSON a almacén
   * @param fichero
   * @throws CSVInvalidoError
   * @throws PrecioNegativoError 
   * @throws NumberFormatException 
   * @throws CantidadNegativaError 
   */
  public void importarCSV(String fichero) throws CSVInvalidoError, NumberFormatException, PrecioNegativoError, CantidadNegativaError {

    try {

      BufferedReader csv = new BufferedReader(new FileReader(fichero));

      String linea = csv.readLine();
      linea = csv.readLine();

      while(linea != null) {
        String[] elementos = linea.split(",");
        annadir(elementos[1].replace("\"", ""), Double.parseDouble(elementos[2]), Double.parseDouble(elementos[3]), Integer.parseInt(elementos[4]));
        //        almacen.add(new Articulo(
        //            elementos[1].replace("\"", ""), 
        //            Double.parseDouble(elementos[2]), 
        //            Double.parseDouble(elementos[3]), 
        //            Integer.parseInt(elementos[4])));

        linea = csv.readLine();
      }
      csv.close();
    } catch (IOException e) {
      throw new CSVInvalidoError("No se puede leer el fichero " + fichero);
    }


  }

  /**
   * Método que exportará artículos que haya en el almacén a un documento XML
   * @param xml
   * @throws XMLInvalidoError
   */
  public void exportaXML(String xml) throws XMLInvalidoError {

    try {

      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = db.newDocument();

      Element raiz = doc.createElement("almacen");
      doc.appendChild(raiz);

      for (Articulo art : almacen) {

        // Nodo contenedor de elementos
        Element articulo = doc.createElement("articulo");
        raiz.appendChild(articulo);

        // Atributo de artículo
        Attr codigo = doc.createAttribute("codigo");
        codigo.setValue(Integer.toString(art.getCodigo()));
        articulo.setAttributeNode(codigo);

        // Nodo Descripción
        Element descripcion = doc.createElement("descripcion");
        descripcion.appendChild(doc.createTextNode(art.getDescripcion()));
        articulo.appendChild(descripcion);

        // Nodo Precio Compra
        Element precioC = doc.createElement("precioC");
        precioC.appendChild(doc.createTextNode(Double.toString(art.getPrecioC())));
        articulo.appendChild(precioC);

        // Nodo Precio Venta
        Element precioV = doc.createElement("precioV");
        precioV.appendChild(doc.createTextNode(Double.toString(art.getPrecioV())));
        articulo.appendChild(precioV);

        //Nodo Unidades
        Element unidades = doc.createElement("unidades");
        unidades.appendChild(doc.createTextNode(Integer.toString(art.getUnidades())));
        articulo.appendChild(unidades);

      }

      // Guardamos y convertimos el documento XML
      TransformerFactory tfF = TransformerFactory.newInstance();
      Transformer tf = tfF.newTransformer();
      DOMSource source = new DOMSource(doc);
      StreamResult result = new StreamResult(new FileWriter(xml));
      tf.transform(source, result);


    } catch (IOException e) {
      System.err.println("Error al crear el documento " + xml + ": " + e.getMessage());
    } catch (TransformerException e) {
      System.err.println("Error al convertir el documento " + xml + ": " + e.getMessage());
    } catch (ParserConfigurationException e) {
      System.err.println("Error al construir el documento: " + xml + ": " + e.getMessage());
    }


  }

  /**
   * Método que importará artículos de un fichero XML a almacén.
   * @param xml
   * @throws XMLInvalidoError
   */
  public void importaXML(String xml) throws XMLInvalidoError {

    try {

      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = db.parse(new File(xml));
      doc.getDocumentElement().normalize();

      // Accedemos a la lista de artículo
      NodeList articulos = doc.getElementsByTagName("articulo");

      // Recorremos los nodos de artículo
      for (int i = 0 ; i < articulos.getLength(); i++) {

        // Nodo Artículo
        Node nodo = articulos.item(i);
        Element articulo = (Element) nodo;

        // Extraemos el atributo de código
        @SuppressWarnings("unused")
        int codigo = Integer.parseInt(articulo.getAttribute("codigo"));

        // Extraemos la información de cada nodo
        String descripcion = articulo.getElementsByTagName("descripcion").item(0).getTextContent();
        double precioC = Double.parseDouble(articulo.getElementsByTagName("precioC").item(0).getTextContent());
        double precioV = Double.parseDouble(articulo.getElementsByTagName("precioV").item(0).getTextContent());
        int unidades = Integer.parseInt(articulo.getElementsByTagName("unidades").item(0).getTextContent());

        // Añadimos Articulo
        almacen.add(new Articulo(descripcion, precioC, precioV, unidades));

      }

    } catch (Exception e) {
      throw new XMLInvalidoError("Error al abrir el documento: " + xml);
    }

  }

  /**
   * Este método importará todos los artículos que haya en el almacen a un fichero JSON
   * pasado como parámetro.
   * @param fichero
   * @throws JSONInvalidoError
   */
  public void exportaJSON(String fichero) throws JSONInvalidoError {

    try {

      // Pasamos el arraylist a JSON
      String json = new Gson().toJson(almacen);

      // Guardamos el JSON en un archivo
      BufferedWriter bf;
      bf = new BufferedWriter(new FileWriter(fichero));
      bf.write(json);
      bf.close();

    } catch (IOException e) {
      throw new JSONInvalidoError("Error al abrir el fichero JSON " + fichero + ": " + e.getMessage());
    }

  }

  /**
   * Método que importa los artículos de un documento JSON a almacén
   * @param fichero
   * @throws JSONInvalidoError
   */
  public void importaJSON(String fichero) throws JSONInvalidoError {

    try {

      // Leemos el fichero y lo pasamos a JSON
      BufferedReader bf = new BufferedReader(new FileReader(fichero));
      String json = bf.readLine();
      bf.close();

      Gson gson = new Gson();
      // Creamos cada atributo de artículo
      Type articulosType = new TypeToken<ArrayList<Articulo>>(){}.getType();
      ArrayList<Articulo> articulos = gson.fromJson(json, articulosType);

      for (Articulo art : articulos) {
        annadir(art.getDescripcion(), art.getPrecioC(), art.getPrecioV(), art.getUnidades());
      }


    } catch (Exception e) {
      throw new JSONInvalidoError("Error de lectura en el fichero " + fichero + ": " + e.getMessage());
    }

  }

}