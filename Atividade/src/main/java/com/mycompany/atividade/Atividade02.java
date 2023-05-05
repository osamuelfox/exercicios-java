/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

import java.util.Scanner;

/**
 *
 * @author 890790
 */
public class Atividade02 {
    public static void main(String[] args) {
        
        System.out.println("Dia da semana: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;
        
        switch(x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
                
            default:
                dia = "valor invalido";
                break;

            }
        System.out.println("Dia da semana: " + dia);
        sc.close();

    }
    
    
}
