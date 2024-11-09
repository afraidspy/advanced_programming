package semaforo;

/**
 * Clase que representa a un escritor 
 * @author 
 */
public class TEscritor extends Thread {

  private Semaforo sem;
  private OperacionesArchivos operador;
  private Articulo a;

  /**
   * Constructor a partir de varios parámtros.
   * @param nombre -- el nombre del escritor.
   * @param s -- 
   */
  public TEscritor(String nombre, Semaforo s, Articulo a) {
    super(nombre);
    this.sem = s;
    operador = new OperacionesArchivos("datos.txt", getName());
    this.a = a;
  }

  @Override
  public void run() {
    try {
      System.out.println(getName() + ": Intentando escribir");
      sem.escribir();
      operador.escribirArchivo(a);
      Thread.sleep((int) ((Math.random()) * 50));

    } catch (InterruptedException ex) {
    }
    sem.desblo_escritores();
  }
}
