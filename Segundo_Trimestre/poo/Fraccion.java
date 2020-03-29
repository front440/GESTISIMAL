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
   * M�todo en el que devolvemos la salida formateada de la fracci�n
   */
  public String toString() {
    return this.numerador + "/" + this.denominador;
    
  }

  // Modificadores
  
  // Getter numerador
  public double getNumerador() {
    return numerador;
  }
  
  // Setter numerador
  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }
  
// Getter denominador
  public double getDenominador() {
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
  
  public double resultadoReal() {
    double resultado = this.numerador /this.denominador;
    return resultado;
  }
 
   /**
    * Multiplicar la fracci�n por un n�mero
    * @param numero
    * @return
    */
  public double multiplicaNumero (int numero) {
    return (this.numerador /  this.denominador) * numero;
  }
  
  /**
   * M�todo que multiplicaremos una fracci�n pasada por par�metro a la actual
   * @param otra
   */
  void multiplicaFraccion (Fraccion otra) {
    this.numerador *= otra.numerador;
    this.denominador *= otra.denominador;
  }
  
  /**
   * M�todo que sumar� una fracci�n pasada por par�metro a la fracci�n actual.
   * @param otra
   */
  void sumaFraccion (Fraccion otra) {
    this.numerador = (this.numerador * otra.denominador) + (this.denominador * otra.numerador);
    this.denominador = (this.denominador * otra.denominador);
  }
  
  /**
   * M�todo que restar� una fracci�n pasada por par�metro a la fracci�n actual.
   * @param otra
   */
  void restaFraccion (Fraccion otra) {
    this.numerador = (this.numerador * otra.denominador) - (this.denominador * otra.numerador);
    this.denominador = (this.denominador * otra.denominador);
  }
  
  /**
   * M�todo que nos ayudar� a hallar el m�ximo com�n divisor de la fracci�n para 
   * implementar el m�todo simplifica
   * @return
   */
  private double maximoComunDivisor() {
    
    double dividendo = this.numerador;
    double divisor =  this.denominador;
    double resto = dividendo%divisor;
    double mcd = 0;
    
    while (resto != 0) {
      dividendo = divisor;
      divisor = resto;
      resto = dividendo%divisor;
      mcd = divisor;
    }
    return mcd;
  }
  
  /**
   * Simplifica la fracc�on dividiendo el numerador y el denominador por el mcd
   */
  void simplifica() {
    double mcd;
    mcd = this.maximoComunDivisor();
    this.numerador /= mcd;
    this.denominador /= mcd;
    
  }
       
  

}
