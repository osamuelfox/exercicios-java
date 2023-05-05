
package com.mycompany.listarepeticao;

import java.util.Scanner;


public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int x = sc.nextInt();
        
        for (int i = 1; i <= x; i++){
            
            int quadrado = i * i;
            int cubo = i*i*i;
            
            System.out.println(i + " " + quadrado + " " + cubo);
        }
    } 
}
