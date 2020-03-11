package RepasoExamen1erTri;

import java.util.Scanner;

public class Ejercicio03_ArrayHastaNumeroNegativo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int array[] = new int [50];
    int copia[] = new int[array.length];

    for (int i=0;i<array.length;i++) {
      System.out.println("introduce valor: ");
      array[i] = sc.nextInt();
      
      
      if (array[i] < 0) {
        break;
      }
      
    }
    for (int i=0;i<array.length;i++) {
      System.out.print(array[i]);
    }
    






  }
}








