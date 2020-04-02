package excepciones;

public class CantidadNegativaError extends Exception {
  public CantidadNegativaError(String mensaje) {
    super(mensaje);
  }
}
