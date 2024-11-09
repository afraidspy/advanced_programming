/**
 * Interfaz común a todos los algoritmos de codificación.
 * @author Jessica Santizo Galicia.
 */
public interface Algoritmo {

  /**
   * Método que permite cifrar una cadena.
   * @param cadenaOriginal -- la cadena a cifrar.
   * @return String--  la cadena generada por un algoritmo de encriptación.
   */
  public String encriptar(String cadenaOriginal);
  /**
   * Método que permite descifrar una cadena.
   * @param cadenaCifrada -- la cadena a decifrar.
   * @return String -- La cadena en su estado original.
   */
  public String desEncriptar(String cadenaCifrada);

}
