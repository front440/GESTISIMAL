package poo;

public class DateTest {

  public static void main(String[] args) {

    System.out.println("Prueba de fechas");
    System.out.println("----------------");
    Date f1 = new Date(15,2,2020);
    System.out.println("Creamos f1: " + f1);
    System.out.println("----------------");
    System.out.println("Llamamos al método suma 1 dia: " + f1.moreDay());
    System.out.println("----------------");
    System.out.println("Llamamos al método resta 1 dia: " + f1.removeDay());
    System.out.println("----------------");
    System.out.println("Sumamos 5 a la fecha: " + f1.addNDay(5));
    System.out.println("----------------");
    System.out.println("Restamos 5 a la fecha: " + f1.removeNDay(5));
    System.out.println("----------------");
    Date f2 = new Date(10,2,2020);
    System.out.println("Comparamos si f1 con f2: " + f1.equals(f2));
    System.out.println("----------------");
    System.out.println("Comparamos si f1 es mayor que f2: " + f1.greaterThan(f2));
    System.out.println("----------------");
    System.out.println("Comparamos si f1 es menor que f2: " + f1.smallerThan(f2));

    

  }

}
