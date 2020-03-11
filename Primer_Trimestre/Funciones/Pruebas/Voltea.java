package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class Voltea {
  
public static void main(String[] args) {
    
    int numero;
    Scanner sc = new Scanner(System.in);

    System.out.println("El programa nos mostrará un núero volteado");
    System.out.println("--------------------------------------------------------");
    
    System.out.println("Inserta un número:");
    numero = sc.nextInt();
    
    System.out.println("El numero volteado es: " + (Varias.voltea(numero)));

  }

}
