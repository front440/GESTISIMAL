package excepciones;

public class PrecioNegativoError extends Exception {
  public PrecioNegativoError(String mensaje) {
    super(mensaje);
  }
}
