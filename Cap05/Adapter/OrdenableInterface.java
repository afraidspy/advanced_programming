
/**
 * Interfaz que permitirá ordenar e imprimir un conjunto de elementos.
 * @author Jessica
 */
public interface OrdenableInterface {
  /**
   * Método que permite ordenar  un arreglo de número enteros.
   * @param int []-- el arreglo que contiene enteros.
   * @return int [] -- el arreglo con los elementos ordenados.
   */
  public int[] ordenar(int[] elementos);

  /**
   * Método que permite imprimir los elementos de un arreglo.
   * @param vector -- el arreglo a ser impreso.
   */
  public void imprimir(int [] vector);
}
