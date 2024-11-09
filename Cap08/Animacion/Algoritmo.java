

/**
 * Clase que permite 
 * @author Jessica Santizo Galicia
 */
public class Algoritmo {

    private int[] datos;

    /**
    * Constructor a partir de un parámetro.
    * @param datos -- el arreglo de números.
    */
    public Algoritmo(int [] datos) {
        this.datos = datos;
    }
    /**
    * Método específico para ordenar el conjunto de
    * elementos usando el algoritmo de selección.
    */
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
        }

    }
   /**
   * Regresa el arreglo de datos.
   * @return -- regresa el arreglo de números.
   */
   public int[] getDatos() {
        return datos;
    }
    /**
    * Función auxiliar para intercambiar dos números, dentro
    * de un arreglo.
    * @param primero -- el primer número a intercambiar.
    * @param primero -- el segundo número a intercambiar.
    */
    public void intercambiar(int primero, int segundo) {
        int temporal = datos[primero];
        datos[primero] = datos[segundo];
        datos[segundo] = temporal;
    }

    // método para imprimir los valores del arreglo

    @Override
    public String toString() {
        StringBuilder temporal = new StringBuilder();
        for (int elemento : datos) {
            temporal.append(elemento);
    	    temporal.append("\n"); // agrega carácter de nueva línea
        }
 
        return temporal.toString();
    } // fin del método toString
    // fin de la clase OrdenamientoSeleccion

  public static void main(String[] args) {
    Algoritmow alg = new Algoritmow();
    alg.ordenar();
  }
}
