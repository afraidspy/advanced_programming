
/**
 * Clase que permite probar la asignación de
 * una letra dependiendo del puntaje obtenido
 * en una calificación.
 * @author Santizo Galicia Jessica
 */
public class PruebaCalificacion {

  public static void main (String [] args) {

    Calificacion [] datos =  {new Calificacion("Ana",52), new Calificacion("Alejandro",97),new Calificacion("Diego",75),new Calificacion("Giovanna",82),
    new Calificacion("Hilario",45),new Calificacion("Irma",74),new Calificacion("Javier",98),new Calificacion("Karina",90),new Calificacion("Martín",32),
    new Calificacion("Nadia",46),new Calificacion("Patricia",49),new Calificacion("Rita",64),new Calificacion("Saúl",79),new Calificacion("Valeria",89)};

    for(int i = 0; i < datos.length; i++){
      System.out.println(datos[i].obtenerGradoPuntaje());
    }
  }



}
