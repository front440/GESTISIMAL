package poo;

import java.util.InputMismatchException;
import java.util.Scanner;

import excepciones.FechaIncorrectaError;
import excepciones.TiempoIncorrectoError;

public class FechaTest {

  public static void main(String[] args) throws TiempoIncorrectoError, InputMismatchException {
    Scanner sc = new Scanner(System.in);

    Fecha f1 = null;
    Fecha f2 = null;

    boolean interruptor = true;

    do {
      try {

        System.out.println("Introduce el dia: ");
        int dia1 = sc.nextInt();
        System.out.println("Introduce el mes: ");
        int mes1 = sc.nextInt();
        System.out.println("Introduce el anio: ");
        int anio1 = sc.nextInt();
        f1 = new Fecha(dia1, mes1, anio1);

        System.out.println("Introduce el dia: ");
        int dia2 = sc.nextInt();
        System.out.println("Introduce el mes: ");
        int mes2 = sc.nextInt();
        System.out.println("Introduce el anio: ");
        int anio2 = sc.nextInt();
        f2 = new Fecha(dia2, mes2, anio2);
        
        interruptor = false;  

      } catch (FechaIncorrectaError e) {
        System.err.println("Fecha introducida incorrectamente mal");
        
        //System.out.println("Pulsa tecla para continuar: ");

      } catch (InputMismatchException e2) {
        System.err.println("Tipo de dato incorrecto ");
        sc.next();
      }
      
    } while (interruptor);

    System.out.println("Fecha 1: " + f1);
    System.out.println("Fecha 2: " + f2);
    System.out.println("¿Son las fechas iguales?: " + f1.igualQue(f2));
    System.out.println("¿Es la primera fecha mayor que la segunda?: " + f1.mayorQue(f2));
    System.out.println("¿Es la primera fecha menor que la segunda?: " + f1.menorQue(f2));
    System.out.println("Fecha mas 1 dia: " + f1.fechaMas1Dia());
    System.out.println("Fecha menos 1 dia: " + f1.fechaMenos1Dia());
    System.out.println("Fecha mas 10 dias: " + f1.fechaMasNDias(10));
    System.out.println("Fecha menos 31 dias: " + f1.fechaMenosNDias(31));





  }

}
