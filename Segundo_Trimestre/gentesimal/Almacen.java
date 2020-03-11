package gentesimal;

/**
 * 
 * @author Francisco
 *
 * Clase Almacen que realice el alta, baja, modificación, entrada de  mercancí
 *  (incrementa unidades), salida de mercancía (decrementa unidades) 
 *  El estado será un ArrayList de artículos. Esta clase es un envoltorio de un
 *  ArrrayList
 *  pero su diseño es distinto al de GESTISIMAL. No te copies, sencillamente entiéndelo.
 *  Su comportamiento será: añadir  artículos (no puede haber dos artículos iguales)
 *  eliminar artículos,  incrementar las existencias de un artículo (se delega en la
 *  clase artículo),  decrementar las existencias de un artículo (nunca por debajo de
 *  cero, se  delega en la clase artículo), devolver un artículo (para mostrarlo). Para
 *  listar el almacén podría devolverse una cadena con todos los artículos del almacén 
 *  (toString)
 */


import java.util.ArrayList;

public class almacen {
  
  /**
   * En este ArrayList almacenaremos los artículos que vayamos añadiendo
   */
  private ArrayList<Articulo> almacen = new ArrayList<Articulo>();

  /**
   * Este método añadirá al ArrayList Almacen el artículo con los datos que
   * pasemos
   * 
   * @param descripcion
   * @param precioC
   * @param precioV
   * @param unidades
   */
  public void annadir(String descripcion, double precioC, double precioV, int unidades) {
    almacen.add(new Articulo(descripcion, precioC, precioV, unidades));
  }

  /**
   * Con este método borraremos los artículos de ArrayList de almacen
   * 
   * @param codigo
   * @return
   */
  public boolean borrar(int codigo) {
    return almacen.remove(new Articulo(codigo));

  }

  /**
   * Método que incrementará las unidades del artículo almacenadas en el ArrayList
   * 
   * @param codigo
   * @param numUnidades
   */
  public void incrementa(int codigo, int cantidad) {
    // Articulo articulo = get(codigo);
    get(codigo).incrementaStock(cantidad);
    // Almacen.get(codigo).setUnidades(Almacen.get(codigo).getUnidades() +
    // cantidad);
  }

  /**
   * Este método nos extrae el índice del código del artículo en el ArrayList.
   * @param codigo
   * @return
   */
  private Articulo get(int codigo) {
    int indice = almacen.indexOf(new Articulo(codigo));
    if (indice == -1)
      return null;
    return almacen.get(indice);
  }

  /**
   * Método que decrementará las unidades del articulo almacenadas en el ArrayList
   * 
   * @param codigo
   * @param cantidad
   */
  public void decrementa(int codigo, int cantidad) {
    // Articulo articulo = get(codigo);
    get(codigo).decrementaStock(cantidad);
  }

  /**
   * Este método modificará la descripción del artículo por una nueva.
   * 
   * @param codigo
   * @param descripcion
   */
  public void modifica(int codigo, String descripcion) {
    // Articulo articulo = Almacen.get(Almacen.indexOf(new Articulo(codigo)));
    get(codigo).modificaDescripcion(descripcion);
  }

  /**
   * Método que, mediante un for-each recorremos el todos los artículos del
   * ArrayList y nos lo muestra.
   */
  public void muestra() {

    for (Articulo articulo : almacen) {
      System.out.println(articulo);
    }

  }
  
  @Override
  public String toString() {
    return "" + almacen;
  }

}
