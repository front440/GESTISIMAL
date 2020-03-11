/*
 Programa: Ejercicio2_NumeroPar.java
 Propósito: Escribe un programa que lea un número e indique
 si es par o impar..

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 10/11/2019


 Variables a usar
   * n <--- Número introducido

 Algoritmo:
 n % 2  
 */
package Ejercicios_Alternativas;

import java.util.Scanner;

public class Ejercicio02_NumeroPar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("En este ejercicio os mostraremos si el número es par o impar.");
		
		System.out.println("Introduce un numero: ");
		n = sc.nextInt();
		
		// Cálculo
		if (n % 2  == 0) {
			System.out.println("El número es par"); 
		}
		else {
			System.out.println("El número es impar");
		}

	}

}
