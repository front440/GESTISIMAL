package Funciones;

import java.util.Iterator;

public class Varias {

  // Este m�todo nos dir� si el n�mero es capic�a
  public static boolean esCapicua(int numero) {

    String numeroS = String.valueOf(numero);
    String invertido = "";

    for (int i = numeroS.length() ; i > 0 ; i-- ) {

      invertido += numeroS.substring(i-1,i );
    }

    if (Integer.parseInt(invertido) == numero) {

      return true;
    }
    else {
      return false;
    }      

  }

  // M�todo que nos mostrar� el n�mero al rev�s
  public static int voltea(int numero) {

    String numeroS = String.valueOf(numero);
    String invertido = "";

    for (int i = numeroS.length() ; i > 0 ; i-- ) {

      invertido += numeroS.substring(i-1,i );
    }

    return Integer.parseInt(invertido);
  }

  // M�todo que nos mostrar� si n�mero es primo
  public static boolean esPrimo(int primo) {

    boolean es = false;
    for (int divisor = 2 ; divisor < Math.sqrt(primo)+1 ; divisor+=2) {
      if (primo % divisor == 0) {
        return es=false;
      }
      else {
        return es=true;
      }

    }
    return es;


  }

  // M�todo que nos mostrar� el siguiente numero primo al n�mero pasado por parametro
  public static int siguientePrimo(int numero) {
    while (!esPrimo(++numero)) {};

    return numero;

  }

  // M�todo que nos devuelve una potencia
  public static double potencia(int base, int exponente) {
    int n = 1;
    if (exponente == 0) {
      // Cuando el exponente = 0, el resultado es 1
      return 1;    
    }
    if (exponente < 0) {
      return 1/potencia(base, -exponente);
    }
    for (int i = 1 ; i <= Math.abs(exponente); i++) {
      // Multiplicamos n tantas veces como diga exponente
      n = n * base;
    }
    return n;
  }

  // Cuenta el numero de d�gitos de un n�mero entero
  public static int digito(int numero) {

    // Primera manera
    int digito = Integer.toString(numero).length();

    return digito;

    // Segunda manera
    //    int n = 0; // Contador
    //    while (numero > 0) {
    //      numero = numero / 10; // Quitamos un cifra a numero
    //      n++; // Incrementamos
    //    }
    // return numero;
  }

  // Nos dice que n�mero encontramos en la poscion que digamos
  public static int digitoN(int numero, int posicion) {

    String digitoCadena = String.valueOf(numero);

    // La posici�n empezar� desde 0
    return Integer.parseInt(digitoCadena.substring(posicion, posicion+1));
  }

  // Nos dir� en la posici�n primera ocurrencia del n�mero que digamos
  public static int posicionDeDigito (int numero, int numeroBuscar) {

    // Pasamos numero a cadena
    String numeroCadena = String.valueOf(numero);

    // Recorremos la cadena caracter a caracter
    int i;
    for (i = 0 ; i < numeroCadena.length(); i++) {

      // Incrementamos la posicion en la cadena
      numeroCadena.substring(i, i+1);

      // Comparamos caracter a caracter la cadena por el n�mero a buscar
      if (Integer.parseInt(numeroCadena.substring(i, i+1)) == numeroBuscar) {
        System.out.println("Lomo con tomate");
        // Devolvemos la posici�n encontrada el caracter
        return i;
      }

    }
    // En caso contrario devolvemos -1
    return -1;

  }

  // Quita al n�mero los d�gitos que digamos por detr�s
  public static String quitaPorDetras (int numero, int numeroQuitar) {

    String numeroCadena = String.valueOf(numero);

    numeroCadena = numeroCadena.substring(0, numeroQuitar);

    return numeroCadena;

  }

  // Quita al n�mero los d�gitos que digamos por delante
  public static String quitaPorDelante (int numero, int numeroQuitar) {

    String numeroCadena = String.valueOf(numero);

    numeroCadena = numeroCadena.substring(numeroQuitar);

    return numeroCadena;

  }

  // Pega un d�gito a un n�mero por detr�s
  public static String pegaPorDetras (int numero, int numeroPegar) {

    String numeroCadena = String.valueOf(numero);

    return numeroCadena = numeroCadena + String.valueOf(numeroPegar);
  }

  //Pega un d�gito a un n�mero por detr�s
  public static String pegaPorDelante (int numero, int numeroPegar) {

    String numeroCadena = String.valueOf(numero);

    return numeroCadena = String.valueOf(numeroPegar) +numeroCadena;
  }

  // Saca por pantalla el n�mero entre la posici�n inicial y final
  public static String trozoDeNumero (int numero, int valorInicial , int valorFinal) {

    String numeroCadena = String.valueOf(numero);

    return numeroCadena.substring(valorInicial, valorFinal);
  }

  //Saca por pantalla el resultado de pegar numero1 y numero2
  public static String juntaNumero (int numero1, int numero2) {

    String numeroCadena = String.valueOf(numero1) + String.valueOf(numero2);

    return numeroCadena;
  }

  









}
