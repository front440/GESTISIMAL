package colecciones;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Crea un mini-diccionario espa�ol-ingl�s que contenga, al menos, 20 palabras
 * (con su correspondiente traducci�n). Utiliza un objeto de la clase HashMap para
 * almacenar las parejas de palabras. El programa pedir� una palabra en espa�ol
 * y dar� la correspondiente traducci�n en ingl�s.
 * 
 * @author Francisco
 *
 */

public class Ejercicio06_Diccionarios {

  public static void main(String[] args) {
    
    // Creamos el diccioanrio
    Hashtable<String, String> diccionarioIngles = new Hashtable<String, String>();
    
    // Introducimos datos
    diccionarioIngles.put("rat�n", "mouse");
    diccionarioIngles.put("bol�grafo", "pencil");
    diccionarioIngles.put("ordenador", "computer");
    diccionarioIngles.put("l�mpara", "lamp");
    diccionarioIngles.put("ventana", "windows");
    diccionarioIngles.put("llave", "key");
    diccionarioIngles.put("papel", "paper");
    diccionarioIngles.put("c�mara", "camera");
    diccionarioIngles.put("ventana", "windows");
    diccionarioIngles.put("cuaderno", "notebook");
    diccionarioIngles.put("estuche", "case");
    diccionarioIngles.put("coche", "car");
    diccionarioIngles.put("cielo", "sky");
    diccionarioIngles.put("juego", "game");
    diccionarioIngles.put("descarga", "download");
    diccionarioIngles.put("instituto", "Secunday School");
    diccionarioIngles.put("nube", "cloud");
    diccionarioIngles.put("pel�cula", "film");
    diccionarioIngles.put("correo", "mail");
    diccionarioIngles.put("diccionario", "dictionary");
    diccionarioIngles.put("repositorio", "repository");
    
    
    System.out.println("Diccionario Completo");
    
    // Imprimimos diccionario
    for (Entry<String, String> clave : diccionarioIngles.entrySet()){
      String valor = clave.getKey();
      System.out.print(valor + " | ");
  }
    System.out.println("�De c�al de las palabras quieres saber la traducci�n?");
    
    
    

  }

}
