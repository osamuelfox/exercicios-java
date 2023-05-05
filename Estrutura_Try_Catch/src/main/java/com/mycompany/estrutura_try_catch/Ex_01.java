
package com.mycompany.estrutura_try_catch;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] vetor = sc.nextLine().split(" ");
        int posicao = sc.nextInt();
        
        System.out.println(vetor[posicao]);
        
        sc.close();
        
        
    }
    
}
