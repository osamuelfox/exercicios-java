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
public class Ex05 {
    public static void main(String[] args) {
        
        String m;
        m = JOptionPane.showInputDialog("Digite a massa em Kg"); 
        double massa;
        massa = Double.parseDouble(m);
        
        String h;
        h = JOptionPane.showInputDialog("Digite a altura em Metros"); 
        double altura;
        altura = Double.parseDouble(h);
        
        String t;
        t = JOptionPane.showInputDialog("Digite o tempo em segundos");
        double segundos;
        segundos = Double.parseDouble(t);
        
        double cavalos;
        cavalos = (massa * altura / segundos)/745.6999;
        
        JOptionPane.showMessageDialog(null,"A quantidade de cavalos necessaria é: " + cavalos);
   
    }
}
