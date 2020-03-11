package secuenciales;

import java.util.Scanner;

public class Ejercicio09_VolumenCono {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int altura;
    int base;
    double volumen;
    
    System.out.println("Escribe un programa que calcule el volumen de un cono");
    System.out.println("-----------------------------------------------------");
    
    System.out.println("Introduce la altura del cono: ");
    altura = sc.nextInt();
    
    System.out.println("Introduce la base del cono: ");
    base = sc.nextInt();
    
    volumen = (Math.PI*Math.pow(base, 2)*altura)/3;
    System.out.println("El volumen del cono es: " + volumen);
    
    
  }

}
