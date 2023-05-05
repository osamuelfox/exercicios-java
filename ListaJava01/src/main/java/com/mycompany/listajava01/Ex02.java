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
public class Ex02 {
    public static void main(String[] args) {
        
        int cont = 0, funcionarios;
        
        String num, salario1;
        
        float salario,soma = 0,media = 0;
     
        
        num = JOptionPane.showInputDialog("Digite a quantidade de funcionarios ");
        
        funcionarios = Integer.parseInt(num);

        while (cont < funcionarios){
            cont = cont + 1;
            
            salario1 = JOptionPane.showInputDialog("Salario " + cont + "°");
            salario = Float.parseFloat(salario1);
            
            while (salario < 0){
                JOptionPane.showMessageDialog(null,"O salario deve ser maior que '0'");
                salario1 = JOptionPane.showInputDialog("Salario " + cont + "°");
                salario = Float.parseFloat(salario1);
            }
            
            if (salario > 0){
                soma = soma + salario;
            }
            media = soma / cont;

        }
        JOptionPane.showMessageDialog(null,"Media dos salarios " + media);
 
    }
    
}
