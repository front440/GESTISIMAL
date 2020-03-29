package poo;

import utiles.Teclado;

public class FraccionTest {

  public static void main(String[] args) {

    System.out.println("Test de fracci�n");
    
    int n = Teclado.getEntero("Introduce el numerador: ");
    int d = Teclado.getEntero("Introduce el denominador: ");
    
    
    Fraccion f1 = new Fraccion(n,d);
    
    System.out.println("Creamos fracci�n f1: " + f1);
    System.out.println("--------------------------");
    System.out.println("Calculamos resultado real de f1: " + f1);
    System.out.println(f1.resultadoReal());
    System.out.println("--------------------------");
    System.out.println("Multiplicamos la fraccion por 5");
    System.out.println(f1.multiplicaNumero(5));
    System.out.println("--------------------------");

    Fraccion f2 = new Fraccion(7, 4);
    System.out.println("Creamos la fracci�n f2: " + f2);
    System.out.println("Sumamos " + f1 + " a "+ f2);
    f1.sumaFraccion(f2);
    System.out.println("Resultado de la fracci�n: " + f1);
    System.out.println("--------------------------");
    System.out.println("Restamos " + f1 + " a "+ f2);
    f1.sumaFraccion(f2);
    System.out.println("Resultado de la fracci�n: " + f1);
    System.out.println("--------------------------");
    System.out.println("Simplificamos la fraccion f1: " + f1);
    f1.simplifica();
    System.out.println("Resultado de simplificar: " + f1);
    

  }

}
