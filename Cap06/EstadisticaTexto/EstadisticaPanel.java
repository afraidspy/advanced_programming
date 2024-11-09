


import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;

/**
 * Representa el panel de contenidos
 * @author Santizo Galicia Jessica.
 */
public class EstadisticaPanel extends JPanel {

  private JButton calcular;
  private JButton limpiar;
  private JTextArea texto;
  private JTextArea estadisticas;
  private JCheckBox caracteres;
  private JCheckBox palabras;
  private JCheckBox lineas;

  /**
   * Constructor por omisión
  */
  public EstadisticaPanel(){
    super();
  }
  /**
   * Panel que contiene las opciones para elegir
   * el tipo de dato que desea calcular de un texto.
   * Además de los botones para efectuar las operaciones
   * de calcular y limpiar.
   * @return JPanel- regresa el panel con las opciones anteriores.
   */
  public JPanel opciones(){
    JPanel opciones = new JPanel();
    opciones.add(panelOpciones());
    opciones.add(panelBotones());
    return opciones;
  }
  /**
   * Panel que contiene las opciones que el usuario puede
   * elegir.
   * @return JPanel - las opciones en checkbox.
   */
  public JPanel panelOpciones(){
    JPanel panel = new JPanel();
    caracteres = new JCheckBox("Carácteres",false);
    palabras = new JCheckBox("Palabras",false);
    lineas = new JCheckBox("Líneas",false);
    panel.add(caracteres);
    panel.add(palabras);
    panel.add(lineas);
    return panel;
  }
  /**
   * Panel que contiene los botones para calcular
   * los datos estadísticos de un texto.
   * @return JPanel -- el panel con los botones Calcular y Limpiar.
   * 
   */
  public JPanel panelBotones(){
    JPanel opciones = new JPanel(new GridLayout(2,1));
    calcular = new JButton("Calcular");
    calcular.addActionListener(new ManejadorEventos(this));
    calcular.setActionCommand("calcular");
    limpiar = new JButton("Limpiar");
    limpiar.addActionListener(new ManejadorEventos(this));
    limpiar.setActionCommand("limpiar");
    opciones.add(calcular);
    opciones.add(limpiar);
    return opciones;
  }
  /**
   * Panel que contiene el área en la cuál el usuario puede escribir el texto.
   * @return JPanel-- contiene el panel con el textarea para escribir el texto.
   */
  public JPanel panelTexto(){
    JPanel panel = new JPanel();
    TitledBorder titulo = BorderFactory.createTitledBorder("Escribir texto");
    panel.setBorder(titulo);
    texto = new JTextArea(8,30);
    panel.add(texto);
    return panel;
  }
  /**
   * Contiene el área que permite mostrar las estadísticas 
   * del texto, según la opción elegida.
   * @return JPanel -- El panel con las estadísticas del texto.
   */

  public JPanel panelEstadisticas(){
    JPanel panel = new JPanel();
    TitledBorder titulo = BorderFactory.createTitledBorder("Mostrando estadísticas del texto");
    panel.setBorder(titulo);
    estadisticas = new JTextArea(8,30);
    estadisticas.setEditable(false);
    panel.add(estadisticas);
    return panel;
  }
  /**
   * @return JButton -- Regresa el botón Calcular.
   */
  public JButton getCalcular() {
    return calcular;
  }
 /**
   * @return JCheckBox-- Regresa el JCheckBox que corresponde a la opción de crácteres.
   */
  public JCheckBox getCaracteres() {
    return caracteres;
  }
 /**
   * @return JTextArea-- Regresa el JTextArea en la que se mostrarán las estadísticas de texto.
   */
  public JTextArea getEstadisticas() {
    return estadisticas;
  }
 /**
   * @return JButton-- Regresa el JButton Limpiar.
   */
  public JButton getLimpiar() {
    return limpiar;
  }
 /**
   * @return JCheckBox-- Regresa el JCheckBox con la opción Líneas.
   */
  public JCheckBox getLineas() {
    return lineas;
  }
   /**
   * @return JCheckBox-- Regresa el JCheckBox con la opción Palabras.
   */
  public JCheckBox getPalabras() {
    return palabras;
  }
    /**
   * @return JTextArea-- Regresa el JTextArea en el que se permitirá escribir texto.
   */
  public JTextArea getTexto() {
    return texto;
  }

}

