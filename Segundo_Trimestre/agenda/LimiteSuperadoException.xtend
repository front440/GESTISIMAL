package agenda

/** 
 * Esta exepcion será lanzada cuando el limite establecido en la agenda sea superado
 * @author Francisco
 */
@SuppressWarnings("serial") class LimiteSuperadoException extends Exception {
	new(String mensaje) {
		super(mensaje)
	}
}
