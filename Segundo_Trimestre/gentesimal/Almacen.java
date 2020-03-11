package gentesimal;

/**
 * 
 * @author Francisco
 *
 * Clase Almacen que realice el alta, baja, modificaci�n, entrada de  mercanc�
 *  (incrementa unidades), salida de mercanc�a (decrementa unidades) 
 *  El estado ser� un ArrayList de art�culos. Esta clase es un envoltorio de un
 *  ArrrayList
 *  pero su dise�o es distinto al de GESTISIMAL. No te copies, sencillamente enti�ndelo.
 *  Su comportamiento ser�: a�adir  art�culos (no puede haber dos art�culos iguales)
 *  eliminar art�culos,  incrementar las existencias de un art�culo (se delega en la
 *  clase art�culo),  decrementar las existencias de un art�culo (nunca por debajo de
 *  cero, se  delega en la clase art�culo), devolver un art�culo (para mostrarlo). Para
 *  listar el almac�n podr�a devolverse una cadena con todos los art�culos del almac�n 
 *  (toString)
 */


import java.util.ArrayList;

public class almacen {
  
  /**
   * En este ArrayList almacenaremos los art�culos que vayamos a�adiendo
   */
  private ArrayList<Articulo> almacen = new ArrayList<Articulo>();

  /**
   * Este m�todo a�adir� al ArrayList Almacen el art�culo con los datos que
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
   * Con este m�todo borraremos los art�culos de ArrayList de almacen
   * 
   * @param codigo
   * @return
   */
  public boolean borrar(int codigo) {
    return almacen.remove(new Articulo(codigo));

  }

  /**
   * M�todo que incrementar� las unidades del art�culo almacenadas en el ArrayList
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
   * Este m�todo nos extrae el �ndice del c�digo del art�culo en el ArrayList.
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
   * M�todo que decrementar� las unidades del articulo almacenadas en el ArrayList
   * 
   * @param codigo
   * @param cantidad
   */
  public void decrementa(int codigo, int cantidad) {
    // Articulo articulo = get(codigo);
    get(codigo).decrementaStock(cantidad);
  }

  /**
   * Este m�todo modificar� la descripci�n del art�culo por una nueva.
   * 
   * @param codigo
   * @param descripcion
   */
  public void modifica(int codigo, String descripcion) {
    // Articulo articulo = Almacen.get(Almacen.indexOf(new Articulo(codigo)));
    get(codigo).modificaDescripcion(descripcion);
  }

  /**
   * M�todo que, mediante un for-each recorremos el todos los art�culos del
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
