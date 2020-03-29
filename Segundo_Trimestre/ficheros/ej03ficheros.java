package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Escribe un programa que guarde en un fichero el contenido de otros dos
 * ficheros, de tal forma que en el fichero resultante aparezcan las l�neas de los
 * primeros dos ficheros mezcladas, es decir, la primera l�nea ser� del primer
 * fichero, la segunda ser� del segundo fichero, la tercera ser� la siguiente del
 * primer fichero, etc.
 * Los nombres de los dos ficheros origen y el nombre del fichero destino se deben
 * pasar como argumentos en la l�nea de comandos.
 * Hay que tener en cuenta que los ficheros de donde se van cogiendo las l�neas
 * pueden tener tama�os diferentes.
 * 
 * @author Francisco
 *
 */

public class ej03ficheros {

  public static void main(String[] args) {
    
    if (args.length != 2) {
      System.err.println("El n�mero de argumentos no es v�lido.");
    }
    
    try {
      // Archivos de lectura
      BufferedReader br1 = new BufferedReader(new FileReader("fichero1ej03.txt"));
      BufferedReader br2 = new BufferedReader(new FileReader("fichero2ej03.txt"));
      // Archivo de escritura
      BufferedWriter bw = new BufferedWriter(new FileWriter("mezcla.txt"));
      
      String fichero1 = "";
      String fichero2 = "";
      
      while (fichero1 != null || fichero2 != null) {
        fichero1 = br1.readLine();
        fichero2 = br2.readLine();
        
        if (fichero1 != null) {
          bw.write(fichero1 + "\n");
        }
        if (fichero2 != null) {
          bw.write(fichero2 + "\n"); 
        }              
        
      }
      
      br1.close();
      br2.close();
      bw.close();
      
    } catch (Exception e) {
      System.err.println("Error al abrir archivo de escritura y lectura.");
    }

  }

}
