/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

import java.util.Scanner;

/**
 *
 * @author 890790
 */
public class Atividade03b {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double preco = 34.5;
        double desconto = (preco < 20.0)? preco * 0.1:preco * 0.05;
        
        System.out.println(desconto);
        
        sc.close();
    }
    
}
