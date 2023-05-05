/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaestrutura;

import java.util.Locale;
import java.util.Scanner;


public class Ex06 {
    public static void main(String[] args) {
        double num;
        
        Locale.setDefault(Locale.US);
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        num = teclado.nextDouble();
        
        if (num > 0.0 && num <= 25.0){
            System.out.println("Intervalo [0,25]");
        }else if (num >= 25.0 && num < 50.0 ){
            System.out.println("Intervalo [25,50]");
        }else if (num >= 50.0 && num < 75.0){
            System.out.println("Intervalo [50,75]");
        }else if (num >= 75.0 && num <= 100.0){
            System.out.println("Intervalo [75,100]");
        }else {
            System.out.println("Fora do intervalo");
        }
    }
    
}
