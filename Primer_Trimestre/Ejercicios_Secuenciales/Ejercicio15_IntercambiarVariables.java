/*
 Programa: Ejercicio15_IntercambiarVariables.py

 Proposito: Dadas dos variables numéricas A y B, que el usuario 
 debe teclear, se pide realizar un algoritmo que intercambie los
 valores de ambas variables y muestre cuanto valen al final las dos variables.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 11/10/2019


 Variables a usar
   * a     <-- Asignación A
   * b     <-- Asignación B
   * aux   <-- Guardará el valor de A
           La variable de aux es utilizada para no peder el valor de la
           varaible a, ya que si no lo hiciesemos de esta manera se perderia.

 Algoritmo:
 aux = a
 a = b
 b = aux
 */
package Ejercicios_Secuenciales;

import java.util.Scanner;

public class Ejercicio15_IntercambiarVariables {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce primer valor: ");
		int a = sc.nextInt();
		
		System.out.println("Introduce segundo valor: ");
		int b = sc.nextInt();
		
		int aux = a;
		a = b;
		b = aux;
		
		System.out.println("A es igual a: " + a);
		System.out.println("B es igual a: " + b );

	}

}
