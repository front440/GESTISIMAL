/*
 Programa: Ejercicio01_MayorQue.java
 Proposito: Algoritmo que pida dos números e indique si el primero es
 mayor que el segundo o no.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 16/10/2019


 Variables a usar
   * a <-- Almacenaremos el primer numero
   * b <-- Almacenaremos el segundo numero

 Algoritmo:
 a > b     <-- A es mayor
 a < b     <-- B es mayor
 a == b    <-- Iguales
 */
package Ejercicios_Alternativas;

import java.util.Scanner;

public class Ejercicio01_MayorQue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		System.out.println("Este programa nos dirá si 'a' es igual, mayor o menor que 'b'");
		
		// Introduce datos
		System.out.println("Introduce valor para A: ");
		a = sc.nextInt();
		
		System.out.println("Introduce valor para B: ");
		b = sc.nextInt();
		
		// Calculo
		if (a > b) {
			System.out.println("A es mayor que B");
		}
		else if ( a < b) {
			System.out.println("B es mayor que A");
		}
		else {
			System.out.println("A y B son iguales");
		}
		
		
		

	}

}
