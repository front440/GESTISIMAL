package Ejercicios_Repetitivos;

import java.util.Scanner;

public class Ejercicio03_Vocal {

	//static final int espacioBlanco = ' ';
	
	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);
		char c;
		
		
		System.out.println("Este programa nos dirá si el caracter introducido es vocal o consonante.");
		System.out.println("-----------------------------------------------------------------------.");
		
		System.out.println("Con un espacio acabaras el programa.");
		System.out.println("Introduce un caracter:");
		c = sc.next().toLowerCase().charAt(0);
		
		while ( c != ' ' ) {
			if (( c == 'a' ) || ( c == 'e') || ( c =='i' ) || ( c == 'o' ) || ( c == 'u' )) {
				System.out.println("El caracter introducido es una vocal.");
			}
			
			else {
				System.out.println("No es una vocal");
			}
			System.out.println("-----------------------------------------------------------------------.");

			System.out.println("Con un espacio acabaras el programa.");
			System.out.println("Introduce un caracter:");
			c = sc.next().toLowerCase().charAt(0);
			
		}
		System.out.println("Te has salido de programa.");

	}

}
