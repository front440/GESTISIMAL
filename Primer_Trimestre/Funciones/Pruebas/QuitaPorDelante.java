package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class QuitaPorDelante {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero;
    int numeroQuitar;

    System.out.println("El programa quitar� el n�mero de digitos que digamos de un n�mero por delante");

    System.out.println("Introduce el n�mero: ");
    numero = sc.nextInt();
    
    System.out.println("Introduce el n�mero de d�gitos que quieres quitar: ");
    numeroQuitar = sc.nextInt();
    
    System.out.println("El n�mero con los d�gitos borrados queda: " + (Varias.quitaPorDetras(numero, numeroQuitar)));
  }

}
