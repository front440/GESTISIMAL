package Ejercicios_Secuenciales;
import java.util.Scanner;


public class Ejercicio02_Perimetro {
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
			
		int lado1 = 0;
		int lado2 = 0;
		
		System.out.println("Este programa calcula el perímetro y area de un rectángulo");
	
			System.out.println("Introduce el valor del lado 1: ");
			lado1 = sc.nextInt();
		
			System.out.println("Introduce el valor del lado 2: ");
			lado2 = sc.nextInt();
			
			int perimetro = lado1*2 + lado2*2;
			int area = lado1 * lado2;
			
			System.out.println("El perimetro es: " + perimetro + "metros.");
			System.out.println("El area es: " + area + "metros cuadrados.");
			
					
	}

}
