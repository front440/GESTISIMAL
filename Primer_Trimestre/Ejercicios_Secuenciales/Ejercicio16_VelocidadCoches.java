/*
 Programa: Ejercicio16_Ciclista.java

 Proposito: Un ciclista parte de una ciudad A a las HH horas, 
 MM minutos y SS segundos. El tiempo de viaje hasta llegar a otra
 ciudad B es de T segundos. Escribir un algoritmo que determine
  la hora de llegada a la ciudad B.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 08/11/2019


 Variables a usar
   * hs          <-- Hora de salida
   * ms          <-- Minuto de salida
   * ss          <-- Segundo de salida
   * ts    <-- hora de salida en segundos
###################################################
   * tt          <-- Tiempo que se tarda en llegar a la ciudad
   * mt          <-- Tiempo que se tarda en llegar a la ciudad
   * st          <-- Tiempo que se tarda en llegar a la ciudad
###################################################
   * hf          <-- Hora final
   * mf          <-- minutos finales
   * sf          <-- segundos finales

   * tf          <-- tiempo final
 */
package Ejercicios_Secuenciales;

import java.util.Scanner;

public class Ejercicio16_VelocidadCoches {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hs = 0;
		int ms = 0;
		int ss = 0;
		int ts = 0;
		
		int tt = 0;
		int mt = 0;
		int st = 0;
		
		int hf = 0;
		int mf = 0;
		int sf = 0;
		
		int tf = 0;
		
		int tiempo = 0;
		int tiempot = 0;
		
		// Entrada
		System.out.println("Introduce la hora de salida: ");
		hs = sc.nextInt();
		System.out.println("Introduce el minuto en el que sale: ");
		ms = sc.nextInt();
		System.out.println("Introduce el segundo en el que sale: ");
		System.out.println("-------------------------------------");
		System.out.println("Introduce la hora en la que llega: ");
		hs = sc.nextInt();
		System.out.println("Introduce el minuto en el que llega: ");
		ms = sc.nextInt();
		System.out.println("Introduce el segundo en el que llega: ");
		
		// Calculo
		tiempo = hs * 3600 + ms * 60 + ts;
		tiempot = tt * 3600 + mt * 60 + st;
		
		tiempo = tiempot - tiempo;
		
		hf = tiempo / 3600;
		mf = (tiempo % 3600) / 60;
		sf = (tiempo % 3600) % 60;
		
		// Salida
		System.out.println("-------------------------------------");
		System.out.println("El ciclista ha tardado: " + hf + "horas, "+ mf + "minutos, " + " y" + sf + " segundos.");
		
		

	}

}
