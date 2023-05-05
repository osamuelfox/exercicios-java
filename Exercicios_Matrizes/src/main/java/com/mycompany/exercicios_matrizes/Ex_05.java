package com.mycompany.exercicios_matrizes;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        
        System.out.println("Digite A, B ou C: ");
        String valor = sc.next().toUpperCase();
        
        switch (valor){
            case ("A"):
                
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = 1;
                    }
                }

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case ("B"): 

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j <= i; j++) {
                        matriz[i][j] = 1;
                    }
                }

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (matriz[i][j] == 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;
            
            case ("C"):
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (i == 0 || i == 3 || j == 0 || j == 3) {
                            matriz[i][j] = 1;
                        }
                    }
                }

                matriz[1][3] = 1;
                matriz[2][3] = 1;

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (matriz[i][j] == 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;
  
                
        }
    }
}
