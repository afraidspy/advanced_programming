
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Interfaz común a todos los sujetos,
 * para conocer el estado de los Observadores.
 * @author Jessica Santizo Galicia.
 */
public abstract class Sujeto {

  private LinkedList<Observador> listaObservadores;
  private boolean estadoActivo;

  public Sujeto() {

  }

  public abstract void establecerSujeto(boolean estado);

  /**
   * Permite agregar un observador, para ser notificado del cambio
   * de un Sujeto.
   * @param obs -El observador a ser agregado en la lista.
   */
  public void agregar(Observador obs) {

  }

  /**
   * Permite eliminar un obse rvador de la lista de observadores.
   * @param obs - El objeto a ser eliminado de la lista.
   */
  public void eliminar(Observador obs) {
  }

  /**
   * Notifica a todos sus observadores que ha habido cambios en el sujeto.
   * La notificación consiste en una llamada al método actualizar, definido en los observadores.
   */
  public void notificar() {
  
  }

  /**
   * Regresa el estado actual del sensor.
   * @return boolean -- regresa el estado activo del sensor.
   */
  public boolean getEstadoSensor() {
    return estadoActivo;
  }
}
