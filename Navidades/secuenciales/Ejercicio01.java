package secuenciales;

import java.util.Scanner;

/**
 * 
 * @author Francisco
 * 
 * Enunciado: Escribe un programa que sume, reste, multiplique y divida dos n�meros
 * introducidos por teclado.
 *
 */

public class Ejercicio01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n1;
    double n2;
    
    System.out.println("Escribe un programa que sume, reste, multiplique y divida dos n�meros \n" + 
        "introducidos por teclado.");
    
    System.out.println("Introduce el primer n�mero: ");
    n1 = sc.nextDouble();
    
    System.out.println("Introduce el segundo n�mero: ");
    n2 = sc.nextDouble();
    
    System.out.println("El resultado de la suma es: " + (n1+n2));
    System.out.println("El resultado de la resta es: " + (n1-n2));
    System.out.println("El resultado de la multiplicaci�n es: " + (n1*n2));
    System.out.println("el resultado de la divisi�n es: "+ (n1/n2));

  }

}
