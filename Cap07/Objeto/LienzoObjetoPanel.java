

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 * Pinta el lienzo en el cuál se
 * moverá el objeto.
 */
public class LienzoObjetoPanel extends JPanel {
  private double posX = 0;
  private double posY = 0;
  private final int centroX;
  private final int centroY;
  private final int ancho;
  private final int alto;

  /**
   * Construye un nuevo lienzo, en el cuál se pintara un punti rojo.
   */
  public LienzoObjetoPanel(int ancho, int alto) {
    super();
    setBackground(Color.WHITE);
    setPreferredSize(new Dimension(ancho, alto));
    this.ancho = ancho;
    this.alto = alto;
    centroX = ancho / 2;
    centroY = alto / 2;
  }

  /**
   * Pinta la superficie.
   * @param g -  el lienzo en donde se va a pintar el objeto.
   */
  @Override
  public void paint(Graphics g) {
    super.paint(g);
    pintarObjeto(g, posX, posY);
    pintarCuadricula(g);
  }
  /**
   * Pinta el objeto, al inicio en el centro del panel.
   * @param g -  área en donde se va a pintar el objeto.
   * @param x -  la cantidad que se va a desplazar en el eje xs.
   * @param y -  la cantidad que se va a desplazar en el eje de las ys.
   */
  private void pintarObjeto(Graphics g, double x, double y) {
    g.setColor(Color.RED);
    g.fillOval((int) (centroX + posX), (int) (centroY + posY), 10, 10);
  }
  
  private void pintarCuadricula(Graphics g){
      g.setColor(new Color(128, 128, 128));
      for (int i = centroX % 50; i < ancho; i += 10 ) {
          g.drawLine(i, 0, i, alto - 1);
          }

      for (int i = centroY % 50; i < alto; i += 10 ) {
        g.drawLine(0, i, ancho - 1, i);
        }

        // ejes principales
        g.setColor(Color.BLACK);
        g.drawLine(0, centroY, ancho - 1, centroY);
        g.drawLine(centroX, 0, centroX, alto - 1);


    }

  /**
   * Se invoca desde el exterior para notificar un movimiento del objeto.
   * @pam m -- El movimiento a efectuar.
   */
  public void mover(Movimiento m) {
      System.out.println("El movimiento a efectuar es: "+ m);
    if (m.getTipo() == Movimiento.ARRIBA) {
      posY -= m.getParam();
    } else if (m.getTipo() == Movimiento.ABAJO) {
      posY += m.getParam();
    } else if (m.getTipo() == Movimiento.IZQUIERDA) {
      posX -= m.getParam();
    } else if (m.getTipo() == Movimiento.DERECHA) {
      posX += m.getParam();
    }
    
    new Timer(2000, null);
    repaint();
    
     
  }
}
