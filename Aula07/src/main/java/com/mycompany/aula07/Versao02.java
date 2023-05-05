
package com.mycompany.aula07;

import java.util.Scanner;
import util.Calculator_V2;


public class Versao02 {
    
    public static void main(String[] args) {
          
        
        Scanner teclado = new Scanner(System.in);
        
        Calculator_V2 calc = new Calculator_V2();
        
        System.out.println("Raio: ");
        double raio = teclado.nextDouble();
        
        double c = calc.circumference(raio);
        
        double v = calc.volume(raio);
        
        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Pi: %.2f%n", calc.Pi);
   
    }
    
}
