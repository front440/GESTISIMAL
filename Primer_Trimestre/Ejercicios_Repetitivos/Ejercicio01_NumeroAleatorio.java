package Ejercicios_Repetitivos;

import java.util.Scanner;

public class Ejercicio01_NumeroAleatorio {
	static final int intentos_maximos = 10;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int intentos;
		int n;
		int numSecreto =(int) (Math.random()*100 + 1);
		
		System.out.println("Adivine el numero (de 1 a 100):");
		n = sc.nextInt();
		intentos = intentos_maximos -1;
		
		while (numSecreto != n && intentos>0) {
			if (n < numSecreto) {
				System.out.println(n + " es menor que el número intrdocido");
			}
			else {
				System.out.println(n + " es mayor que el numero introducido");
			}
			System.out.println("Te quedan " + intentos + " intentos:");
			System.out.println("Dame otro número de 1 a 100");
			n = sc.nextInt();
			intentos--;
		}
		if (n == numSecreto) {
			System.out.println("Has adivinado el número en " + intentos+ " intentos");
		}
		else {
			System.out.println("Te has quedado sin intentos, el número era: " + numSecreto);
		}
		
	}

}
