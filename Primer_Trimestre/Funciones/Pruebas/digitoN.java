package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class digitoN {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero;     // N�mero que introducimos
    int posicion;   // Ser� igual al numero que corresponda con la posicion
    
    System.out.println("Introduce n�mero: ");
    numero = sc.nextInt();
    
    System.out.println("Introduce la posici�n del n�mero que deseas saber: ");
    posicion = sc.nextInt();
    
    System.out.println("El n�mero es: " + (Varias.digitoN(numero, posicion)));
  }

}
