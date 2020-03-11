/*
 Programa: Ejercicio11_Viaje.java

 Proposito: El director de una escuela está organizando un viaje de
 estudios, y requiere determinar cuánto debe cobrar a cada alumno y
 cuánto debe pagar a la compañía de viajes por el servicio. La forma
 de cobrar es la siguiente: si son 100 alumnos o más, el costo por
 cada alumno es de 65 euros; de 50 a 99 alumnos, el costo es de 70
 euros, de 30 a 49, de 95 euros, y si son menos de 30, el costo de la
 renta del autobús es de 4000 euros, sin importar el número de alumnos. 
 Realice un algoritmo que permita determinar el pago a la compañía
 de autobuses y lo que debe pagar cada alumno por el viaje.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 10/10/2019

 Variables, algoritmos a usar
   * n     <-- numero de alumnos 
 */
package Ejercicios_Alternativas;

import java.util.Scanner;

public class Ejercicio11_Viaje {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int bus = 0;
		
		System.out.println("Con este programa daremos con cuanto deberá de pagar cada alumno.");
		System.out.println("-----------------------------------------------------------------");

		System.out.println("Introduce el número de alumnos que iran al viaje: ");
		n = sc.nextInt();
		bus = 400 / n;
		
		// Desarollo
		if (n >= 100) {
			System.out.println("Al alumno le costará 65€");
		}
		else if (n > 50 || n <= 99) {
			System.out.println("El alumno le costará 70€");
		}
		else if ( n >= 30 || n <= 49 ) {
			System.out.println("El alumno le costará 95€");
		}
		else {
			System.out.println("El alumno pagará: " + bus + "€");
		}
		
	}

}
