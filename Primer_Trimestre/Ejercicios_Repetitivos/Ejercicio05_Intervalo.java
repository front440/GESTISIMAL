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
		
		System.out.println("Este programa nos dir� la suma de los n�meros entre un intervalo");
		System.out.println("Tambi�n los n�meros iguales a �l y los que est�n fuera de �l");
		System.out.println("Mediante el n�mero , saldremos del programa");
		System.out.println("----------------------------------------------------------------");
		
		// Entrada de Datos
		System.out.println("Introduce n�mero para intervalo menor: ");
		intervaloMenor = sc.nextInt();
		
		System.out.println("Introduce n�mero para intervalo mayor: ");
		intervaloMayor = sc.nextInt();
		System.out.println("----------------------------------------------------------------");

		
		while ( intervaloMenor >= intervaloMayor) {
			System.out.println("El intervalo menor no puede ser mayor que el intervalo mayor");
			System.out.println("Vuelva a introducir un n�mero");
			
			System.out.println("Introduce n�mero para intervalo menor: ");
			intervaloMenor = sc.nextInt();
		}
		// Una vez esten los n�meros entre el intervalo, procedemos a hacer las operaciones
		System.out.println("Introduce n�meros: ");
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
			System.out.println("Introduce n�meros: ");
			num = sc.nextInt();	
		}
		// Salida de datos
		System.out.println("La suma de los n�mero del intervalo es: " + totalSuma);
		System.out.println("Hay un total de:" + fueraIntervalo + " n�meros fuera del intervalo");
		System.out.println("Adem�s, tenemos " + igualIntervalo + " igual al numero mayor y menor del intervalo.");
			
		}


	

}
