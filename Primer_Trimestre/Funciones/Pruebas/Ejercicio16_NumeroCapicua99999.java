package Funciones.Pruebas;

import Funciones.Varias;

public class Ejercicio16_NumeroCapicua99999 {

  public static void main(String[] args) {
    System.out.println("El programa muestra los números capicúa entre 1 y 99999");
    System.out.println("-------------------------------------------------------");

    for(int i = 1; i < 100000; i++) {
      if (Varias.esCapicua(i)) {
        System.out.println(i + " | ");
      }
    }


  }

}
