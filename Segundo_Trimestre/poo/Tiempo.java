package poo;

public class Tiempo {

  //Atributos
  /**
   * Con el private delante de los atributos conseguiremos que estos no puedan ser alterados volviendose
   * datos erroneos o inconsistentes
   */
  private int horas;
  private int minutos;
  private int segundos;

  // Constructor
  Tiempo (int h, int m, int s) {
    this.horas = h;
    this.minutos = m;
    this.segundos = s;
  }

  // Salida formateada
  public String toString() {
    return this.horas + "h " + this.minutos + "m " + this.segundos + "s ";

  }

  // Modificadores

  // Getter horas
  public int getHoras() {
    return horas;
  }
  // Setter horas
  public void setHoras(int horas) {
    this.horas = horas;
  }
  //Getter minutos
  public int getMinutos() {
    return minutos;
  }
  // Setter minutos
  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }
  //Getter segundos
  public int getSegundos() {
    return segundos;
  }
  // Setter segundos
  public void setSegundos(int segundos) {
    this.segundos = segundos;
  }

  // Métodos

  /**
   * Método para sumar objeto pasado como parámetro a objeto inicial.
   * 
   * @param otro
   */
  void sumaTiempo (Tiempo otro) {
    int tiempoTotal = (this.horas*3600 + this.minutos*60 + this.segundos) + (otro.horas*3600 + otro.minutos*60 + otro.segundos);
    this.horas = tiempoTotal / 3600;
    this.minutos = (tiempoTotal% 3600)/60;
    this.segundos =(tiempoTotal % 3600) % 60;
  }

  /**
   * Método para restar objeto pasado como parámetro a objeto inicial
   * @param otro
   */
  void restaTiempo (Tiempo otro) {
    int tiempoTotal = (this.horas*3600 + this.minutos*60 + this.segundos) - (otro.horas*3600 + otro.minutos*60 + otro.segundos);
    this.horas = tiempoTotal / 3600;
    this.minutos = (tiempoTotal% 3600)/60;
    this.segundos =(tiempoTotal % 3600) % 60;
  }

  /**
   * Método para sumar al objeto las horas pasadas como parámetro
   * @param horas
   */
  void sumaHoras (int horas) {
    this.horas += horas;
  }

  /**
   * Método para restar al objeto las horas pasadas como parámetro
   * @param horas
   */
  void restaHoras (int horas) {
    this.horas -= horas;
  }

  /**
   * Método para sumar minutos pasados por parámetro al objeto
   * @param minutos
   */
  void sumaMinutos (int minutos) {
    int tiempoTotal = this.horas * 3600 + this.minutos * 60 + this.segundos + minutos * 60;
    this.conversor(tiempoTotal);
  }

  /**
   * Método para restar minutos pasados por parámetro al objeto
   * @param minutos
   */
  void restaMinutos (int minutos) {
    int tiempoTotal = this.horas * 3600 + this.minutos * 60 + this.segundos - minutos * 60;
    this.conversor(tiempoTotal);   
  }

  /**
   * Método para sumar segundos
   * 
   */

  void sumaSegundos (int segundos) {
    int tiempoTotal = this.horas * 3600 + this.minutos * 60 + this.segundos + segundos;
    this.conversor(tiempoTotal);
  }

  void restaSegundos (int segundos) {
    int tiempoTotal = this.horas * 3600 + this.minutos * 60 + this.segundos - segundos;
    this.conversor(tiempoTotal);
  }

  // Otros métodos

  /**
   * Método creado para la transformación de segundos de los objetos
   * @param otro
   * @return
   */
  public int tiempoTotal(Tiempo otro) {
    int tiempoTotal = (this.horas*3600 + this.minutos*60 + this.segundos) + (otro.horas*3600 + otro.minutos*60 + otro.segundos);
    return tiempoTotal;
  }

  /**
   * metodo conversor
   * 
   */

  public void conversor(int tiempoTotal) {
    this.horas = tiempoTotal / 3600;
    this.minutos = (tiempoTotal % 3600) / 60;
    this.segundos = (tiempoTotal % 3600) % 60;
  }

}
