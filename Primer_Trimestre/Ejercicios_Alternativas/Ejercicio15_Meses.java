package Ejercicios_Alternativas;

import java.util.Scanner;

public class Ejercicio15_Meses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		
		System.out.println("Con este programa podremos que número le corresponde a cada dia de la semana.");
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Introduce el numero: ");
		n = sc.nextInt();
		
		// Desarrollo
		if (n > 1 && n < 12) { 
			if (n == 1) {
				System.out.println("Corresponde con Enero y tiene 31");
			}
			else if (n ==2 ) {
				System.out.println("Corresponde con Febrero y tiene 28, menos los bisiestos que cuenta con 29");
			}
			else if (n ==3 ) {
				System.out.println("Corresponde con Marzo y tiene 31");
			}
			else if (n ==4 ) {
				System.out.println("Corresponde con Abril y tiene 30");
			}
			else if (n ==5 ) {
				System.out.println("Corresponde con Mayo y tiene 31");
			}
			else if (n == 6){
				System.out.println("Corresponde con Junio y tiene 30");
			}
			else if (n == 7){
				System.out.println("Corresponde con Julio y tiene 31");
			}
			else if (n == 8){
				System.out.println("Corresponde con Agosto y tiene 31");
			}
			else if (n == 9){
				System.out.println("Corresponde con Septiembre y tiene 30");
			}
			else if (n == 10){
				System.out.println("Corresponde con Octubre y tiene 31");
			}
			else if (n == 11){
				System.out.println("Corresponde con Noviembre y tiene 30");
			}
			else {
				System.out.println("Corresponde con Diciembre y tiene 31");
			}
		}
		else {
			System.out.println("Número introducido erroneo");
		}
		

	}

}
