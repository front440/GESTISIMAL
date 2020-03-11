package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio03_ArrayList {
  
  static final int TAMAÑO = 10;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    ArrayList<String> contenedor = new ArrayList<String>();
    
    for (int i=0; i < TAMAÑO; i++) {
      System.out.println("Introduce elemento " + (i+1) + " al ArrayList: ");
      contenedor.add(sc.next());
    }
    
    // Lista desordenada
    System.out.println(contenedor);
    
    // Ordenamos lista
    Collections.sort(contenedor);

    // Lista ordenada
    System.out.println(contenedor);
    
    
    
    

  }

}
