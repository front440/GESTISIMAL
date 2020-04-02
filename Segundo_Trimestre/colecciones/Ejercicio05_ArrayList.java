package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import colecciones.Carta;

/**
 * Modifica el programa anterior de tal forma que las cartas se muestren ordenadas.
 * Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
 * coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 * 
 * @author Francisco
 *
 */

public class Ejercicio05_ArrayList {

  public static void main(String[] args) {

    ArrayList<Carta> Baraja = new ArrayList<Carta>();

    for (int i=0;i<10;i++) {
      Carta c;
      do {
        c = new Carta();
      } while (Baraja.contains(c));

      Baraja.add(c);
      System.out.println("Creamos carta: " + Baraja.get(i));
    }

    System.out.println("-------------");
    System.out.println(Baraja);
    System.out.println("-------------");

    for(Carta carta : Baraja ) {
      //if (carta.getPalo()>c.getPalo()  ) {
    }
    
    Collections.sort(Baraja, new Comparator() {
      @Override
      public int compare(Carta c1, Carta c2) {
          return new Integer(c1.getPalo()).compareTo(new Integer(c2.getPalo()));
      }
  });

    
    

    



  }

}
