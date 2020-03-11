/*
 Programa: Ejercicio09_AñoBisiesto.java
 Proposito: Escribir un programa que lea un año indicar si es
 bisiesto. Nota: un año es bisiesto si es un número divisible por
 4, pero no si es divisible por 100, excepto que también sea divisible
 por 400.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 10/11/2019

 Variables a usar
   * año <-- Valor para año

 Algoritmo:
 Para que un año sea bisiesto y lo mostremos este deberá de ser 
 divisible entre 4 y entre 400. Utilizaremos los objetos booleanos

 */
package Ejercicios_Alternativas;

import java.util.Calendar;
import java.util.Scanner;

import EXAMEN.tiempo.Fecha;

public class Ejercicio09_AñoBisiesto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String fecha = "20201010";
		
//		System.out.println("Este programa nos dirá si un año es bisiesto o no.");
//		
//		System.out.println("Introduce un año: ");
//		fecha = sc.nextInt();
//		
//		if (fecha % 4 == 0 || fecha % 400 == 0) {
//			System.out.println("El año " + fecha + "   es bisiesto");
//		}
//		else {
//			System.out.println("El año " + fecha + "  no es bisiesto");
//		}
		
		//Fecha.anyo(fecha);
		System.out.println("el mes es: " + Fecha.esBisiesto(fecha));
		

	}

}
