/*
 Programa: Ejercicio03_Division.java
 Proposito: Crea un programa que pida al usuario dos números y muestre su división
 si el segundo no es cero, o un mensaje de aviso en caso
 contrario.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 16/10/2019

 Variables a usar
   * dividiendo  <-- Número a dividir
   * divisor   <-- Número con el que dividiremos
   * Resultado <-- Almacenamos resultado de la division

 Algoritmo:
 divisor == 0 or dividiendo == 0 <-- error
 diviendo / divisor = resultado
 */
package Ejercicios_Alternativas;

import java.util.Scanner;

public class Ejercicio03_Division {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dividiendo = 0;
		int divisor = 0;
		int resultado = 0;
		
		System.out.println("Con este programa dividiremos los número introducidos");
		
		System.out.println("Introduce número a dividir: ");
		dividiendo = sc.nextInt();
		
		System.out.println("Introduce el número con el que dividiremos: ");
		divisor = sc.nextInt();
		
		// Calculo
		resultado = dividiendo / divisor;
		
		if (divisor == 0 || dividiendo == 0) {
			System.out.println("Número introducido es erroneo.");
			System.out.println("Vuelve a ejecutar el programa con un número correcto");
		}
		else {
			System.out.println("El resultado de la operacion es: " + resultado);
		}

	}

}
