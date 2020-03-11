/*
 * Ejercicio09_Primo.java
 * 
 * Autor: Francisco Javier Campos Gutiérrez
 * 
 * 
 * Programa: Suponiendo que hemos introducido una cadena por teclado que representa 
 * una frase (palabras separadas por espacios), realiza un programa que cuente cuantas 
 * palabras tiene.
 * 
 * Variables:
 * 	* String cadena --> 	Alamacena la cadena introducida
 *  * String contador -->	Cuenta el numero de palabras
 * 
 * Analisis / Desarrollo
 * A la hora de contador palabras nos ceñiremos a los espacios, sabemos que capor cada
 * espacio tenemos 1 palabra. Crearemos un bucle que cuente las palabras segun los
 * espacios + 1.
 * 
 */
package Ejercicios_Repetitivos;

import java.util.Scanner;

public class Ejercicio11_NumeroDePalabras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cadena;
		int contador = 0;
		
		// Decimos lo que el programa hace
		System.out.println("Este programa nos contará el número de palabras");
		System.out.println("-----------------------------------------------");
		
		// Salida 
		System.out.println("Introduce una frase:");
		cadena = sc.nextLine();
		
		// Bucle
		// Realizamos el bucle de tal manera que recorreremos la cadena y entrará en el
		// si i es menor que la cadena
		for (int i = 0; i < cadena.length(); i++ ) {
			if(cadena.substring(i,i+1).equals(" ")) { // Recore la cadena palabra a palabra
				contador++; // incrementa el contador de las palabras
			}
		}
		// Decimos que es +1 por que un espacio contiene una palabra, mas la depués
		// del espacio.
		System.out.println("El número total de palabras es de: " + (contador+1));
		
		

	}

}
