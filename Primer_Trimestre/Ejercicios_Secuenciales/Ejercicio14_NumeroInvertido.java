package Ejercicios_Secuenciales;

import java.util.Scanner;

public class Ejercicio14_NumeroInvertido {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int cifra1 = 0;
		int cifra2 = 0;
		int invertido = 0;
		
		System.out.println("Este programa invertira el orden de un número de dos cifras");
		
		// Entrada
		System.out.println("Introduce número de dos cifras: ");
		numero = sc.nextInt();
		
		// Calculo
		cifra1 = numero / 10;
		cifra2 = numero % 10;
		invertido = cifra2 * 10 + cifra1;
		
		// Salida
		System.out.println("El número invertido es: "+ invertido);
		

	}

}
