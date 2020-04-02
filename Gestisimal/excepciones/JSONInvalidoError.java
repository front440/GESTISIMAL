package excepciones;

public class JSONInvalidoError extends Exception {
  public JSONInvalidoError(String mensaje) {
    super(mensaje);
  }
}
