
package adapter;

/**
 *
 * @author Jessica
 */
public class Ordenar implements OrdenableInterface {

  @Override
  public int[] ordenar(int[] arreglo) {

    return arreglo;
  }
  
  @Override
  public void imprimir(int [] arreglo) {
    for (int i = 0; i < arreglo.length; i++){
      System.out.print(arreglo[i] + " , ");
    }
  }
}
