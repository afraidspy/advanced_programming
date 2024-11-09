import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Lienzo que contendŕa el panel dónde se mostrará
 * el cronómetro.
 * @author Jessica Santizo Galicia
 */
public class CronometroPanel extends JPanel {

  private JTextArea horaActual;

  /**
   * Constructor por omisi&oacuten  que
   * permite mostrar el fractal
   */
  public CronometroPanel() {
    this.setVisible(true);
    this.setLayout(new GridLayout(2,1));
    this.add(colocarHora());
    this.add(colocarBotones());
  }

  public JPanel colocarHora() {
    JPanel texto = new JPanel();
    horaActual = new JTextArea("00:00:00");
    horaActual.setFont(new Font("Arial", Font.PLAIN, 80));
    horaActual.setEnabled(false);
    texto.add(horaActual);
    return texto;
  }

  public JPanel colocarBotones() {
    CronometroEventos evento = new CronometroEventos(this);
    JButton iniciar = new JButton("Iniciar/Reiniciar");
    JButton continuar = new JButton("Continuar");
    JButton detener = new JButton("Detener");
    JPanel botones = new JPanel();
//    botones.setLayout(null);
    iniciar.setActionCommand("iniciar");
    continuar.setActionCommand("continuar");
    detener.setActionCommand("detener");
    iniciar.addActionListener(evento);
    continuar.addActionListener(evento);
    detener.addActionListener(evento);
//    iniciar.setBounds(630, 200, 100, 20);
//    continuar.setBounds(430, 200, 100, 20);
//    detener.setBounds(430, 200, 100, 20);
    botones.add(iniciar);
    botones.add(continuar);
    botones.add(detener);
    return botones;
  }

  public JTextArea getHoraActual() {
    return horaActual;
  }
  
}
