

/**
 * Clase que representa de forma generalizada una transacción.
 * @author Jessica
 */
public abstract class Transaccion {
    
    protected Cuenta cuenta;
   
    /**
     * Asigna  la cuenta que ejecuta una transacción.
     * @param cuenta - la cuenta en donde se hará la transacción.
     */
    public void establecerNumeroCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    /**
     * Método que permite realizar un tipo de transacción.
     */
    public abstract void ejecutar(); 
    
}
