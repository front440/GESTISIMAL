/*
 Programa: Ejercicio03_Division.java
 Proposito: Crea un programa que pida al usuario dos n�meros y muestre su divisi�n
 si el segundo no es cero, o un mensaje de aviso en caso
 contrario.

 Autor: Francisco Javier Campos Guti�rrez

 Fecha : 16/10/2019

 Variables a usar
   * dividiendo  <-- N�mero a dividir
   * divisor   <-- N�mero con el que dividiremos
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
		
		System.out.println("Con este programa dividiremos los n�mero introducidos");
		
		System.out.println("Introduce n�mero a dividir: ");
		dividiendo = sc.nextInt();
		
		System.out.println("Introduce el n�mero con el que dividiremos: ");
		divisor = sc.nextInt();
		
		// Calculo
		resultado = dividiendo / divisor;
		
		if (divisor == 0 || dividiendo == 0) {
			System.out.println("N�mero introducido es erroneo.");
			System.out.println("Vuelve a ejecutar el programa con un n�mero correcto");
		}
		else {
			System.out.println("El resultado de la operacion es: " + resultado);
		}

	}

}
