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
  public static int getCodigo() {
    return siguienteCodigo;
  }

  public static void setCodigo(int codigo) {
    Articulo.siguienteCodigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioC() {
    return precioC;
  }

  public void setPrecioC(double precioC) {
    // assert esCorrecto(precioC, this.precioV, this.unidades): "El valor
    // introducido no puede ser negativo";
    this.precioC = precioC;
  }

  public double getPrecioV() {
    return precioV;
  }

  void setPrecioV(double precioV) {
    // assert esCorrecto(this.precioC, precioV, this.unidades): "El valor
    // introducido no puede ser negativo";
    this.precioV = precioV;
  }

  public int getUnidades() {
    return unidades;
  }

  public void setUnidades(int unidades) {
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
    setUnidades(getUnidades() + unidades);

  }

  /**
   * modificaremos dentro del m�todo decrementa las unidades pasadas como par�metro del art�culo
   * @param cantidad
   */
  void decrementaStock(int cantidad) {
    // Extraemos las unidades del art�culo del siguiente c�digo y decrementamos las unidades del stock
    setUnidades(getUnidades() - cantidad);

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
    return      "\nC�digo art�culo: " + codigo + "\n"
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
