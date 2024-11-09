

import java.util.Scanner;

/**
 * Clase que contiene métodos especiales
 * para obtenes estadísticas sobre un texto.
 * @author Santizo Galicia Jessica.
 */
public class CalcularDatos {
  private String texto;
  /**
   *Método constructor que a partir de un parámetro.
   *@param texto -- Recibe el texto del cuál se van a obtener las estadísticas.
   */
  public CalcularDatos(String texto) {
    this.texto = texto;
  }
  /**
   * Método que regresa la cantidad de carácteres de un texto.
   * @return -- la cantidad de carácteres que contiene el texto.
   */
  public int calcularCaracteres() {
    return texto.length();
  }
  /**
   * Permite obtener la cantidad de palabras  de un texto.
   * @return int - la cantidad de palabras del texto.
   */
  public int obtenerCantidadPalabras() {
    Scanner teclado = new Scanner(texto);
    int palabras = 0;
    while (teclado.hasNext()) {
      teclado.next();
      palabras++;
    }
    return palabras;
  }
  /**
   * Permite obtener la cantidad de líneas de un texto.
   * @return int - la cantidad de líneas del texto.
   */
  public int calcularLineas() {
    Scanner scaner = new Scanner(texto);
    int lineas = 0;
    while (scaner.hasNextLine()) {
      scaner.next();
      lineas++;
    }
    return lineas;
  }
  /**
   *Método para obtener el texto 
   *@return texto
   */
  public String getTexto() {
    return texto;
  }
}
