/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author 890790
 */
public class Adivinhacao4 {
    
    public static void main(String[] args) {
        
        //Scanner
        
        JOptionPane.showMessageDialog(null,"Jogo de adivinhação \n Escolha um numero de 0 a 5");
                
        String numero1;
        numero1 = JOptionPane.showInputDialog("Digite um numero"); 
       
        int numero;
        numero = Integer.parseInt(numero1);
        

        //Numero aleatorio

        Random gerador = new Random();
        int aleatorio = (gerador.nextInt(5));
        
        //primeira verificacao
       
        if (numero > 0 && numero < 6) {
        
            if (numero == aleatorio) {
            JOptionPane.showMessageDialog(null,"O numero era " +aleatorio);
            JOptionPane.showMessageDialog(null,"Voce ganhou");
            } else {
                JOptionPane.showMessageDialog(null,"Vece perdeu");
            }

            //contador

            int cont;
            cont = 1;

            while (numero != aleatorio && cont < 3) {

                cont = cont + 1;

                numero1 = JOptionPane.showInputDialog("Digite um numero"); 
                numero = Integer.parseInt(numero1);

                if (numero == aleatorio){
                    JOptionPane.showMessageDialog(null,"O numero era " + aleatorio);

                    JOptionPane.showMessageDialog(null,"Voce ganhou");
                    JOptionPane.showMessageDialog(null,"Voce fez " + cont + " tentativas");
                } else {
                    JOptionPane.showMessageDialog(null,"Voce perdeu");
                } 

                if (cont == 3) {
                    JOptionPane.showMessageDialog(null,"O numero sorteado era " + aleatorio);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null,"Digite um numero valido");
        }
    }
    
}
