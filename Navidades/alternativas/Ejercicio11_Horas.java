package alternativas;

import java.util.Scanner;

/**
 * 
 * @author Francisco
 * 
 * Enunciado: Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 *
 */

public class Ejercicio11_Horas {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int hora=0;
    int minuto=0;
    int segundosInsertados;
    int segundosRestantes;
    
    System.out.println("Introduce la hora: ");
    hora = sc.nextInt();
    
    System.out.println("Introduce los minutos: ");
    minuto = sc.nextInt();
    
    segundosInsertados=(hora * 3600) + (minuto * 60);
    segundosRestantes=86400-segundosInsertados;
    
    System.out.println(segundosRestantes + " segundos son los que faltan para llegar a \n"
        + "medianoche");
    
    
    

  }

}
