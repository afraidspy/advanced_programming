
/**
 * Clase que permite probar el patrón Observador
 * @author Jessica Santizo Galicia.
 */
public class PruebaAlarma {

  public static void main (String [] args){
    Sujeto sensor = new Sensor();

    Alarma uno =  new Alarma("AlarmaUno");
    Alarma dos =  new Alarma("AlarmaDos");
    Alarma tres =  new Alarma("AlarmaTres");
    Alarma cuatro =  new Alarma("AlarmaCuatro");
    Alarma cinco =  new Alarma("AlarmaCinco");
    Alarma seis =  new Alarma("AlarmaSeis");
    Alarma siete =  new Alarma("AlarmaSiete");
    Alarma ocho =  new Alarma("AlarmaOcho");
    Alarma nueve =  new Alarma("AlarmaNueve");
    Alarma diez =  new Alarma("AlarmaDiez");

    sensor.agregar(uno);
    sensor.agregar(dos);
    sensor.agregar(tres);
    sensor.agregar(cuatro);
    sensor.agregar(cinco);
    sensor.agregar(seis);
    sensor.agregar(siete);
    sensor.agregar(ocho);
    sensor.agregar(nueve);
    sensor.agregar(diez);

    System.out.println("Se modificará el estado de la alarma, pues ha ocurrido un sismo");
    sensor.establecerSujeto(true);

    sensor.notificar();



  }

}
