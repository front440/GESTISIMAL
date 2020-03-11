package array.ejercicios;

/**Programa: Desviaci�nEje5.java
 * 
 *Prop�sito: Muestra 50 n�meros enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios. Muestra tambi�n el m�ximo, el m�nimo, la moda, la media, la mediana y la desviaci�n t�pica de esos n�meros.
 * 
 *@author Jose Manuel
 * 
 *Fecha: 25/11/2019
 *
 *An�lisis: 
 * Queremos trabajar con numeros aleatorios entre 100 y 199 y de todos los que salgan debemos hacer calculos sabiendo que
 * el m�ximo es el m�s alto, el m�nimo el m�s bajo, la moda el m�s recurrente, la media la suma de todos entre el total de los n�meros,
 * la mediana es el n�mero de valor en el medio de todos y la desviaci�n tipica es la ra�z cuadrada de la varianza
 * 
 *Variables: int max, min, dividendo, divisor, num, sumaNum son todas las variables que usaremos para los calculos,
 * double varianza es la varible de la varianza, int [] mediana es un array que nos facilitar� el calculo de la mediana.
 * 
 *Dise�o:
 * PARA i hasta 50
 * 	num <-- valores aleatorios entre 100 y 199
 * 	ESCRIBE num
 * 	SI num > max
 * 		max <-- num
 * 	SINO num < min
 * 		min <-- num
 * 	dividendo +<-- num
 * 	divisor++
 * 	mediana[i] <-- num
 * FIN-PARA
 * ESCRIBE min, max
 * media <-- dividendo/divisor
 * ESCRIBE media
 * ORDENA mediana
 * ESCRIBE mediana[25]
 * PARA j hata 50 
 * 	sumaNum += Math.pow(mediana[j]-media, 2)
 * FIN-PARA
 * varianza <-- sumaNum/50
 * desviacion <-- Math.sqrt(varianza)
 * ESCRIBE desviacion
*/
import java.util.Arrays;
public class Desviaci�nEje5 {
    public static void main(String args[]) {
        System.out.println("Trabajo con n�meros entre 100 y 199");
        System.out.println("-----------------------------------");
        int max = 0;
        int min = 199;
        int dividendo = 0;
        int divisor = 0;
        double varianza;
        int num;
        int [] mediana = new int [50];
        int sumaNum = 0;

        for (int i = 0; i < 50; i++){ // vamos a generar los numeros
          num = (int)(Math.random()*100) + 100;
          System.out.print(num + " ");
          if (num > max){ // calculamos el max
            max = num;
          } else if (num < min){ // calculamos el min
            min = num;
          }
          dividendo += num; //a�adimos valores al dividendo para la media
          divisor++;
          mediana[i] = num; // a�adimos los valores a un array de la mediana
        }
        
        System.out.println();
        System.out.println("M�nimo: " + min);
        System.out.println("M�ximo: " + max);
       
        double media = (double)(dividendo)/(double)(divisor); // calculo de la media
        System.out.println("Media: " + media);
       
        Arrays.sort(mediana);
        System.out.println("Mediana: " + mediana[25]);
        
        for (int j=0; j<50; j++) { // calculo de la varianza
					sumaNum += Math.pow(mediana[j]-media, 2);
        }
        varianza = sumaNum/50;
        double desviacion = Math.sqrt(varianza); // calculo de la desviaci�n
        System.out.println("Desviaci�n t�pica: " +desviacion);
    }
}
