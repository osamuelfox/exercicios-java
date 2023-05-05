
package com.mycompany.aula01;

import java.util.Scanner;


public class Ex02 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int mask = 0b100000;
        int n = teclado.nextInt();
        
        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } 
        else {
            System.out.println("6th bit is false");
        }
        
        teclado.close();
   
    }
    
}
