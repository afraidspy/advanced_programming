package sincronizacion;

/**
 * Clase que representa una puerta del edificio, el
 * cuál equivale a un proceso.
 * @author Jessica Santizo Galicia.
 */
public class Puerta implements Runnable {

  private Edificio edificio;

  /**
   * Constructor a partir de dos parámetros.
   * @param edificio -- la variable a compartir entre los procesos.
   * @param entrada  -- Indica si la puerta del edificio es una entrada
   * o salida.
   */
  public Puerta(Edificio edificio) {
    this.edificio = edificio;
  }

  @Override
  public void run() {
    for (int cont = 0; cont < 10; cont++) {
      edificio.aumentarPersonas();
      System.out.println("Aumento el proceso: " + Thread.currentThread());
    }
  }

  /**
   * Método principal que crea los dos procesos, los cuáles
   * representan las dos puertas del edificio.
   */
  public static void main(String[] args) {

    Edificio edificio = new Edificio();
    Puerta puertaUno = new Puerta(edificio);
    Puerta puertaDos = new Puerta(edificio);
    Thread procesoUno = new Thread(puertaUno);
    Thread procesoDos = new Thread(puertaDos);

    procesoUno.start();
    procesoDos.start();
    try {
      Thread.sleep(1000);
      System.out.println("La cantidad de personas es " + edificio);
    } catch (InterruptedException ex) {
    }

  }
}
