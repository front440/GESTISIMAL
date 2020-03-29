package ficheros;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 2. Crea un programa que encripte un fichero que le pasamos como parámetro y almacene el resultado en otro, 
 *    que también pasamos como parámetro, de manera que:
 *    
 *            1. Si el programa no recibe dos parámetros termina con un error 1.
 *            2. Si el programa recibe un solo parámetro guardará la información encriptada en el mismo archivo del que lee, 
 *               pero antes advertirá al usuario de que machacará el archivo origen, dando opción a que la operación no se haga.
 *            3. Si el fichero origen no existe (da error al abrirlo como lectura) el programa termina con un mensaje de error y código 2.
 *            4. Si en el fichero destino no se puede escribir da error al abrirlo como lectura) el 
 *               programa termina con un mensaje de error y código 2.
 *            5. Para encriptar usa el método César, necesitarás una clave que debes pedir al usuario.
 *            
 * @author JOSÉ LUIS ÁLVAREZ FERNÁNDEZ
 *
 */

public class encriptaCesar {
  
  /**
   * 
   * @param linea
   * @param desplazamiento
   * @return
   */
  private static String encriptaCesar(String linea, int desplazamiento) {
    String letras = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZáéíóúüÁÉÍÓÚÜ";
    String cadenaEncriptada = "";
    for (int i=0; i<linea.length(); i++) {
      String caracter = linea.substring(i, i+1);
      // Si el caracter es alfabético, encriptamos
      if (letras.contains(caracter)) {
        int posicionDondeEsta = letras.indexOf(caracter);
        int posicionCaracterEncriptado = ((posicionDondeEsta + desplazamiento) % letras.length());
        caracter = letras.substring(posicionCaracterEncriptado, posicionCaracterEncriptado+1);
      }
      cadenaEncriptada += caracter;
    }     
    return cadenaEncriptada;
  }

  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner (System.in);

    //  1. Si el programa no recibe dos parámetros termina con un error 1.

    if ((args.length < 1) || (args.length > 2)){
      System.err.println("Error al introducir los parámetros");
      System.exit(1);
    }


    // 2. Si el programa recibe un solo parámetro guardará la información encriptada
    // en el mismo archivo del que lee, pero antes advertirá al usuario de que 
    // machacará el archivo origen, dando opción a que la operación no se haga.

    String ficheroOrigen = args[0];
    String ficheroDestino = null;

    if ( args.length == 1) {
      ficheroDestino = ficheroOrigen;

      System.out.println("Tenga en cuenta que solo ha indicado un nombre de archivo " + ficheroOrigen);
      System.out.println("Esta operación machaca el fichero " + ficheroOrigen);

      String resp;
      do {
        System.out.println("Pulse S o N");
        resp = sc.next().toUpperCase();
        if (resp.equals("S")) {
          break;
        }
        if (resp.equals("N")) {
          System.exit(1);

        } else {
          ficheroDestino = args[2];
        }  
      } while (true);
    }

    // 3. Si el fichero origen no existe (da error al abrirlo como lectura) 
    // el programa termina con un mensaje de error y código 2.

    BufferedReader origen = null;
    try {
      origen = new BufferedReader(new FileReader(ficheroOrigen));
    } catch (Exception e) {
      System.err.println("No se ha podido abrir "+ ficheroOrigen);
      System.exit(2);
    }

    boolean SeguirEnCiclo = true;
    int desplazamiento = 0;
    do {
      try {
        System.out.println("Introduce el desplazamiento para la encriptacion Cesar: ");
        desplazamiento = sc.nextInt();
        SeguirEnCiclo = false;
      } catch (Exception e) {
        System.err.println("Introduce desplazamiento para la encriptacion: ");
        sc.nextLine();      // Quitamos con la cadena anterior del buffer
      }
    } while (SeguirEnCiclo);

    // Abrime fichero de destino
    BufferedWriter destino = null;
    try {
      destino = new BufferedWriter(new FileWriter(ficheroDestino));
    } catch (Exception e) {
      System.err.println("No se ha podido abrir el archivo de escritura " + ficheroDestino);
      System.exit(3);
    }

    // Leemo, encriptamos y escribimos
    String linea = origen.readLine();
    while (linea != null) {
      destino.write(encriptaCesar(linea, desplazamiento));
      destino.newLine();        // Salto de linea
      // Leemos hasta final del ciclo, cuando nos encontremos con <EOF> saldremos fuera del ciclo
      linea = origen.readLine();
    }   
    origen.close();
    destino.close();
  }

  

}