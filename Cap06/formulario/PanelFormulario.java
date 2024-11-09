
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;

/**
 * Panel que contendr&aacute el formulario
 * @author Santizo Galicia Jessica
 * @version 1.0
 */
public class PanelFormulario extends JPanel{

  public PanelFormulario(){
    super();

  }

  public JPanel formulario(){
    JPanel campos = new JPanel();
    campos.setLayout(new GridLayout(6,2));
    JLabel nombre = new JLabel ("Nombre");
    campos.add(nombre);
    JTextField campoNombre = new JTextField();
    campos.add(campoNombre);
    JLabel paterno = new JLabel ("Apellido Paterno");
    campos.add(paterno);
    JTextField campoApaterno = new JTextField();
    campos.add(campoApaterno);
    JLabel materno = new JLabel ("Apellido Materno");
    campos.add(materno);
    JTextField campoMaterno = new JTextField();
    campos.add(campoMaterno);
    JLabel edad = new JLabel ("Edad");
    campos.add(edad);
    
    JComboBox campoEdad = new JComboBox();

    for(int i = 0; i < 100; i++) {
      campoEdad.addItem(i);
    }
 
    campos.add(campoEdad);

    JLabel sexo = new JLabel ("Sexo");
    campos.add(sexo);

    ButtonGroup grupo = new ButtonGroup();
    JRadioButton femenino = new JRadioButton("Femenino",true);
    JRadioButton masculino = new JRadioButton("Masculino",true);

    grupo.add(femenino);
    grupo.add(masculino);

    return campos;
  }

  public JPanel opcionesNoticias(){
    JPanel noticias = new JPanel();
    noticias.setLayout(new GridLayout(4,1));
    JLabel etiqueta = new JLabel("Elija el tipo de noticia a recibir");
    noticias.add(etiqueta);
    JCheckBox deportes = new JCheckBox("Deportes");
    JCheckBox salud = new JCheckBox("Salud");
    JCheckBox cocina = new JCheckBox("Cocina");
    JCheckBox tecnologia = new JCheckBox("Tecnología");
    JCheckBox educacion = new JCheckBox("Educación");
    noticias.add(deportes);
    noticias.add(salud);
    noticias.add(cocina);
    noticias.add(tecnologia);
    noticias.add(educacion);
    return noticias;
  }

  public JPanel botones(){
   JPanel botones = new JPanel();
   JButton aceptar = new JButton("Aceptar");
   JButton cancelar = new JButton("Cancelar");
   botones.add(aceptar);
   botones.add(cancelar);
   return botones;
  }
}

