package RepasoExamen1erTri;

import java.util.Scanner;

/**
 * Programa: fibonacci.java
 * 
 * @author Francisco
 * 
 * 
 */

public class fibonacci {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int nActual = 0;
    int nAnterior = 1;
    int aux = 0;
    
    System.out.println("Introduce numero fibonacci");
    nActual = sc.nextInt();

    for(int i=0;i<=nActual;i++) {
      System.out.println("Número fibonacci: " + nActual);
      aux = nActual;
      nActual += nActual + nAnterior;
      nAnterior = aux;
    }
    
    

  }

}
