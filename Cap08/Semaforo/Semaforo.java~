

/**
 * Clase que representa la implementación de un Semaforo.
 * @author Jessica Santizo Galicia.
 */
public class Semaforo {

  private final static int VACIO = 0;
  private final static int LEYENDO = 1;
  private final static int ESCRIBIENDO = 0;
  protected int estado;
  protected int num_lectores = 0;

  /**
   * Constructor que permite inicializar el estado del
   * semáforo.
   */
  public Semaforo() {
    estado = VACIO;
  }

  public synchronized void leer() {
    if (estado == VACIO) {
      estado = LEYENDO;
      System.out.println("LEYENDO");
    } else if (estado != LEYENDO) {
      while (estado != LEYENDO) {
        try {
          System.out.println("Se está leyendo, esperar ...");
          wait();

        } catch (InterruptedException ex) {
        }
        estado = LEYENDO;
        num_lectores++;
      }
    }
  }

  public synchronized void escribir() {
    if (estado == VACIO) {
      estado = ESCRIBIENDO;
      System.out.println("Escribiendo");
    } else {
      while (estado != VACIO) {
        try {
          wait();
          System.out.println("Se está escribendo esperar ...");
        } catch (InterruptedException ex) {
        }
      }
    }
  }

  public synchronized void desblo_escritores() {
    estado = VACIO;
    System.out.println("DESBLOQUEAR ESCRITORES");
    notify();
  }

  public synchronized void desblo_lectores() {
    num_lectores--;
    if (num_lectores == 0) {
      estado = VACIO;
      System.out.println("DESBLOQUEAR ESCRITORES");
      notify();
    }
  }
}
