package agenda;

/**
 * 1. Crea una clase para gestionar una agenda de un máximo de 100 contactos en Java y haz un
 * programa que la pruebe.
 * Nombre clase: Agenda.
 * 
 * Un contacto está definido por:
 *  • Nombre. Será válido cuando esté compuesto por letras y espacios (solo en medio) y no
 *    haya otro con el mismo nombre. (hecho)
 *  • Teléfono. Será válido si está compuesto por nueve dígitos, el primero empieza por 6, 7 ó 9. (hecho)
 *  • Dirección. No se valida, puede estar vacía. (hecho)
 *  • Correo electrónico. Si existe hay que validarlo. (hecho)
 *  
 * El comportamiento de esta clase es el siguiente:
 *  • Tiene dos constructores:
 *    ◦ El primero sin parámetros, simplemente crea una agenda vacía. (hecho)
 *    ◦ El segundo recibe un fichero CSV con información de contactos. (hecho)
 *    
 *  • Alta de contacto. Añade un contacto a la agenda. Lanza una excepción si se sobrepasa el
 *      máximo de contactos (100).
 *  • Baja de contacto. Lanza una excepción si el contacto a borrar no existe.
 *  • Busca un contacto. Devuelve el contacto que coincida con la búsqueda, en caso de no
 *    encontrar coincidencia se devuelve un valor nulo.
 *  • Reduce el tamaño de la agenda. Cambia el número máximo de contactos a otro valor inferior
 *      a 100, si se diera un valor mayor lanza una excepción, si reducimos el tamaño de la agenda a
 *      un valor inferior al número de contactos que hay lanza una excepción.
 *  • Exporta a fichero CSV. Lanza una excepción si no podemos escribir en el fichero.
 *  • Importa de fichero CSV. Cada contacto importado llama al método que da de alta. Lanza
 * una excepción si no podemos leer del fichero.
 * El control del tamaño de la agenda se hace sobre esta clase.
 * Una agenda está formada por una colección de de contactos, que a su vez son objetos de la clase
 * Contacto. Esta clase:
 * • Tiene tres constructores:
 * ◦ El primero recibe un nombre y un teléfono. (hecho)
 * ◦ El segundo los datos anteriores y además una dirección. (hecho)
 * ◦ El tercero los datos anteriores y además un correo electrónico. (hecho)
 * ◦ Los datos los validamos mediante expresiones regulares, si alguno es inválido lanzamos
 *    una excepción. (hecho)
 * • Tiene getters para obtener el nombre, teléfono, dirección y correo electrónico. (hecho)
 * • Tiene setters para asignar teléfono, dirección y correo electrónico. En caso de datos no
 *      válidos lanza una excepción. (hecho)
 * Ten en cuenta de que en ninguna de estas clases se interactúa con el usuario.
 * Haz un test con un menú que me permita gestionar una agenda con todas sus opciones. Limita el
 * tamaño de la agenda a 5 contactos.
 * Peso sobre el total: 75%.
 * 
 * @author Francisco
 *
 */

public class Contacto {
	
	private String nombre;
	private String telefono;
	private String direccion;
	private String correo;
	
	/**
	 * Método constructor de contacto
	 * @param nombre
	 * @param telefono
	 * @throws ContactoInvalidoException 
	 */
	public Contacto(String nombre, String telefono) throws ContactoInvalidoException {
	  setNombre(nombre);
    setTelefono(telefono);
  }
	
	/**
	 * Método contructor de contacto
	 * @param nombre
	 * @param telefono
	 * @param direccion
	 * @throws ContactoInvalidoException 
	 */
	public Contacto(String nombre, String telefono, String direccion) throws ContactoInvalidoException {
	  setNombre(nombre);
    setTelefono(telefono);
    setDireccion(direccion);
  }

  /**
	 * Método constructor de contacto
	 * @param nombre
	 * @param telefono
	 * @param direccion
	 * @param correo
	 * @throws ContactoInvalidoException 
	 */
  public Contacto(String nombre, String telefono, String direccion, String correo) throws ContactoInvalidoException {
    setNombre(nombre);
    setTelefono(telefono);
    setDireccion(direccion);
    setCorreo(correo);
  }

  // Métodos de obtención y establecimiento
  
  public String getNombre() {
    return nombre;
  }

  /**
   * Método de establecimiento del nombre
   * @param nombre
   * @throws ContactoInvalidoException
   */
  public void setNombre(String nombre) throws ContactoInvalidoException {
    String expresion = "^([A-Z]{1}[a-z]+[ ]?){1,2}$";
    if (!nombre.matches(expresion)) {
      throw new ContactoInvalidoException("Nombre incorrecto");
    }
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  /**
   * Método de establecimiento del teléfono
   * @param telefono
   * @throws ContactoInvalidoException
   */
  public void setTelefono(String telefono) throws ContactoInvalidoException {
    String expresion = "(6|7|9)[0-9]{8}";
    if (!telefono.matches(expresion)) {
      throw new ContactoInvalidoException("Teléfono incorrecto");
    }
    this.telefono = telefono;
  }

  public String getDireccion() {
    return direccion;
  }

  /**
   * Método de establecimiento de dirección
   * @param direccion
   */
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getCorreo() {
    return correo;
  }

  /**
   * Método de establecimiento del correo
   * @param correo
   * @throws ContactoInvalidoException
   */
  public void setCorreo(String correo) throws ContactoInvalidoException {
    String expresion = "[^@]+@[^@]+\\.[a-zA-Z]{2,}";
    if (!correo.matches(expresion)) {
      throw new ContactoInvalidoException("Correo incorrecto");
    }
    this.correo = correo;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
    result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Contacto other = (Contacto) obj;
    if (nombre == null) {
      if (other.nombre != null)
        return false;
    } else if (!nombre.equals(other.nombre))
      return false;
    if (telefono == null) {
      if (other.telefono != null)
        return false;
    } else if (!telefono.equals(other.telefono))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "\nNombre: " + nombre + "\n"
        +   "Teléfono: " + telefono + "\n"
        +   "Dirección: " + direccion + "\n"
        +   "Correo: " + correo + "\n"
        +   "------------------------------------";
  }
  
}
