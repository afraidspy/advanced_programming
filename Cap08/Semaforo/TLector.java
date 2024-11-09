
package semaforo;


/**
 *  Clase que representa a un escritor
 * @author 
 */
public class TLector extends Thread {

    Semaforo sem;
    OperacionesArchivos operador;

    public TLector(String nombre, Semaforo s) {
        super(nombre);
        this.sem = s;
        operador = new OperacionesArchivos("datos.txt", getName());
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + ":  Intentando leer");
            sem.leer();
            operador.leerArchivo();
            System.out.println(getName() + ":  Ya ha leído");
            Thread.sleep((int)((Math.random())*50));
            sem.desblo_lectores();
        } catch (InterruptedException ex) {
            
        }
        sem.desblo_lectores();
    }

}
