package Ejercicios_Repetitivos;

import java.util.Scanner;

public class Ejercicio05_Intervalo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Variables
		int num = 0;
		int intervaloMenor = 0;
		int intervaloMayor = 0;
		int igualIntervalo = 0;
		int totalSuma = 0;
		int fueraIntervalo = 0;
		
		System.out.println("Este programa nos dirá la suma de los números entre un intervalo");
		System.out.println("También los números iguales a él y los que están fuera de él");
		System.out.println("Mediante el número , saldremos del programa");
		System.out.println("----------------------------------------------------------------");
		
		// Entrada de Datos
		System.out.println("Introduce número para intervalo menor: ");
		intervaloMenor = sc.nextInt();
		
		System.out.println("Introduce número para intervalo mayor: ");
		intervaloMayor = sc.nextInt();
		System.out.println("----------------------------------------------------------------");

		
		while ( intervaloMenor >= intervaloMayor) {
			System.out.println("El intervalo menor no puede ser mayor que el intervalo mayor");
			System.out.println("Vuelva a introducir un número");
			
			System.out.println("Introduce número para intervalo menor: ");
			intervaloMenor = sc.nextInt();
		}
		// Una vez esten los números entre el intervalo, procedemos a hacer las operaciones
		System.out.println("Introduce números: ");
		num = sc.nextInt();
		
		while ( num != 0 ) {
			if (num == intervaloMenor || num == intervaloMayor ) {
				igualIntervalo +=1;
			}
			else if ( num > intervaloMenor || num < intervaloMayor ) {
				totalSuma = totalSuma + num;
			}
			else {
				fueraIntervalo += 1;
			}
			System.out.println("Introduce números: ");
			num = sc.nextInt();	
		}
		// Salida de datos
		System.out.println("La suma de los número del intervalo es: " + totalSuma);
		System.out.println("Hay un total de:" + fueraIntervalo + " números fuera del intervalo");
		System.out.println("Además, tenemos " + igualIntervalo + " igual al numero mayor y menor del intervalo.");
			
		}


	

}
