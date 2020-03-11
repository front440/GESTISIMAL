package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class QuitaPorDelante {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero;
    int numeroQuitar;

    System.out.println("El programa quitará el número de digitos que digamos de un número por delante");

    System.out.println("Introduce el número: ");
    numero = sc.nextInt();
    
    System.out.println("Introduce el número de dígitos que quieres quitar: ");
    numeroQuitar = sc.nextInt();
    
    System.out.println("El número con los dígitos borrados queda: " + (Varias.quitaPorDetras(numero, numeroQuitar)));
  }

}
