/*
 Programa: Ejercicio8_Sueldo
 Proposito: Un vendedor recibe un sueldo base mas un 10% extra por 
 comisión de sus ventas, el vendedor desea saber cuanto dinero obtendrá 
 por concepto de comisiones por las tres ventas que realiza en el mes y 
 el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 07/10/2019


 Variables a usar
 sueldobase   <-- Sueldo sin comision del trabajador
 venta1      <-- Resultado de calcular el 10% de la venta
 venta2      <-- Resultado de calcular el 10% de la venta
 venta3      <-- Resultado de calcular el 10% de la venta
 sueldobruto <-- Sueldo bruto

 Algoritmo:
 venta1        <-- venta1 / 10 
 venta2        <-- venta2 / 10 
 venta3        <-- venta3 / 10 
 comision     	<-- suma de valor1, valor2, valor3
 total    		<-- sueldobruto - comision
*/
package Ejercicios_Secuenciales;
import java.util.Scanner;

public class Ejercicio08_Sueldo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double sueldobase = 0;
		double venta1 = 0;
		double venta2 = 0;
		double venta3 = 0;
		double total = 0;
		double comision = 0;
		
		System.out.println("Este programa será capaz de transformar una cantidad de minutos a horas y minutos.");

		System.out.println("Introduce precio base: ");
		sueldobase = sc.nextDouble();
		
		System.out.println("Introduce valor de venta 1: ");
		venta1 = sc.nextDouble();
		
		System.out.println("Introduce valor de venta2: ");
		venta2 = sc.nextDouble();
		
		System.out.println("Introduce valor de venta3: ");
		venta3 =  sc.nextDouble();
		
		// Calculo de datos
		venta1 = venta1 / 10;
		venta2 = venta2 / 10;
		venta3 = venta3 / 10;
		total = sueldobase + venta1 + venta2 + venta3;
		comision = venta1 + venta2 + venta3;
		
		// Salida
		System.out.println("El trabajador recibirá" + venta1 + "euros por venta1");
		System.out.println("El trabajador recibirá" + venta2 + "euros por venta1");		
		System.out.println("El trabajador recibirá" + venta3 + "euros por venta1");
		System.out.println("El total de " + sueldobase + " más " + comision + " da un sueldo de " + total);
		
	}

}
