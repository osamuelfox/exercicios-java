
package com.mycompany.exercicios_matrizes;

import java.util.Scanner;

public class Ex_03 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [][] matriz = new int [3][3];

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
        
        int contPar = 0;
        int contImpar = 0;
        System.out.println("");
        for(int i = 0; i < matriz.length; i++) {

            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] % 2 == 0){
                    contPar ++;
   
                } else{
                    contImpar ++;
                }
            }
        }
        
        System.out.println("Quantidade Impar: " + contImpar);
        System.out.println("Quantidade Par: " + contPar);
        
        
        boolean repetido = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                for (int k = i; k < matriz.length; k++) {
                    for (int l = j+1; l < matriz[0].length; l++) {
                        if (matriz[i][j] == matriz[k][l]) {
                            repetido = true;
                            break;
                        }
                    }
                }
            }
        }
       

        // Imprime se existem elementos repetidos ou não
        if (repetido) {
            System.out.println("A matriz possui elementos repetidos.");
        } else {
            System.out.println("A matriz não possui elementos repetidos.");
        }

    }
    
}
