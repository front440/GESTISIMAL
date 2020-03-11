package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class esPrimo {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int primo;

    System.out.println("Este programa nos dirá si el número introducido es primo o no");
    System.out.println("-------------------------------------------------------------");
    
    System.out.println("Introduce un número: ");
    primo = sc.nextInt();
    
    System.out.println("El numero introducido es: "+ (Varias.esPrimo(primo)));
    

  }

}
