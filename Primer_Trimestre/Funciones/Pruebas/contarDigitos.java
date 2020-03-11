package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class contarDigitos {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int numero;
    
    System.out.println("El progrma contará el número de dígitos que tendrá un \n"
        + "número entero");
    
    System.out.println("Inserta un número: ");
    numero = sc.nextInt();
    
    System.out.println("El número insertado tiene " + (Varias.digito(numero) + " dígitos"));
    
    
  }

}
