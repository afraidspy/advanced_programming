/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Material;

/**
 *
 * @author Jess
 */
public class Hilo1 implements Runnable {

  private String nombre;

  public Hilo1(String nombre) {
    this.nombre = nombre;
  }

  public void run() {
    System.out.println("Ejecutando " + nombre);
  }
}
