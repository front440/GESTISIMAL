package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class siguientePrimo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero;
    
    System.out.println("El programa nos mostrará el siguiente número primo al número \n"
        + "pasado por parámetro");
    
    System.out.println("Introduce el número: ");
    numero = sc.nextInt();
    
    System.out.println("El siguiente número primo es: " + (Varias.siguientePrimo(numero)));
    

  }

}
