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
public class Adivinhacao2 {
    
    public static void main(String[] args) {
        
        //Scanner
                
       int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero de 0 a 5");
        System.out.print("Digite um numero: ");
        numero = teclado.nextInt();   
       
        //Numero aleatorio

        Random gerador = new Random();
        int aleatorio = (gerador.nextInt(5));
        
        //primeira verificacao
        
        if (numero == aleatorio) {
        System.out.println("numero aleatorio " +aleatorio);
        System.out.println("Voce ganhou");
        }
        
        //contador
        
        int cont;
        cont = 1;
        
        while (numero != aleatorio ) {
            
            cont = cont + 1;
            
            System.out.print("Digite um numero: ");
            numero = teclado.nextInt();
                      
            if (numero == aleatorio){
                System.out.println("numero aleatorio " +aleatorio);

                System.out.println("Voce ganhou");
                System.out.println("Voce fez " + cont + " tentativas");
            } else {
                System.out.println("Voce perdeu");
            }
        }
    }
    
}
