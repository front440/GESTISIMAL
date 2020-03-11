package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class generaArrayInt {

  public static void main(String[] args) {

    //    Scanner sc = new Scanner(System.in);
    //    int tamaño;
    //    int intervaloMax;
    //    int intervaloMin;
    //    
    //
    //
    //    System.out.println("El programa genera un array del tamaño que digamos con unos \n"
    //        + "números aleatorios comprendidos entre el max y el min.");
    //
    //    System.out.println("¿Qué tamaño tendrá el array?");
    //    tamaño = sc.nextInt();
    //
    //    System.out.println("Intervalo mínimo: ");
    //    intervaloMin = sc.nextInt();
    //    
    //    System.out.println("Intervalo máximo: ");
    //    intervaloMax = sc.nextInt();
    //
    //    System.out.println("El array sera: ");
    //    int []array = Varias.generaArrayInt(tamaño, intervaloMin, intervaloMax);
    int [] array = Funciones.Array.generaArrayInt(10, 1, 10);
    System.out.println();


    Funciones.Array.mostrarArray(array);
    System.out.println();
    System.out.println("mínimo | " + Funciones.Array.minimoArrayInt(array));
    System.out.println();
    System.out.println("máximo | " + Funciones.Array.maximoArrayInt(array));
    System.out.println();
    System.out.println("media | " + Funciones.Array.mediaArrayInt(array));
    System.out.println();
    System.out.println("está: " + Funciones.Array.estaEnArrayInt(array, 5));
    System.out.println();
    System.out.println("En número está en la posición: " + Funciones.Array.posicionEnArray(array, 4));
    System.out.println();
    System.out.println("El array volteado es: ");
    Funciones.Array.mostrarArray(Funciones.Array.volteaArrayInt(array));
    System.out.println();
    System.out.println();
    System.out.println();
    
    System.out.println("El array sin rotar es:");
    Funciones.Array.mostrarArray(array);
    ;
    System.out.println();
    System.out.println("El array rotado es:");
    
    Funciones.Array.mostrarArray(Funciones.Array.rotaDerechaArrayInt(array, 3));

  }

}
