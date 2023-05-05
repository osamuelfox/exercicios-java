/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajava01;

/**
 *
 * @author 890790
 */
public class teste {
    public static void main(String[] args) {
        
        int cont;
        cont = 0;
        
        while (cont < 3){
        
            cont = cont + 1;

            //Altura
            String altura1;
            altura1 = JOptionPane.showInputDialog("Digite a Altura");

            //conversao
            float altura;
            altura = Float.parseFloat(altura1);

            //Sexo
            String sexo;
            sexo = JOptionPane.showInputDialog("Digite 'M' ou 'F' ");
            
            
            float maisAlto;
            maisAlto = altura;

            if (maisAlto < altura ){
                

            } else {
                float maisBaixo;
                maisBaixo = altura;
                
            }
            break;
         
        }
        
        JOptionPane.showMessageDialog(null,"O mais alto " + maisAlto);
        
        JOptionPane.showMessageDialog(null,"O mais baixo " + maisBaixo);
        
        

        
        
        
        
        
    }
    
}
