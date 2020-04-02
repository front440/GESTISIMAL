package excepciones;

public class CodigoNoExisteError extends Exception {
  public CodigoNoExisteError(String mensaje) {
    super(mensaje);
  }
}
