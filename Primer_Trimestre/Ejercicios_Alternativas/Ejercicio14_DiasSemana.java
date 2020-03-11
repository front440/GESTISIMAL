/*
 # Programa: Ejercicio11_Viaje.java
#
# Proposito: Realiza un programa que pida el día de la semana
# (del 1 al 7) y escriba el día correspondiente. Si introducimos otro
# número nos da un error.
#
# Autor: Francisco Javier Campos Gutiérrez
#
# Fecha : 18/10/2019
#
# Variables, algoritmos a usar
#   * n     <-- numero introducido
 */
package Ejercicios_Alternativas;

import java.util.Scanner;

public class Ejercicio14_DiasSemana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		
		System.out.println("Con este programa podremos que número le corresponde a cada dia de la semana.");
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Introduce el numero: ");
		n = sc.nextInt();
		
		// Desarrollo
		if (n > 1 && n < 7) {
			
			if (n == 1) {
				System.out.println("El número 1 le corresponde al Lunes");
			}
			else if (n ==2 ) {
				System.out.println("El número 2 le corresponde al Martes");
			}
			else if (n ==3 ) {
				System.out.println("El número 3 le corresponde al Miércoles");
			}
			else if (n ==4 ) {
				System.out.println("El número 4 le corresponde al Jueves");
			}
			else if (n ==5 ) {
				System.out.println("El número 5 le corresponde al Viernes");
			}
			else if (n == 6){
				System.out.println("El número 6 le corresponde al Sábado");
			}
			else {
				System.out.println("El número 7 le corresponde al Domingo");
			}
		}
		else {
			System.out.println("Número introducido erroneo");
		}

	}

}
