/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula00;

/**
 *
 * @author 890790
 */
public class Ex07 {
    public static void main(String[] args) {
        
        double delta, b = 2, a = 2, c = 2;
        double x1, x2;
                
        delta = Math.pow(b, 2.0) - 4* a * c;
        
        x1 = ( -b + Math.sqrt(delta)) / (2.0 * a);
        x2 = ( -b - Math.sqrt(delta)) / (2.0 * a);
        
        System.out.println(x1);
        System.out.println(x2);
        
        
    }
    
}
