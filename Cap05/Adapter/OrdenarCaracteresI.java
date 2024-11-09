/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package adapter;

/**
 *
 * @author Jessica
 */
public interface OrdenarCaracteresI {
   /**
   * Método que permite ordenar  un arreglo de carácteres.
   * @param char []-- el arreglo que contiene los carácteres a ordenar.
   * @return char [] -- el arreglo con los elementos ya ordenados.
   */
  public char[] ordenar(char[] elementos);

  /**
   * Método que permite imprimir los elementos de un arreglo.
   * @param elementos -- el arreglo a ser impreso.
   */
  public void imprimir(char [] elementos);
}
