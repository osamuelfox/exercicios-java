
package com.mycompany.listarepeticao;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        int N, res = 1, cont = 1;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite X: ");
        N = teclado.nextInt();
        
        while (cont <= N){
            res *= cont;
            cont ++;
        }
        System.out.println("Resposta = " + res);
    }
    
}
