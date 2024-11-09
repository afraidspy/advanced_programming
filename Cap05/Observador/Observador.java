
/**
 * Interfaz de los objetos, a los que se deben notificar cambios.
 * @author Jessica Santizo Galicia.
 */
public interface Observador {

  /**
   * Permite notificar a los objetos que un Sujeto ha cambiado.
   * @param sujeto - EL objeto que ja sido modificado.
   */
  public void actualizar(Sujeto sujeto);

}
