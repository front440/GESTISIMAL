/*
 Programa: Ejercicio04_NumerosPares.py

 Proposito: Escribir un programa que imprima todos los números pares
 entre dos números que se le pidan al usuario.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 12/11/2019

 Variables, algoritmos a usar
   * n1  <-- Variable para almacenar numero1
   * n2 <-- Variable para almacenar numero2

 Analisis, Algoritmos
 Escribiremos un programa en el que pediremos dos numeros y tendremos que decir
 los numeros pares que hay entre ellos.
 Al introducir dos numeros comprobaremos si n1 es par o impar, para ello 
 tendremos que ver el resultado de el resto de la division entre 2.
 Si es verdaderemos incrementaremos el valor de n1 para hacerlo par, y
 entonces podremos mostrar los numeros por la salida

 */
package Ejercicios_Repetitivos;

import java.util.Scanner;

public class Ejercicio04_NumerosPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Variables
		int n1 = 0;
		int n2 = 0;
		
		
		System.out.println("Introduce número 1: ");
		n1 = sc.nextInt();
		
		System.out.println("Introduce número 2:");
		n2 = sc.nextInt();
		
		if (n1 % 2 ==1) {
			n1++;
		}
		for (int i=n1 ; i<=n2 ; i++) {
			System.out.println(i);
		}

	}

}
