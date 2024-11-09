package Material;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

/**
 * Esta clase nos servida para dibujar el laberinto
 * @author jessica
 */
public class LaberintoJPanel extends JPanel{

    private Laberinto laberinto;
    private final int ANCHO_CUADRO=10;

    /**
     * Constructor por omision que crea el laberinto de
     * forma aleatoria.
     */
    public LaberintoJPanel (){
        laberinto = new Laberinto();
        laberinto.crearLaberinto();
        setSize(405,405);
    }
    /**
     *
     * @param g
     */
    @Override
    public void paint(Graphics g){
     int matriz [][]=  laberinto.obtenerLaberinto();
      for(int i = 0 ; i < matriz.length; i++){
          for(int j = 0; j < matriz[i].length;j++ ){
              dibujaRectangulo(g,matriz[i][j],new Point(i*ANCHO_CUADRO,j*ANCHO_CUADRO),new Point(i*ANCHO_CUADRO,j*ANCHO_CUADRO));
          }    
      }
  }
  /**
   * Se dibuja un rectangulo de cierto color , dado el punto de la esquina superior izquierda
   * y la esquina inferior derecha
   * @param g -clase que nos permitira pintar el rectangulo.
   * @param tipo --dependiendo del tipo de casilla, se pintara el rectangulo
   * de un color especifico.
   * @param a - el punto de la esquina superior izquierda.
   * @param b - el punto de la esquina superior derecha.
   */
  public void dibujaRectangulo(Graphics g, int tipo,Point a, Point b){
      if (tipo==Estado.PARED)
          g.setColor(new Color(100, 50, 0));          
      if (tipo==Estado.CAMINO)
          g.setColor(Color.ORANGE);
      if (tipo==Estado.VACIA)
          g.setColor(Color.BLACK);
      if(tipo == Estado.VISITADA)
          g.setColor(Color.BLACK);
      g.fillRect(a.x, a.y, b.x, b.y);
  }
  
   /**
    * Cuando se desee otro laberinto repintamos.
    */
   public void reiniciar(){
       laberinto.crearLaberinto();
      repaint();
  }
   /**
    * Resolver el laberinto usando backtracking
    * y repintar.
    */
   public void resolver(){
       laberinto.crearRuta(1,1);
       repaint();
   }

}
