
package com.mycompany.aula_matrix;

import java.util.Scanner;

public class Aula_Matrix {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Matriz: ");
        int n = sc.nextInt();
        int [][] matriz = new int [n][n];
        
        //For para percorrer a horizontal
        for(int i = 0; i < matriz.length; i++) {
            
            //For para percorrer a vertical
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Diagonal Princiapal: ");
       
        for (int i = 0; i < matriz.length; i++) {
            //Ira mostrar os valores na vertical da matriz
            System.out.println(matriz[i][i] + " ");
        }
        System.out.println();
        
        int contador = 0;
        
        //Ira percorrer toda matriz e contar os numeros negativos
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    contador++;
                }
            }
        }
        System.out.println("Numeros negativos = " + contador);
        
        sc.close();

    }
}
