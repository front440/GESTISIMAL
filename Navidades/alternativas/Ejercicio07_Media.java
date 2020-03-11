package alternativas;

import java.util.Scanner;

/**
 * 
 * @author Francisco
 * 
 * Enunciado: Realiza un programa que calcule la media de tres notas.
 *
 */

public class Ejercicio07_Media {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n1;
    int n2;
    int n3;
    int media;
    
    
    System.out.println("Realiza un programa que calcule la media de tres notas.");
    
    System.out.println("Introduce nota1: ");
    n1 = sc.nextInt();
    
    System.out.println("Introduce nota2: ");
    n2 = sc.nextInt();
    
    System.out.println("Introduce nota3: ");
    n3 = sc.nextInt();
    
    media=(n1+n2+n3)/3;
    
    if (media<=4) {
      System.out.println("Insuficiente");
    }
    else if (media==5) {
      System.out.println("Suficiente");
    }
    else if (media==6) {
      System.out.println("Bien");
    }
    else if (media<=8) {
      System.out.println("Notable");
    }
    else if (media<=10) {
      System.out.println("sobresaliente");
    }
    else {
      System.out.println("Las notas son evaluadas de 0 a 10");
    }
    
    
    

  }

}
