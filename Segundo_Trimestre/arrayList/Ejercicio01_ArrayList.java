package arrayList;

import java.util.ArrayList;

/**
 * Programa: Ejercicio01_ArrayList
 * 
 * @author Francisco
 * 
 * Enunciado: Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el m�ximo y el m�nimo de esos
 * n�meros. El tama�o de la lista tambi�n ser� aleatorio y podr� oscilar entre 10
 * y 20 elementos ambos inclusive.Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el m�ximo y el m�nimo de esos
 * n�meros. El tama�o de la lista tambi�n ser� aleatorio y podr� oscilar entre 10
 * y 20 elementos ambos inclusive.
 */

public class Ejercicio01_ArrayList {

  // Creamos constante para cambiar tama�o del ArrayList en cualquier momento
  static final int TAMA�O = (int) (Math.random()*11)+10;

  public static void main(String[] args) {

    int suma = 0;
    int minimo = 100;
    int maximo = 0;

    // Definimos ArrayLisa
    ArrayList<Integer> lista = new ArrayList<Integer>(20);


    // Introducimos n�meros aleatorios entre 0 y 100
    for (int i = 0; i <TAMA�O; i ++) {
      // Los introducimos con el m�todo add
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
    System.out.println("M�nimo: " + minimo);
    System.out.println("M�ximo: " + maximo);

  }

}
