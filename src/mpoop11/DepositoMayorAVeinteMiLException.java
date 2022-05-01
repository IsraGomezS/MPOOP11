package mpoop11;
/**
 * Clase que define la excepción que impide al usuario depositar más de $20,000 MXN en su cuenta en una sola exhibición.
 * @author David Gomez, David Montoya
 */
public class DepositoMayorAVeinteMiLException extends Exception{

    public DepositoMayorAVeinteMiLException() {
        super("No se permite depositar más de $ 20,000 MXN en una sola exhibición.");
    }
}
