
package com.mycompany.aula07;

import java.util.Locale;
import java.util.Scanner;


public class Versao01 {
    
    public static final double Pi = 3.14159;
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Raio");
        
        double raio = sc.nextDouble();
        
        double c = circ(raio);
        double v = volume(raio);
        
        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Pi: %.2f%n", Pi);
        
        
        sc.close();
    }
    
    public static double circ(double raio) {
        return 2 * Pi * raio;
    }
    public static double volume(double raio) {
        return 4 * Pi * raio * raio * raio / 3;
    } 
}
