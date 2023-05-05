/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajava02;

import java.util.Scanner;

/**
 *
 * @author 890790
 */
public class Ex01 {
    public static void main(String[] args) {
        
        int x,y,soma; 
                
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        x = teclado.nextInt();
        
        System.out.print("Digite outro numero: ");
        y = teclado.nextInt(); 
        
        soma = x + y;
        
        System.out.println("Soma = " + soma);
    }
    
}
