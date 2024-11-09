
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 * Clase que permitirá el manejo de eventos, en este
 * caso específicamente cuándo se le de clic a un botón.
 * @author Santizo Galicia Jessica.
 */
public class ManejadorEventos implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton boton = (JButton) e.getSource();
    if (boton.getActionCommand().equals("presioname")) {
    		JOptionPane.showMessageDialog(null,"Mensaje de alerta");
    }
  }
}  
