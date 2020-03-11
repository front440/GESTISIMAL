/*
 Programa: Ejercicio13_RaizCuadradayCubica.java
 Proposito: Realizar un algoritmos que lea un número y que muestre 
 su raíz cuadrada y su raíz cúbica. Python no tiene ninguna función 
 predefinida que permita calcular la raíz cúbica, ¿cómo se puede calcular?

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 07/11/2019


 Variables a usar
   * numero    <-- numero a exponer
   * rcuadrada <-- raiz cuadrada de numero a exponer
   * rcubica   <-- raiz cubica de numero a exponer

 Algoritmo:
 rcuadrada = numero ** (1/2)
 rcubica = numero ** (1/3)
 */
package Ejercicios_Secuenciales;

import java.util.Scanner;

public class Ejercicio13_RaizCuadradayCubica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double numero = 0;
		double rcuadrada = 0;
		double rcubica = 0;
		
		System.out.println("Con este programa calcularemos la raiz cuadra y cúbica del número introducido");
		
		// Entrada de datos
		System.out.println("Introduce número: ");
		numero = sc.nextDouble();
		
		// Cáculo
		rcuadrada = Math.pow(numero, 2);
		rcubica = Math.pow(numero, 3);
		
		// Salida
		System.out.println("El resultado de elevar " + numero + " al cuadrado es: " + rcuadrada);
		System.out.println("El resultado de elevar " + numero + " al cubo es: " + rcubica);

	}

}
