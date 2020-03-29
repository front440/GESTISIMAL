package poo;

import java.util.InputMismatchException;
import java.util.Scanner;

import excepciones.DimensionRectanguloError;

public class RectanguloTest {
   

    public static void main(String[] args) throws excepciones.DimensionRectanguloError, InputMismatchException {

      Scanner sc = new Scanner (System.in);

      Rectangulo r1 = null;
      Rectangulo r2 = null;
      
      boolean interruptor = true;

      do {

        try {
          
          System.out.println("Introduce la base para el rect�ngulo r1: ");
          int baseR1 = sc.nextInt();
          System.out.println("Introduce la altura para el rect�ngulo r1: ");
          int alturaR1 = sc.nextInt();
          r1 = new Rectangulo(baseR1, alturaR1);
          
          System.out.println("Introduce la base para el rect�ngulo r2: ");
          int baseR2 = sc.nextInt();
          System.out.println("Introduce la altura para el rect�ngulo r2: ");
          int alturaR2 = sc.nextInt();
          r2 = new Rectangulo(baseR2, alturaR2);
          
          interruptor = false;

        } catch (DimensionRectanguloError e) {
          System.err.println("Error al dar las dimensiones");
          sc.nextLine();
          //System.exit(1);
          
        }
        
        catch (InputMismatchException e2) {
          
          System.err.println("Introduce un n�mero entero, por favor");
          sc.nextLine();
          //System.exit(2);
        }

      } while (interruptor);



      // Comprobamos todos los m�todos creados para la clase Rect�ngulo

      System.out.println("TEST PARA COMPROBAR LOS M�TODOS DE LA CLASE RECT�NGULO: ");
      System.out.println("---------------------------------------------------------");
      System.out.println("Valores del r�ctangulo r1: " + r1);
      System.out.println("Valores del r�ctangulo r2: " + r2);
      System.out.println("----------------------------------");
      System.out.println("Mostramos el rect�ngulo r1: ");
      System.out.println();
      System.out.println(r1.dibujaRectangulo());
      System.out.println("----------------------------------");
      System.out.println("Mostramos el rect�ngulo r2: ");
      System.out.println();
      System.out.println(r2.dibujaRectangulo());
      System.out.println("----------------------------------");
      System.out.println("El per�metro del rect�ngulo r1 es: " + r1.calculaPerimetro() + " cm");
      System.out.println("El per�metro del rect�ngulo r2 es: " + r2.calculaPerimetro() + " cm");
      System.out.println("------------------------------------------");
      System.out.println("El �rea del rect�ngulo r1 es: " + r1.calculaArea() + " cm cuadrados");
      System.out.println("El �rea del rect�ngulo r2 es: " + r2.calculaArea() + " cm cuadrados");
      System.out.println("----------------------------------------------");
      System.out.println("�Resultado de comparar el rect�ngulo r1 con el rect�ngulo r2?: " + r1.comparaRectangulos(r2));
      System.out.println("-----------------------------------------------------------------");
      System.out.println("�Son gemelos los rect�ngulos r1 y r2?: " + r1.esGemelo(r2));
      System.out.println("-----------------------------------------------");
      System.out.println("Cantidad de rect�ngulos creados: " + Rectangulo.NUMRECTANGULOSCREADOS + " rectangulos");
      System.out.println("--------------------------------------------------");
      System.out.println("�Cual es la base y altura m�xima de los rect�ngulos creados: " + Rectangulo.LADOMAXIMO);
      System.out.println("-------------------------------------------------------------------");


    }

  }


