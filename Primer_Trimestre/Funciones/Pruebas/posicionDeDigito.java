package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class posicionDeDigito {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero;
    int numeroBuscar;
    
    System.out.println("Introduce el n�mero: ");
    numero = sc.nextInt();
    
    System.out.println("�Que n�mero buscas?");
    numeroBuscar = sc.nextInt();
    
    System.out.println("El n�mero est� en la posicion" + (Varias.posicionDeDigito(numero, numeroBuscar)));
    
  }

}
