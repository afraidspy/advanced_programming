/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sinsincronizacion;

/**
 * Se agregan  números enteros a un objeto compartido
 * que en este caso es una arreglo.
 * @author Jessica Santizo Galicia.
 */
public class EscritorArreglo implements Runnable {

  private final ArregloSimple arregloSimpleCompartido;
  private final int valorInicial;

   /**
    * Constructor a partir de varios parámetros.
    * @param valor -- el valor a escribir en el arreglo.
    * @@param ArregloSimple -- el objeto que es compartido entre
    * varios procesos.
    */
  public EscritorArreglo(int valor, ArregloSimple arreglo) {
    valorInicial = valor;
    arregloSimpleCompartido = arreglo;
  } // fin del constructor

  /**
   * Método que contiene agrega un número entero al arreglo compartido.
   */
  public void run() {
    for (int i = valorInicial; i < valorInicial + 3; i++) {
      arregloSimpleCompartido.agregar(i); // agrega un elemento al arreglo compartido
    } // fin de for
  } // fin del método run
}
