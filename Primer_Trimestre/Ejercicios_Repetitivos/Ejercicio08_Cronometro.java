/*
 * Programa: Ejercicio08_Cronometro.java
 * 
 * Autor: Francisco Javier Campos Gutiérrez
 * 
 * Enunciado:
 * Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.
 * 
 * Variables:
 * int horas	<-- Asiganción de horas
 * int minutos	<-- Asignación de minutos
 * int segundos	<-- Asignación de segundos
 * 
 * Desarrollo / Análisis
 * Para la creación de este programa será necesaria la creación de 3 bucles, para horas
 * primero, minutos y segundos.
 * El cronometro lo pararemos al dia, de esta manera para que entre en el bucle de horas
 * tendra que ser hasta 23. El bucle de minutos y segundos será 60, se incrementará
 * cada que llegue a esa cifra
 * Será neceria la excepción, thread.sleep(1000). Esto será un contador de milésimas,
 * este se parará el correspondiente 1000 milésimas a segundos.
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
		for (horas = 0; horas <=23; horas++) { // será hasta 23 por que son las horas que tiene un día
			for (minutos = 0; minutos <60; minutos++) { // 60 será los minutos de una hora
				for (segundos = 0; segundos <60; segundos++) { // 60 sera los segundos de un minutos
					// Salida
					System.out.printf("%2d:%2d:%2d",horas,minutos,segundos);
					//System.out.println("horas " + horas + " minutos " + minutos + " segundos " + segundos);
					Thread.sleep(1000);
					// Por cada salida que emite el programa, este lo borrará para que salga la siguiente y que no se sobreescriba
					System.out.print(borrar); 
				}
			}
		}
		
		
		
		
	}

}
