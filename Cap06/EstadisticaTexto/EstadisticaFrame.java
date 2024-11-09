
import javax.swing.JFrame;
import java.awt.BorderLayout;
/**
 * Representa la ventana principal
 * en dónde se mostrarán las estadśiticas
 * de la aplicación.
 * @author Santizo Galicia Jessica.
 */
public class EstadisticaFrame extends JFrame{
    
  private EstadisticaPanel panel;
  
  /**
   * Constructor a partir de un parámetro.
   * @param nombre --  el nombre de la ventana.
   */
  public EstadisticaFrame (String nombre){
    super(nombre);
    this.setLayout(new BorderLayout());
    panel = new EstadisticaPanel();
    this.add(panel.opciones(), BorderLayout.NORTH);
    this.add(panel.panelTexto(), BorderLayout.CENTER);
    this.add(panel.panelEstadisticas(), BorderLayout.SOUTH);
    this.setLocation(600, 400);

    this.setVisible(true);
    setDefaultCloseOperation( JFrame .EXIT_ON_CLOSE) ; //evento cerrar
  }
}
