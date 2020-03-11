package secuenciales;

import java.util.Scanner;

/**
 * 
 * @author Francisco
 * 
 * Enunciado: Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 *
 */

public class Ejercicio01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n1;
    double n2;
    
    System.out.println("Escribe un programa que sume, reste, multiplique y divida dos números \n" + 
        "introducidos por teclado.");
    
    System.out.println("Introduce el primer número: ");
    n1 = sc.nextDouble();
    
    System.out.println("Introduce el segundo número: ");
    n2 = sc.nextDouble();
    
    System.out.println("El resultado de la suma es: " + (n1+n2));
    System.out.println("El resultado de la resta es: " + (n1-n2));
    System.out.println("El resultado de la multiplicación es: " + (n1*n2));
    System.out.println("el resultado de la división es: "+ (n1/n2));

  }

}
