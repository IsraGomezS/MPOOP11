package mpoop11;

/**
 * Clase principal
 * @author David Gomez, David Montoya
 */

public class MPOOP11 {

    public static void main(String[] args) {
        
        String[] mensajes = {"mensaje 1", "mensaje 2", "mensaje 3"};
        try{
            for (int i = 0; i <= 3 ; i++) {
                System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        //DESPUÈS DE UN TRY CATCH DEBERIA DE HABER UN FINALLY
        System.out.println("Sigue el código");
        System.out.println("------------DIVIDIR ENTRE CERO------------");
        try{ 
            float x=10/0;
            System.out.println("x="+x);
        }catch(ArithmeticException ex){
            System.out.println("Error"+ex.getMessage());
        }finally{
            //FINALLY ES PARA ERRORES CATASTRÓFICOS
            System.out.println("A pesar de todo, se ejecuta el finally.");
        }
        
        System.out.println("------------CATCH ANIDADOS------------");
        try{ 
            float x=10/0;
            System.out.println("x="+x);
        }catch(ArithmeticException ex){
            System.out.println("Error"+ex.getMessage());
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }finally{
            //FINALLY ES PARA ERRORES CATASTRÓFICOS
            System.out.println("A pesar de todo, se ejecuta el finally.");
        }
        
        System.out.println("-------PROPAGACIÓN DE EXCEPCIONES-----");
        try{
            double division=miMetodoDivision(20.0f,2.0);//PARA ESTE TIPO DE ERRORES SE RECOMIENDA CREAR EL METODO Y OMITIR EL TRY Y CATCH
            System.out.println(division);
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("------EJERCICIO CUENTA BANCARIA-----");
        Cuenta cuenta = new Cuenta();
        
        try {
            System.out.println("$"+cuenta.getSaldo());
            cuenta.depositar(1000);
            System.out.println("$"+cuenta.getSaldo());
            cuenta.retirar(100);
            cuenta.retirar(100);
            cuenta.retirar(100);
            cuenta.retirar(100);
            System.out.println("$"+cuenta.getSaldo());
        }catch (SaldoInsuficienteException | DepositoMayorAVeinteMiLException | TresRetirosException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        
        //SALDO FINAL
        System.out.println("$"+cuenta.getSaldo());
    }
    //TODO LO QUE ESTÀ JUNTO AL MAIN ES ESTÀTICO, LO ESTÀTICO NO SE PUEDE DESTRUIR
    /**
     * Método que realiza la división entre dos números uno de tipo float y otro de tipo double y que arroja una excpeción aritmética.
     * @param d Numerador o dividendo de tipo float.
     * @param d0 Denominador o divisor de tipo double.
     * @return Devuelve el valor de la división d/d0
     */
    private static double miMetodoDivision(float d, double d0) throws ArithmeticException{
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return d/d0;
    }
}
