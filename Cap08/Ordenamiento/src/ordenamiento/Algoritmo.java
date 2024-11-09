/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Jessica Santizo Galicia
 */
public class Algoritmo {

    private int[] datos;
    private SimulacionAlgo lienzo;
    private int pasada;

    public int[] getDatos() {
        return datos;
    }

    public Algoritmo(SimulacionAlgo lienzo, int [] datos) {
        this.lienzo = lienzo;
        pasada = 0;
        this.datos = datos;
    }

    public void ordenar() {
        int masPequenio;
        for (int i = 0; i < datos.length - 1; i++) {
            masPequenio = i;

            for (int indice = i + 1; indice < datos.length; indice++) {
                if (datos[indice] < datos[masPequenio]) {
                    masPequenio = indice;
                }
            }

            intercambiar(i, masPequenio);
            imprimirPasada(i + 1, masPequenio);
        }

    }

    public void intercambiar(int primero, int segundo) {
        int temporal = datos[primero];
        datos[primero] = datos[segundo];
        datos[segundo] = temporal;
//     lienzo.establecerDatos(datos);

    }

    public void imprimirPasada(int pasada, int indice) {

        try {
            int[] nuevo = new int[datos.length];
            String elem = "";
            for (int i = 0; i < datos.length; i++) {
                nuevo[i] = datos[i];
                elem += String.valueOf(nuevo[i] + ",");
            }
            Thread.sleep(2000);
            lienzo.updateUI();
            lienzo.repaint();
//      System.out.println("Pasada "+ elem);
//      if (pasada == 1){
//          lienzo.establecerDatos(nuevo);
//      }else{
//          try {
//              Thread.sleep(50);
//            lienzo.establecerDatos(nuevo);
//          } catch (InterruptedException ex) {
//              Logger.getLogger(Algoritmo.class.getName()).log(Level.SEVERE, null, ex);
//          }
//      }
            System.out.println(elem);
//      lienzo.repaint();
            pasada++;
//      lienzo.repaint();
            System.out.println();
            //     lienzo.repaint();
            //    System.out.print(datos[indice] + "* "); // indica intercambio
            //// termina de imprimir el arreglo en pantalla
            //    for (int i = indice + 1; i < datos.length; i++) {
            //      System.out.print(datos[i] + " ");
            //    }
            //    System.out.print("\n"); // para alineación
            //// indica la cantidad del arreglo que está almacenada
            //    for (int j = 0; j < pasada; j++) {
            //      System.out.print("-- ");
            //    }
            //    System.out.println("\n"); // agrega fin de línea
            // fin del método imprimirPasada
            // método para imprimir los valores del arreglo
        } // fin del método imprimirPasada
        catch (InterruptedException ex) {
            Logger.getLogger(Algoritmo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
// método para imprimir los valores del arreglo

    @Override
    public String toString() {
        StringBuilder temporal = new StringBuilder();
// itera a través del arreglo
        for (int elemento : datos) {
            temporal.append(elemento);
        }
        temporal.append("\n"); // agrega carácter de nueva línea
        return temporal.toString();
    } // fin del método toString
    // fin de la clase OrdenamientoSeleccion
//  public static void main(String[] args) {
//    Algoritmow alg = new Algoritmow();
//    alg.ordenar();
//
//
//  }
}
