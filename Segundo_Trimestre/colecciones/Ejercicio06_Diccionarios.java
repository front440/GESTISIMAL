package colecciones;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
 * almacenar las parejas de palabras. El programa pedirá una palabra en español
 * y dará la correspondiente traducción en inglés.
 * 
 * @author Francisco
 *
 */

public class Ejercicio06_Diccionarios {

  public static void main(String[] args) {
    
    // Creamos el diccioanrio
    Hashtable<String, String> diccionarioIngles = new Hashtable<String, String>();
    
    // Introducimos datos
    diccionarioIngles.put("ratón", "mouse");
    diccionarioIngles.put("bolígrafo", "pencil");
    diccionarioIngles.put("ordenador", "computer");
    diccionarioIngles.put("lámpara", "lamp");
    diccionarioIngles.put("ventana", "windows");
    diccionarioIngles.put("llave", "key");
    diccionarioIngles.put("papel", "paper");
    diccionarioIngles.put("cámara", "camera");
    diccionarioIngles.put("ventana", "windows");
    diccionarioIngles.put("cuaderno", "notebook");
    diccionarioIngles.put("estuche", "case");
    diccionarioIngles.put("coche", "car");
    diccionarioIngles.put("cielo", "sky");
    diccionarioIngles.put("juego", "game");
    diccionarioIngles.put("descarga", "download");
    diccionarioIngles.put("instituto", "Secunday School");
    diccionarioIngles.put("nube", "cloud");
    diccionarioIngles.put("película", "film");
    diccionarioIngles.put("correo", "mail");
    diccionarioIngles.put("diccionario", "dictionary");
    diccionarioIngles.put("repositorio", "repository");
    
    
    System.out.println("Diccionario Completo");
    
    // Imprimimos diccionario
    for (Entry<String, String> clave : diccionarioIngles.entrySet()){
      String valor = clave.getKey();
      System.out.print(valor + " | ");
  }
    System.out.println("¿De cúal de las palabras quieres saber la traducción?");
    
    
    

  }

}
