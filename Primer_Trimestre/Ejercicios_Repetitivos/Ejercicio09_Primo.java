/*
 * Ejercicio09_Primo.java
 * 
 * Autor: Francisco Javier Campos Guti�rrez
 * 
 * 
 * Programa: Mostrar en pantalla los N primero n�mero primos. Se pide 
 * por teclado la cantidad de n�meros primos que queremos mostrar.
 * 
 * Variables:
 * 	* int cantidadMostrar	<-- Cantidad de n�meros que queremos mostrar
 * 	* int cantidadMosrados	<-- Cantidad de n�meros primos que hemos mostrado
 * 	* int num				<-- N�mero que calculamos para ser primo
 * 	* boolean esPrimo		<-- Interruptor que parte de la secuencia for
 * 								que nos facilitar� si es primo cuando lo sea y cuando no
 * 	* divisor				<-- divisor de n�mero primo
 * 
 * Analisis / Desarrollo
 * El programa nos pide que relizemos un programa que mostremos el n�mero que nos pide
 * de numeros pirmos. Para ello ese n�mero lo almacenaremos en la variable 'cantidadMostrar'
 * y ser� el primer bucle, que tiene que ser mayor que cantidadMostrados.
 * 
 */
package Ejercicios_Repetitivos;

import java.util.Scanner;

public class Ejercicio09_Primo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cantidadMostrar;
		int cantidadMostrados;
		int num;
		
		
		System.out.println("Es programa nos mostrar� el n�mero de los primeros n�meros primos que queramos");
		
		System.out.println("Ingre el n�mero de n�meros primos: ");
		cantidadMostrar = sc.nextInt();
		
		System.out.println("1:2"); // Imprimimos dos, por que es el primer n�mero primo
		cantidadMostrados = 1; // A�adimos 1 a la variable por que ya lo hemos mostrado
		num = 3; // Este ser� el pr�ximo n�mero
		
		// Entrar� en el bucle si cantidadMostrados es menor que cantidadMostrar, para que tenga un l�mite
		while (cantidadMostrados <= cantidadMostrar) { 
			boolean esPrimo = true; // Declaramos esPrimo como true
			
			// divisor ser� de 3 por que todos los n�meros primos son impares, de esta forma ahorramos calculos al pc
			for (int divisor=3; divisor <= Math.sqrt(num) && esPrimo; divisor+=2) { // Decimos que la raiz tiene que ser mayor por que si se divide entre m�s el calculo ser� erroneo
				if (num%divisor == 0) {
					esPrimo = false; // Cambiamos el interruptor a false cuando el resto de la divisi�n sea 0, entonces descartamos el n�mero
				}
			}
			// Cuando la secuencia siga quiere decir que el n�mero es primo, entonces incrementamos cantidadMostrados
			// y lo mostramos por pantalla
			if (esPrimo) {
				cantidadMostrados++;
				System.out.println(cantidadMostrados + ":" + num); // Salida
			}
			num += 2; // num=3 ser� incrementado de dos en dos ya que todos los n�meros primos son impares y ser�a un ahorro de c�lculo
		}
		
		

	}

}
