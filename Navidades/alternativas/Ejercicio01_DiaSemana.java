package alternativas;

import java.util.Scanner;

/**
 * 
 * @author Francisco
 * 
 * Enunciado: Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 *
 */

public class Ejercicio01_DiaSemana {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int dia;

    System.out.println("Escribe un programa que pida por teclado un día de la semana y que diga qué \n" + 
        "asignatura toca a primera hora ese día.");
    System.out.println("Introduce el número del día: ");
    dia = sc.nextInt();

    switch (dia) {
    case 1:
      System.out.println("Lenguaje de Marcas");
      break;
    case 2:
      System.out.println("Programación");
      break;
    case 3:
      System.out.println("Entornos de Desarrollo");
      break;
    case 4:
      System.out.println("Programación");
      break;
    case 5:
      System.out.println("Sistemas Informáticos");
      break;
    case 6:
      System.out.println("FindeSemana");
      break;
    case 7:
      System.out.println("FindeSemana");
      break;
    default:
      System.out.println("La semana no tiene más de 7 días");
    }



  }
}
