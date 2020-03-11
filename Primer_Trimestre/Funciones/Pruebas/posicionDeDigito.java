package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class posicionDeDigito {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero;
    int numeroBuscar;
    
    System.out.println("Introduce el número: ");
    numero = sc.nextInt();
    
    System.out.println("¿Que número buscas?");
    numeroBuscar = sc.nextInt();
    
    System.out.println("El número está en la posicion" + (Varias.posicionDeDigito(numero, numeroBuscar)));
    
  }

}
