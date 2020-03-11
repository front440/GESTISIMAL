package array.ejercicios;

/**
 * Programa: Ejercicio07_Pag120_2
 * 
 * @author Francisco
 * 
 * fecha: 27/11/2019
 * 
 * Enunciado: Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 * que no han sido inicializados?
 * 
 * Analisis/Desarrollo:
 * Nos pide que creemos un un array tipo char de 10 posiciones, insertaremos un serie
 * de caracteres y los imprimos
 *
 */

public class Ejercicio07_Pag120_2 {

  public static void main(String[] args) {
    
    // Definimos array
    char [] simbolo = new char[10];
    simbolo[0]='a';
    simbolo[1]='x';
    simbolo[5]='@';
    simbolo[7]=' ';
    simbolo[8]='x';
    simbolo[9]='Q';
    
    // Creamos bucle al estilo for-each
    for (char i:simbolo) {
      System.out.println(i) ;
    }
    System.out.println("-------------------------------------------------------------");
    System.out.println("Como podemos ver al mostrar los elementos de cada posición en \n"
        + "en cada posición que no tengamos nada tampoco se nos mostrará");

  }

}
