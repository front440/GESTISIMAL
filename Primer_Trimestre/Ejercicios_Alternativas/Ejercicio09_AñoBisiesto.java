/*
 Programa: Ejercicio09_A�oBisiesto.java
 Proposito: Escribir un programa que lea un a�o indicar si es
 bisiesto. Nota: un a�o es bisiesto si es un n�mero divisible por
 4, pero no si es divisible por 100, excepto que tambi�n sea divisible
 por 400.

 Autor: Francisco Javier Campos Guti�rrez

 Fecha : 10/11/2019

 Variables a usar
   * a�o <-- Valor para a�o

 Algoritmo:
 Para que un a�o sea bisiesto y lo mostremos este deber� de ser 
 divisible entre 4 y entre 400. Utilizaremos los objetos booleanos

 */
package Ejercicios_Alternativas;

import java.util.Calendar;
import java.util.Scanner;

import EXAMEN.tiempo.Fecha;

public class Ejercicio09_A�oBisiesto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String fecha = "20201010";
		
//		System.out.println("Este programa nos dir� si un a�o es bisiesto o no.");
//		
//		System.out.println("Introduce un a�o: ");
//		fecha = sc.nextInt();
//		
//		if (fecha % 4 == 0 || fecha % 400 == 0) {
//			System.out.println("El a�o " + fecha + "   es bisiesto");
//		}
//		else {
//			System.out.println("El a�o " + fecha + "  no es bisiesto");
//		}
		
		//Fecha.anyo(fecha);
		System.out.println("el mes es: " + Fecha.esBisiesto(fecha));
		

	}

}
