/*
 Programa: Ejercicio06_Potencia.java

 Proposito: Escribe un programa que dados dos números, uno real
 (base) y un entero positivo (exponente), saque por pantalla el
 resultado de la potencia. No se puede utilizar el operador de potencia.

 Fecha : 28/10/2019

 Variables, algoritmos a usar
   * exponente  <-- Almacenamos el exponente
   * base       <-- Alamcenamos base
   * resultado	<-- será igual a base

 Analisis, Algoritmos
 Crearemos un algoritmo para resolver una potencia, para ello
 tendremos que dar con la sintaxis correcta, ya que podemos utilizar
 el operador de la potencia.
 El bucle en este caso, lo aplicaremos al exponente ya que no puede ser
 negativo y lo repetiremos hasta que se positivo.
 */
package Ejercicios_Repetitivos;

import java.util.Scanner;

public class Ejercicio06_Potencia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Variables
		int base;
		int exponente;
		int resultado;
		
		System.out.println("Este programa podrá resolver potencias");
		System.out.println("--------------------------------------");
		
		// Entrada de datos
		System.out.println("Introduce valor para exponente: ");
		exponente = sc.nextInt();

		System.out.println("Introduce valor para base: ");
		base = sc.nextInt();	
		
		resultado = base;
		
		// Bucle
		for(int i=1;i<exponente;i++) {
			
		resultado *= base; 	
		
		}
		
		// Salida
		System.out.println("--------------------------------------");
		System.out.println("El resultado de elevar " + exponente + " a " + base + " es:  "+ resultado);
		

	
	
}

}
