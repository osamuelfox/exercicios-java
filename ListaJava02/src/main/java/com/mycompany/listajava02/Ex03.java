
package com.mycompany.listajava02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int A, B, C, D;
        
        double DIFERENCA;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        A = teclado.nextInt();
        
        System.out.print("Digite um numero: ");
        B = teclado.nextInt();
        
        System.out.print("Digite um numero: ");
        C = teclado.nextInt();
        
        System.out.print("Digite um numero: ");
        D = teclado.nextInt();
        
        DIFERENCA = (A * B - C * D);
        
        System.out.println("A diferenca = " + DIFERENCA);
        
        
        
    }
    
}
