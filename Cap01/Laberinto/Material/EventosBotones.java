package Material;





import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


/**
 * Clase para el manejo de eventos , cuando los botones 
 * son presionados.
 * @author jessica
 */
public class EventosBotones implements ActionListener{

    private LaberintoFrame lab;
    /**
     * Constructor a partir de  un parametro.
     * @param labFrame -- la ventana que contiene el laberinto.
     */
    public EventosBotones(LaberintoFrame labFrame){
        lab = labFrame;
    }
    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton option =(JButton)e.getSource();
        if(("reiniciar").equals(option.getActionCommand()))
            lab.obtenerPanel().reiniciar();

        if(("resolver").equals(option.getActionCommand()))
            lab.obtenerPanel().resolver();
        
    }
    
}
