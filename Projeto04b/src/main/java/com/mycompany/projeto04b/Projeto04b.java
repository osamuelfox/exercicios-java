

package com.mycompany.projeto04b;

import java.util.Scanner;

public class Projeto04b {

     public static void main(String[] args) {
         
         while (true) {
             
            Scanner nota = new Scanner(System.in);
            System.out.print("Primeira Nota:");
            float nota1 = nota.nextFloat();
            
            
            Scanner des = new Scanner(System.in);       
            System.out.print("Continuar 'S' ou 'N'");
            Char dese = nota.nextString();
            
        
         }

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
