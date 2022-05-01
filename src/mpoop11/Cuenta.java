package mpoop11;
/**
 * Clase que define y sirve para crear una cuenta bancaria.
 * @author David Gomez, David Montoya
 */
public class Cuenta {
    private float saldo;
    private int numDeRetiros;
    /**
     * Constructor vacio
     */
    public Cuenta() { 
    }
    /**
     * Metodo que sirve para obtener el saldo
     * @return Devuelve el saldo en la cuenta
     */
    public float getSaldo() {
        System.out.println("Saldo: ");
        return saldo;
    }
    /**
     *  Metodo que sirve para depositar en la cuenta
     * @param monto Cantidad de dinero a depositar
     * @throws DepositoMayorAVeinteMiLException Invoca la excepción contenida en la clase DepositoMayorAVeinteMiLException
     */
    public void depositar(float monto) throws DepositoMayorAVeinteMiLException{
       if (monto>20000){
           throw new DepositoMayorAVeinteMiLException();
       }else{
           System.out.println("Depositando: \n$"+monto);
           saldo+=monto;
       }
    }
    /**
     * Metodo para retirar de la cuenta
     * @param monto Cantidad de dinero a retirar
     * @throws SaldoInsuficienteException Invoca la excepción contenida en la clase SaldoInsuficienteException.
     * @throws TresRetirosException Invoca la excepción contenida en la clase TresRetirosException.
     */
    public void retirar(float monto) throws SaldoInsuficienteException, TresRetirosException{//ADVERTIR QUE SE PUEDE ARROJAR ESTA EXCEPCION
       if(monto>saldo){
           throw new SaldoInsuficienteException();
       }else if(numDeRetiros>2){
           throw new TresRetirosException();
       }
       else{
           System.out.println("Retirando: \n$"+monto);
           saldo-=monto;
           numDeRetiros++;
       }
   } 
}
