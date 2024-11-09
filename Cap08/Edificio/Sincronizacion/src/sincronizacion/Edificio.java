
package sincronizacion;

/**
 * Clase que representa el edificio, con una variable
 * que almacenará la cantidad de personas que entrarn al edificio.
 * @author Jessica Santizo Galicia.
 */
public class Edificio {

  private int numPersonas;

  public Edificio() {
    numPersonas = 0;
  }

  public int getNumPersonas() {
    return numPersonas;
  }

  public void aumentarPersonas() {
    numPersonas += 1;
  }

  @Override
  public String toString() {
    return "La cantidad de personas es: " + numPersonas;
  }
}
