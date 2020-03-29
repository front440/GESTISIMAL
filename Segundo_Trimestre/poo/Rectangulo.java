package poo;

import excepciones.DimensionRectanguloError;

public class Rectangulo {

  // definimos dos variables est�ticas para otros calcular otros m�todos
  
  public static int LADOMAXIMO = 10;
  public static int NUMRECTANGULOSCREADOS = 0;
  
  // definimos los atributos de la clase rect�ngulo
  
  private int base;
  private int altura;
  
  // creamos el constructor para la clase rect�ngulo
  
  public Rectangulo(int base, int altura) throws excepciones.DimensionRectanguloError {
    
    
    // aqui vamos a comprobar que los objetos creados cumplan con que su base o altura sean correctas
    if (Rectangulo.esLadoCorrecto(base) && Rectangulo.esLadoCorrecto(altura)) {
      this.base = base;
      this.altura = altura;
      
    }else {
      // para crear un excepci�n propiua es necesario lanzar throw new mas el nombre de la excepci�n y se crea otra clase para esa excepci�n
      throw new DimensionRectanguloError("No esta dentro de las dimensiones");
      // System.err.println("Error al introducir los datos");
      // System.exit(1);

    }
   
    // para saber el n�mero de rect�ngulos que hemos creado debemos ahcerlo en el cosntructor, que es donde creamos los objetos
    NUMRECTANGULOSCREADOS += 1;
    
  }
  
  // creamos los metodos getters (observadores) y setters (modificadores) para los atributos de la clase rect�ngulo
  
  public int getBase() {
    return base;
  }

  public void setBase(int base) throws DimensionRectanguloError  {
    if (Rectangulo.esLadoCorrecto(base)) {
      this.base = base;
    } else {
      throw new DimensionRectanguloError("No esta dentro de las dimensiones");
    }

  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) throws DimensionRectanguloError {
    if (Rectangulo.esLadoCorrecto(altura)) {
      this.altura = altura;
    } else {
      throw new DimensionRectanguloError("No esta dentro de las dimensiones");
    }
  }
  
  // M�todo toString para mostrar el objeto de la clase rect�ngulo como una cadena
  
  @Override
  public String toString() {
    return "[" + base + "," + altura + "]";
  }
  
  // M�todo para dibujar los rect�ngulos 
  
  /**
   * M�todo apra dibujar rect�ngulos con un for que recorre la altura y otro for dentro del anterior que recorre la base
   * devolvemos los asteriscos por cada iteracion de la altura y base
   * @return dibuja
   */
  
  public String dibujaRectangulo() {
    String dibuja = "";
    for (int i = 0; i < this.altura; i++) {
      
      for (int j = 0; j < this.base; j++) {
        dibuja += "*" ;
      }
      dibuja += "\n" ;
    }
    return dibuja;
  }
  
  // M�todo para calcular el per�metro
  /**
   * M�todo para calcular el per�metro de los rect�ngulos
   * El per�metro se clacula multiplicando por 2 la base + la altura
   * 
   * @return perimetro
   */
  
  public int calculaPerimetro() {
    return 2 * (this.base + this.altura);
  }
  
  // M�todo para clacular el �rea
  
  /**
   * M�todo apra calcular el �rea de los rect�ngulos
   * El �rea se ca�culo multiplicando la base * la altura
   * @return
   */
  
  public int calculaArea() {
    return (this.base * this.altura);
  }
  
  // M�todo para comparar los rect�ngulos
  /**
   *  M�todo para comparar rect�ngulos
   *  Para saber si dos rect�ngulos son iguales debemos comprobar sus �reas
   * Asi pues, las restaremos:
   * @param otroRectangulo
   * @return
   *        si el numero resultante es 0 significa que son iguale
   *        si el n�mero resultante es mayor que 0 significa que el primer rect�mgulo es mayor que el primero
   *        si el n�mero resultante es mayor que 0 significa que el primer rect�ngulo es menor que el segundo
   */
  
  public int comparaRectangulos(Rectangulo otroRectangulo) {
    return this.calculaArea() - otroRectangulo.calculaArea();
  }
  
  // M�todo para saber si los rect�ngulos son gemelos
  
  /**
   * M�todo para saber si dos rect�ngulos son gemelos
   * Para saber si lo son tenemos que comparar la base y altura de cada uno
   * @param otroRectangulo
   * @return true si son iguales o false si no lo son
   */
  
  public boolean esGemelo(Rectangulo otroRectangulo) {
    if ((this.base == otroRectangulo.base && this.altura == otroRectangulo.altura)) {
    return true;
  }
    return false;
  }
  
  // M�todo est�tico para saber si el lado de los rectangulos es correcto 
  /**
   * M�todo est�tico para saber si la base o altura del rectangulo es correcta
   * @param valor
   * @return ser� verdadera si es mayor que 0 y mnor o igual a 10
   */
  
  public static boolean esLadoCorrecto(int valor) {
    return valor > 0 && valor <= Rectangulo.LADOMAXIMO;
    
  }




}
