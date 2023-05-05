package com.mycompany.exercicios_matrizes;

import java.util.Scanner;

public class Ex_01a {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char matriz [][] = new char [4][5];
       char a = 'a';
       int b = 0;
       
       char [] vetor = new char[22];
       
       for(int v =0; v<(22);v++){
           vetor[v] = (char) (a+v);
           
       }
       System.out.print(vetor);
 
       for(int i=0; i<matriz.length; i++){
           
           for(int j=0; j<matriz[i].length; j++){
                  matriz[i][j]= vetor[b+j];
                 
            }
        b+=5;
        }
       
       for(int i=0; i<matriz.length; i++){
           System.out.println(" ");
           for(int j=0; j<matriz[i].length; j++){
                  System.out.print(" " + matriz[i][j]);
            }
        }
    }           
}
    
    

