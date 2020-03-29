package poo;

import java.util.InputMismatchException;
import java.util.Scanner;
import excepciones.TiempoIncorrectoError;

public class TiempoTest {

  public static void main(String[] args) throws TiempoIncorrectoError, InputMismatchException {

    boolean interruptor = true;

    Scanner sc = new Scanner(System.in);
    
    Tiempo t1 = null;
    Tiempo t2 = null;

    do {

      try {

        System.out.println("Introduce horas para tiempo 1: ");
        int h1 = sc.nextInt();
        System.out.println("Introduce minutos para tiempo 1: ");
        int m1 = sc.nextInt();
        System.out.println("Introduce segundos para tiempo 1: ");
        int s1 = sc.nextInt();

        t1 = new Tiempo(h1, m1, s1);

        System.out.println("Introduce horas para tiempo 2: ");
        int h2 = sc.nextInt();
        System.out.println("Introduce minutos para tiempo 2: ");
        int m2 = sc.nextInt();
        System.out.println("Introduce segundos para tiempo 2: ");
        int s2 = sc.nextInt();
        
        t2 = new Tiempo(h2, m2, s2);
        
        interruptor = false;

      } catch (TiempoIncorrectoError e) {
        System.err.println("Error al introducir los datos.");
        sc.nextLine();
        
        
      } catch (InputMismatchException e2) {
        System.err.println("Tipo de datos introducido incorrecto");
        
      }

    } while (interruptor);
    
      
    System.out.println("Tiempo 1: " + t1);
    System.out.println("Tiempo 2: " + t2); 

    // Método de suma
    t1.sumaTiempo(t2);
    System.out.println("Resultado de sumar " + t1);

    System.out.println("---------------------");
    Tiempo t3 = new Tiempo(5,5,5);
    Tiempo t4 = new Tiempo(2,2,2);
    System.out.println("Creamos t3 " + t3 +" y t4 " + t4 + " y los restamos");

    t3.restaTiempo(t4);
    System.out.println("Resultado " + t3);
    System.out.println("Sumamos 70 min a: " + t1);

    System.out.println("---------------------");
    t1.sumaMinutos(70);
    System.out.println(t1);

    System.out.println("Restamos 70 min a: " + t1);

    t1.restaMinutos(70);
    System.out.println(t1);

    System.out.println("Sumamos segundos");
    System.out.println("--------------------");
    System.out.println("Sumamos 120s a " + t1);
    t1.sumaSegundos(120);
    System.out.println("Resultado: " + t1);

    System.out.println("---------------------");
    System.out.println("Restamos segundos");
    System.out.println("Restamos 120s a " + t1);
    t1.restaSegundos(120);
    System.out.println("Resultado: " + t1); 



  }

}
