/*
 Programa: Ejercicio6_Media_de_3Numeros.java
 Calcular la media de tres números pedidos por teclado.

 Autor : Francisco Javier Campos

 Fecha: 06/11/2019

 Alogoritmo

 Variables a usar:
   * numero1 : leer valor1
   * numero2 : leer valor2
   * numero3 : leer valor3
   * media : resultado de calcular los 3 valores

 LEER media
 media <-- (numero1 + numero2 + numero3) / 3
*/
package Ejercicios_Secuenciales;
import java.util.Scanner;

public class Ejercicio06_Media_de_3Numeros {

	public static void main(String[] args) {
		
		double numero1 = 0;
		double numero2 = 0;
		double numero3 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este programa nos permite saber la media de 3 números");
		
		// Leer datos
		System.out.println("Introduce numero 1: ");
		numero1 = sc.nextDouble();
		
		System.out.println("Introduce numero 2: ");
		numero2 = sc.nextDouble();
		
		System.out.println("Introduce numero 3: ");
		numero3 = sc.nextDouble();
		
		// Algoritmo
		double media = (numero1 + numero2 + numero3) / 3;
		
		// Salida de datos
		System.out.println("La media es: " + media);

	}

}
