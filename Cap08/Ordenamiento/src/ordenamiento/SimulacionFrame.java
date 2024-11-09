/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import javax.swing.JFrame;

/**
 *
 * @author Jess
 */
public class SimulacionFrame extends JFrame {

    private SimulacionAlgo algoPanel;

    public SimulacionFrame(String nombre, int[] datos) {
        super(nombre);
        this.setLocation(150, 200);
        this.setSize(500, 600);
        this.setVisible(true);
        algoPanel = new SimulacionAlgo(datos);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(algoPanel);
    }

    public SimulacionAlgo getAlgoPanel() {
        return algoPanel;
    }

    public static void main(String[] args) {
        SimulacionFrame simula = new SimulacionFrame("Ordenamiento", new int[]{9, 6, 5, 3, 2, 1});
 simula.getAlgoPanel().getAlgo().ordenar();
    }
}
