/*
 Programa: Ejercicio08_Cadena.java
 
 Autor: Francisco Javier Campos Gutiérrez

 Proposito: Pide una cadena y un carácter por teclado y muestra cuantas veces aparece
  el carácter en la cadena.



 Fecha : 12/11/2019

 Variables, algoritmos a usar
   * String caracter	<-- Alamcenaremos el caracter a buscar
   * String cadena		<-- Almacenaremos la cadena introducida
   * int contador		<-- variable contador

 Analisis, Algoritmos
 Para realizar este ejercicio tendremos que analizar caracter a caracter la cadena
 introducida y la compararemos con el caracter que queramos, cuando sera igual
 la variable contador será incrementada en 1.

 */
package Ejercicios_Repetitivos;

import java.util.Scanner;

public class Ejercicio10_Cadena {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String cadena;
		String caracter;
		int contador = 0;
		
		System.out.println("Introduce una frase: ");
		cadena = sc.nextLine();

		// Entrada
		System.out.println("Introducir un caracter: ");
		caracter = sc.nextLine();
		
		// Bucle
		for (int i=0 ; i<cadena.length(); i++) {
			// Repasamos la cadena caracter a caracter y lo comparamos
			if (cadena.substring(i,i+1).equals(caracter)) { 
				contador++; // Incrementamos
			}
		}
		// Salida
		System.out.println("El caracter " + caracter + " se repite " + contador + " veces");
		

	}

}
