package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * 
 * @author Francisco
 *
 */

public class ej02ficheros {

  public static void main(String[] args) {
    
    System.out.println("Este programa leerá el fichero 'primos.dat' y imprimirá"
        + "por pantalla su contenido.");
    
    try {
      BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
      
      String linea = "";
      
      while (linea != null) {
        
        System.out.println(linea );
        linea = br.readLine();
      }
      
      br.close();
      
    } catch (IOException e) {
      System.err.println("Ha habido un error de lectura.");
    }

  }

}
