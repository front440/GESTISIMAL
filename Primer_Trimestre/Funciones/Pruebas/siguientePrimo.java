package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class siguientePrimo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero;
    
    System.out.println("El programa nos mostrar� el siguiente n�mero primo al n�mero \n"
        + "pasado por par�metro");
    
    System.out.println("Introduce el n�mero: ");
    numero = sc.nextInt();
    
    System.out.println("El siguiente n�mero primo es: " + (Varias.siguientePrimo(numero)));
    

  }

}
