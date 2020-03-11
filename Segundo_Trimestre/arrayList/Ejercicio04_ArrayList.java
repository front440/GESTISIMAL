package arrayList;

import java.util.ArrayList;

/**
 * Ejercicio: Ejercicio04_ArrayList
 * 
 * @author Francisco
 * 
 * Enunciado: Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
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
      } while (baraja.contains(c));     // Este método añadirá a la baraja una carta sí esta no la contiene
      baraja.add(c);        // Añadimos la carta en caso de que no este
    }
    // Imprimimos el ArrayList
    for (Carta miCarta: baraja) {
      System.out.println(miCarta);
    }
  }

}
