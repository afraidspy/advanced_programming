package Material;


/**
 * Clase que crea hilos, extendiendo de Thread.
 * @author Jessica Santizo Galicia.
 */
public class EjemploThread extends Thread{


  /**Constructor a partir de un parámetro
   @param nombre -- Pertmite identificar un hilo de otro*/
  public EjemploThread(String nombre){
    super(nombre);
  }
  @Override
  public void run(){
    try {
      Thread.sleep(150);
    } catch (InterruptedException ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println("Ejecutando el hilo "+this.getName());
  }

  /**
   * Método para probar la creación de hilos, a través
   * del uso de la clase Thread.
   */
  public static void main(String[] a) {
    Thread hilo = new Thread(new Hilo1("Uno"));
    Thread hilo2 = new Thread(new Hilo1("Dos"));
    Thread hilo3 = new Thread(new Hilo1("Tres"));
    hilo.start();
    hilo2.start();
    hilo3.start();
  }
  

}
