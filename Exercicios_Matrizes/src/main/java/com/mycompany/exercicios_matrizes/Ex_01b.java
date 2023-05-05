
package com.mycompany.exercicios_matrizes;


public class Ex_01b {
    public static void main(String[] args) {

       int[][] matriz = new int [3][4];
       
       matriz[0][0] = 19;
       matriz[0][1] = 25;
       matriz[0][2] = 100;
       matriz[0][3] = 99;

       matriz[1][0] = 10;
       matriz[1][1] = 7;
       matriz[1][2] = 25;
       matriz[1][3] = 14;
       
       matriz[2][0] = 35;
       matriz[2][1] = 2;
       matriz[2][2] = 47;
       matriz[2][3] = 74;
       
       for(int i=0; i<matriz.length; i++){
           System.out.println(" ");
           for(int j=0; j<matriz[i].length; j++){
                  System.out.print(" " + matriz[i][j]);
            }
        }
    } 
    
}
