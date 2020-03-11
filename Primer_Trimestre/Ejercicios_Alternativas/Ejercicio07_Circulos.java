/*
Programa: Ejercicio07_Circulos.py
Proposito: Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos 
circunferencias y las clasifique en uno de estos estados:

 Exteriores
 Tangentes exteriores
 Secantes
 Tangentes interiores
 Interiores
 Concéntricas

 El exponente sea positivo, sólo tienes que imprimir la potencia.
 El exponente sea 0, el resultado es 1.
 El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 10/11/2019

 Variables a usar
   * x1 <-- valor para x1, circunferencia 1
   * y1 <-- valor para 11, circunferencia 1
   * y2 <-- valor para x1, circunferencia 2
   * x2 <-- valor para x1, circunferencia 2
   * distancia <-- Valor de la distancia entre centros

 Algoritmo, Casos:
   Calcular distancia:
   math.sqrt(math.pow((x2-x1),2)+math.pow((y2-y1),2))
   Exteriores:
   La distancia entre los centros, d, es mayor que la suma de los radios.
   Las circunferencias no tienen puntos en común.

   Secantes:
   La distancia d es menor que la suma de los radios y mayor que su diferencia.
   Tienen dos puntos en común.

   Interiores:
   La distancia entre los centros es mayor que cero y menor que la diferencia entre los radios.
   Una circunferencia está dentro de la otra, y por tanto no tienen puntos en común.

   Tagentes Exteriores:
   La distancia entre los centros es igual a la suma de los radios.
   El centro de cada circunferencia es exterior a la otra y tienen un punto en común, punto de tangencia.

   Tagentes Interiores:
   La distancia entre los centros es igual a la diferencia entre los radios.
   El centro de una de las circunferencias está dentro de la otra. Tienen un punto en común.

   Concéntricas:
   Tienen el mismo centro. La distancia d=0.
   No tienen puntos en común, salvo que R=R', en este caso son la misma circunferencia.

 */
package Ejercicios_Alternativas;

import java.util.Scanner;

public class Ejercicio07_Circulos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x1 = 0;
		int y1 = 0;
		int r1 = 0;
		
		int x2 = 0;
		int y2 = 0;
		int r2 = 0;
		int distancia = 0;
		
		// Entrada de datos
		System.out.println("Posicion de x1: ");
		x1 = sc.nextInt();
		System.out.println("Posicion de y1: ");
		y1 = sc.nextInt();
		System.out.println("Posicion de r1: ");
		r1 = sc.nextInt();
		
		System.out.println("Posicion de x2: ");
		x2 = sc.nextInt();
		System.out.println("Posicion de y2: ");
		y2 = sc.nextInt();
		System.out.println("Posicion de r3: ");
		r2 = sc.nextInt();
		
		// Calculo
		distancia = (int) Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		// Salida
		if (distancia > (r1 + r2)) {
			System.out.println("Estamos hablando de que la relación entre las circunferencia es Exterior.");
		}
		else if (distancia < (r1+2) || distancia > Math.abs(r1-r2)) {
			System.out.println("Estamos hablando de que la relación entre las circunferencia es Exterior.");
		}
		else if (distancia > 0 || distancia < Math.abs(r1-r2)) {
			System.out.println("Estamos hablando de que la relación entre las circunferencia es Interior.");
		}
		else if (distancia == (r1 + r2)) {
			System.out.println("Estamos hablando de que la relación entre las circunferencia es Tangente Exterior.");
		}
		else if (distancia == (r1 - r2)) {
			System.out.println("Estamos hablando de que la relación entre las circunferencia es Tangente Interior.");
		}
		else if (distancia == 0) {
			System.out.println("Estamos hablando de que la relación entre las circunferencia es Concentrica");
		}
		
	}

}
