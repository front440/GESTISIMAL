/*
  Programa: DescuentoCompra.java

 Proposito: Una tienda ofrece un descuento del 15% sobre el total de 
 la compra y un cliente desea saber cuanto deberá pagar finalmente por su compra.

 Autor: Francisco Javier Campos Gutiérrez

 Fecha : 10/10/2019


 Variables a usar
 valorcompra       <-- total de la compra
 preciodescuento   <-- precio con descuento

 Algoritmo:
 preciodescuento   <-- valorcompra - 0.15
 */
package Ejercicios_Secuenciales;

import java.util.Scanner;

public class Ejercicio09_DescuentoCompra {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	double valorcompra = 0;
	double preciodescuento = 0;
	
	// Entrada de Datos
	System.out.println("Introduce valor de la compra: ");
	valorcompra = sc.nextDouble();
	
	// Calculo
	preciodescuento = valorcompra + (valorcompra * 0.15);
	
	// Salida de datos
	System.out.println("El valoar de la compra sin descuento es " + preciodescuento);
	
	
	}

}
