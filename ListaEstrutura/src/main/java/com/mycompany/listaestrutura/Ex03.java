/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaestrutura;

import java.util.Scanner;


public class Ex03 {
    public static void main(String[] args) {
        int A, B;
        double num;
       

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero: ");
        A = teclado.nextInt();
        
        System.out.print("Digite o numero: ");
        B = teclado.nextInt();
        
        if (A < B){
            if (B % A == 0){
                System.out.println("SAO MULTILOS");
            }else{
                System.out.println("NAO SAO MULTIPLOS");
            }
        }else{
            if (A % B == 0){
                System.out.println("SAO MULTILOS");
            }else{
                System.out.println("NAO SAO MULTIPLOS");
            }
        }
        teclado.close();
  
    }
    
}
