package alternativas;

import java.util.Scanner;
/**
 * 
 * @author Francisco
 * 
 * Enunciado: Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 *
 */

public class Ejercicio02_Horas {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hora;
    
    System.out.println("Introduce la hora: ");
    hora = sc.nextInt();
    
    if (hora == 6 || hora == 7 || hora == 8 || hora == 9 || hora == 10 || hora == 11 ) {
      System.out.println("Buenos dias");
    }
    else if (hora == 12 || hora == 13 || hora == 14 || hora == 15 || hora == 16 || hora == 17 || hora == 18 || hora == 19) {
      System.out.println("Buenas tardes");
    }
    else if (hora == 20 || hora == 21 || hora == 22 || hora == 23 || hora == 24 || hora == 1 || hora == 2 || hora == 3 || hora == 4 || hora == 5) {
      System.out.println("Buenas noches");
    }
    
    

  }

}
