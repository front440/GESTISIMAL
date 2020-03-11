/*
Programa: Ejercicio18_Iniciales.java

 Pedir el nombre y los dos apellidos de una persona y mostrar
 las iniciales.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 08/11/2019


 Variables a usar
   * letra1    <-- Almacenamos letra1 
   * letra2    <-- almacenamos letra2
   * iniciales <--- Almacenamos las iniciales de letra1, letra2 y letra3

 */
package Ejercicios_Secuenciales;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio18_Iniciales {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		String letra1 = "";
		String letra2 = "";
		String iniciales = "";
		
		System.out.println("Introduce su nombre: ");
		letra1 = sc.next();
		
		System.out.println("Introduce su nombre: ");
		letra2 = sc.next();
		
		letra1.substring(0, 1);
		letra2.substring(0, 1);
		
		iniciales = letra1 + letra2;
		
		System.out.println("Las iniciales son: "+ iniciales);
		
		
		

	}
	

}
