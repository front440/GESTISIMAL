package RepasoExamen1erTri;

import java.util.Scanner;

/**
 * 
 * @author Francisco
 * 
 * Enunciado: Se quiere realizar un programa que lea por teclado las 5 notas obtenidas
 * por un alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, 
 * la nota media, la nota más alta que ha sacado y la menor.
 *
 */


public class Ejercicio02_NotaMediaAlumno {

  static final int TAMANO = 5;

  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int [] notas = new int[TAMANO];
    double media = 0;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    for (int i= 0; i<notas.length;i++) {
      System.out.println("Introduce la " + (i+1) + ": ");
      notas[i] = sc.nextInt();
      
      if (notas[i] > 11 || notas[i] <= 0) {
        System.out.println("La nota debe de estar entre 0 y 10");
        notas[i] = sc.nextInt();
      }
      media += notas[i];
      if (notas[i] > maximo) {
        maximo = notas[i];    
      }
      if (notas[i] < minimo) {
        minimo = notas[i];    
      }
    }
    for (int i= 0; i< notas.length;i++) {
      System.out.print(notas[i] + " ");
    }
    System.out.println();
    System.out.println("El máximo es: " + maximo);
    System.out.println("El mínimo es: " + minimo);
    System.out.println("la media es: " + media/TAMANO);

  }

}
