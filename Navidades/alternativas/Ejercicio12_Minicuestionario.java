package alternativas;

import java.util.Scanner;

public class Ejercicio12_Minicuestionario {

  public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    int solucion;
    int notafinal=0;

    System.out.println("Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas\n" + 
        "que se imparten en el curso. Cada pregunta acertada sumará un punto y la mal respondida \n" + 
        "restará 0.5 .El programa mostrará al final la calificación obtenida.");

    System.out.println("----------------------------------------------------------------------------");

    System.out.println("El número 1010 en binario se representa en decimal como:");
    System.out.println("1) 8");
    System.out.println("2) 12");
    System.out.println("3) 16");
    System.out.println("4) Las anteriores respuestas no son correctas ");

    System.out.println("Introduce la solución: ");
    solucion= sc.nextInt();

    if (solucion==4) {
      notafinal++;
    }
    else {
      notafinal-=0.5;
    }

    System.out.println("");

    System.out.println("Imperativo, declarativo y orientado a objetos son:");
    System.out.println("1) Modos de compilar el código fuente de un programa de ordenador");
    System.out.println("2) Modos de definir el pseudocódigo de un programa de ordenador");
    System.out.println("3) Paradigmas de programación");
    System.out.println("4) Las anteriores respuestas no son correctas ");

    System.out.println("Introduce la solución: ");
    solucion= sc.nextInt();

    if (solucion==3) {
      notafinal++;
    }
    else {
      notafinal-=0.5;
    }

    System.out.println("");

    System.out.println("Un bucle o ciclo es:");
    System.out.println("1) Una sentencia que permite decidir si se ejecuta o no se \n"
        + "ejecuta una sola vez un bloque aislado de código");
    System.out.println("2) Una sentencia que ejecuta otra sentencia que a su vez \n "
        + "ejecuta la primera sentencia");
    System.out.println("3) Una sentencia que permite ejecutar un bloque aislado de \n"
        + "código varias veces hasta que se cumpla (o deje de cumplirse) la condición \n"
        + " asignada al bucle");
    System.out.println("4) Las anteriores respuestas no son correctas ");

    System.out.println("Introduce la solución: ");
    solucion= sc.nextInt();

    if (solucion==3) {
      notafinal++;
    }
    else {
      notafinal-=0.5;
    }
    
    System.out.println("");

    System.out.println("La programación se puede definir como...");
    System.out.println("1) el proceso de diseñar, codificar, depurar y mantener \n"
        + "el código fuente de programas de ordenador");
    System.out.println("2) la ejecución de programas de ordenador desde la línea de comandos");
    System.out.println("3) la instalación de programas en sistemas operativos \n"
        + "desde la línea de comandos");
    System.out.println("4) Las anteriores respuestas no son correctas ");

    System.out.println("Introduce la solución: ");
    solucion= sc.nextInt();

    if (solucion==1) {
      notafinal++;
    }
    else {
      notafinal-=0.5;
    }
    
    System.out.println("");

    System.out.println("¿Qué es un algoritmo?");
    System.out.println("1) Un conjunto de instrucciones o reglas bien definidas, \n"
        + "ordenadas y finitas que permiten realizar una actividad mediante pasos \n"
        + "sucesivos que no generen dudas a quien deba realizar dicha actividad");
    System.out.println("2) Es una igualdad entre dos expresiones algebraicas, \n"
        + "denominadas miembros, en las que aparecen valores conocidos o datos, \n"
        + "y desconocidos o incógnitas, relacionados mediante operaciones");
    System.out.println("3) Es una relación de variables que pueden ser \n"
        + "cuantificadas para calcular el valor de otras de muy difícil o \n"
        + "imposible cálculo y que suministra una solución para un problema");
    System.out.println("4) Las anteriores respuestas no son correctas ");

    System.out.println("Introduce la solución: ");
    solucion= sc.nextInt();

    if (solucion==1) {
      notafinal++;
    }
    else {
      notafinal-=0.5;
    }
    
    System.out.println("");

    System.out.println("¿Cuál es el código ASCII decimal de \"nueva línea\" (line feed)?");
    System.out.println("1) 10");
    System.out.println("2) 13");
    System.out.println("3) 32");
    System.out.println("4) Las anteriores respuestas no son correctas ");

    System.out.println("Introduce la solución: ");
    solucion= sc.nextInt();

    if (solucion==1) {
      notafinal++;
    }
    else {
      notafinal-=0.5;
    }
    
    System.out.println("");

    System.out.println("int, char, float, string y boolean son");
    System.out.println("1) Funciones de acceso a datos");
    System.out.println("2) Instrucciones de acceso a datos");
    System.out.println("3) Sentencias de control");
    System.out.println("4) Tipos de datos ");

    System.out.println("Introduce la solución: ");
    solucion= sc.nextInt();

    if (solucion==4) {
      notafinal++;
    }
    else {
      notafinal-=0.5;
    }
    
    System.out.println("");

    System.out.println("¿Qué significa EOF?");
    System.out.println("1) Empty or full");
    System.out.println("2) End of file");
    System.out.println("3) End of floop");
    System.out.println("4) Las anteriores respuestas no son correctas ");

    System.out.println("Introduce la solución: ");
    solucion= sc.nextInt();

    if (solucion==2) {
      notafinal++;
    }
    else {
      notafinal-=0.5;
    }
    
    System.out.println("");

    System.out.println("El lenguaje ensamblador se sitúa");
    System.out.println("1) Más cerca del lenguaje máquina que de los lenguajes de alto nivel");
    System.out.println("2) Más cerca de los lenguajes de alto nivel que del lenguaje máquina");
    System.out.println("3) No es un lenguaje de programación");
    System.out.println("4) Las anteriores respuestas no son correctas ");

    System.out.println("Introduce la solución: ");
    solucion= sc.nextInt();

    if (solucion==2) {
      notafinal++;
    }
    else {
      notafinal-=0.5;
    }
    
    System.out.println("");

    System.out.println("Se considera que el primer lenguaje de alto nivel fue");
    System.out.println("1) Ada");
    System.out.println("2) C");
    System.out.println("3) Fortran");
    System.out.println("4) Java");

    System.out.println("Introduce la solución: ");
    solucion= sc.nextInt();

    if (solucion==3) {
      notafinal++;
    }
    else {
      notafinal-=0.5;
    }
    
    System.out.println("La nota final es: " + notafinal);

  }

}
