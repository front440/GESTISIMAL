package Ejercicios_Secuenciales;
import java.util.Scanner;

public class Ejercicio03_Hipotenusa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cateto1 = 0;
		int cateto2 = 0;
		
		System.out.println("Con este programa podremos saber la hipotenusa dados los catetos introducidos.");
		
		System.out.println("Introduce valor para cateto 1: ");
		cateto1 = sc.nextInt();
		
		System.out.println("Introduce valor para cateto 2: ");
		cateto2 = sc.nextInt();
		
		double hipotenusa = Math.sqrt( Math.pow(cateto1, 2) + Math.pow(cateto2, 2) );
		System.out.println("La hipotenusa es: " + hipotenusa);
	}

}
