/*
Programa: Ejercicio04_LetraMay.py
 Proposito: Programa que lea una cadena por teclado y compruebe si
 es una letra mayúscula.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 16/10/2019

 Variables a usar
   * letra     <-- Almacenamos la letra

 Algoritmo:
 Character.isUpperCase(letra) <-- operando que nos muestra si es mays o mins
 */
package Ejercicios_Alternativas;

import java.util.Scanner;

public class Ejercicio04_LetraMay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char letra;
		
		// Entrada de datos
		System.out.println("Ingrese una letra: ");
		letra = sc.nextLine().charAt(0);
		
		if (Character.isUpperCase(letra)) {
			System.out.println("La letra es mayuscula.");
		}
		else {
			System.out.println("La letra minuscula");
		}
		

	}

}
