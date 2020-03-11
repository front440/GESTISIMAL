/*
 * Programa: Ejercicio10_CalificacionFinal.py

 Proposito: Un alumno desea saber cual será su calificación final en 
 la materia de Algoritmos. Dicha calificación se compone de los 
 siguientes porcentajes:
 * 55% del promedio de sus tres calificaciones parciales.
 * 30% de la calificación del examen final.
 * 15% de la calificación de un trabajo final.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 07/10/2019


 Variables a usar
 parcial1      <-- Lee nota de parcial 1, la media de los 3 son un 55%
 parcial2      <-- Lee nota de parcial 2, la media de los 3 son un 55%
 parcial3      <-- Lee nota de parcial 3, la media de los 3 son un 55%
 parciales     <-- Almacena la media de los parciales
 examenfinal   <-- Lee nota del examen final, la nota es 30%
 trabajofinal  <-- Lee nota del trabajo final, la nota es 15%
 notafinal     <-- La nota final haciendo los calculos de todos los examenes y parciales


 Algoritmo:
 parciales     <-- ((parcial1 + parcial2 + parcial3)/3) * 0.55
 examenfinal   <-- examenfinal * 0.3
 trabajofinal  <-- trabajofinal * 0.15
 notafinal     <-- parciales + examenfinal + trabajofinal

 */
package Ejercicios_Secuenciales;

import java.util.Scanner;

public class Ejercicio10_CalificacionFinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double parcial1 = 0;
		double parcial2 = 0;
		double parcial3 = 0;
		double parciales = 0;
		double examenfinal = 0;
		double trabajofinal = 0;
		double notafinal = 0;
		
		// Entrada parciales
		System.out.println("Introduce nota de parcial 1: ");
		parcial1 = sc.nextDouble();
		
		System.out.println("Introduce nota de parcial 2: ");
		parcial2 = sc.nextDouble();
		
		System.out.println("Introduce nota de parcial 3: ");
		parcial3 = sc.nextDouble();
		
		// Entrada examen final
		System.out.println("Introduce nota de examen final:  ");
		examenfinal = sc.nextDouble();
		
		// Entrada trabajo final
		System.out.println("Introduce nota de trabajo final: ");
		trabajofinal = sc.nextDouble();
		
		// Algoritmos
		parciales = ( ( parcial1 + parcial2 + parcial3 ) / 3 ) * 0.55;
		
		examenfinal = examenfinal * 0.3;
		
		trabajofinal = trabajofinal * 0.15;
		
		notafinal = parciales + examenfinal + trabajofinal;
		
		// Salida de datos
		System.out.println("La nota de los parciales sobre la evaluacion es: " + parciales);
		
		System.out.println("La nota del examen final sobre la evaluacion es: " + examenfinal);
		
		System.out.println("La nota del trabajo final sobre la evaluacion es: " + trabajofinal);
		
		System.out.println("La nota final es: " + notafinal);

	}

}
