/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajava01;

import javax.swing.JOptionPane;

/**
 *
 * @author 890790
 */
public class Ex06 {
    public static void main(String[] args) {
        
        String cel;
        cel = JOptionPane.showInputDialog("Digite a temperatura em Celsius"); 
        double c;
        c = Double.parseDouble(cel);
        
        double k;
        k = c + 273.15;
        
        double Re;
        Re = c * 0.8;
        
        double Ra;
        Ra = c * 1.8 + 32 + 459.67;
        
        double f;
        f = c * 1.8 + 32;
        
        JOptionPane.showMessageDialog(null,"Celsius: " + c + "\n Kelvin:  "+ k + 
         "\n Reaumur: "+ Re + "\n Rankine: " + Ra + "\n Fahrenheit: " + f + "");

    }
    
}
