package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class encriptaCesarv2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);

    //  1. Si el programa no recibe dos par�metros termina con un error 1.

    if ((args.length == 1) || (args.length > 2)){
      System.err.println("Error al introducir los par�metros");
      System.exit(1);
    }


    // 2. Si el programa recibe un solo par�metro guardar� la informaci�n encriptada
    // en el mismo archivo del que lee, pero antes advertir� al usuario de que 
    // machacar� el archivo origen, dando opci�n a que la operaci�n no se haga.

    String ficheroOrigen = args[0];
    String ficheroDestino = ficheroDestino(args);
    
    BufferedReader origen = bufferOrigen(ficheroOrigen);
    
    ArrayList<String> lineaOrigen = new ArrayList<String>();
    String linea = origen.readLine();
    while (linea != null) {
      lineaOrigen.add(linea);
      linea = origen.readLine();
    }
    origen.close();
    
    
    int desplazamiento = desplazamientoCesar();
    
    BufferedWriter destino = BufferDestino(ficheroDestino);
    
    for (String linea: lineaOrigen) {
      destino.write(encriptaCesar(desplazamiento, ));
    }

  }

  private static int desplazamientoCesar() {
    Scanner sc = new Scanner(System.in);
    int desplamiento = 0;
    boolean seguirEnCiclo = true;
  }

  private static BufferedReader bufferOrigen(String ficheroOrigen) {
    try {
      return new BufferedReader(new FileReader(ficheroOrigen));
    } catch (Exception e) {
      System.err.println("No se ha podido abrir " + ficheroOrigen);
    }
    do {
      try {
        System.out.println("Desplazamineot para la encriptacion");
      }
    }
    
    return null;
  }

}
