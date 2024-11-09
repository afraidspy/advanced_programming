


/**
 * Clase para representar la cuenta de un cliente
 * del banco.
 * @author Jessica
 */
public class Cuenta {
    
    private int numeroCuenta;
    private double saldo;
    
    /**
    * Constructor a partir de un parámetro.
    * @param numeroCuenta -El número de cuenta del cliente.
    */
    public Cuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 5000;
    }
    /**
    * Obtiene el número de cuenta del cliente.
    * @return - Regresa el número de cuenta del usuario-
    */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    /**
    * Establece el número de cuenta 
    * @return - Número de cuenta del usuario.
    */
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    /**
    * Obtiene el saldo de una cuenta.
    * @return - Regresa el saldo de la cuenta de un cliente.
    */
    public double getSaldo() {
        return saldo;
    }
    
}
