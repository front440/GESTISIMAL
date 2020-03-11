/*
 * Programa: Ejercicio01_Quiniela.java
 * 
 * Autor: Francisco Javier Campos Gutierrez
 * 
 * Fecha: 24/11/2019
 * 
 * Enunciado: Escribe un programa que muestre tres apuestas de la quiniela en tres
 * columnas para los 14 partidos y el pleno al quince (15 filas) de forma que la
 * probabilidad de que salga un 1 sea  de 1/2, la probabilidad de que salga x sea de
 * 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 * 
 * Variables:
 * String[] resultado = {"1","1","1","X","X","2","2"}   <-- Almacena las probabilidades
 * int partido  <-- Almacena el número de partido hasta 15
 * int aleatorio    <-- Elige aleatoriamente  el contenido del array
 * 
 * Desarrollo:
 * El ejercicio nos pide que rellenemos de forma aletoria de 15 partidos, en los cuales
 * los resultados serán:
 * 3/6 de que salga 1
 * 1/6 de que salga x
 * 2/6 de que salga 2
 * Crearemos un Array donde almacenaremos las posibilidades de los resultados y con la
 * ayuda de un bucle determinado de hasta 15 filas para los 15 partidos.
 */
package array.ejercicios;

public class Ejercicio01_Quiniela {

  public static void main(String[] args) {

    // Presentación del programa
    System.out.println("Este programa rellenerá una quinela de 15 partidos automaticamente");
    System.out.println("------------------------------------------------------------------");

    // Almacenamos las probabilidades de 1, X o 2 
    String[] resultado = {"1","1","1","X","X","2"};

    // Creamos el bucle definido hasta 15
    for (int partido=1; partido<=14; partido++) {
      // La creacion de 3 números aleatorios será para cada partido en cada columna
      int aleatorio1 = (int)(Math.floor(Math.random()*(resultado.length)));
      int aleatorio2 = (int)(Math.floor(Math.random()*(resultado.length)));
      int aleatorio3 = (int)(Math.floor(Math.random()*(resultado.length)));

      // Mostramos por pantalla los resultados
      System.out.print("Partido " + partido + ": " + resultado[aleatorio1] + "|" + resultado[aleatorio2] + "|" + resultado[aleatorio3]);
      System.out.println();

    }
  }
}
