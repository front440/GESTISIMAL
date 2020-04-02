package colecciones;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.Collection;
import java.util.Collections;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * 
 * @author Francisco
 *
 */

public class Ejercicio02_ArrayList {

  static final int TAMAÑO = 10;

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> contenedor = new ArrayList<Integer>();

    for (int i= 0; i< TAMAÑO; i ++) {
      
      System.out.println("Añade un elemento " + (i+1) + " al ArrayList:");
      contenedor.add(sc.nextInt());
    }
    
    System.out.println("El ArrayList sin ordenar: " + contenedor);
    
    // Con el método de sort ordenaremos el ArrayList
    Collections.sort(contenedor);
    
    System.out.println("-----------------------------------");
    
    // Seguidamente mostramos el contenedor ordenador
    System.out.println("El ArrayList ordenado: " + contenedor);



  }

}
