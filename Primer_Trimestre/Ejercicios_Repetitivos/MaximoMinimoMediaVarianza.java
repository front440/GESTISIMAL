/*
 * Programa: MaximoMinimoMediaVarianza.java
 * 
 * Autor: Francisco Javier Campos Guti�rrez
 * 
 * Enunciado:
 * Crea un programa que pida una serie de notas al usuario y calcule:
 * 	-m�ximo de las notas
 * 	-m�nimo de las notas
 * 	-media de las notas
 * 	-varianza de las notas
 * 
 * Analisis/desarrollo:
 * Encontramos dos partes:
 * 	-C�lculo de la media, m�ximo y m�nimo.
 * 	-C�lculo de la varianza.
 * 
 * Variables:
 * 	notas		<-- vector (array) con las calificaci�nes introducidas por el usuario
 * 	maximo		<-- Valor m�ximo de las notas
 * 	minimo		<-- Valor m�nimo de las notas
 * 	sumatorio	<-- Suma de todas las notas
 * 
 * Algoritmos:
 * ------Primera Parte-------
 * sumatorio	<-- 0
 * maximo		<-- 0
 * minimo		<-- 0
 * PARA i DESDE 1 HASTA 10
 * 	LEER notas [i]
 * 	SI notas> maximo ENTONCES
 * 		maximo <-- notas[i]
 * 	FINSI
 * 		sumatorio <-- sumatorio + notas[i]
 * FINPARA
 * media	<-- sumatorio/10
 * 
 * ------Segunda Parte-------
 * PARA i DESDE 1 HASTA 10
 * 	sumatorio <-- sumatorio+(nota[i]-media)^2
 * FINPARA
 * 
 * ESCRIBIR maximo, minimi, media y varianza
 * 
 * 	
 */
package Ejercicios_Repetitivos;

import java.util.Scanner;

public class MaximoMinimoMediaVarianza {
	static final int numeroNotas = 3;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// Variables
		double[] notas;
		double sumatorio = 0;
		double media = 0;
		double varianza = 0;
		double maximo = Double.MIN_VALUE;
		double minimo = Double.MAX_VALUE;
		
		// Creacion de un vector y reservamos espacio
		notas = new double[numeroNotas];
		
		System.out.println("Este programa nos dir� de las notas insertadas el m�ximo, m�nimo, media y varianza");
		System.out.println("----------------------------------------------------------------------------------");
		
		// Bucle para introducir las 10 notas
		for(int i= 0; i<numeroNotas; i++) {
			// Entrada de datos
			// Pedir nota entre  0 y 10
			System.out.println("Introduzca la nota n�mero " + (i+1) + ": ");
			notas[i] = sc.nextDouble();
			while (notas[i]<0 || notas[i]>10) {
				// Notas erroneas no comprendidas entre 0 y 10
				System.out.println("Has introducido una nota err�nea");
				System.out.println("Introduzca la nota n�mero " + (i+1) + ": ");
				notas[i] = sc.nextDouble();
			}
			// Actualizar los datos: sumatorio, maximo y minimo
			if (notas[i] > maximo) {
				maximo = notas[i];
				}
			if (notas[i] < minimo) {
				minimo = notas[i];
			}
			sumatorio += notas[i];
		}
		media = sumatorio/numeroNotas;
		
		// Segunda Parte: Varianza
		sumatorio = 0;
		for (int i=0; i<numeroNotas; i++) {
			sumatorio += Math.pow(notas[i]-media, 2);
		}
		
		varianza = sumatorio/numeroNotas;
		
		//Mostramos resultados
		System.out.println("El m�ximo de las notas es: "+ maximo);
		System.out.println("El m�nimo de las notas es: "+ minimo);
		System.out.println("La media de las notas es: "+ media);
		System.out.println("La varianza de las notas es: "+ varianza);



	}

}
