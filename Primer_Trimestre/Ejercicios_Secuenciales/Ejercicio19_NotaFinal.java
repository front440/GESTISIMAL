/*
 Programa: Ejercicio19_NotaFinal.java

 Escribir un algoritmo para calcular la nota final de un estudiante,
 considerando que por cada respuesta correcta 5 puntos, por una
 incorrecta -1 y por respuestas en blanco 0. Imprime el resultado
 obtenido por el estudiante.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 08/11/2019


 Variables a usar
   * correcta      <-- Almacenamos preguntas correctas, valor 5
   * incorrecta    <-- almacenamos preguntas incorrectas, valor -1
   * notafinal    <-- Almacenamos la nota final

 Algoritmo
 notalfinal = correcta - incorrectas
 */
package Ejercicios_Secuenciales;

import java.util.Scanner;

public class Ejercicio19_NotaFinal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int correcta = 0;
		int incorrecta = 0;
		int notafinal = 0;
		
		// Entrada
		System.out.println("Introduzca respuestas correctas: ");
		correcta = sc.nextInt();
		
		System.out.println("Introduzca las respuesta incorrectas: ");
		incorrecta = sc.nextInt();
		
		// Calculo
		correcta = correcta * 5;
		incorrecta = -incorrecta * (-1);
		notafinal = correcta - incorrecta;
		
		System.out.println("La nota final es: " + notafinal);
		
		
	}

}
