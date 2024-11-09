package PatronObservador;

/**
 * Representa el sensor del sistema y está identificado
 * por un nombre único.
 * @author Jessica Santizo Galicia.
 */
public class Sensor extends Sujeto {

  private boolean estadoSensor;

  public Sensor() {
    estadoSensor = false;
  }

  public boolean isEstadoSensor() {
    return estadoSensor;
  }

  @Override
  public void establecerSujeto(boolean estado) {
    this.estadoSensor = estado;
  }

  public boolean getEstadoSensor(){
    return estadoSensor;
  }

}
