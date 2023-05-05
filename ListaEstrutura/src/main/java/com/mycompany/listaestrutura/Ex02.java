/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaestrutura;

import java.util.Scanner;


public class Ex02 {
    public static void main(String[] args) {
        int num;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero: ");
        num = teclado.nextInt();
        
        /*
        if (num % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        */
        
        String cond = (num % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println(cond);
        
        teclado.close();
        
        
        
        
    }
    
}
