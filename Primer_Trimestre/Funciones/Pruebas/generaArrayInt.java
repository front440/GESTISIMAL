package Funciones.Pruebas;

import java.util.Scanner;

import Funciones.Varias;

public class generaArrayInt {

  public static void main(String[] args) {

    //    Scanner sc = new Scanner(System.in);
    //    int tama�o;
    //    int intervaloMax;
    //    int intervaloMin;
    //    
    //
    //
    //    System.out.println("El programa genera un array del tama�o que digamos con unos \n"
    //        + "n�meros aleatorios comprendidos entre el max y el min.");
    //
    //    System.out.println("�Qu� tama�o tendr� el array?");
    //    tama�o = sc.nextInt();
    //
    //    System.out.println("Intervalo m�nimo: ");
    //    intervaloMin = sc.nextInt();
    //    
    //    System.out.println("Intervalo m�ximo: ");
    //    intervaloMax = sc.nextInt();
    //
    //    System.out.println("El array sera: ");
    //    int []array = Varias.generaArrayInt(tama�o, intervaloMin, intervaloMax);
    int [] array = Funciones.Array.generaArrayInt(10, 1, 10);
    System.out.println();


    Funciones.Array.mostrarArray(array);
    System.out.println();
    System.out.println("m�nimo | " + Funciones.Array.minimoArrayInt(array));
    System.out.println();
    System.out.println("m�ximo | " + Funciones.Array.maximoArrayInt(array));
    System.out.println();
    System.out.println("media | " + Funciones.Array.mediaArrayInt(array));
    System.out.println();
    System.out.println("est�: " + Funciones.Array.estaEnArrayInt(array, 5));
    System.out.println();
    System.out.println("En n�mero est� en la posici�n: " + Funciones.Array.posicionEnArray(array, 4));
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
