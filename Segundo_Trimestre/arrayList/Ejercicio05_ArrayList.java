package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import arrayList.Carta;

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
    
  }

}
