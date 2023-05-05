
package com.mycompany.exercicios_matrizes;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [][] matriz = new int [3][3];

        for(int i = 0; i < matriz.length; i++) {
            
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < matriz.length; i++){
            System.out.println(" ");
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(" " + matriz [i][j]);
            }
        }
    
        System.out.println("");
        
        for (int j = 0; j < matriz.length; j++){

            int somaColuna = 0;

            for (int i = 0; i < matriz[j].length; i++){
                somaColuna += matriz[i][j];
                
            }
            System.out.println("Soma Coluna: " + (j+1) + ": " + somaColuna);

        }
        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + (i+1) + ": " + somaLinha);
        }

        System.out.println("");
       
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {

            somaDiagonalPrincipal +=  matriz[i][i];
        }
        System.out.println("Soma diagonal principal: " + somaDiagonalPrincipal);
        
        System.out.println("");
       
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {

            somaDiagonalSecundaria += matriz[i][(matriz.length - 1) - i];
        }
        
        System.out.println("Soma diagonal segundaria: " + somaDiagonalSecundaria);
    }
}
