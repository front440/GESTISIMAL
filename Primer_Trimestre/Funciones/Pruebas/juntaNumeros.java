package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class juntaNumeros {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int numero1;
    int numero2;
    
    System.out.println("El programa junta numero1 y numero2");
    
    System.out.println("Inserta numero1: ");
    numero1 = sc.nextInt();
    
    System.out.println("Inserta numero2: ");
    numero2 = sc.nextInt();
    
    System.out.println("El resultado es: " + (Varias.juntaNumero(numero1, numero2)));
    

  }

}
