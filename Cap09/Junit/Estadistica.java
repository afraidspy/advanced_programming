/**
* Clase que contiene funciones
* para hacer cálculos estadísticos.
* @author Santizo Galicia Jessica
*/
public class Estadistica {

    private int datos [];
    private double media;
    private double mediana;
    private int moda; 
    private double desviacionEstandar;
    
    /**
     * Constructor de la clase que inicializa un arreglo de datos
     * @param datos -  el arreglo que contiene los datos estadísticps
     */
    public Estadistica(int datos[]){
        this.datos = datos;
    }
 
    /**
     * Regresa la media aritmética de un conjunto de datos , el cuál 
     * se cálcula sumando cada uno de éstos y dividiendo dicho resultado
     * entre la cantidad de elementos (También es llamada promedio).
     */
    public double getMediaAritmetica(){
        double suma = 0;
        for(int i= 0; i<datos.length;  i++)
            suma+= datos[i];
        media = suma /datos.length;
        
        return media;
    }
	
	   /**
     * Ordena un conjunto de elementos de forma creciente
     * @return int[]- el conjunto de datos ordenados de forma creciente
     */
    public int[] ordenaDatos(){
        int n = datos.length - 1;
        int [] d =  datos.clone();
        
        for(int i = n-1; i>0; i--)
            for(int j = 0; j<i; j++)
                if(d[j] > d[j+1]){
                    int tmp = d[j];
                    d[j] = d[j+1];
                    d[j+1] = tmp;
                }
        
        return d;
    }

    /**
     * Regresa la mediana de un conjunto de elementos.
     * Si la cantidad del conjunto de elementos(n) es impar, la mediana ocupa el valor (n + 1) / 2
     * Si n es par. la mediana  es el promedio de los dos valores centrales.
     * @return double -  la mediana del conjunto de datos
     */
    public double getMediana(){
        int [] datosOrdenados = ordenaDatos();
        int enMedio =0;
        double median=0.0;
        if (datosOrdenados.length%2!=0){
        enMedio = datosOrdenados.length/2;
        mediana=datosOrdenados[enMedio];
        }
        else{
            enMedio = datosOrdenados.length/2;
            mediana= (datosOrdenados[enMedio-1]+datosOrdenados[enMedio])/2;
        }
        return  mediana;
    }
    /**
     * Calcula la moda del conjunto de datos, la cuál corresponde al valor con mayor frecuencia
     * en una distribución de datos.
     * @return double - la moda del conjunto de datos.
     */
    public int moda(){
        int n = datos.length;
        int[] dats = datos.clone();
        int[] frec = new int[n];
        for (int i=0; i<n; i++) {
           double val = datos[i];
            for (int j=0; j<n; j++) {
                if(val == dats[j]){
                    frec[j]++;
                    break;
                }
            }
        }
        int maxFrec = 0;
        for (int i=0; i<n; i++) {
            if(frec[i]>maxFrec){
                maxFrec = frec[i];
                moda = dats[i];
            }
         }
        return moda;
        }

      /**
       * Método que permite obtener el elemento más grande
       * de un arreglo.
       * @return int - el número mayo
      */
      public int getMayor(){
	int mayor = datos[0];
	for(int i = 0; i < datos.length; i++){
		if (datos[i] < mayor)
			mayor = datos [i];
	}
	return mayor;
      }
      /**
      * Método que permite obtener el elemento más pequeño.
      * de un arreglo.
      * @return int - el número menor.
      */
      public int getMenor(){
	int menor = datos[0];
	for(int i = 0; i < datos.length; i++){
		if (datos[i] < menor)
			menor = datos [i];
	}
        return menor;
      }

}
