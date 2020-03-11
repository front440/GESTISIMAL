/*
 Programa: Ejercicio01_MayorOMenorque0.py

 Proposito: Realizar un algoritmo que pida números (se pedirá por
 teclado la cantidad de números a introducir). El programa debe
 informar de cuantos números introducidos son mayores que 0, menores
 que 0 e iguales a 0.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 24/10/2019

 Variables, algoritmos a usar
   * contador  <-- Variable para almacenar contador de 1 a 10
   * numero    <-- Variable para almacenar numero introducido

 Analisis, Algoritmos
 Deberemos de pedir una serie de números, de estos pedidos deberemos
 decir cuales son mayores, iguales o menores.
 Entonces, crearemos un contador hasta 10, para que pare en esta cifra
 y según nos vaya dando datos, iremos diciendo si es mayor, igual o menor
 mediante un "if". Cuando el contador llegue a 10, parará el programa.
 */
package Ejercicios_Repetitivos;

import java.util.Scanner;

public class Ejercicio02_MayorOMenorque0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// variables
		int n;
		
		// Creamos la variable contador
		int contador = 3;
		
		System.out.println("Este programa nos dirá si el número insertado es mayor, igual menor que 0");
		System.out.println("-------------------------------------------------------------------------");
		
		//Entrada de datos
		System.out.println("Introduce un número: ");
		n = sc.nextInt();
	
		
		while (contador != 0) {
			if (n < 0) {
				System.out.println("El número introducido es menor que 0");
			}
			else if (n == 0) {
				System.out.println("El número es igual que 0");
			}
			else {
				System.out.println("El número es mayor que 0");
			}
			contador--; // Decremetamos contador
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Te quedan " + contador + " intentos");
			System.out.println("Vuelve a introducir un número:");
			n = sc.nextInt();
		}
		System.out.println("Has agotado el número de intentos");
		
		

	}

}
