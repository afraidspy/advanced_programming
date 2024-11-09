/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PatronObservador;

/**
 *  Clase que permite simular una alarma
 *  que será activada en caso de sismo.
 * @author Jessica Santizo Galicia.
 */
public class Alarma implements Observador {

  private boolean estadoActivada;
  private String id;

  /**
   * Método constructor que establece el nombre
   * de
   */
  public Alarma(String id){
    this.id = id;
    estadoActivada = false;
  }
  /**
   * Permite saber si una alarma está sonando  o no;
   */
//  public boolean isEstadoActivada() {
//    return estadoActivada;
//  }
//
//  public String getId() {
//    return id;
//  }
//

  public void actualizar(Sujeto sujeto) {
    if (sujeto.getEstadoSensor()){
      System.out.println("La alarma "+ id +" está activa.");
    }else{
      System.out.println("Apagando alarma");
    }
  }

}
