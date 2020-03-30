package gentesimal;

/**
 * 
 * @author Francisco
 * 
 *         - Su estado será: código, descripción, precio de compra, precio de
 *         venta y número de unidades (nunca negativas).
 * 
 *         - Como comportamiento: Considero que el código va a generarse de
 *         forma automática en el constructor, así no puede haber dos artículos
 *         con el mismo código. Esto implica que no puede modificarse el código
 *         de un artículo. Sí el resto de las propiedades. Podremos mostrar el
 *         artículo, por lo que necesito una representación del artículo en
 *         forma de cadena (toString)
 *
 */

public class Articulo {

  // Atributos
  private int codigo;
  private String descripcion;
  private double precioC;
  private double precioV;
  private int unidades;
  private static int siguienteCodigo = 1;

  // Constructor
  Articulo(String descripcion, double precioC, double precioV, int unidades) {
    //assert esCorrecto(precioC, precioV, unidades) : "El valor introducido no puede ser negativo";
    this.descripcion = descripcion;
    this.precioC = precioC;
    this.precioV = precioV;
    this.unidades = unidades;
    this.codigo = generaCodigo();

  }

  /**
   * Constructor para identificar los códigos del artículo 
   * @param codigo
   */
  Articulo(int codigo) {
    this.codigo = codigo;
  }



  // Modificadores
  private int getCodigo() {
    return siguienteCodigo;
  }

  private void setCodigo(int codigo) {
    Articulo.siguienteCodigo = codigo;
  }

  private String getDescripcion() {
    return descripcion;
  }

  void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  private double getPrecioC() {
    return precioC;
  }

  private void setPrecioC(double precioC) {
    // assert esCorrecto(precioC, this.precioV, this.unidades): "El valor
    // introducido no puede ser negativo";
    this.precioC = precioC;
  }

  private double getPrecioV() {
    return precioV;
  }

  private void setPrecioV(double precioV) {
    // assert esCorrecto(this.precioC, precioV, this.unidades): "El valor
    // introducido no puede ser negativo";
    this.precioV = precioV;
  }

  private int getUnidades() {
    return unidades;
  }

  private void setUnidades(int unidades) {
    assert esCorrecto(this.precioC, this.precioV, unidades) : "El valor introducido no puede ser negativo";
    this.unidades = unidades;
  }

  // Métodos

  /**
   * Este método incrementará en uno cada vez que creemos un artículo nuevo
   * 
   * @return codigo++
   */
  private int generaCodigo() {
    return siguienteCodigo++;
  }

  /**
   * modificaremos dentro del método incrementa las unidades pasadas como parámetro del artículo
   * @param cantidad
   */
  void incrementaStock(int cantidad) {
 // Extraemos las unidades del artículo del siguiente código y incrementamos las unidades del stock
    if (cantidad < 0) {
      System.err.println("La cantidad a decrementar no puede ser negativa");
    }
    else {
      setUnidades(getUnidades() + unidades);
      if (getUnidades() < 0) {
        System.err.println("El número de artículos no puede ser negativos");
      }
    }
    
    

  }

  /**
   * modificaremos dentro del método decrementa las unidades pasadas como parámetro del artículo
   * @param cantidad
   */
  void decrementaStock(int cantidad) {
    // Extraemos las unidades del artículo del siguiente código y decrementamos las unidades del stock
    if (cantidad < 0) {
      System.err.println("La cantidad a decrementar no puede ser negativa");
    }
    else {
      setUnidades(getUnidades() - cantidad);
    }
    

  }

  /**
   * El método modificará la descripción del artículo seleccionado
   * @param descripcion
   */
  void modificaDescripcion(String descripcion) {
    setDescripcion(descripcion);

  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + codigo;
    return result;
  }

  /**
   * Método equals, compara un objeto pasado como parámetro
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Articulo other = (Articulo) obj;
    if (codigo != other.codigo)
      return false;
    return true;
  }

  /**
   * Devuelve la salida formateada de los atributos del artículo
   */
  @Override
  public String toString() {
    return      "Código artículo: " + codigo + "\n"
        +   "Descripción: " + descripcion + "\n"
        +   "Precio Compra: " + precioC + "\n"
        +   "Precio Venta: " + precioV + "\n"
        +   "Unidades: " + unidades + "\n"
        +   "------------------------------------";
  }

  /**
   * Este método impedirá que introduzcamos datos erroneos en los atributos
   * 
   * @param precioC
   * @param precioV
   * @param unidades
   * @return
   */
  public static boolean esCorrecto(double precioC, double precioV, int unidades) {
    return (precioC > 0) && (precioV > 0) && (unidades > 0);
  }









}
