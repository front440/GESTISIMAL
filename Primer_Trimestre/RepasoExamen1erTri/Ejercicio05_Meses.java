package RepasoExamen1erTri;

import java.util.Scanner;

/**
 * Enunciado: # Crea un programa que pida un número al usuario un número de mes 
 * (por ejemplo, el 4) y diga cuántos días tiene (por ejemplo, 30) 
 * y el nombre del mes. Debes usar listas. Para simplificarlo vamos 
 * a suponer que febrero tiene 28 días.
 * 
 * @author Francisco
 *
 */

public class Ejercicio05_Meses {

  public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);

    String [] mes =  {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};

    int [] dias = {31,28,31,30,31,30,31,31,30,31,30,31};

    int num;


    do {
      System.out.println("Introduce un mes (del 1 al 12): " );
      num = sc.nextInt();
      if (num < 1 || num > 12) {
        System.out.println("Error: mes incorrecto.");
      }
      if (num>=1 && num<=12) {
        break;
      }


    } while (true);


    System.out.println("El mes de "+mes[num-1]+" tiene "+dias[num-1]+" días.");
  }

}
