package Ejercicios_Repetitivos;

import java.util.Scanner;

public class Ejercicio14_SubcadenaEnCadena {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Variables
		String cadena;
		String subcadena;
		boolean estaSubcadena = false;
		int comprobarHasta;
		
		
		
		System.out.println("Este programa encontra una frase dentro de la principal");
		System.out.println("-------------------------------------------------------");
		
		// Entrada de primera cadena
		System.out.println("Introduce una frase:");
		cadena = sc.nextLine();
		
		System.out.println("Introduce lo que quieras buscar: ");
		subcadena = sc.nextLine();
		
		comprobarHasta = cadena.length()-subcadena.length();
		
		for (int i=0 ; i<=comprobarHasta && !subcadena.length(); i++);
			String subc = cadena.substring(i,i+subcadena.length());
			if (cadena.substring(i, i+subcadena.length()).equals(subcadena)) {
				estaSubcadena = true;
				}
		if (estaSubcadena) {
			System.out.println("Genial");
		}
		else {
			System.out.println("Mal");
		}
			
				
			}
		


	}

}
