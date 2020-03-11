package array.ejemplos;

import java.util.Random;
import java.util.Scanner;

/**
 * Programa: Ejercicio07_NumeroAleatorios.java
 * 
 * @author Francisco
 *
 * Enunciado: Ejercicio 7
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del primer
 * valor por el segundo en la lista generada anteriormente. Los números que se
 * han cambiado deben aparecer entrecomillados.
 */

public class Ejercicio07_NumeroAleatorios {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] numeros = new int [20];
    int n1;
    int n2;

    // Generamos dentro del array, mediante un foreach los números aleatorios entre
    // 0 y 20
    for (int i=0; i<numeros.length;i++) {
      numeros [i] = (int) (Math.random()*(20+1));
      System.out.print(numeros[i] + " ");
    }

    System.out.println("");
    // Insertamos primer valor
    System.out.println("Introduce el primer valor: ");
    n1 = sc.nextInt(); // 6

    // Insertamos segundo valor
    System.out.println("Introduce el segundo valor: ");
    n2 = sc.nextInt(); // 11

    System.out.println("");

    // Nos pide que cambiemos el valor de n1 por n2, entonces comparamos en todo el array
    // cuando n1 es igual n2, cuando lo sea, el valor de n2 será cambiado por el valor de
    // n1
    for (int i = 0; i<numeros.length; i++) {
      // Comparamos el valor de n1 al valor del índice en el momento
      if (n1 == numeros[i]) {
        // Cuando sea verdadero cambiamos los valores de n1 por n2 y para identificarlo
        // lo escribimos entre comillas
        numeros[i] = n2;
        System.out.print("'" + numeros[i]+ "'");
      }
      else {
        // En caso de que el valor no coincida no haya que modificarlo se escribe el
        // valor igual que en el array original
        System.out.print(numeros[i] + " ");
      }

    }

  }

}
