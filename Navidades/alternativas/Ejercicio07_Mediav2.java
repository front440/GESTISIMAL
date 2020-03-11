package alternativas;

import java.util.Scanner;

/**
 * 
 * @author Francisco
 * 
 * Enunciado: Realiza un programa que calcule la media de tres notas.
 *
 */

public class Ejercicio07_Mediav2 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n1;
    int n2;
    int n3;
    
    
    System.out.println("Realiza un programa que calcule la media de tres notas.");
    
    System.out.println("Introduce nota1: ");
    n1 = sc.nextInt();
    
    System.out.println("Introduce nota2: ");
    n2 = sc.nextInt();
    
    System.out.println("Introduce nota3: ");
    n3 = sc.nextInt();
    
    System.out.println("La nota media es: " + (n1+n2+n3)/3);
    
    

  }

}
