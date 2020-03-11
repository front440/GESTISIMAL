package secuenciales;

import java.util.Scanner;

/**
 * 
 * @author Francisco
 *
 * Enunciado: Escribe un programa que calcule el área de un triangulo
 * 
 */

public class Ejercicio03_AreaTriangulo {

  public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    int base;
    int altura;
    double area;
    
    System.out.println("Introduce el valor de la base: ");
    base = sc.nextInt();
    
    System.out.println("Introduce el valor de la altura: ");
    altura = sc.nextInt();
    
    area = (base*altura)/2;
    System.out.println("El area del triángulo es: " + area);
    
  }

}
