

import java.util.LinkedList;

/**
 * Esta clase corresponde al director del patrón Builder.
 * @author Jessica Santizo Galicia.
 */
public class Nino {

    private LinkedList<AnimalBuilder> animales;
    private String nombre;

    /**
     * Constructor a partir de un parámetro.
     * @param nombre -- Recibe le nombre del niño.
     */
    public Nino(String nombre) {
        this.nombre = nombre;
       
    }
    /**
     * Establece una lista de los animales que se van a crear.
     * @param animales -- La lista con los animales que se van a crear.
     */
    public void establecerAnimales(LinkedList<AnimalBuilder> animales){
        this.animales = animales;
    }
    /**
     * Construye cada animal contenido en la lista.
     */
    public void construir() {
        for (AnimalBuilder animal : animales) {
            System.out.println(animal);
   
        }
    }
}
