/*
 Programa: Ejercicio12_Telefonoa.py

 Proposito: ULa pol�tica de cobro de una compa��a telef�nica es: 
 cuando se realiza una llamada, el cobro es por el tiempo que �sta 
 dura, de tal forma que los primeros cinco minutos cuestan 1 euro, los 
 siguientes tres, 80 c�ntimos, los siguientes dos minutos, 70
 c�ntimos, y a partir del d�cimo minuto, 50 c�ntimos. 
 Adem�s, se carga un impuesto de 3 % cuando es domingo, y si es
 otro d�a, en turno de ma�ana, 15 %, y en turno de tarde, 10 %.
 Realice un algoritmo para determinar cu�nto debe pagar por cada
 concepto una persona que realiza una llamada.

 Autor: Francisco Javier Campos Guti�rrez

 Fecha : 18/10/2019

 Variables, algoritmos a usar
   * m     <-- Variable para almacenar los minutos de la llamada
   * p     <-- Variable para almaccenar el precio final de la llamada

 Analisis, Algoritmos
 La compa�ia ir� cobrando la llamada seg�n siga en curso, es decir, que
 con medida que vaya subiendo de minutos se ir�n aplicando las tarifas.
 Dice:
 Los primeros 5 minutos a 1� :      m > 5  <-- m * 1�
 Del minuto 5 al 8 a 80cnt:         m > 8  <-- m + m * 0.8
 Del minuto 8 al 10 a 70cnt:        m > 10 <-- m + m * 0.7
 Del minuto 10 en adelante 50cnt:   10 < m <-- m + m * 0.5
 Tambi�n nos cuenta que se le aplicar� un recargo:
 de lunes a sabado:
 ma�ana    <-- 15%
 tarde     <-- 10%
 Domingo   <-- 3%

 */
package Ejercicios_Alternativas;

import java.util.Scanner;

public class Ejercicio12_Telefonia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = 0;
		int t = 0;
		int d = 0;
		
		System.out.println("Este programa determinar� el precio de una llamada telef�nica.");
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("�Cuantos minutos ha durado la llamada?");
		m = sc.nextInt();
		
		System.out.println("-----------------------------------------------------------------");

		System.out.println("�Qu� d�a de la semana ha hecho la llamada?");
		// Menu
		System.out.println("1) Lunes");
		System.out.println("2) Martes");
		System.out.println("3) Miercoles");
		System.out.println("4) Jueves");
		System.out.println("5) Viernes");
		System.out.println("6) Sabado");
		System.out.println("7) Domingo");
		d = sc.nextInt();
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("La llamada �ha hecho de ma�ana o de tarde?");
		System.out.println("1) Ma�ana");
		System.out.println("2) Tarde");
		t = sc.nextInt();
		
		// Desarrollo
		if (m < 5) {
			System.out.println("La llamada tien un precio base de:"+  m * 1  );
			if (m > 5 && m < 8) {
				System.out.println("La llamada tiene un precio base de: " +  (m*0.8+5-5));
			}
			else if (m > 8 && m < 10 ) {
				System.out.println("La llamada tiene un precio base de: " + (m*0.5+5+2.4+1.4-10));
			}
		if (d == 1 || d == 2 || d == 3 || d == 4 || d == 5 || d == 6 && t == 1) {
			System.out.println("El coste de la llamada es:" + (m + m*0.15));
		}
		else if (d == 1 || d == 2 || d == 3 || d == 4 || d == 5 || d == 6 && t == 2) {
			System.out.println("El coste de la llamada es: " + (m + m*0.1));
		}
		else {
			System.out.println("El coste de la llamda es: " + (m + m*0.3));
			
		}
		
		}
		
		
		
		
		

	}

}
