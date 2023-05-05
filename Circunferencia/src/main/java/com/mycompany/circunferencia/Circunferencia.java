

package com.mycompany.circunferencia;

import java.util.Locale;
import java.util.Scanner;


public class Circunferencia {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner teclado = new Scanner(System.in);
        
        double raio;
        double Pi = 3.141592;
        double circ;
       
        System.out.println("Raio: ");
        raio = teclado.nextDouble();
        
        circ = 2*(Pi * raio);
        
        System.out.printf("Circunferencia: %.2f", circ);
        System.out.println("");
        System.out.printf("Pi: %.2f", Pi);
   
    }
}
