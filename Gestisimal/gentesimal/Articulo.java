package gentesimal;

/**
 * 
 * @author Francisco
 * 
 *         - Su estado ser�: c�digo, descripci�n, precio de compra, precio de
 *         venta y n�mero de unidades (nunca negativas).
 * 
 *         - Como comportamiento: Considero que el c�digo va a generarse de
 *         forma autom�tica en el constructor, as� no puede haber dos art�culos
 *         con el mismo c�digo. Esto implica que no puede modificarse el c�digo
 *         de un art�culo. S� el resto de las propiedades. Podremos mostrar el
 *         art�culo, por lo que necesito una representaci�n del art�culo en
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
   * Constructor para identificar los c�digos del art�culo 
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

  // M�todos

  /**
   * Este m�todo incrementar� en uno cada vez que creemos un art�culo nuevo
   * 
   * @return codigo++
   */
  private int generaCodigo() {
    return siguienteCodigo++;
  }

  /**
   * modificaremos dentro del m�todo incrementa las unidades pasadas como par�metro del art�culo
   * @param cantidad
   */
  void incrementaStock(int cantidad) {
 // Extraemos las unidades del art�culo del siguiente c�digo y incrementamos las unidades del stock
    if (cantidad < 0) {
      System.err.println("La cantidad a decrementar no puede ser negativa");
    }
    else {
      setUnidades(getUnidades() + unidades);
      if (getUnidades() < 0) {
        System.err.println("El n�mero de art�culos no puede ser negativos");
      }
    }
    
    

  }

  /**
   * modificaremos dentro del m�todo decrementa las unidades pasadas como par�metro del art�culo
   * @param cantidad
   */
  void decrementaStock(int cantidad) {
    // Extraemos las unidades del art�culo del siguiente c�digo y decrementamos las unidades del stock
    if (cantidad < 0) {
      System.err.println("La cantidad a decrementar no puede ser negativa");
    }
    else {
      setUnidades(getUnidades() - cantidad);
    }
    

  }

  /**
   * El m�todo modificar� la descripci�n del art�culo seleccionado
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
   * M�todo equals, compara un objeto pasado como par�metro
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
   * Devuelve la salida formateada de los atributos del art�culo
   */
  @Override
  public String toString() {
    return      "C�digo art�culo: " + codigo + "\n"
        +   "Descripci�n: " + descripcion + "\n"
        +   "Precio Compra: " + precioC + "\n"
        +   "Precio Venta: " + precioV + "\n"
        +   "Unidades: " + unidades + "\n"
        +   "------------------------------------";
  }

  /**
   * Este m�todo impedir� que introduzcamos datos erroneos en los atributos
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
