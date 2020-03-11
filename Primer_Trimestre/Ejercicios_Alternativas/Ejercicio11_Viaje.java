/*
 Programa: Ejercicio11_Viaje.java

 Proposito: El director de una escuela est� organizando un viaje de
 estudios, y requiere determinar cu�nto debe cobrar a cada alumno y
 cu�nto debe pagar a la compa��a de viajes por el servicio. La forma
 de cobrar es la siguiente: si son 100 alumnos o m�s, el costo por
 cada alumno es de 65 euros; de 50 a 99 alumnos, el costo es de 70
 euros, de 30 a 49, de 95 euros, y si son menos de 30, el costo de la
 renta del autob�s es de 4000 euros, sin importar el n�mero de alumnos. 
 Realice un algoritmo que permita determinar el pago a la compa��a
 de autobuses y lo que debe pagar cada alumno por el viaje.

 Autor: Francisco Javier Campos Guti�rrez

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
		
		System.out.println("Con este programa daremos con cuanto deber� de pagar cada alumno.");
		System.out.println("-----------------------------------------------------------------");

		System.out.println("Introduce el n�mero de alumnos que iran al viaje: ");
		n = sc.nextInt();
		bus = 400 / n;
		
		// Desarollo
		if (n >= 100) {
			System.out.println("Al alumno le costar� 65�");
		}
		else if (n > 50 || n <= 99) {
			System.out.println("El alumno le costar� 70�");
		}
		else if ( n >= 30 || n <= 49 ) {
			System.out.println("El alumno le costar� 95�");
		}
		else {
			System.out.println("El alumno pagar�: " + bus + "�");
		}
		
	}

}
