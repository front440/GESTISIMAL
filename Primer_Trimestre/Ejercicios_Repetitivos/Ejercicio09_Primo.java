/*
 * Ejercicio09_Primo.java
 * 
 * Autor: Francisco Javier Campos Gutiérrez
 * 
 * 
 * Programa: Mostrar en pantalla los N primero número primos. Se pide 
 * por teclado la cantidad de números primos que queremos mostrar.
 * 
 * Variables:
 * 	* int cantidadMostrar	<-- Cantidad de números que queremos mostrar
 * 	* int cantidadMosrados	<-- Cantidad de números primos que hemos mostrado
 * 	* int num				<-- Número que calculamos para ser primo
 * 	* boolean esPrimo		<-- Interruptor que parte de la secuencia for
 * 								que nos facilitará si es primo cuando lo sea y cuando no
 * 	* divisor				<-- divisor de número primo
 * 
 * Analisis / Desarrollo
 * El programa nos pide que relizemos un programa que mostremos el número que nos pide
 * de numeros pirmos. Para ello ese número lo almacenaremos en la variable 'cantidadMostrar'
 * y será el primer bucle, que tiene que ser mayor que cantidadMostrados.
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
		
		
		System.out.println("Es programa nos mostrará el número de los primeros números primos que queramos");
		
		System.out.println("Ingre el número de números primos: ");
		cantidadMostrar = sc.nextInt();
		
		System.out.println("1:2"); // Imprimimos dos, por que es el primer número primo
		cantidadMostrados = 1; // Añadimos 1 a la variable por que ya lo hemos mostrado
		num = 3; // Este será el próximo número
		
		// Entrará en el bucle si cantidadMostrados es menor que cantidadMostrar, para que tenga un límite
		while (cantidadMostrados <= cantidadMostrar) { 
			boolean esPrimo = true; // Declaramos esPrimo como true
			
			// divisor será de 3 por que todos los números primos son impares, de esta forma ahorramos calculos al pc
			for (int divisor=3; divisor <= Math.sqrt(num) && esPrimo; divisor+=2) { // Decimos que la raiz tiene que ser mayor por que si se divide entre más el calculo será erroneo
				if (num%divisor == 0) {
					esPrimo = false; // Cambiamos el interruptor a false cuando el resto de la división sea 0, entonces descartamos el número
				}
			}
			// Cuando la secuencia siga quiere decir que el número es primo, entonces incrementamos cantidadMostrados
			// y lo mostramos por pantalla
			if (esPrimo) {
				cantidadMostrados++;
				System.out.println(cantidadMostrados + ":" + num); // Salida
			}
			num += 2; // num=3 será incrementado de dos en dos ya que todos los números primos son impares y sería un ahorro de cálculo
		}
		
		

	}

}
