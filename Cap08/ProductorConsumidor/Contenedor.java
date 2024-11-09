
/**
 * Clase que representa el buffer que almacenará
 * números, los cuáles serán producidos y consumidos al mismo tiempo.
 * @author Santizo Galicia Jessica.
 */
public class Contenedor {

  private int cuantos;
  private int sigProductor;
  private int sigConsumidor;
  private final int [] arreglo;
  private final int CUANTOS = 10;

  /**
   * Constructor por omisión
   */
  public Contenedor(){
    arreglo = new int[CUANTOS];
    cuantos = 0;
    sigProductor = 0;
    sigConsumidor = 0;
  }
  /**
   * Método que de forma concurrente debe de colocar un elemento en el contenedor
   * @param num - el número a colocar dentro del contenedor.
   */
  public synchronized void poner(int num){

    while(lleno()){
      try {
        System.out.println("Poner  en espera..");
        wait();
      } catch (InterruptedException ex) {
      }
    }
      arreglo[sigProductor] =  num;
      sigProductor ++;
      cuantos++;
      notify();
  
  }
  /**
   * Método que de forma concurrente debe colocar un elemento en el contenedor.
   * @return int - Regresa el número que se tomó de contenedor.
   */
  public synchronized int tomar(){
    int num = -1;

    while(vacio()){
      try {
         System.out.println("Tomar en espera..");
        wait();
      } catch (Exception ex) {
      }
    }
      num = arreglo[sigConsumidor];
      sigConsumidor++;
      cuantos--;
      notify();
    
     return num;
  }
  /**
   * Método que indica si el contenedor está lleno o no.
   * @return boolean -- true si el contenedor está lleno y false en otro caso.
   */
  public boolean lleno(){
    return cuantos == arreglo.length;
  }
   /**
   * Método que indica si el contenedor es vacio  o no.
   * @return boolean -- true si el contenedor está lleno y false en otro caso.
   */
  public boolean vacio(){
       return cuantos == 0;
  }
}
