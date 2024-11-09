
import org.junit.Test;
import static org.junit.Assert.*;

public class TestEstadistica {

 Estadistica arreglo;

public PruebaArreglos(){
int [] a =  {3,5,23,7,1,87,45,26,7,9,12,6};
    arreglo = new Estadistica(a);
  }

  @Test
  public void testConstructorLegal(){
    System.out.println("Constructor legal");
  }
  
  @Test
  public void testMediaAritmetica(){
    System.out.println("Media aritmética");
   double media = arreglo.getMediaAritmetica();
    assertEquals(19.25,media,0);
  }
  
  @Test
  public void testOrdenarDatos(){
    System.out.println("Datos ordenados");
    int [] a =  {1,3,5,6,7,7,9,12,23,26,45,87};
    assertArrayEquals(a, arreglo.ordenaDatos());
  }
  
  @Test
  public void testGetMediana(){
    System.out.println("Mediana");
    double mediana = arreglo.getMediana();
    assertEquals(8,mediana,0);

  }

 @Test
  public void testGetModa(){
    System.out.println("Moda");
    double mediana = arreglo.moda();
    assertEquals(7,mediana,0);
  }

 @Test
  public void testGetMayor(){
    System.out.println("Mayor");
    double mayor = arreglo.getMayor();
    assertEquals(87, mayor,0);
  }

 @Test
  public void testGetMenor(){
    System.out.println("Menor");
    double menor = arreglo.getMenor();
    assertEquals(1, menor,0);
  }

}
