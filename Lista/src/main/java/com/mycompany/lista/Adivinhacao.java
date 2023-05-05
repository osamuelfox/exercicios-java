/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 890790
 */
public class Adivinhacao {
    public static void main(String[] args) {
        
        //Scanner
                
       int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = teclado.nextInt();   
        
        
        //Numero aleatorio

        Random gerador = new Random();
                
        int aleatorio = (gerador.nextInt(3));
                      
        if (numero == aleatorio){
            System.out.println("numero aleatorio " +aleatorio);
            
            System.out.println("Voce ganhou");
        } else {
            System.out.println("Voce perdeu");
        }
    }
}
