
package com.mycompany.exercicios_matrizes;

import java.util.Scanner;


public class Ex_04 {
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
        System.out.println("Diagonal Princiapal: ");
       
        for (int i = 0; i < matriz.length; i++) {

            System.out.println(matriz[i][i] + " ");
        }
        
        System.out.println("");
        System.out.println("Diagonal Segundaria: ");
       
        for (int i = 0; i < matriz.length; i++) {

            System.out.println(matriz[i][(matriz.length - 1) - i] + " ");
        }
        
        for (int i = 0; i < matriz.length; i++){
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(" " + matriz [j][i]);
            }
        }
    }   
}
