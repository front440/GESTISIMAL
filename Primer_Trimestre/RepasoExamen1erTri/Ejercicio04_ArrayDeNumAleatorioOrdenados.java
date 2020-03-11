package RepasoExamen1erTri;

import java.util.Scanner;
import java.util.Arrays;


public class Ejercicio04_ArrayDeNumAleatorioOrdenados {

  public static void main(String[] args) {     
    
    Scanner sc = new Scanner(System.in);
    int [] array = new int [10];
    
    for (int i= 0; i<array.length;i++) {
      array[i] = (int) (Math.random()*101);
      System.out.print(array[i] + " ");
    }
    
    Arrays.sort(array);
    
    System.out.println();
    for (int i= 0; i<array.length;i++) {
      System.out.print(array[i] + " ");
    }
    
    
  }

}
