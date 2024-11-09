/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Material;

/**
 *
 * @author Jess
 */
public class Prueba2 {

  public static void main (String [] a){
    EjemploThread h1 = new EjemploThread("Uno");
    EjemploThread h2 = new EjemploThread("Dos");
    EjemploThread h3 = new EjemploThread("Tres");

    h1.start();
    h2.start();
    h3.start();

  }

}
