package array.ejercicios;

import java.util.Scanner;

/**
 * Programa: Ejercio11_Pag121_8
 * 
 * @author Francisco
 * 
 * Fecha: 28/11/2019
 * 
 * Enunciado: Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 *
 */
public class Ejercicio11_Pag121_8 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    // Definimos Array para almacenar meses
    String [] meses = {"Enero" , "Febrero", "Marzo" , "Abril" , "Mayo" , "Junio" ,
        "Julio" , "Agosto" , "Septiembre" , "Octubre" , "Noviembre" , "Diciembre"};
    
    // Definimos Array para almacenar temperatura de cada mez
    int temperatura [] = new int [12];
    
    for (int i = 0;i<12;i++) {
      System.out.println("Introduce temperatura media para " + meses[i] + ": ");
      temperatura[i] = sc.nextInt();
    }
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%10S",meses[i]);
      for (int j = 0; j < temperatura[i]; j++) {
        System.out.print(" * ");
      }
      System.out.println(+temperatura[i] + "ºC");
    }

  }

}
