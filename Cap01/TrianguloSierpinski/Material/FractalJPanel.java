package Practica01;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

/**
 * Panel que contendr&aacute el fractal
 * @author Santizo Galicia Jessica
 * @version 1.0
 */
public class FractalJPanel extends JPanel{
    /**
     * Indica el m&aacute de veces que
     * se pintar&aacute el fractal
     */
    private final int NIVEL_MAX =12;
    
    /**
     * Constructor por omisi&oacuten  que
     * permite mostrar el fractal
     */
    public FractalJPanel(){
      
    }
    @Override
    /**
     * Dibujamos el tri&aacutengulo m&aacute grande
     * a partir de tres puntos
     * y hacemos la llamada recursiva.
     */
    public void paint(Graphics g){
      
    }
    /**
     * M&eacute recursivo para pintar el fractal.
     * @param g - el lienzo en d&oacute  dibujaremos el fractal.
     * @param pA -el primer punto del tri&aacutengulo.
     * @param pB -el segundo punto del tri&aacutengulo.
     * @paramC - el tercer punto del tri&aacutengulo.
     */
    public void dibujaFractal(Graphics g,int nivel,Point pA,Point pB,Point pC){
        
      
    }
    /**
     * M&Eacute  que calcula el punto medio de dos puntos dados
     * @param a - el primer punto
     * @param b - el segundo punto
     */
    private Point puntoMedio(Point p1, Point p2){
      
    }   
}

