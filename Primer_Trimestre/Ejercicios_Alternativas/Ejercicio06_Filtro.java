/*
 Programa: Ejercicio06_Filtro.java
 Proposito: Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el 
 mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a 
 dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe 
 imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.

 El exponente sea positivo, sólo tienes que imprimir la potencia.
 El exponente sea 0, el resultado es 1.
 El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 16/10/2019

 Variables a usar
   * nota <-- Almacenamos la nota
   * edad <-- Almacenamos edad introducida
   * sexo <-- Almacenamos, masculino o femenino
 */
package Ejercicios_Alternativas;

import java.nio.charset.Charset;
import java.util.Scanner;

public class Ejercicio06_Filtro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nota = 0;
		int edad = 0;
		char sexo;
		
		System.out.println("Este programa nos dirá que tipo de persona nos hará falta.");
		
		System.out.println("Introduzca la nota: ");
		nota = sc.nextInt();
		
		System.out.println("Introduzca tu edad: ");
		edad = sc.nextInt();
		
		System.out.println("Introduce sexo (M/F): ");
		sexo = sc.next().charAt(0);
		
		// Cálculo
		if ( nota >= 5 ) {
			if ( edad >= 18 ) {
				if ( sexo  == 'F') {
					System.out.println("Estás admintida");
				}
				else  {
					System.out.println("Eres un posible candidato");
				}
			}
		}
		else {
			System.out.println("No estás admitido");
		}
		
		
	}

}
