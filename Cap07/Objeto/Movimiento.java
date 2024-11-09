

public class Movimiento {

  public final static int DESPLAZAMIENTO = 0;
  public final static int ARRIBA = 1;
  public final static int ABAJO = 2;
  public final static int IZQUIERDA = 3;
  public final static int DERECHA = 4;
  private int tipo;      
  private int param;     

  /**
   * Constructor  a partir de dos parámetros.
   * @param tipo - tipo de movimiento a realizar en el mapa.
   */
  public Movimiento(int tipo, int param) {
    this.tipo = tipo;
    this.param = param;
  }

  @Override
  public String toString() {
    if (tipo == ARRIBA) {
      return "Desplazamiento arriba de " + param;
    } else if (tipo == ABAJO) {
      return "Desplazamiento abajo de " + param;
    } else if (tipo == IZQUIERDA) {
      return "Desplazamiento izquierda de " + param;
    } else if (tipo == DERECHA) {
      return "Desplazamiento derecha de " + param;
    } else {
      return "ERROR DEBE DE ELEGIR EL TIPO DE DESPLAZAMIENTO";
    }
  }

  /**
   *Se obtiene el tipo de movimiento.
   * @return int -  el tipo de movimiento.
   */
  public int getTipo() {
    return tipo;
  }

  /**
   *Se obtiene la cantidad de puntos a moverse.
   * @return int -  la cantidad de puntos que se moverá el objeto.
   */
  public int getParam() {
    return param;
  }
}
