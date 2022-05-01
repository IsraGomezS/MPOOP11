package mpoop11;
/**
 * Clase que define la excepción que impide al usuario realizar más de 3 retiros de su cuenta
 * @author David Gomez, David Montoya
 */
public class TresRetirosException extends Exception{

    public TresRetirosException() {
        super("No se pueden realizar más de 3 retiros.");
    }
}
