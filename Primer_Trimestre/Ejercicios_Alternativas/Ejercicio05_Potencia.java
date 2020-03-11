/*
 Programa: Ejercicio05_Potencia.java
 Proposito: Realiza un algoritmo que calcule la potencia, para ello
 pide por teclado la base y el exponente. Pueden ocurrir tres cosas:

 El exponente sea positivo, s�lo tienes que imprimir la potencia.
 El exponente sea 0, el resultado es 1.
 El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

 Autor: Francisco Javier Campos Guti�rrez

 Fecha : 16/10/2019

 Variables a usar
   * base      <-- N�mero que elevaremos a la potencia
   * exponente <-- N�mero que utilizaremos como potencia

 Algoritmo:
 base**exponente   <-- c�lculos positivos
 */
package Ejercicios_Alternativas;

import java.util.Scanner;

public class Ejercicio05_Potencia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int base = 0;
		int exponente = 0;
		int resultado = 0;
		
		System.out.println("Este programa nos dir� el resultado de elevar un n�mero a la que queramos");
		
		System.out.println("Introduce n�mero como base: ");
		base = sc.nextInt();
		
		System.out.println("Introduce n�mero como exponente: ");
		exponente = sc.nextInt();
		
		// Caculo
		// resultado = base^exponente;
		// 1/(base ** Math.abs(exponente)) (base^exponente
		
		if (exponente > 0) {
			System.out.printf("El resultado es: " + Math.pow(base, exponente) );
		}
		else if (exponente == 0) {
			System.out.println("El resultado de todo a potencia a 0 es: 1");
		}
		else {
			System.out.println("El resultado es: " + 1/ (Math.pow(base, Math.abs(exponente))));
		}
		

	}

}
