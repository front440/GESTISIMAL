/*
 Programa: PreguntarNombre.java
 Este programa nos pregunta como nos llamamos y nos saluda.

 Autor : Francisco Javier Campos

 Fecha: 06/11/2019

 Variables a usar:

   nombre --> Nombre introducido
*/


package Ejercicios_Secuenciales;
import java.util.Scanner;


public class Ejercicio01_Nombre {
	public static void main(String[] args) {
	Scanner nombre = new Scanner(System.in);
	
	// Pregunta Nombre //
	System.out.println("¿Como te llamas?");
	
	// Recoge datos
	String nombreUsuario = nombre.nextLine();
	
	// Salida de datos
	System.out.println("Hola "+ nombreUsuario + ", encantado.");

	}
}
