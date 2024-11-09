
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Clase con las operaciones que permiten leer y escribir
 * datos en un archivo;
 * @author Jessica Santizo Galicia
 */
public class OperacionesArchivos  {

    private String nombre;
    private String nombreHilo;

    /**
     * Constructor por omisión a partir del nombre del archivo.
     * @param nombre -- recibe el nombre del archivo.
     */
    public OperacionesArchivos(String nombre, String hilo) {
        this.nombre = nombre;
        nombreHilo = hilo;
    }

    /**
     * Permite escribir datos en un archivo de forma secuencial.
     *
     * @param a --el artículo a guardar en el archivo
     *
     */
    public void escribirArchivo(Articulo a) {
        try {
            //Si no Existe el fichero lo crea
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombre, true));
            bw.write(a.toString());
            bw.close();
             System.out.println("Se terminó de escribir en el fichero " + nombre + " por " +nombreHilo);
        } catch (IOException ex) {
            System.out.println("Error en escritura" + ex.getMessage());
        }
    }

    /**
     * Permite leer el archivo y mostrar su contenido.
     */
    public void leerArchivo() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombre));
            /*Abre un flujo de lectura a el fichero*/
            String linea;
            System.out.println("Lectura del fichero " + nombre + " por " +nombreHilo);
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (IOException io) {
            System.out.println("Error en lecutra: " + io.getMessage());
        }
    }

}
