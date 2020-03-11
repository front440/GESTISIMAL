/*
 * Programa: Ejercicio02_NumeroAleatorioHasta24.java
 * 
 * Autor: Francisco Javier Campos Gutierrez
 * 
 * Fecha: 25/11/2019
 * 
 * Enunciado: Realiza un programa que vaya generando números aleatorios pares entre 
 * 0 y 100 y que no termine de generar números hasta que no saque el 24. El  programa 
 * deberá decir al final cuántos números se han generado.
 * 
 * Variables:
 * aleatorio    <-- Número aleatorio
 * contador     <-- Contador de números
 * 
 * 
 * Desarrollo:
 * Deberemos de generar numeros del 0 al 100 y contabilizar solo los pares mediante la
 * división con resto 0. Una vez hecho esto el programa solo se parará cuando el 
 * número par 24 salga.
 * 
 */
package array.ejercicios;

public class Ejercicio02_NumeroAleatorioHasta24 {

  public static void main(String[] args) {

    System.out.println("El programa generará unos números aleatorios pares, los ");
    System.out.println("contabilizará y se parará cuando salga el numero 24");
    System.out.println("--------------------------------------------------------");

    int aleatorio;
    int contador = 0;

    while (true) {
      
   // Generamos un número aleatorio entre 0 y 100
      aleatorio = (int) Math.floor(Math.random()*101);
      
      // Contabilizamos el contador si es par mediante la division absoluta
      if (aleatorio % 2 ==0 ) {
        contador++; // Incrementamos
        //System.out.println(aleatorio); Descomentar para ver números
        
        // Si el numero es 24 mostramos contador de números y paramos el programa
        if (aleatorio == 24) {
          System.out.println("Han salido " + contador + " números pares antes de que");
          System.out.println("salga el 24");
          
          // Paramos el programa
          break;
        }
      }

    }


  }

}
