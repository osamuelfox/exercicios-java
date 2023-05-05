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
public class Ex03 {
     public static void main(String[] args) {

         Float hp, lp, ha, la, azuleijo;
         
         String hp1, lp1, ha1, la1;
         
         hp1 = JOptionPane.showInputDialog("Altura parede");
         hp = Float.parseFloat(hp1);
         
         lp1 = JOptionPane.showInputDialog("Largura parede");
         lp = Float.parseFloat(lp1);
         
         ha1 = JOptionPane.showInputDialog("Altura azuleijo");
         ha = Float.parseFloat(ha1);
         
         la1 = JOptionPane.showInputDialog("Largura azueleijo");
         la = Float.parseFloat(la1);
         
         azuleijo = (la*ha)/(hp*lp);
         
         JOptionPane.showMessageDialog(null,"Seram " + azuleijo + " azuleijos"); 
         
     }  
}
