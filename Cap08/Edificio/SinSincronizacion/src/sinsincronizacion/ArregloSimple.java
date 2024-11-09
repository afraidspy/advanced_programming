/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sinsincronizacion;

import java.util.Random;

/**
 * 
 * @author Jessica Santizo Galicia.
 */
public class ArregloSimple {

  private int arreglo[]; // el arreglo entero compartido
  private int indiceEscritura = 0; // índice del siguiente elemento a escribir
  private Random generador = new Random();

 /**
  * Constructor a partir de un parámetro
  * @param tamanio -- La cantidad de elementos de arreglo.
  */
  public ArregloSimple(int tamanio) {
    arreglo = new int[tamanio];
  } // fin del constructor


  /**
   * Método que permite agregar un número entero al arreglo.
   */
  public void agregar(int valor) {
    int posicion = indiceEscritura; // almacena el índice en donde se va a escribir el siguiente número.
    try {
    // pone el subproceso en inactividad (a dormir) de 0 a 499 milisegundos
      Thread.sleep(generador.nextInt(500));
    } // fin de try
    catch (InterruptedException ex) {
      System.out.println("Ocurrió un error");
    } // fin de catch
    // coloca el valor en el elemento apropiado
    arreglo[posicion] = valor;
    System.out.println("EL hilo "+Thread.currentThread().getName() + " escribió el número "+valor+ " en la posición "+posicion +" del arreglo");
    ++indiceEscritura; // incrementa el índice del siguiente elemento a escribir
  } // fin del método agregar

  // se utiliza para imprimir el contenido del arreglo entero compartido

  @Override
  public String toString() {
    String cadenaArreglo = "\nContenido de ArregloSimple:\n";
    for (int i = 0; i < arreglo.length; i++) {
      cadenaArreglo += arreglo[i] + " ";
    }
    return cadenaArreglo;
  } 
}
