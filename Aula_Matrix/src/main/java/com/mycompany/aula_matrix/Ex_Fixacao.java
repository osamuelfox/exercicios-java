
package com.mycompany.aula_matrix;

import java.util.Scanner;


public class Ex_Fixacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Numero de Linhas: ");
        int m = sc.nextInt();
        
        System.out.println("Numero de Colunas: ");
        int n = sc.nextInt();
        
        int [][] matriz = new int [m][n];
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Digite: ");
                matriz [i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < matriz.length; i++){
            System.out.println(" ");
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(" " + matriz [i][j]);
            }
        }
        
        System.out.println(" ");
        System.out.println("Digite um numero: ");
        int num  = sc.nextInt();
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == num) {
                    System.out.println("Position: " + i + " ," + j); 
                }
            }
        }
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == num) {
                    System.out.println("");
                    System.out.println("Position: " + i + " ," + j); 
                    
                    
                    if (i != 0){
                        System.out.println("");
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if (i < n){
                        System.out.println("");
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                    if (j != 0){
                        System.out.println("");
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if (j < m){
                        System.out.println("");
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                }    
            }
        }
        sc.close();
    }
}
