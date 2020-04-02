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

/**
 * 
 * @author Francisco
 *
 * Clase Almacen que realice el alta, baja, modificaci�n, entrada de  mercanc�
 *  (incrementa unidades), salida de mercanc�a (decrementa unidades) 
 *  El estado ser� un ArrayList de art�culos. Esta clase es un envoltorio de un
 *  ArrrayList
 *  pero su dise�o es distinto al de GESTISIMAL. No te copies, sencillamente enti�ndelo.
 *  Su comportamiento ser�: a�adir  art�culos (no puede haber dos art�culos iguales)
 *  eliminar art�culos,  incrementar las existencias de un art�culo (se delega en la
 *  clase art�culo),  decrementar las existencias de un art�culo (nunca por debajo de
 *  cero, se  delega en la clase art�culo), devolver un art�culo (para mostrarlo). Para
 *  listar el almac�n podr�a devolverse una cadena con todos los art�culos del almac�n 
 *  (toString)
 */

public class almacen {

  /**
   * En este ArrayList almacenaremos los art�culos que vayamos a�adiendo
   */
  private ArrayList<Articulo> almacen = new ArrayList<Articulo>();

  /**
   * Este m�todo a�adir� al ArrayList Almacen el art�culo con los datos que
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
   * Con este m�todo borraremos los art�culos de ArrayList de almacen
   * 
   * @param codigo
   * @return
   */
  public boolean borrar(int codigo) {
    return almacen.remove(new Articulo(codigo));

  }

  /**
   * M�todo que incrementar� las unidades del art�culo almacenadas en el ArrayList
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
   * Este m�todo nos extrae el �ndice del c�digo del art�culo en el ArrayList.
   * @param codigo
   * @return
   * @throws CodigoNoExisteError 
   */
  private Articulo get(int codigo) throws CodigoNoExisteError {
    try {
      return almacen.get(almacen.indexOf(new Articulo(codigo)));

    } catch (IndexOutOfBoundsException e) {
      throw new CodigoNoExisteError("C�digo: " + codigo + " inexistente, " + e.getMessage());
    }

  }

  /**
   * M�todo que decrementar� las unidades del articulo almacenadas en el ArrayList
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
   * Este m�todo modificar� la descripci�n del art�culo por una nueva.
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
   * M�todo que, mediante un for-each recorremos el todos los art�culos del
   * ArrayList y nos lo muestra.
   */
  public void muestra() {
    System.out.println("** Art�culos en el Almacen **");
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
   * M�todo que exporta e csv un fichero
   * @param fichero
   * @throws CSVInvalidoError
   */
  public void exportaCSV(String fichero) throws CSVInvalidoError {

    try {

      BufferedWriter csv = new BufferedWriter(new FileWriter(fichero));
      csv.write("C�digo, Descripci�n, Precio Compra, Precio Venta, Unidades");
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
   * M�todo que importar� art�culos de un fichero CSON a almac�n
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
        almacen.add(new Articulo(
            elementos[1].replace("\"", ""), 
            Double.parseDouble(elementos[2]), 
            Double.parseDouble(elementos[3]), 
            Integer.parseInt(elementos[4])));

        linea = csv.readLine();
      }
      csv.close();
    } catch (IOException e) {
      throw new CSVInvalidoError("No se puede leer el fichero " + fichero);
    }


  }

  /**
   * M�todo que exportar� art�culos que haya en el almac�n a un documento XML
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

        // Atributo de art�culo
        Attr codigo = doc.createAttribute("codigo");
        codigo.setValue(Integer.toString(art.getCodigo()));
        articulo.setAttributeNode(codigo);

        // Nodo Descripci�n
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
      throw new XMLInvalidoError("Error al crear el documento " + xml + ": " + e.getMessage());
    } catch (TransformerException e) {
      throw new XMLInvalidoError("Error al convertir el documento " + xml + ": " + e.getMessage());
    } catch (ParserConfigurationException e) {
      throw new XMLInvalidoError("Error al construir el documento: " + xml + ": " + e.getMessage());
    }


  }

  /**
   * M�todo que importar� art�culos de un fichero XML a almac�n.
   * @param xml
   * @throws XMLInvalidoError
   */
  public void importaXML(String xml) throws XMLInvalidoError {

    try {

      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = db.parse(new File(xml));
      doc.getDocumentElement().normalize();

      // Accedemos a la lista de art�culo
      NodeList articulos = doc.getElementsByTagName("articulo");

      // Recorremos los nodos de art�culo
      for (int i = 0 ; i < articulos.getLength(); i++) {

        // Nodo Art�culo
        Node nodo = articulos.item(i);
        Element articulo = (Element) nodo;

        // Extraemos el atributo de c�digo
        @SuppressWarnings("unused")
        int codigo = Integer.parseInt(articulo.getAttribute("codigo"));

        // Extraemos la informaci�n de cada nodo
        String descripcion = articulo.getElementsByTagName("descripcion").item(0).getTextContent();
        double precioC = Double.parseDouble(articulo.getElementsByTagName("precioC").item(0).getTextContent());
        double precioV = Double.parseDouble(articulo.getElementsByTagName("precioV").item(0).getTextContent());
        int unidades = Integer.parseInt(articulo.getElementsByTagName("unidades").item(0).getTextContent());

        // A�adimos Articulo
        almacen.add(new Articulo(descripcion, precioC, precioV, unidades));

      }

    } catch (Exception e) {
      throw new XMLInvalidoError("Error al abrir el documento: " + xml + ": " + e.getMessage());
    }

  }

  /**
   * Este m�todo importar� todos los art�culos que haya en el almacen a un fichero JSON
   * pasado como par�metro.
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
   * M�todo que importa los art�culos de un documento JSON a almac�n
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
      // Creamos cada atributo de art�culo
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