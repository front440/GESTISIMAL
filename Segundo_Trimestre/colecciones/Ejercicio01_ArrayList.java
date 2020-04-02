package colecciones;

import java.util.ArrayList;

/**
 * Programa: Ejercicio01_ArrayList
 * 
 * @author Francisco
 * 
 * Enunciado: Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 */

public class Ejercicio01_ArrayList {

  // Creamos constante para cambiar tamaño del ArrayList en cualquier momento
  static final int TAMAÑO = (int) (Math.random()*11)+10;

  public static void main(String[] args) {

    int suma = 0;
    int minimo = 100;
    int maximo = 0;

    // Definimos ArrayLisa
    ArrayList<Integer> lista = new ArrayList<Integer>(20);


    // Introducimos números aleatorios entre 0 y 100
    for (int i = 0; i <TAMAÑO; i ++) {
      // Los introducimos con el método add
      lista.add((int) (Math.random()*101));
    }
    // Imprimimos lista para comprobar resultado
    System.out.println(lista);

    for (int i : lista) {
      suma += i;

      if (i < minimo) {
        minimo = i;
      }
      if (i > maximo) {
        maximo = i;
      }
    }
    // Resultados
    System.out.println("----------------------------");
    System.out.println("Suma: " + suma);
    System.out.println("Media: " + suma/lista.size());
    System.out.println("Mínimo: " + minimo);
    System.out.println("Máximo: " + maximo);

  }

}
