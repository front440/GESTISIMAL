package alternativas;

import java.util.Scanner;

/**
 * 
 * @author Francisco
 * 
 * Enunciado: Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
 * la hora.
 *
 */

public class Ejercicio_HorasExtras {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int horas;
    int sueldo;
    
    System.out.println("Vamos a ampliar uno de los ejercicios de la relación anterior para considerar\n" + 
        "las horas extras. Escribe un programa que calcule el salario semanal de un\n" + 
        "trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de\n" + 
        "trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros\n" + 
        "la hora.");
    
    System.out.println("------------------------------------------------------------------");
    
    System.out.println("Introduce el número de horas trabajadas: ");
    horas = sc.nextInt();
    
    if (horas < 40) {
      sueldo=12*horas;
    }
    else {
      sueldo=40*12+(horas-40)*16;
    }
    System.out.println("El sueldo es: "+ sueldo + "€ semanales");

  }

}
