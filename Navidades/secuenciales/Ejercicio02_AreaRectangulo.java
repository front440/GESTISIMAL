package secuenciales;

import java.util.Scanner;

/**
 * 
 * @author Francisco
 * 
 * Enunciado: Escribe un programa que calcule el �rea de un rect�ngulo.
 *
 */

public class Ejercicio02_AreaRectangulo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int lado1;
    int lado2;
    
    System.out.println("Escribe un programa que calcule el �rea de un rect�ngulo.");
    System.out.println("---------------------------------------------------------");
    
    System.out.println("Introduce el valor de lado 1:");
    lado1 = sc.nextInt();
    
    System.out.println("Introduce el valor de lado 2: ");
    lado2 = sc.nextInt();
    
    System.out.println("El �rea del rect�ngulo es: " + (lado1*lado2));
  }

}
