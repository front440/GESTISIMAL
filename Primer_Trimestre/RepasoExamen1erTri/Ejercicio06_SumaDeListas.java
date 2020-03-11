package RepasoExamen1erTri;

import java.util.Scanner;

/**
 * 
 * @author Francisco
 * 
 * Enunciado: Programa que declare tres listas 'lista1', 'lista2' y 'lista3' de cinco 
 * enteros cada uno, pida valores para 'lista1' y 'lista2' y 
 * calcule lista3=lista1+lista2.
 *
 */

public class Ejercicio06_SumaDeListas {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int lista1[] = new int [5];
    int lista2[] = new int [5];
    int lista3[] = new int [5];

    for (int i=0;i<lista1.length;i++) {
      System.out.println("Introduce valor " + (i+1) + "para lista 1: ");
      lista1[i] = sc.nextInt();
    }
    System.out.println();

    for (int i=0;i<lista1.length;i++) {
      System.out.print(lista1[i] + " ");
    }
    for (int i=0;i<lista2.length;i++) {
      System.out.println("Introduce valor " + (i+1) + " para lista 2: ");
      lista2[i] = sc.nextInt();
    }

    System.out.println();
    for (int i=0;i<lista2.length;i++) {
      System.out.print(lista2[i] + " ");
    }

    System.out.println("");
    for (int i=0;i<lista3.length;i++) {
      lista3[i]= lista1[i] + lista2[i];
    }
    System.out.println("Suma de lista1 y lista2");
    for (int i=0;i<lista3.length;i++) {
      System.out.print(lista3[i] + " ");
    }

  }

}
