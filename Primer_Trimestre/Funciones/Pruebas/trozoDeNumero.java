package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class trozoDeNumero {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero;
    int valorInicial;
    int valorFinal;
    
    System.out.println("El programa imprime por pantalla el n�mero entre el valor incial \n"
        + "y el valor final");
    
    System.out.println("Introduce numero: ");
    numero = sc.nextInt();
    
    System.out.println("Introduce valor inicial: ");
    valorInicial = sc.nextInt();
    
    System.out.println("Introduce valor final: ");
    valorFinal = sc.nextInt();
    
    System.out.println("El n�mero es: " + (Varias.trozoDeNumero(numero, valorInicial, valorFinal)));
  }

}
