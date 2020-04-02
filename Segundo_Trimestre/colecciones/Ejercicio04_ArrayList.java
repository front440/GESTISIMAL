package colecciones;

import java.util.ArrayList;

/**
 * Ejercicio: Ejercicio04_ArrayList
 * 
 * @author Francisco
 * 
 * Enunciado: Realiza un programa que escoja al azar 10 cartas de la baraja espa�ola
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y aseg�rate de que no se repite ninguna.
 *
 */

public class Ejercicio04_ArrayList {

  public static void main(String[] args) {

    // ArrayList de tipo carta
    ArrayList<Carta> baraja = new ArrayList<Carta>(); 

    for (int i = 0; i < 10; i++) {
      Carta c;
      do {
        c = new Carta();        
      } while (baraja.contains(c));     // Este m�todo a�adir� a la baraja una carta s� esta no la contiene
      baraja.add(c);        // A�adimos la carta en caso de que no este
    }
    // Imprimimos el ArrayList
    for (Carta miCarta: baraja) {
      System.out.println(miCarta);
    }
  }

}
