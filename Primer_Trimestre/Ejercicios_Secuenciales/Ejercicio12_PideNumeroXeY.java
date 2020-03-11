/*
  Programa: Ejercicio12_PideNumeroXeY.java

 Proposito: Pide al usuario dos pares de números x1,y2 y x2,y2, que
 representen dos puntos en el plano. Calcula y muestra la distancia
 entre ellos.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 07/11/2019


 Variables a usar
   * x1        <-- Coordenada asignada x1
   * y1        <-- Coordenada asignada y1
   -------------------------------
   * x2        <-- Coordenada asignada x2
   * y2        <-- Coordenada asignada y2
   * distancia <-- distancia entre punto1 y punto2

 Algoritmo:
 distancia = (1/2)**((x2 - x1)**2 + (y2 - y1)**2
 */
package Ejercicios_Secuenciales;

import java.util.Scanner;

public class Ejercicio12_PideNumeroXeY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		double distancia = 0;
		
		System.out.println("Este programa nos dira la distancia en linea recta entre punto1 y punto2");
		
		// Entrada de datos
		System.out.println("Introduce valor para x1: ");
		x1 = sc.nextDouble();
		System.out.println("Introduce valor para y1: ");
		y1 = sc.nextDouble();
		
		System.out.println("Introduce valor para x2: ");
		x2 = sc.nextDouble();
		System.out.println("Introduce valor para y2: ");
		y2 = sc.nextDouble();
		
		// Calculo
		distancia = (double) Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

		// Salida
		System.out.println("La distancia entre los puntos es: " + distancia);
	}

}
