/*
 * Programa: Ejercicio02_NumeroAleatorioHasta24.java
 * 
 * Autor: Francisco Javier Campos Gutierrez
 * 
 * Fecha: 25/11/2019
 * 
 * Enunciado: Realiza un programa que vaya generando n�meros aleatorios pares entre 
 * 0 y 100 y que no termine de generar n�meros hasta que no saque el 24. El  programa 
 * deber� decir al final cu�ntos n�meros se han generado.
 * 
 * Variables:
 * aleatorio    <-- N�mero aleatorio
 * contador     <-- Contador de n�meros
 * 
 * 
 * Desarrollo:
 * Deberemos de generar numeros del 0 al 100 y contabilizar solo los pares mediante la
 * divisi�n con resto 0. Una vez hecho esto el programa solo se parar� cuando el 
 * n�mero par 24 salga.
 * 
 */
package array.ejercicios;

public class Ejercicio02_NumeroAleatorioHasta24 {

  public static void main(String[] args) {

    System.out.println("El programa generar� unos n�meros aleatorios pares, los ");
    System.out.println("contabilizar� y se parar� cuando salga el numero 24");
    System.out.println("--------------------------------------------------------");

    int aleatorio;
    int contador = 0;

    while (true) {
      
   // Generamos un n�mero aleatorio entre 0 y 100
      aleatorio = (int) Math.floor(Math.random()*101);
      
      // Contabilizamos el contador si es par mediante la division absoluta
      if (aleatorio % 2 ==0 ) {
        contador++; // Incrementamos
        //System.out.println(aleatorio); Descomentar para ver n�meros
        
        // Si el numero es 24 mostramos contador de n�meros y paramos el programa
        if (aleatorio == 24) {
          System.out.println("Han salido " + contador + " n�meros pares antes de que");
          System.out.println("salga el 24");
          
          // Paramos el programa
          break;
        }
      }

    }


  }

}
