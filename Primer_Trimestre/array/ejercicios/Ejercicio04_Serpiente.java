package array.ejercicios;

import java.util.Scanner;

public class Ejercicio04_Serpiente {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final char cabeza = '@';
    final int espInicial = 12;
    int nEsp = 0;
    char caracter = '*';
    System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
    int longitud = sc.nextInt();
    for (int i = 0; i < longitud; i++){
      if (i == 0){
        nEsp = 12;
        caracter = '@';
      } else {
        nEsp += (int)((Math.random()*3)-1);
        caracter = '*';
      }
      for(int j = 0; j < nEsp; j++){
        System.out.print(" ");
      }
      System.out.println(caracter);
    }
  }

}
