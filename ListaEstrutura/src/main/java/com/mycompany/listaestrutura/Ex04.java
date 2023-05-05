/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaestrutura;

import java.util.Scanner;


public class Ex04 {
    public static void main(String[] args) {
        int hora1,hora2;
        int hora;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero: ");
        hora1 = teclado.nextInt();
        
        System.out.print("Digite o numero: ");
        hora2 = teclado.nextInt();
        
        if (hora1 > 12){
            hora = (24 - hora1) + hora2;
            System.out.println("O JOGO DUROU " + hora + " HORAS");

        }else if(hora1 == hora2){
            hora = 24;
            System.out.println("O JOGO DUROU " + hora + " HORAS");
            
        }else {
            hora = hora2 - hora1;
            System.out.println("O JOGO DUROU " + hora + " HORAS");
        }
        
        teclado.close();

    }
    
}
