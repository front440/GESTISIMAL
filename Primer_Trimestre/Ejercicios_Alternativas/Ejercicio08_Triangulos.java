/*
 Programa: Ejercicio08_Triangulos.java
 Proposito: Programa que lea 3 datos de entrada A, B y C. Estos
 corresponden a las dimensiones de los lados de un triángulo.
 El programa debe determinar que tipo de triangulo es, teniendo en
 cuenta los siguiente:

 Si se cumple Pitágoras entonces es triángulo rectángulo
 Si sólo dos lados del triángulo son iguales entonces es isósceles.
 Si los 3 lados son iguales entonces es equilátero.
 Si no se cumple ninguna de las condiciones anteriores, es escaleno.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 10/11/2019

 Variables a usar
   * lado1 <-- Almacenamos el valor de lado1
   * lado2 <-- Almacenamos el valor de lado2
   * lado3 <-- Almacenamos el valor de lado3

 Algoritmo:
 Triángulo rectángulo:
 Debe de cumplirse Pitagoras por lo que: a**2 = (b**2)+(c**2)
 Tiángulo equilatero:
 Todos los lados son iguales.
 Triángulo isósceles:
 Si dos lados son iguales
 Triángulo Escaleno:
 Si no se cumple niguna de las anteriores condiciones
 */
package Ejercicios_Alternativas;

import java.util.Scanner;

public class Ejercicio08_Triangulos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int lado1 = 0;
		int lado2 = 0;
		int lado3 = 0;
		
		// Entrada
		System.out.println("Ingresa valor de lado 1: ");
		lado1 = sc.nextInt();
		System.out.println("Ingresa valor de lado 2: ");
		lado2 = sc.nextInt();
		System.out.println("Ingresa valor de lado 3: ");
		lado3 = sc.nextInt();
		
		// Cálculo
		if (Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2) || Math.pow(lado1, 2) + Math.pow(lado3, 2) == Math.pow(lado2, 2) || Math.pow(lado3, 2) + Math.pow(lado2, 2) == Math.pow(lado1, 2)) {
			System.out.println("Triángulo rectángulo");
		}
		else if (lado1/lado1 == 1 && lado2/lado2 == 1 && lado3/lado3 == 1) {
			System.out.println("Triangulo equilátero");
		}
		else if (lado1 == lado2 && lado1 != lado3 || lado2 == lado1 && lado2 != lado3 || lado2 != lado3 || lado3 == lado1 && lado3 == lado2) {
			System.out.println("Triángulo isósceles");
		}
		else {
			System.out.println("Triángulo escaleno");
		}

	}

}
