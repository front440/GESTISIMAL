/* 
Programa: Ejercicio5_GradosF_a_GradoC.java
 Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.

 Autor : Francisco Javier Campos

 Fecha: 06/11/2019

 Alogoritmo

 Variables a usar:
   * gradosf : Grados en unidad Fahrenheit
   * gradosc : Grados en unidad Celsius
*/

package Ejercicios_Secuenciales;
import java.util.Scanner;

public class Ejercicio05_GradosF_a_GradoC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int gf = 0;
		int gc = 0;
		
		System.out.println("Este programa nos pasará los grados fahrenheit a celsius ");

		// Peticion de datos
		System.out.println("introduce cuantos grados fahrenheit quieres pasar a celsius: ");
		gf = sc.nextInt();
		
		// Algorimo
		gc = (gf - 32)* 5 / 9;
		
		
		// Salida de datos
		System.out.println("El resultado de la conversion es: "+ gc);
 
	}

}
