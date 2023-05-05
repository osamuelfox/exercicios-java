
package com.mycompany.aula07;

import java.util.Scanner;

import util.Calculator_V3;

public class Versao03 {
    
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Raio: ");
        double raio = sc.nextDouble();
        
        double c = Calculator_V3.circumference(raio);
        
        double v = Calculator_V3.volume(raio);
        
        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Pi: ", Calculator_V3.Pi);
        
    }
    
}
