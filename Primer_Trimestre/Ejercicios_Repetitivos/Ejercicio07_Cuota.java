/*
 Programa: Ejercicio07_Cuota.java

 Proposito: Una persona adquiri� un producto para pagar en 20 meses.
 El primer mes pag� 10 �, el segundo 20 �, el tercero 40 � y as�
 sucesivamente. Realizar un programa para determinar cu�nto debe pagar
 mensualmente y el total de lo que pagar� despu�s de los 20 meses.

 Fecha : 12/11/2019

 Variables, algoritmos a usar
   * int mes			<-- variable contador de para cada mez
   * int pagoTotal		<-- Almacenaremos la suma total de todas las cuotas
   * int cuotaMEnsual	<-- Valor de la cuota cada mes

 Analisis, Algoritmos
 En este ejercicio nos pedir� que calculemos la

 */
package Ejercicios_Repetitivos;

import java.util.Scanner;

public class Ejercicio07_Cuota {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Variables
		int mes; 			// Contador
		int pagoTotal = 0;		
		int cuotaMensual = 10;
		
		// Expresamos lo que hace el programa
		System.out.println("El programa nos har� el c�lculo de la siguiente cuota");
		System.out.println("-----------------------------------------------------");
		
		// bucle for
		for (mes = 1 ; mes <= 3 ; mes++) {
			System.out.println("El mes " + mes + " pagar�: " + cuotaMensual + "�");
			pagoTotal+=cuotaMensual;
			cuotaMensual*=2;
			
		}
		System.out.println("El pago total ser�: " + pagoTotal);
	}

}
