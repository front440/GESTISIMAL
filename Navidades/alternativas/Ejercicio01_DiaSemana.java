package alternativas;

import java.util.Scanner;

/**
 * 
 * @author Francisco
 * 
 * Enunciado: Escribe un programa que pida por teclado un d�a de la semana y que diga qu�
 * asignatura toca a primera hora ese d�a.
 *
 */

public class Ejercicio01_DiaSemana {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int dia;

    System.out.println("Escribe un programa que pida por teclado un d�a de la semana y que diga qu� \n" + 
        "asignatura toca a primera hora ese d�a.");
    System.out.println("Introduce el n�mero del d�a: ");
    dia = sc.nextInt();

    switch (dia) {
    case 1:
      System.out.println("Lenguaje de Marcas");
      break;
    case 2:
      System.out.println("Programaci�n");
      break;
    case 3:
      System.out.println("Entornos de Desarrollo");
      break;
    case 4:
      System.out.println("Programaci�n");
      break;
    case 5:
      System.out.println("Sistemas Inform�ticos");
      break;
    case 6:
      System.out.println("FindeSemana");
      break;
    case 7:
      System.out.println("FindeSemana");
      break;
    default:
      System.out.println("La semana no tiene m�s de 7 d�as");
    }



  }
}
