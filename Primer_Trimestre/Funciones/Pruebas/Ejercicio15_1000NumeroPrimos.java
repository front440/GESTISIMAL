package Funciones.Pruebas;

import Funciones.Varias;

public class Ejercicio15_1000NumeroPrimos {

  public static void main(String[] args) {

    System.out.println("El programa mostrar� los 1000 primeros n�meros primos");
    System.out.println("-----------------------------------------------------");

    for(int i = 0; i < 1001; i++) {
      if(Varias.esPrimo(i)) {
        System.out.print(i + " | ");
      }
    }

  }

}
