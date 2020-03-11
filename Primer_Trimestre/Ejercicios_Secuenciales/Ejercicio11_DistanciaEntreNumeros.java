/*
 * Programa: Ejercicio11_DistanciaEntreNumeros.java

 Proposito: Pide al usuario dos números y muestra la "distancia" 
 entre ellos (el valor absoluto de su diferencia, de modo que el 
 resultado sea siempre positivo).

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 10/10/2019

 Variables a usar
 numero1 <-- valor del numero 1
 numero2 <-- valor del numero 2
 diferencia <-- Resultado de restar numero1 y numero2

# Algoritmo:
# diferencia <-- numero1 - numero2
 */
package Ejercicios_Secuenciales;

import java.util.Scanner;

public class Ejercicio11_DistanciaEntreNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		int diferencia = 0;
		
		// Entrada de datos
		System.out.println("Ingrese primer valor: ");
		numero1 = sc.nextInt();
		
		System.out.println("Ingrese segundo valor: ");
		numero2 = sc.nextInt();
		
		// Calculo
		diferencia = numero1 - numero2;
		
		// Salida
		System.out.println("La distancia entre los dos puntos es de: " + Math.abs(diferencia));           
		
		

	}

}
