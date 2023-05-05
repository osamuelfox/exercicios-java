/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

/**
 *
 * @author 890790
 */
public class Atividade03 {
    public static void main(String[] args) {
        
        double preco = 34.5;
        double desconto;
        
        if (preco < 20.0) {
            desconto = preco * 0.1;
            
        } else {
            desconto = preco * 0.05;
        }
        System.out.println(desconto);
    }
    
}
