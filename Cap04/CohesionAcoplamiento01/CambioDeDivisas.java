import java.util.Scanner;

public class CambioDeDivisas {
    public static void main(String[] pps) {
 Scanner in= new Scanner(System.in);
 double dolarpesos;
 double dolareuro;
 System.out.println("hola, antes de empezar introduce la paridad del dolar a pesos");
 dolarpesos=in.nextDouble();
 System.out.println("ahora introduce la paridad de el dolar a euros");
 dolareuro=in.nextDouble();
  System.out.println("indica que tipo de cambio quieres hacer introduciendo el numeral de la opcion correspondiente");
  System.out.println("1.- de dolar a pesos");
  System.out.println("2.- de dolar a euro");
  System.out.println("3.- de peso a dolar");
  System.out.println("4.- de peso a euro");
  System.out.println("5.- de euro a dolar");
  System.out.println("6.- de euro a peso");
  int operacion = in.nextInt();
if(operacion==1) {

  System.out.println("�cual es la cantidad de dolares que quieres cambiar por pesos?");
 double candolares=in.nextDouble();
 double dolarrest= (candolares*dolarpesos)%5;
 double canpesos=(candolares*dolarpesos)-dolarrest;
 System.out.println("la cantidad que quieres cambiar es:"+candolares);
 System.out.println("la cantidad de pesos comprados es:"+canpesos);
  System.out.println("recuerda qeu solo se pueden vender divisas que sean multiplos de cinco por lo tanto la cantidad de dolares a regresar                     son:"+dolarrest);
}else{
        if(operacion==2) {

 System.out.println("�cual es la cantidad de dolares que quieres cambiar por euros?");
double candolares=in.nextDouble();
double dolarrest= (candolares*dolareuro)%5;
 double caneuros=(candolares*dolareuro)-dolarrest;
System.out.println("la cantidad que quieres cambiar es:"+candolares);
  System.out.println("la cantidad de euros comprados es:"+caneuros);
 System.out.println("recuerda qeu solo se pueden vender divisas que sean multiplos de cinco por lo tanto la cantidad de dolares a regresar                     son:"+dolarrest);
 }else{
  
  if(operacion==3) {
 System.out.println("�cual es la cantidad de pesos que quieres cambiar por dolares?");
 double pesos=in.nextDouble();
 double resto= (pesos/dolarpesos)%5;
                   double dolares= (pesos/dolarpesos)-resto;
                   System.out.println("la cantidad que quieres cambiar es:"+pesos);
                  System.out.println("la cantidad de dolares comprados es:"+dolares);
                   System.out.println("recuerda qeu solo se pueden vender divisas que sean multiplos de cinco por lo tanto la cantidad de pesos a regresar                       son:"+resto);
             
                            }else{       if(operacion==4) {
                               
                                    System.out.println("�cual es la cantidad de pesos que quieres cambiar por euros?");
                                    double pesos= in.nextDouble();
               double resto =((pesos/dolarpesos)*dolareuro)%5;
              double euros=  ((pesos/dolarpesos)*dolareuro)-resto;
                                    System.out.println("la cantidad que quieres cambiar es:"+pesos);
         System.out.println("la cantidad de euros comprados es:"+euros);
     System.out.println("recuerda qeu solo se pueden vender divisas que sean multiplos de cinco por lo tanto la cantidad de pesos a regresar son:"+resto);

                                    }else{
                                 

                                          if(operacion==5) {
                                             
            System.out.println("�cual es la cantidad de euro que quieres cambiar por dolares?");
           double euros=in.nextDouble();
           double resto= (euros/dolareuro)%5;
            double dolares= (euros/dolareuro)-resto;
                                                  
           System.out.println("la cantidad que quieres cambiar es:"+euros);
              System.out.println("la cantidad de dolares comprados es:"+dolares);
           System.out.println("recuerda qeu solo se pueden vender divisas que sean multiplos de cinco por lo tanto la cantidad de euros a regresar son:"+resto);

                                                 }else{

                                                      if(operacion==6) {
                               
                                                            System.out.println("�cual es la cantidad de euros que quieres cambiar por pesos?");
                                                            double euros= in.nextDouble();
                                                              double resto =((euros/dolareuro)*dolarpesos)%5;
                                                            double pesos= ((euros/dolareuro)*dolarpesos)-resto;
                                                          System.out.println("la cantidad que quieres cambiar es:"+euros);
                                                             System.out.println("la cantidad de pesos comprados es:"+pesos);
                                                            System.out.println("recuerda qeu solo se pueden vender divisas que sean multiplos de cinco por lo tanto la cantidad de euros a regresar son:"+resto);
                                             
                                                           }else{
                                                           System.out.println("opcion invalida");
                                                            }
}
}
}
}
}
}
}








                 



















