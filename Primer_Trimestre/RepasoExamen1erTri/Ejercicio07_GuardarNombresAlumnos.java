package RepasoExamen1erTri;

import java.util.Scanner;

/**
 * 
 * @author Francisco
 * 
 * Enunciado: Queremos guardar los nombres y la edades de los alumnos de un curso. 
 * Realiza un programa que introduzca el nombre y la edad de cada alumno. 
 * El proceso de lectura de datos terminará cuando se introduzca como nombre 
 * un asterisco (*) Al finalizar se mostrar los siguientes datos:
 * Todos lo alumnos mayores de edad.
 * Los alumnos mayores (los que tienen más edad)
 *
 */

public class Ejercicio07_GuardarNombresAlumnos {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String []nombre = new String[3];
    int []edad = new int[3];
    int i;
    String nombres = null;
    int edads;

    //for (i=0; i<nombre.length;i++) {



    do {
      System.out.println("Introduce nombre  para el alumno: ");
      nombres = sc.next();
      if (nombres != "*") {

        System.out.println("Introduce edad  para el alumno: ");
        edads = sc.nextInt();
      }

      if (nombres == "*") {

        break;
      }


    } while (true);


    //      for (i=0;i<edad.length;i++) {
    //        System.out.println("Introduce edad " + (i+1) + " para el alumno: ");
    //        edad[i] = sc.nextInt();
    //      }


    for (i=0;i<edad.length;i++) {
      System.out.print(nombre[i] + " ");
      System.out.print(edad[i] + " ");
    }
  }

}
