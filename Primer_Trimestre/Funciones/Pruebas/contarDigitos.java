package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class contarDigitos {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int numero;
    
    System.out.println("El progrma contar� el n�mero de d�gitos que tendr� un \n"
        + "n�mero entero");
    
    System.out.println("Inserta un n�mero: ");
    numero = sc.nextInt();
    
    System.out.println("El n�mero insertado tiene " + (Varias.digito(numero) + " d�gitos"));
    
    
  }

}
