package poo;

public class TiempoTest {

  public static void main(String[] args) {

    Tiempo t1 = new Tiempo(1,1,1);
    Tiempo t2 = new Tiempo(2,2,2);

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
