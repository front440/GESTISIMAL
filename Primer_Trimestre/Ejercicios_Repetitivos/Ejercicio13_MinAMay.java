/*
 * Programa: Ejercicio13_MinAMay.java
 * 
 * Autor: Francisco Javier Campos Guti�rrez
 * 
 * Enunciado: Realizar un programa que lea una cadena por teclado y convierta las
 * may�sculas a min�sculas y viceversa.
 * 
 * Variables:
 * String cadena	<-- Almacenaremos la frase introducida
 * String caracter	<-- Almaceneramos el valor de cada caracter a lo largo del bucle
 * String invertido	<-- Ser� el valor invertido de la variable
 * 
 * Analisis/Desarollo
 * En este programa deberemos de cambiar a may�scula a min�scula y viceversa. Para ello
 * tendremos que crear un for en el que contaremos la longitud de la cadena y la pasamos
 * caracter a caracter. Entonces, mediante una subcadena comparamos si el caracter
 * introducido es may�scula o min�scula mediante un if. Siendo cierta la sentencia, 
 * cambiaremos aplicaremos el valor invertido a la variable "invertida".
 */
package Ejercicios_Repetitivos;

import java.util.Scanner;

public class Ejercicio13_MinAMay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String cadena;
		String caracter;
		String invertida = "";
		
		
		System.out.println("Este programa invertir� la letras mayusculas a minusculas y vicversa.");
		System.out.println("---------------------------------------------------------------------");
		
		// Entrada de datos
		System.out.println("Introduce una frase: ");
		cadena = sc.nextLine();
		
		// Bucle
		for (int i=0; i<cadena.length();i++) {
			caracter = cadena.substring(i,i+1); // Repasa la cadena caracter por caracter
			if (caracter.equals(caracter.toUpperCase())) { // Comparamos si el caracter es may�scula
				invertida += caracter.toLowerCase(); // Cambiamos de may�scula a min�scula
			}
			else {
				invertida += caracter.toUpperCase(); // Cambiamos de min�cula a may�scula
			}
			
		}
		//Salida de datos
		System.out.println("La cadena invertida es:");
		System.out.println(invertida);
		
	}

}
