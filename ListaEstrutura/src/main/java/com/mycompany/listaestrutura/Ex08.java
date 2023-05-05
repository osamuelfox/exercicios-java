/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaestrutura;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        double salario, imposto = 0;
        
        Locale.setDefault(Locale.US);
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o salario: ");
        salario = teclado.nextDouble();
        
        if (salario <= 2000){
            System.out.println("Isento");
        }else if (salario > 2000 && salario < 3000 ){
            imposto = ((salario-2000)*0.08)+(2*0.18);    
            System.out.printf("R$ %.2f", imposto);
        }else if (salario > 3000 && salario < 4500 ){
            imposto = 1000*0.08+((salario-3000)*0.18);
            System.out.printf("R$ %.2f", imposto);
        }else if (salario >= 4500){
            imposto = 1000*0.08 + 1500 * 0.18 + ((salario - 4500)*0.28);
            System.out.printf("R$ %.2f", imposto);
        }

    }
 
}
