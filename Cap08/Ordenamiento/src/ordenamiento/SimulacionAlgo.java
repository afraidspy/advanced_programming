/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Panel en donde se va a pintar la representación de los datos del arreglo.
 *
 * @author Jessica Santizo Galicia
 */
public class SimulacionAlgo extends JPanel {

    private int[] datos;
    private Algoritmo algo;

    int entrar = 0;

    public SimulacionAlgo(int[] datos) {
        algo = new Algoritmo(this, datos);

    }

    public Algoritmo getAlgo() {
        return algo;
    }

    public void establecerDatos(int[] datos) {
        this.datos = datos;
    }

    public void dibujar() {
    }

    public void paint(Graphics g) {
        super.paint(g);
        entrar++;
        System.out.println("Dibujar " + entrar);
//        System.out.println("Tam : "+datos.length);
//        int[] nuevo = new int[datos.length];
//        String elem = "";
//        for (int i = 0; i < datos.length; i++) {
//            nuevo[i] = datos[i];
//            elem += String.valueOf(nuevo[i] + ",");
//        }
//
//        System.out.println("Repaint " + elem);

        establecerDatos(algo.getDatos());

        dibujaEjes(g);

        int aumento = (getWidth() - 24) / datos.length;

        int coordenadaX = 11;
        int altoBarra = 0;
        for (int i = 0; i < algo.getDatos().length; i++) {
            g.setColor(Color.pink);
            altoBarra = (getHeight() - 11) / 10 * algo.getDatos()[i];
            g.fillRect(coordenadaX, (getHeight() - (altoBarra + 11)), aumento, altoBarra);
            coordenadaX += aumento + 3;
        }
//        updateUI();
//        repaint();
    }

    public void dibujaEjes(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(10, getHeight() - 10, getWidth() - 11, getHeight() - 10);//eje Y
        g.drawLine(10, 10, 10, getHeight() - 10);//eje x
    }
}
