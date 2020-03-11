/*
 Programa: Ejercicio16_Envios.java

 Proposito: Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur, Europa y Asia. El costo por el servicio de transporte se basa en el peso del paquete y la zona a la que va dirigido. Lo anterior se muestra en la tabla:

 ZONA	UBICACIÓN	COSTO/GRAMO
 1	América del Norte	24.00 euros
 2	América Central	20.00 euros
 3	América del Sur	21.00 euros
 4	Europa	10.00 euros
 5	Asia	18.00 euros
 Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados, esto por cuestiones de logística y de seguridad. 
 Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.



 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 18/10/2019

 Variables, algoritmos a usar
   * n     <-- numero introducido
   * p     <-- precio introducido

 */
package Ejercicios_Alternativas;

import java.util.Scanner;

public class Ejercicio16_Envios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int p = 0;
		
		System.out.println("Introduce el peso del paquete (en gramos): ");
		n = sc.nextInt();
		System.out.println("-----------------------------------------------------------------");

		
		System.out.println("Introduce el pais al que quieras mandar el paquete: ");
		System.out.println("1) America del Norte");
		System.out.println("2) America Central");
		System.out.println("3) America del Sur");
		System.out.println("4) Europa");
		System.out.println("5) Asia");
		p = sc.nextInt();
		System.out.println("-----------------------------------------------------------------");

		
		// Desrrollo
		if (n > 0 && n < 5000) {
			if (p == 1) {
				System.out.println("El envio a America del Norte es: " + (24*n));
			}
			if (p == 2) {
				System.out.println("El envio a America del Norte es: " + (20*n));
			}
			if (p == 3) {
				System.out.println("El envio a America del Norte es: " + (21*n));
			}
			if (p == 4) {
				System.out.println("El envio a America del Norte es: " + (10*n));
			}
			if (p == 5) {
				System.out.println("El envio a America del Norte es: " + (18*n));
			}
		}
		else {
			System.out.println("El número introducido es erroneo.");
		}
	}

}
