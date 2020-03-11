package Funciones;

public class Array {

  /**
   * Muestra por pantalla array
   * @param array
   */

  public static void mostrarArray(int array[]) {
    for (int n: array) {
      System.out.print(n + " | ");
    }
  }

  /**
   * Genera un array de tama�o n con n�meros aleatorios cuyo intervalo (m�nimo y
   * m�ximo) se indica como par�metro.
   * @param tama�o
   * @param intervaloMin
   * @param intervaloMax
   * @return
   */

  public static int[] generaArrayInt(int tama�o, int intervaloMin, int intervaloMax) {
    int array[] = new int [tama�o];

    for (int i = 0 ; i < tama�o ; i++) {
      array[i] = (int) ((Math.random()* (intervaloMax - intervaloMin +1)+intervaloMin));
    }
    return array;
  }

  /**
   * Devuelve el m�nimo del array que se pasa como par�metro.
   * @param array
   * @return
   */

  public static int minimoArrayInt(int[]array) {
    int minimo = Integer.MAX_VALUE;

    for (int n:array) {
      if (n < minimo) {
        minimo = n;
      }
    }
    return minimo;
  }

  /**
   *  Devuelve el m�ximo del array que se pasa como par�metro.
   * @param array
   * @return
   */

  public static int maximoArrayInt(int[]array) {
    int maximo = Integer.MIN_VALUE;

    for (int i:array) {
      if (i > maximo) {
        maximo = i;
      }
    }
    return maximo;
  }

  /**
   *  Devuelve la media del array que se pasa como par�metro.
   * @param array
   * @return
   */
  public static int mediaArrayInt(int[]array) {
    int media = 0;
    for (int n:array) {
      media +=n;
    }
    return media/array.length;
  }

  /**
   *  Dice si un n�mero est� o no dentro de un array
   * @param array
   * @param seEncuentra
   * @return
   */
  public static boolean estaEnArrayInt (int[] array, int seEncuentra) {
    for (int n:array) {
      if (seEncuentra == n) {
        return true;
      }
    }
    return false;
  }

  /**
   *  Busca un n�mero en un array y devuelve la posici�n (el �ndice) en la que se encuentra.
   * @param array
   * @param numero
   * @return
   */

  public static int posicionEnArray (int[] array, int numero) {
    int i;
    for ( i = 0; i< array.length; i++) {
      if (numero == array[i]) {
        return i;

      }

    }
    return 1;
  }

  /**
   * 
   * @param array
   * @return
   */
  public static int[] volteaArrayInt (int[] array) {
    int [] arrayVolteado = new int [array.length];
    int i;
    for ( i = 0 ; i<array.length; i++) {

      arrayVolteado[array.length-i-1]=array[i];
    }
    return arrayVolteado;
  }

  /**
   * 
   * @param array
   * @param nRotar
   */
  public static void rotaDerechaArrayInt (int[] array, int nRotar) {
    int []copia = new int[array.length];
    int c = nRotar;

    for (int i=0; i<array.length;i++) {
      copia[c] = array[i];
      c++;
      if (c == array.length) {
        c = 0;
      }
    }
    for (int i = 0; i< array.length; i++) {
      array[i]=copia[i];
    }


  }

  //  public static int[] rotaDerechaArrayInt(int[] x, int n) {
  //    
  //    int[] a = x.clone(); // clona en a el contenido de x
  //    int i;
  //    int aux;
  //    
  //    while (n-- > 0) {
  //      aux = a[a.length - 1];
  //      for(i = a.length - 1; i > 0; i--) {
  //        a[i] = a[i - 1];
  //      }
  //      a[0] = aux;
  //    }
  //      
  //    return a;
  //  }


}
