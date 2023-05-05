/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajava02;

import javax.swing.JOptionPane;

/**
 *
 * @author 890790
 */
public class Ex02 {
     public static void main(String[] args) {
        double r, area, raio;
        r = 3.14159;
         
        String rai;
        rai = JOptionPane.showInputDialog("Digite: "); 
        raio = Double.parseDouble(rai);
        
        area = (r * Math.pow(raio, 2));
        
        JOptionPane.showMessageDialog(null,"Area = " + area );
     }
    
    
}
