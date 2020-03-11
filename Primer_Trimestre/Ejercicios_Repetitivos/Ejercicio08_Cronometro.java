/*
 * Programa: Ejercicio08_Cronometro.java
 * 
 * Autor: Francisco Javier Campos Guti�rrez
 * 
 * Enunciado:
 * Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.
 * 
 * Variables:
 * int horas	<-- Asiganci�n de horas
 * int minutos	<-- Asignaci�n de minutos
 * int segundos	<-- Asignaci�n de segundos
 * 
 * Desarrollo / An�lisis
 * Para la creaci�n de este programa ser� necesaria la creaci�n de 3 bucles, para horas
 * primero, minutos y segundos.
 * El cronometro lo pararemos al dia, de esta manera para que entre en el bucle de horas
 * tendra que ser hasta 23. El bucle de minutos y segundos ser� 60, se incrementar�
 * cada que llegue a esa cifra
 * Ser� neceria la excepci�n, thread.sleep(1000). Esto ser� un contador de mil�simas,
 * este se parar� el correspondiente 1000 mil�simas a segundos.
 * 
 */
package Ejercicios_Repetitivos;

import java.util.Scanner;

public class Ejercicio08_Cronometro {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc  = new Scanner(System.in);
		
		// Variables
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		String borrar = "\b         \n";
		
		// Bucle finito para un dia
		for (horas = 0; horas <=23; horas++) { // ser� hasta 23 por que son las horas que tiene un d�a
			for (minutos = 0; minutos <60; minutos++) { // 60 ser� los minutos de una hora
				for (segundos = 0; segundos <60; segundos++) { // 60 sera los segundos de un minutos
					// Salida
					System.out.printf("%2d:%2d:%2d",horas,minutos,segundos);
					//System.out.println("horas " + horas + " minutos " + minutos + " segundos " + segundos);
					Thread.sleep(1000);
					// Por cada salida que emite el programa, este lo borrar� para que salga la siguiente y que no se sobreescriba
					System.out.print(borrar); 
				}
			}
		}
		
		
		
		
	}

}
