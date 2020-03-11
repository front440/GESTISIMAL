/**
 * Programa: Ejericio01_Pag120_1.java
 * 
 * @author Francisco
 * 
 * Fecha: 27/11/2019
 * 
 * Enunciado: Define un array de 12 n�meros enteros con nombre num y asigna los valores
 * seg�n la tabla que se muestra a continuaci�n. Muestra el contenido de todos
 * los elementos del array. �Qu� sucede con los valores de los elementos que no
 * han sido inicializados?
 * 
 * Analisis/Desarrollo:
 * Crearemos un array de 12 n�meros, en cada posici�n del array meteremos manualmente
 * un serie de datos. Seguidamente nos pide que mostremos los n�meros insertados que 
 * haremos mediante un for de 12 n�meros.
 * 
 * Variables:
 * int array[]      <-- Array de 12 posiciones
 */
package array.ejercicios;

public class Ejercicio06_Pag120_1 {

  public static void main(String[] args) {
    
    System.out.println("Este programa crear� un array de 12 n�meros con algunos valores dentro de �l");
    System.out.println("----------------------------------------------------------------------------");
    
    int[] array = new int [11];
    array[1] = 39;
    array[2] = -2;
    array[4] = 0;
    array[6] = 14;
    array[8] = 5;
    array[9] = 120;
    
    for (int i = 0; i<array.length; i++) {
      System.out.println("valor " + i + ": " + array[i]);
    }
    System.out.println("Como podemos ver cuando imprimimos los n�meros, en la posici�n \n"
        + "en la que no tenemos nada nos saldr� 0");
  }

}
