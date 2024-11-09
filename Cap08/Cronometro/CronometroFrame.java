import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 * Frame que representa la ventana, en dónde se colocará el panel con
 * los elementos del Cronómetro.
 * @author Jessica Santizo Galicia
 */
public class CronometroFrame extends JFrame{

    private CronometroPanel cronometro;
    /**
     * Constructor a partir de un p&aacuteramtro, aqu&iacute
     * agregamos el panel al frame y el bot&oacuten.
     * Establecemos su ubicaci&oacute.
     * @param nombre  -- recibe el nombre del frame
     * que aparece en la barra de t&iacutetulo.
     */
    public CronometroFrame(String nombre){
        super(nombre);
        cronometro = new CronometroPanel();
        this.setLocation(400, 200);
        this.setSize(400, 150);
        this.setVisible(true);
        this.add(cronometro,BorderLayout.NORTH);
        this.pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
      /**
       * Método de prueba que permite
       * mostrar el cronómetro en pantalla, al crear un objeto
       * de  tipo CronometroFrame
       */
    public static void main (String [] args){
      CronometroFrame cronometro = new CronometroFrame("Cronómetro");
    }

}
