/*
 Programa: Ejercicio7_Minutos_a_Horas.java
 Proposito: Realiza un programa que reciba una cantidad de 
 minutos y muestre por pantalla a cuantas horas y minutos corresponde.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 07/10/2019


 Variables a usar
   * total	<-- Total de minutos introducidos.
   * horas <-- Calculará mediante una divion entera el numero de horas
   * minutos <---  Calculará el reste de la division de las horas calculadas
               de la division anterior

 Algoritmo:
 horas <-- horas // 60
 min   <-- - min % 60
 */
package Ejercicios_Secuenciales;
import java.util.Scanner;


public class Ejercicio07_Minutos_a_Horas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horas = 0;
		int min = 0;
		
		System.out.println("Este programa será capaz de transformar una cantidad de minutos a horas y minutos.");
		
		// Leemos datos
		System.out.println("Introduce número de minutos a calcular: ");
		int total = sc.nextInt();
		
		// algorimo
		horas = total / 60;
		min = total % 60;
		
		// Salida de datos
		System.out.println("El resultado es "+ horas + "horas" + "y" + min + "minutos");
		
		
		

	}

}
