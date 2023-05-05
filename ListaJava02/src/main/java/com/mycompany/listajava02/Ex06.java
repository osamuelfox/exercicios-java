/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajava02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 890790
 */
public class Ex06 {
    public static void main(String[] args) {

        double A, B, C;
        double atr, acr, atp, aqd, arg, pi = 3.14159;
        
        Locale.setDefault(Locale.US);
        

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero: ");
        A = teclado.nextDouble();
        
        System.out.print("Digite o numero: ");
        B = teclado.nextDouble();
        
        System.out.print("Digite o numero: ");
        C = teclado.nextDouble();
        
        
        atr = ((A * C) / 2);
        System.out.printf("TRIANGULO : %.3f%n", atr);
        
        acr = pi * (Math.pow(C, 2));
        System.out.printf("CIRCULO: %.3f%n", acr);
        
        atp = ((A + B) * C) / 2;
        System.out.printf("TRAPEZIO: %.3f%n", atp);
        
        aqd = B * B;
        System.out.printf("QUADRADO: %.3f%n", aqd);
        
        arg = A * B;
        System.out.printf("RETANGULO: %.3f%n", arg);
        
        teclado.close();
         
    }
    
    
    
}
