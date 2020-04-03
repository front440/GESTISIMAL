package gentesimal;

import excepciones.CantidadNegativaError;
import excepciones.PrecioNegativoError;

//import excepciones.CantidadNegativaError;
//import excepciones.PrecioNegativoError;

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
  Articulo(String descripcion, double precioC, double precioV, int unidades) throws PrecioNegativoError, CantidadNegativaError {
    
      this.codigo = generaCodigo();
      setDescripcion(descripcion);
      setPrecioC(precioC);
      setPrecioV(precioV);
      setUnidades(unidades);



  }

  /**
   * Constructor para identificar los códigos del artículo 
   * @param codigo
   */
  Articulo(int codigo) {
    this.codigo = codigo;
  }

  // Modificadores
  public int getCodigo() {
    return codigo;
  }
  //  public int getCodigo() {
  //    return siguienteCodigo;
  //  }

  private void setCodigo(int codigo) {
    Articulo.siguienteCodigo = codigo;
  }

  String getDescripcion() {
    return descripcion;
  }

  void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  double getPrecioC() {
    return precioC;
  }

  private void setPrecioC(double precioC) {
    // assert esCorrecto(precioC, this.precioV, this.unidades): "El valor
    // introducido no puede ser negativo";
    this.precioC = precioC;
  }

  double getPrecioV() {
    return precioV;
  }

  private void setPrecioV(double precioV) {
    // assert esCorrecto(this.precioC, precioV, this.unidades): "El valor
    // introducido no puede ser negativo";
    this.precioV = precioV;
  }

  int getUnidades() {
    return unidades;
  }

  private void setUnidades(int unidades) throws CantidadNegativaError {
    if (esCorrecto(this.precioC, this.precioV, unidades)) {
      this.unidades = unidades;
    }
    else {
      throw new CantidadNegativaError("El número de unidades no puede ser negativo");
    }

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
   * @throws CantidadNegativaError 
   */
  void incrementaStock(int cantidad) throws CantidadNegativaError {

    // Extraemos las unidades del artículo del siguiente código y incrementamos las unidades del stock
    if (cantidad > 0) {
      setUnidades(getUnidades() + unidades);
    }
    else {
      throw new CantidadNegativaError("La cantidad a decrementar no puede ser negativa");
    }
    

  }

  /**
   * modificaremos dentro del método decrementa las unidades pasadas como parámetro del artículo
   * @param cantidad
   * @throws CantidadNegativaError 
   */
  void decrementaStock(int cantidad) throws CantidadNegativaError {

    if (cantidad > 0) {
      // Extraemos las unidades del artículo del siguiente código y decrementamos las unidades del stock
      setUnidades(getUnidades() - cantidad);
    }
    else {
      throw new CantidadNegativaError("la cantidad a decrementar no puede ser negativa");
    }


  }

  /**
   * El método modificará la descripción del artículo seleccionado
   * @param descripcion
   * @param numUnidades 
   * @param precioV 
   * @param precioC 
   * @throws CantidadNegativaError 
   */
  void set(String descripcion, double precioC, double precioV, int numUnidades) throws CantidadNegativaError, PrecioNegativoError {
    setDescripcion(descripcion);
    setPrecioC(precioC);
    setPrecioV(precioV);
    setUnidades(numUnidades);

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
