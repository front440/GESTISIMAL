/*
 Programa: Ejercicio10_Vinicultores.java

 Proposito: La asociaci�n de vinicultores tiene como pol�tica fijar
 un precio inicial al kilo de uva, la cual se clasifica en tipos
 A y B, y adem�s en tama�os 1 y 2. Cuando se realiza la venta del
 producto, �sta es de un solo tipo y tama�o, se requiere determinar
 cu�nto recibir� un productor por la uva que entrega en un embarque,
 considerando lo siguiente: si es de tipo A, se le cargan 20 c�ntimos
 al precio inicial cuando es de tama�o 1; y 30 c�ntimos si es de
 tama�o 2. Si es de tipo B, se rebajan 30 c�ntimos cuando es de
 tama�o 1, y 50 c�ntimos cuando es de tama�o 2. Realice un algoritmo
 para determinar la ganancia obtenida.

 Autor: Francisco Javier Campos Guti�rrez

 Fecha : 18/10/2019

 Variables, algoritmos a usar
   * kg    <-- Kilos que venden
   * pb    <-- Precio base
   * A1    <-- kg * (pb + (pb * 0.2))
   * A2    <-- kg * (pb + (pb * 0.3))
   * B1    <-- kg * (pb - (pb * 0.3))
   * B2    <-- kg * (pb - (pb * 0.5))
 */
package Ejercicios_Alternativas;

import java.util.Scanner;

public class Ejercicio10_Vinicultores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int pb = 0;
		int kg = 0;
		int opcion = 0;
		double a1 = 0;
		double a2 = 0;
		double b1 = 0;
		double b2 = 0;
		
		System.out.println("Con este programa determinaremos la ganancia de la cosecha seg�n el tipo de uva.");
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println("Cu�l es el valor de la uva en kg/�: ");
		pb = sc.nextInt();
		System.out.println("�De cuantos Kilos quieres saber el precio de la uva?: ");
		kg = sc.nextInt();
		
		System.out.println("--------------------------------------------------------------------------------");

		// Menu
		System.out.println("�Que tipo de uva prefieres?");
		System.out.println("1) Uva tipo A1: ");
		System.out.println("2) Uva tipo A2: ");
		System.out.println("3) Uva tipo B1: ");
		System.out.println("4) Uva tipo B2: ");
		opcion = sc.nextInt();
		
		// Algoritmo
		a1 = kg * (pb + (pb * 0.2));
		a2 = kg * (pb + (pb * 0.3));
		b1 = kg * (pb - (pb * 0.3));
		b2 = kg * (pb - (pb * 0.5));
		
		// Salida
		if ( opcion == 1 ) {
			System.out.println("La ganacia es de: " + a1 + "�");
		}
		else if ( opcion == 2 ) {
			System.out.println("La ganacia es de: " + a2 + "�");
		}
		else if ( opcion == 3 ) {
			System.out.println("La ganacia es de: " + b1 + "�");
		}
		else if ( opcion == 4 ) {
			System.out.println("La ganacia es de: " + b2 + "�");
		}
		else {
			System.out.println("mierda");
		}
		
		
		
	}

}
