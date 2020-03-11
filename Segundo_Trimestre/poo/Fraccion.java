package poo;

public class Fraccion {
  
  // Atributos
  private int numerador;
  private int denominador;
  
  // Constructor
  Fraccion(int n, int d) {
    this.numerador = n;
    this.denominador = d;
  }
  
  /**
   * Método en el que devolvemos la salida formateada de la fracción
   */
  public String toString() {
    return this.numerador + "/" + this.denominador;
    
  }

  // Modificadores
  
  // Getter numerador
  public int getNumerador() {
    return numerador;
  }
  
  // Setter numerador
  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }
  
// Getter denominador
  public int getDenominador() {
    return denominador;
  }
  
  // Setter denominador
  public void setDenominador(int denominador) {
    if (denominador != 0) {
      this.denominador = denominador;
    }
    else {
      System.out.println("El denominador nunca puede ser 0.");
    }
  }
  
  public int resultadoReal() {
    return this.numerador / this.denominador;
  }
 
   /**
    * Multiplicar la fracción por un número
    * @param numero
    * @return
    */
  public int multiplicaNumero (int numero) {
    return (this.numerador /  this.denominador) * numero;
  }
  
  /**
   * Método que multiplicaremos una fracción pasada por parámetro a la actual
   * @param otra
   */
  void multiplicaFraccion (Fraccion otra) {
    this.numerador *= otra.numerador;
    this.denominador *= otra.denominador;
  }
  
  /**
   * Método que sumará una fracción pasada por parámetro a la fracción actual.
   * @param otra
   */
  void sumaFraccion (Fraccion otra) {
    this.numerador = (this.numerador * otra.denominador) + (this.denominador * otra.numerador);
    this.denominador = (this.denominador * otra.denominador);
  }
  
  /**
   * Método que restará una fracción pasada por parámetro a la fracción actual.
   * @param otra
   */
  void restaFraccion (Fraccion otra) {
    this.numerador = (this.numerador * otra.denominador) - (this.denominador * otra.numerador);
    this.denominador = (this.denominador * otra.denominador);
  }
  
  /**
   * Método que nos ayudará a hallar el máximo común divisor de la fracción para 
   * implementar el método simplifica
   * @return
   */
  private int maximoComunDivisor() {
    
    int dividendo = this.numerador;
    int divisor = this.denominador;
    int resto = dividendo%divisor;
    int mcd = 0;
    
    while (resto != 0) {
      dividendo = divisor;
      divisor = resto;
      resto = dividendo%divisor;
      mcd = divisor;
    }
    return mcd;
  }
  
  /**
   * Simplifica la fraccíon dividiendo el numerador y el denominador por el mcd
   */
  void simplifica() {
    int mcd;
    mcd = this.maximoComunDivisor();
    this.numerador /= mcd;
    this.denominador /= mcd;
  }
       
  
  
  
 

}
