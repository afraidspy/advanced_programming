package Material;




import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Clase que me permite dibujar la ventana que contendra el laberinto.
 * @author jessica
 */
public class LaberintoFrame extends JFrame{
    
    private LaberintoJPanel lab;
    private EventosBotones evento;
    /**
     * Constructor a partir del nombre que tendra la ventana
     */    
    public LaberintoFrame (String nombre){
        super(nombre);
        this.setLocation(500, 200);
        this.setVisible(true);
        this.setSize(451, 500);
        agregarPanelLaberinto();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);
        
    }    
    /**
     * Permite agregar el panel que contiene el laberinto
     * a la ventana
     */
    private void agregarPanelLaberinto(){
        this.add(BorderLayout.NORTH,agregarBotones());
        lab =  new LaberintoJPanel();
        this.add(BorderLayout.CENTER,lab);
    }
    /**
     * Permite agregar el panel que contiene a los botones
     * reiniciar y resolver  a la ventana.
     * @return JPanel- el panel con los botones reiniciar y resolver.
     */
    private JPanel agregarBotones(){
        evento =  new EventosBotones(this);
        JPanel botones = new JPanel();
        botones.setLayout(new GridLayout());
        botones.add(crearBotonReiniciar());
        botones.add(crearBotonResolver());
        return botones;
    }
    /**
     * Crea el boton reiniciar y le añade el evento
     * que se lanzara al dar click en el boton,en  este 
     * caso dibujara un nuevo laberinto
     * @return JButton -- regresa el boton de reiniciar.
     */
    private JButton crearBotonReiniciar(){
       JButton reiniciar =  new JButton("Reiniciar");
       reiniciar.setActionCommand("reiniciar");
       reiniciar.addActionListener(evento);
       return reiniciar;
    
    }
    /**
     * Crea el boton resolver y le añade el evento
     * que se lanzara al dar click en el boton, en este caso
     * se debe de trazar la ruta que da solucion al laberinto.
     * @return JButton -- regresa el boton de resolver.
     */
    private JButton crearBotonResolver(){
      JButton resolver =  new JButton("Resolver");
      resolver.setActionCommand("resolver");
      resolver.addActionListener(evento);
      return resolver;
    }
    /**
     * Regresa el panel que contiene el laberinto
     * @return LaberintoPanel -- panel que contiene el laberinto
     */
    public LaberintoJPanel obtenerPanel(){
        return lab;
    }

}
