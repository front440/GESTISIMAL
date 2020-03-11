package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class pegaPorDelante {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;
    int numeroPegar;

    System.out.println("El programa pegará el número insertado por delante");

    System.out.println("Introduce el número: ");
    numero = sc.nextInt();
    
    System.out.println("Introduce el número de dígitos que quieres pegar: ");
    numeroPegar = sc.nextInt();
    
    System.out.println("El número pegado: " + (Varias.pegaPorDelante(numero, numeroPegar)));
  

  }

}
