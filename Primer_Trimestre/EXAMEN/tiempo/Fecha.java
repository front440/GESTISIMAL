package EXAMEN.tiempo;

import java.lang.Character.Subset;

/**
 * Colección de funciones para manejar fechas en cadenas de caracteres.
 *
 * El formato de la cadena es: AAAAMMDD.
 * Ejemplo: El 15 de diciembre de 2019 sería: "20191215"
 *
 * Colección de funciones:
 *
 * 1. fechaCorrecta: dice si la fecha que se pasa como parámetro es correcta.
 *
 * 2. fechaMas1Dia: suma un día a la fecha que se pasa como parámetro y lo devuelve.
 *
 * 3. fechaMasNDias: suma una serie de días a la fecha que se pasa como parámetro y lo devuelve.
 *
 * 4. fechaMenos1Dia: resta un día a la fecha que se pasa como parámetro y lo devuelve.
 *
 * 5. fechaMenosNDias: resta una serie de días a la fecha que se pasa como parámetro y lo devuelve.
 *
 * 6. esBisiesto: dice si la fecha que se pasa como parámetro es bisiesto.
 *
 * 7. comparaFechas: recibe dos fechas y devuelve un valor negativo si la 1ª es anterior a la
 *    segunda, cero si son iguales, y un valor positivo si la 1ª es posterior a la segunda.
 *
 * 8. fechaFormateada: recibe un fecha y devuelve una cadena con el formato:
 *    DD de {MES} de AAAA     (Ejemplo: "15 de Diciembre de 2019")
 *
 * 9. anyo, mes, dia, nombreMes: recibe un fecha y devuelve esos valores.
 *
 * @author rafa
 *
 */

public class Fecha {

  /**
   * Dice si la fecha que se pasa como parámetro es correcta.
   *
   * @param fecha
   * @return verdadero o falso.
   */
  public static boolean fechaCorrecta(String fecha) {
    return true;

  }

  /**
   * Suma un día a la fecha que se pasa como parámetro y la devuelve.
   *
   * @param fecha
   * @return nuevo fecha
   */
  public static String fechaMas1Dia(String fecha) {
    return fecha;
    
    

  }

  /**
   * Suma una serie de días a la fecha que se pasa como parámetro y la devuelve.
   *
   * @param fecha
   * @param dias
   * @return nueva fecha
   */
  public static String fechaMasNDias(String fecha, int dias) {
    return "FECHA";
  }

  /**
   * Resta un día a la fecha que se pasa como parámetro y la devuelve.
   *
   * @param fecha
   * @return nuevo fecha
   */
  public static String fechaMenos1Dia(String fecha) {
    return "FECHA";
  }

  /**
   * Resta una serie de días a la fecha que se pasa como parámetro y la devuelve.
   *
   * @param fecha
   * @param dias
   * @return nuevo fecha
   */
  public static String fechaMenosNDias(String fecha, int dias) {
    return "FECHA";
  }

  /**
   * Dice si la fecha que se pasa como parámetro es de un año bisiesto.
   *
   * @param fecha
   * @return verdadero o falso
   */
  public static boolean esBisiesto(String fechas) {
    // Comprobamos si el a�o anteriormente extraido en la funcion a�o
    // es bisiesto, para ello realizamos la division de resto 0 de los
    // multiplos de 4 y 400
    if (anyo(fechas) % 4 == 0 || anyo(fechas) % 400 == 0) {
      return true;
    }
    return false;

  }

  /**
   * Recibe dos fechas y devuelve un valor negativo si la 1º es anterior a la 2º,
   * cero si son iguales, y un valor positivo si la 1º es posterior a la segunda.
   *
   * @param fecha1
   * @param fecha2
   * @return entero negativo, cero o un entero positivo.
   */
  public static int comparaFechas(String fecha1, String fecha2) {
    return 0;
  }

  /**
   * Recibe un fecha y devuelve una cadena con el formato DD de {MES} de AAAA
   * (Ejemplo: "15 de Diciembre de 2019")
   *
   * @param fecha
   * @return fecha formateada
   */
  public static String fechaFormateada(String fecha) {
    return Fecha.dia(fecha) +" "+ Fecha.nombreMes(fecha)+ " " + Fecha.anyo(fecha);
  }

  /**
   * Devuelve el año de la fecha.
   *
   * @param fecha
   * @return
   */
  public static int anyo(String fecha) {
    // Con el m�todo de substring del par�metro pasado cogemos del caracter
    // 0 al 4 que conforma los d�gitos del a�o.
    String anyo = fecha.substring(0, 4);
    // Devolvemos los caracteres en la variable de a�o como entero
    return Integer.parseInt(anyo);
  }

  /**
   * Devuelve el mes de la fecha.
   *
   * @param fecha
   * @return
   */
  public static String nombreMes(String fecha) {
    // Extraemos los caracteres de fecha de entre 4 y 6, los correspondientes
    // al mes.
    String nombreMes = fecha.substring(4,6);

    // Una vez extraidos los comparamos con los meses reales y devolvemos el
    // valor del mes en caso de que est� entre 1 y 12
    if (Integer.parseInt(nombreMes) == 01) {
      nombreMes= "Enero";
    }
    else if (Integer.parseInt(nombreMes) == 02) {
      nombreMes= "Febrero";
    }
    else if (Integer.parseInt(nombreMes) == 03) {
      nombreMes= "Marzo";
    }
    else if (Integer.parseInt(nombreMes) == 04) {
      nombreMes= "Abril";
    }
    else if (Integer.parseInt(nombreMes) == 05) {
      nombreMes= "Mayo";
    }
    else if (Integer.parseInt(nombreMes) == 06) {
      nombreMes= "Junio";
    }
    else if (Integer.parseInt(nombreMes) == 07) {
      nombreMes= "Julio";
    }
    else if (Integer.parseInt(nombreMes) == 8) {
      nombreMes= "Agosto";
    }
    else if (Integer.parseInt(nombreMes) == 9) {
      nombreMes= "Septiembre";
    }
    else if (Integer.parseInt(nombreMes) == 10) {
      nombreMes= "Octubre";
    }
    else if (Integer.parseInt(nombreMes) == 11) {
      nombreMes= "Noviembre";
    }
    else if (Integer.parseInt(nombreMes) == 12) {
      nombreMes= "Diciembre";
    }

    return nombreMes;
  }

  /**
   * Devuelve el nombres del mes de la fecha.
   *
   * @param fecha
   * @return nombre del mes
   */
  public static int mes(String fecha) {
    // Pasamos a la cadena meses el contenido de la fecha de entre el caracter 4
    // al 6
    String meses = fecha.substring(4,6);
    // Devolvemos el valor pasado como entero
    return Integer.valueOf(meses);

  }

  /**
   * Devuelve el día de la fecha.
   *
   * @param fecha
   * @return
   */
  public static int dia(String fecha) {
    // Pasamos a la cadena diaMes el contenido de la fecha de entre el caracter 6
    // al 8 
    String diaMes = fecha.substring(6,8);
    // Devolvemos el valor como entero
    return Integer.valueOf(diaMes);
  }

  /**
   * Devuelve una cadena en formato AAAAMMDD
   * @param d día del mes
   * @param m día del año
   * @param a año
   * @return
   */
  public static String fecha(int d, int m, int a) {

    String dia=Integer.toString(d).trim();
    String mes=Integer.toString(m).trim();
    String anyo=Integer.toString(a).trim();
    // día
    if (dia.length()<2) {
      dia = "0"+dia;
    }
    // mes
    if (mes.length()<2) {
      mes = "0"+mes;
    }
    // año
    for (int i=anyo.length(); i<4; i++) {
      anyo = "0"+anyo;
    }
    return anyo + mes + dia;
  }

}
