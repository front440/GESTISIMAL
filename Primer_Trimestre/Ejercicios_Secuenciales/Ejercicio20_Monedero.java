/*
Programa: Ejercicio20_Monedero.java

 Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y
 céntimos) después de pedirnos cuantas monedas tenemos de 2e, 1e, 50
 céntimos, 20 céntimos o 10 céntimos).

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 08/11/2019


 Variables a usar
   * 10cnt <-- Variable para almacenar 10cnt
   * 20cnt <-- Variable para almacenar 20cnt
   * 50cnt <-- Variable para almacenar 50cnt
   * 1eu   <-- Variable para almacenar 1 euro
   * 2eu   <-- Variable para almacenar 2 euros
   * total <-- Variable para almacenar 10cnt
   * 
  Algoritmo
# total = 10cnt * 0.1 + 20cnt * 0.2 + 50cnt * 0.5 + 1eu  + 2eu
 */
package Ejercicios_Secuenciales;

import java.util.Scanner;

public class Ejercicio20_Monedero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt10 = 0;
		int cnt20 = 0;
		int cnt50 = 0;
		int eu1 = 0;
		int eu2 = 0;
		int total = 0;
		
		System.out.println("Introduzca monedas de 10 centimos: ");
		cnt10 = sc.nextInt();
		System.out.println("Introduzca monedas de 20 centimos: ");
		cnt20 = sc.nextInt();
		System.out.println("Introduzca monedas de 50 centimos: ");
		cnt50 = sc.nextInt();
		System.out.println("Introduzca monedas de 1 euros: ");
		eu1 = sc.nextInt();
		System.out.println("Introduzca monedas de 2 euros: ");
		eu2 = sc.nextInt();
		
		// Calculo
		total = (int) (cnt10 * 0.1 + cnt20 * 0.2 + cnt50 * 0.5 + eu1 * 1  + eu2 * 2);
		
		// Salida
		System.out.println("Hay un total de: " + total + " euros");

	}

}
