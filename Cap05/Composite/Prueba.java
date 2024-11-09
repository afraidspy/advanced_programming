

/**
 *
 * @author Jess
 */
public class Prueba {

  public static void main(String [] args){
    Componente c1 = new Compuesto("Gabinete de PC", 950);
    Componente c2 = new Compuesto("Placa Base", 90);

    Componente p1 = new Pieza("DVD",1500);
    Componente p2 = new Pieza("Procesador",8000);
    Componente p3 = new Pieza("RAM",1250);
    Componente p4 = new Pieza("Disco duro",958);


    c1.agregarComponente(p1);
    c1.agregarComponente(p2);
    c1.agregarComponente(p3);
    c1.agregarComponente(p4);


     c1.descripcion();

    System.out.println("Calculando el total del Gabinete: "+c1.obtenerPrecio());

  }

}
