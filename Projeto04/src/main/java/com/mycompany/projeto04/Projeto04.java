/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projeto04;

import java.util.Scanner;

/**
 *
 * @author 890790
 */
public class Projeto04 {

    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        System.out.print("Primeira Nota:");
        float nota1 = nota.nextFloat();
        
        System.out.print("Segunda Nota:");
        float nota2 = nota.nextFloat();
        
        System.out.print("Terceira Nota:");
        float nota3 = nota.nextFloat();
        
        System.out.print("Quarta Nota:");
        float nota4 = nota.nextFloat();
       
        
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("A media das notas foi:" +media);
        
        
        if (media >= 7){
            System.out.print("Aprovado");
            
        } else if (media >= 4 ) {
            System.out.print("Recuperacao");
            
        } else if (media <= 3) {
            System.out.print("Reprovado");
        }
         
    }
}
