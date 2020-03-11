package RepasoExamen1erTri;

import java.util.Scanner;

/**
 * 
 * @author Francisco
 * 
 * Programa: Ejercicio09_MenuDeFunciones
 * 
 * Enunciado: # Escriba un programa que permita crear una lista de palabras y que, a continuación de tres opciones:
 * Contar: Me pide una cadena, y me dice cuantas veces aparece en la lista
 * Modificar: Me pide una cadena, y otra cadena a modificar, y modifica todas alas apariciones de la primera por la segunda en la lista.
 * Eliminar: Me pide una cadena, y la elimina de la lista.
 * Mostrar: Muestra la lista de cadenas
 * Terminar
 *
 */

public class Ejercicio09_MenuDeFunciones {

  public static int contar(String lista[],String cadena) {
    int contador = 0;
    for (int i=0;i<lista.length;i++) {
      
      if (lista.index) {
        contador++;
      }

    }

    return contador;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    String [] lista = new String [5];
    String cadena;
    int opcion;

    for (int i = 0; i < lista.length; i++) {
      System.out.println("Introduce una cadena: ");
      lista[i] = sc.next();
    }

    System.out.println("MENU CON LAS DIFERENTES OPCIONES A ELEGIR SOBRE TU CADENA: ");
    System.out.println(" 1. Contar");
    System.out.println(" 2. Modificar");
    System.out.println(" 3. Eliminar");
    System.out.println(" 4. Mostrar");
    System.out.println(" 5. Salir");
    System.out.println("Introduce tu eleccion: ");
    opcion = sc.nextInt();

    switch (opcion) {
    case 1:
      System.out.println("Introduce una cadena para comprobar si está: ");
      cadena = sc.next();
      
      lista.

      //      System.out.println("La cadena que buscamos la encontramos: \n"
      //          + contar(lista, cadena));
    }
  }
}