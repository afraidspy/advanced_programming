package productorconsumidor;

/**
 * Clase que permita probar el problema de
 * los Productores-Consumidres
 * @author Santizo Galicia Jessica
 */
public class Prueba {

  public static void main (String [] args){
    Contenedor contenedor = new Contenedor();
    Productor prod = new Productor("Productor 1", contenedor);
    Consumidor consumidorA = new Consumidor("Consumidor 2", contenedor);
    Consumidor consumidorB = new Consumidor("Consumidor 3", contenedor);
    Consumidor consumidorC = new Consumidor("Consumidor 4", contenedor);
    Consumidor consumidorD = new Consumidor("Consumidor 5", contenedor);
    Consumidor consumidorE = new Consumidor("Consumidor 6", contenedor);

    Thread hiloA = new Thread(prod);
    Thread hiloB = new Thread(consumidorA);
    Thread hiloC = new Thread(consumidorB);
    Thread hiloD = new Thread(consumidorC);
    Thread hiloE = new Thread(consumidorD);
    Thread hiloF = new Thread(consumidorE);

    hiloA.start();
    hiloB.start();
    hiloC.start();
    hiloD.start();
    hiloE.start();
    hiloF.start();

  }

}
