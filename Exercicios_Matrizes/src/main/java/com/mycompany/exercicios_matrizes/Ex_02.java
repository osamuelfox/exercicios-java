
package com.mycompany.exercicios_matrizes;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int [][] matriz = new int [3][3];
        
        int soma = 0;
        
        //For para percorrer a horizontal
        for(int i = 0; i < matriz.length; i++) {
            
            //For para percorrer a vertical
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
        
        for (int i = 0; i < matriz.length; i++){

            int somaColuna = 0;
            int somaLinha = 0;
            
            for (int j = 0; j < matriz[i].length; j++){
                somaColuna += matriz[0][i];
                somaLinha += matriz[0][j];
                
                if (matriz[i][j] % 2 !=0){
                    soma += matriz[i][j];
                }
            }
            System.out.println("Soma Coluna: " + somaColuna);
            System.out.println("Soma Linha: " + somaLinha);
        }

        System.out.println("Soma: " + soma);
    }

}
