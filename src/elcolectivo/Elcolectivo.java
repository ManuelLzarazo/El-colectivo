
package elcolectivo;

import java.util.Scanner;

public class Elcolectivo {

   
    public static void main(String[] args) {
              
    Scanner Teclado =new Scanner(System.in);

        double Cp =0;

        double Nt =0;

        double Cv =0; 

        double Cvt =0;
        
        double Dp =0;

         
    System.out.println("Digite la catidad de puestos del colectivo");
            Cp = Teclado.nextInt();
       

    System.out.println("Digite el numero de turistas que va transportar");
            Nt = Teclado.nextInt();
            
            if (Nt>Cp){
                Cv = (double)(Nt/Cp);
            System.out.println("la cantidad de viajes a realizar por el colectivo es"+Cv);
            }
            if (Nt<Cp){
                Cv = (double)(1);
            System.out.println("la cantidad de viajes a realizar por el colectivo es"+Cv);
            }

          Cvt = (double)(Nt*10000);
          System.out.print("el costo del viaje de los turistas es"+Cvt);
          System.out.println("pesos");
          
          Cp = (double)(Nt*2000);
          System.out.print("El dinero que debe pagar el conductor a la empres dueña del colectivo es"+Cp);
          System.out.print("pesos");
       
     }

    }

    
