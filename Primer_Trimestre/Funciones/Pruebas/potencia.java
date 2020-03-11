package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class potencia {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int base;
    int exponente;
    int potencia = 0;
    
    System.out.println("El programa nos calculará la potencia de número dada su \n"
        + "su base y su exponente");
    
    System.out.println("Inserte valor para base: ");
    base = sc.nextInt();
    
    System.out.println("Inserte valor para exponente: ");
    exponente = sc.nextInt();
    
    
    System.out.println("El resultado de la potencia es: " + (Varias.potencia(base, exponente)));
    

  }

}
