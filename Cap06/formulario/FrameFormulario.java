
import javax.swing.JFrame;
import java.awt.GridLayout;

/**
 * Frame que contendr&aacute el panel
 * en d&oacute se dibujar&aacute  el formulario.
 * @author Santizo Galiicia Jessica
 * @version 1.0
 */
public class FrameFormulario extends JFrame{
 
    private PanelFormulario formulario;
    /**
     * Constructor a partir de un p&aacuteramtro, aqu&iacute 
     * agregamos el panel al frame.
     * Establecemos su ubicaci&oacute.
     * @param nombre  -- recibe el nombre del frame 
     * que aparece en la barra de t&iacutetulo.
     */
    public FrameFormulario(String nombre){
        super(nombre);
        formulario = new PanelFormulario();
        this.setLayout(new GridLayout(3,1));

        this.add(formulario.formulario());
        this.add(formulario.opcionesNoticias());
        this.add(formulario.botones());

        this.setVisible(true);

        setDefaultCloseOperation( JFrame .EXIT_ON_CLOSE) ; //evento cerrar

    }
    
}

