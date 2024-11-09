/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package adapter;

/**
 *
 * @author Jessica
 */
public class Prueba {
  public static void main (String [] args){
    OrdenableInterface ordenar = new Ordenar();
    int [] elements = {3,1,8,5,5};
    System.out.println("Los elementos del arreglo a ordenar son: ");
    ordenar.imprimir(elements);
    System.out.println("\nDespués de usar el algoritmo de ordenamiento tenemos");
    ordenar.ordenar(elements);
    ordenar.imprimir(elements);

    char [] elemChar = {'z','w','a','k','o'};
    Adaptador a =  new Adaptador();
    System.out.println("\nLos elementos del arreglo de caracteres a ordenar son:");
    int [] elemInt = a.conversorInt(elemChar);
    a.imprimir(elemInt);
    System.out.println("\nDespués de usar el algoritmo de ordenamiento tenemos");
    elemInt = ordenar.ordenar(a.conversorInt(elemChar));
    a.imprimir(elemInt);
  }

}
