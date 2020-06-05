package agenda;

/**
 * Esta exepcion será lanzada cuando el limite establecido en la agenda sea superado
 * @author Francisco
 *
 */
@SuppressWarnings("serial")
public class LimiteAgendaException extends Exception {
  public LimiteAgendaException(String mensaje) {
    super(mensaje);
  }
}
