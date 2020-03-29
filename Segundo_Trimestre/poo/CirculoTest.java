package poo;

import java.util.InputMismatchException;
import java.util.Scanner;

import excepciones.RadioNegativoError;

public class CirculoTest {

  public static void main(String[] args) throws RadioNegativoError, InputMismatchException {
    Scanner sc = new Scanner (System.in);


    Circulo c1 = null;
    boolean interruptor = true;

    do {
      try {

        System.out.println("Introduce un radio: ");
        double r = sc.nextDouble();
        
        c1 = new Circulo(r);
        
        interruptor = false;

      } catch (RadioNegativoError e) {
        System.err.println("El radio no puede ser negativo");
      } catch (InputMismatchException e) {
        System.err.println("Tipo de radio incorrecto");
      }

    } while (interruptor);

    System.out.println("Mostramos el radio del circulo: " + c1);
    System.out.println("El área del circulo es: " + c1.area());
    System.out.println("Radio del circulo despues de crecer 27 veces: " + c1.crece(27));
    System.out.println("El área del circulo es: " + c1.area());
    System.out.println("Radio del circulo después de menguar 10 veces:" + c1.mengua(10));
    System.out.println("Mostramos el estado final del circulo: " + c1);


  }
}


