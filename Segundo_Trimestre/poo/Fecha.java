package poo;

import excepciones.FechaIncorrectaError;

public class Fecha {

  //definimos los atributos

  private int dia;
  private int mes;
  private int anio;

  // creamos el constructor

  public Fecha(int dia, int mes, int anio) throws FechaIncorrectaError {
    
    if (fechaCorrecta(dia, mes, anio)) {
      this.dia = dia;
      this.mes = mes;
      this.anio = anio;
    }
    else {
      throw new FechaIncorrectaError("Error, fecha introducida incorrecta");
    }

  }

  public int getDia() {

    return dia;
  }

  public void setDia(int dia) throws FechaIncorrectaError {
    
    if (fechaCorrecta(dia, this.mes, this.anio)) {
      this.dia = dia;
    }
    else {
      throw new FechaIncorrectaError("Dia introducido incorrecto. ");
    }

  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) throws FechaIncorrectaError {
    if (fechaCorrecta(this.dia, mes, this.anio)) {
      this.mes = mes;
    }
    else {
      throw new FechaIncorrectaError("Mes introducido incorrecto. ");
    }

  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) throws FechaIncorrectaError {
    if (fechaCorrecta(this.dia, this.mes, anio)) {
      this.anio = anio;
    }
    else {
      throw new FechaIncorrectaError("A�o introducido incorrecto. ");
    }
  }


  // M�todo toString para mostrar la fecha

  @Override
  public String toString() {
    return  dia + " DE " + nombreMes() + " DE " + anio;
  }


  /**
   * M�todo para mostrar el mes como cadena
   * @return  
   */

  public String nombreMes () {
    String [] meses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO","SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};

    return meses[this.mes-1];

  }

  /**
   * M�todo para saber si la es fecha correcta, que devuelve si dia es mayor que 0 y el dia es menor o igual para cuando el a�o es bisiesto
   * @return
   */

  public boolean fechaCorrecta(int dia, int mes, int anio) {

    if (dia < 1 || dia > 31) {
      return false;
    }
    if (mes < 1 || mes > 12) {
      return false;
    }
    if (anio < 0) {
      return false;
    }
    return dia > 0 && dia <= diasAnio(mes, anio);

  }

  /**
   * M�todo para  saber cuantos dias tiene un mes del a�o y si es un a�o bisiesto le sumamos a febrero 1 dia
   * @param mes
   * @param anio
   * @return
   */

  public int diasAnio(int mes, int anio) {
    int [] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    if (esBisiesto(anio)) {
      diasMes[1] = 29;
    }
    return diasMes[mes-1];

  }

  /**
   * M�todo para saber si el a�o es bisiesto
   * @param anio
   * @return
   */


  private boolean esBisiesto(int anio) {
    if ((anio % 4 == 0) && (anio % 400 == 0 || anio % 100 != 0)) {
      return true;
    }
    return false;
  }


  /**
   * 
   * @param fecha2
   * @return
   */
  public boolean igualQue(Fecha fecha2) {
    if (this.dia == fecha2.dia && this.mes == fecha2.mes && this.anio == fecha2.anio) {
      return true;
    }
    return false;
  }


  /**
   * 
   * @param fecha2
   * @return
   */
  public boolean mayorQue(Fecha fecha2) {
    if (this.dia != fecha2.dia) {
      return this.dia > fecha2.dia;
    } else if (this.mes != fecha2.mes) {
      return this.mes > fecha2.mes;
    }  else if (this.anio != fecha2.anio) {
      return this.anio > fecha2.anio;
    }
    return false;
  }


  /**
   * 
   * @param fecha2
   * @return
   */
  public boolean menorQue(Fecha fecha2) {
    if (this.dia != fecha2.dia) {
      return this.dia < fecha2.dia;
    } else if (this.mes != fecha2.mes) {
      return this.mes < fecha2.mes;
    }  else if (this.anio != fecha2.anio) {
      return this.anio < fecha2.anio;
    }
    return false;

  }

  /**
   * M�todo para sumar 1 dia a la fecha inicial
   * @return
   */

  public String fechaMas1Dia () {
    dia += 1;

    if (dia > diasAnio(mes, anio)) {
      dia = 1;
      mes +=1;
      if (mes > 12) {
        mes = 1;
        anio +=1;
      }
    }
    return dia + " de " + nombreMes() + " de " + anio;
  }

  /**
   * Metodo para restar 1 dia a la fecha inicial
   * @return
   */

  public String fechaMenos1Dia() {
    dia -= 1;

    if (dia == 0) {
      mes -= 1;
      if (mes < 1) {
        mes = 12;
        anio -= 1;
      }
      dia = diasAnio(mes, anio);
    }
    return dia + " de " + nombreMes() + " de " + anio;

  }

  /**
   * M�todo para sumar una cantidad de dias que se le pase como parametro a la fecha
   * @param dias
   * @return
   */
  public String fechaMasNDias (int dias) {
    this.dia += dias;

    while (dia > diasAnio(mes, anio)) {
      dia -= diasAnio(mes, anio);
      mes += 1;
      if (mes > 12) {
        mes = 1;
        anio += 1;
      }
    }
    return dia + " de " + nombreMes() + " de " + anio;
  }

  /**
   * M�todo para sumar una cantidad de dias que se le pase como par�metro a la fecha
   * @param dias
   * @return
   */
  public String fechaMenosNDias (int dias) {

    dia -= dias;

    while (dia < 1) {
      dia += diasAnio(mes, anio);
      mes--;
      if (mes < 1) {
        mes = 12;
        anio--;
      }
    }

    return dia + " de " + nombreMes() + " de " + anio;

  }

}
