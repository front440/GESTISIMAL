/*
 Programa: Ejercicio12_Telefonoa.py

 Proposito: ULa política de cobro de una compañía telefónica es: 
 cuando se realiza una llamada, el cobro es por el tiempo que ésta 
 dura, de tal forma que los primeros cinco minutos cuestan 1 euro, los 
 siguientes tres, 80 céntimos, los siguientes dos minutos, 70
 céntimos, y a partir del décimo minuto, 50 céntimos. 
 Además, se carga un impuesto de 3 % cuando es domingo, y si es
 otro día, en turno de mañana, 15 %, y en turno de tarde, 10 %.
 Realice un algoritmo para determinar cuánto debe pagar por cada
 concepto una persona que realiza una llamada.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 18/10/2019

 Variables, algoritmos a usar
   * m     <-- Variable para almacenar los minutos de la llamada
   * p     <-- Variable para almaccenar el precio final de la llamada

 Analisis, Algoritmos
 La compañia irá cobrando la llamada según siga en curso, es decir, que
 con medida que vaya subiendo de minutos se irán aplicando las tarifas.
 Dice:
 Los primeros 5 minutos a 1€ :      m > 5  <-- m * 1€
 Del minuto 5 al 8 a 80cnt:         m > 8  <-- m + m * 0.8
 Del minuto 8 al 10 a 70cnt:        m > 10 <-- m + m * 0.7
 Del minuto 10 en adelante 50cnt:   10 < m <-- m + m * 0.5
 También nos cuenta que se le aplicará un recargo:
 de lunes a sabado:
 mañana    <-- 15%
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
		
		System.out.println("Este programa determinará el precio de una llamada telefónica.");
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("¿Cuantos minutos ha durado la llamada?");
		m = sc.nextInt();
		
		System.out.println("-----------------------------------------------------------------");

		System.out.println("¿Qué día de la semana ha hecho la llamada?");
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
		System.out.println("La llamada ¿ha hecho de mañana o de tarde?");
		System.out.println("1) Mañana");
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
