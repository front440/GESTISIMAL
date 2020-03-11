/*
 Programa: Ejercicio11_Viaje.py

 Proposito: Realiza un programa que pida por teclado el resultado
 (dato entero) obtenido al lanzar un dado de seis caras y muestre por
 pantalla el número en letras (dato cadena) de la cara opuesta al
 resultado obtenido.

 Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
 Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto.”.
 Ejemplo:
 Introduzca número del dado: 5
 En la cara opuesta está el "dos".

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 18/10/2019

 Variables, algoritmos a usar
   * n     <-- numero introducido
 */
package Ejercicios_Alternativas;

import java.util.Scanner;

public class Ejercicio13_CarasOpuestas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		
		System.out.println("Con este programa podremos saber el lado opuesto de la cara de un dado.");
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("¿El lado opuesto a que cara quieres saber?");
		n = sc.nextInt();
		
		// Desarrollo
		if (n > 1 && n < 6) {
			
			if (n == 1) {
				System.out.println("El lado opuesto es 6");
			}
			else if (n ==2 ) {
				System.out.println("El lado opuesto es 5");
			}
			else if (n ==3 ) {
				System.out.println("El lado opuesto es 4");
			}
			else if (n ==4 ) {
				System.out.println("El lado opuesto es 3");
			}
			else if (n ==5 ) {
				System.out.println("El lado opuesto es 2");
			}
			else {
				System.out.println("El lado opuesto es 1");
			}
		}
		else {
			System.out.println("Número introducido erroneo");
		}
		

		
		
	}

}
