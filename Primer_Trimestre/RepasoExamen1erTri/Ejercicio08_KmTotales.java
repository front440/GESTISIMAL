package RepasoExamen1erTri;

import java.util.Scanner;

public class Ejercicio08_KmTotales {

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    String[] dias = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
    String[] nombre = new String [3];

    int [] km = new int [7];

    int [] kmTotales = new int [7];

    



    for (int i = 0; i < 3; i++) {
      System.out.println("Introduce el nombre del conductor numero " + (i+1)+ ":");
      nombre[i] = sc.next();

      for (int j = 0; j <= 6; j++) {
        System.out.println("Introduce los km para el dia " +(j+1) + ":");
        km[j] = sc.nextInt();

        kmTotales[i] += km[j];


      }


    }

    for (int i = 0; i<=6; i++) {
      System.out.println("km totales" +kmTotales[i]);
    }



  }

}
