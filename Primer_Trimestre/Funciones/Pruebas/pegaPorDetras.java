package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class pegaPorDetras {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;
    int numeroPegar;

    System.out.println("El programa pegar� el n�mero insertado por detr�s");

    System.out.println("Introduce el n�mero: ");
    numero = sc.nextInt();
    
    System.out.println("Introduce el n�mero de d�gitos que quieres pegar: ");
    numeroPegar = sc.nextInt();
    
    System.out.println("El n�mero pegado: " + (Varias.pegaPorDetras(numero, numeroPegar)));
  
  }

}
