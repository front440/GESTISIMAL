package RepasoExamen1erTri;

import java.util.Scanner;

/**
 * Programa: Ejercicio18.java
 * 
 * @author Francisco
 * 
 * Crea una lista e iniciala con 5 cadenas de caracteres leídas por teclado. 
 * Copia los elementos de la lista en otra lista pero en orden inverso, y muestra 
 * sus elementos  por la pantalla.
 *
 */
public class Ejercicio01_VolteaArrayCadena {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] lista = new String[5];
    String[] inversa = new String[lista.length];

    for (int i= 0; i<lista.length;i++) {
      System.out.println("Inserta cadena " + i + " : ");
      lista[i] = sc.nextLine();
    }

    for (int i= 0; i<lista.length;i++) {
      System.out.print(" '" + lista[i] + "' ");
    }
    System.out.println();

    for (int i= 0; i<lista.length;i++) {
      inversa[lista.length-i-1] = lista[i];
    }
    System.out.println("Lista invertida: ");
    
    for (int i= 0; i<inversa.length;i++) {
      System.out.print(" '" + inversa[i]+ "' ");
    }

  }
}

