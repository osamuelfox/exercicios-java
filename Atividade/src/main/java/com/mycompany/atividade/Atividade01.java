/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

import java.util.Locale;
import java.util.Scanner;


public class Atividade01 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int minutos = sc.nextInt();
        
        double conta = 50.0;
        if(minutos > 100){
            conta += (minutos - 100) * 2.0;
        }
        System.out.printf("valor da conta e: R$%.2f%n ", conta);
        
        sc.close();
    }
    
}
