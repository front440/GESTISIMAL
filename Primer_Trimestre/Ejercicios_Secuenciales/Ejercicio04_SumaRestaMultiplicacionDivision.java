/** Programa: Ejercicio4_SumaRestaMultiplicacionDivision.py
 Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.

 Autor : Francisco Javier Campos

 Fecha: 06/11/2019

 Alogoritmo

 Variables a usar:
   * valor1
   * valor2


 LEER 
 Suma <-- valor1 + valor2
 Resta <-- valor1 - valor2
 Multiplicación <-- valor1 * valor2
 División <--- valor1 / valor2

 Petición de datos 
 
 **/
package Ejercicios_Secuenciales;
import java.util.Scanner;

public class Ejercicio04_SumaRestaMultiplicacionDivision {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		
		//* Breve explicacion de lo hace el programa *//
		System.out.println("Con este programa sabremos el resultado de la suma, resta, multiplicacion y division de los números introducidos");
		
		// Leemos datos
		System.out.println("Introduce valor para numero 1: ");
		numero1 = sc.nextInt();
		
		System.out.println("Introduce valor para numero 2: ");
		numero2 = sc.nextInt();
		
		// Algoritmos
		double suma = numero1 + numero2;
		double resta = numero1 - numero2;
		double multiplicacion = numero2 * numero2;
		double division = numero1 / numero2;
		
		// Mostramos por pantalla el reultado de la operacion //
		System.out.println("El restultado de la suma es: " + suma);
		System.out.println("El restultado de la resta es: " + resta);
		System.out.println("El restultado de la multiplicacion es: " + multiplicacion);
		System.out.println("El restultado de la division es: " + division);

		


	}

}
