package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class digitoN {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero;     // Número que introducimos
    int posicion;   // Será igual al numero que corresponda con la posicion
    
    System.out.println("Introduce número: ");
    numero = sc.nextInt();
    
    System.out.println("Introduce la posición del número que deseas saber: ");
    posicion = sc.nextInt();
    
    System.out.println("El número es: " + (Varias.digitoN(numero, posicion)));
  }

}
