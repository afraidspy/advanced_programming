/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sinsincronizacion;


/**
 * Clase que permite probar un programa, donde dos procesos
 * acceden a un mismo recurso.
 * @author Jessica Santizo Galicia.
 */
public class PruebaArregloCompartido {

  public static void main(String[] args) {

    ArregloSimple arregloSimpleCompartido = new ArregloSimple(6);
    // crea dos tareas para escribir en el objeto ArregloSimple compartido
    EscritorArreglo escritor1 = new EscritorArreglo(1, arregloSimpleCompartido);
    EscritorArreglo escritor2 = new EscritorArreglo(11, arregloSimpleCompartido);
    
    //Ejecutamos cada hilo mandando a llamar al método start
    Thread hilo1 = new Thread(escritor1);
    Thread hilo2 = new Thread(escritor2);
    hilo1.start();
    hilo2.start();

    try {
      //Esperamos un cierto tiempo para poder imprimir los elementos del arreglo.
      Thread.sleep(2000);
      System.out.println(arregloSimpleCompartido); // imprime el contendio
    } catch (InterruptedException ex) {
      System.out.println("Error");
    }

  }
}
