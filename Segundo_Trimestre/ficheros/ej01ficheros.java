package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import Funciones.Varias;

/**
 * Ejercicio 1:
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author Francisco
 *
 */

public class ej01ficheros {

  public static void main(String[] args) throws IOException {

    System.out.println("El siguiente programa crea el fichero 'primos.dat' y guarda en el"
        + "los primeros 500 números primos. ");

    try {

      BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat")); 

      for (int i=0; i <= 500; i++) {
        if (Varias.esPrimo(i)) {
          bw.write(i + " ");
        }

      }
      bw.close();

    } catch (IOException e) {
      System.err.println("Se ha producido un error de escritura. ");
    }

  }



}
