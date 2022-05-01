package mpoop11;
/**
 * Clase que define la excepción que impide al usuario realizar un retiro si tiene un saldo insuficiente en su cuenta.
 * @author David Gomez, David Montoya
 */
public class SaldoInsuficienteException extends Exception{//extends throwable
    
    public SaldoInsuficienteException() {
        super("Saldo insuficiente");
    }
}
