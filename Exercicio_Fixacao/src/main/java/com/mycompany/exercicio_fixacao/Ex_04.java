
package com.mycompany.exercicio_fixacao;

import entidade.Programa04;
import java.util.Scanner;


public class Ex_04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        
        int cont = 0;
        
        Programa04[] vetor = new Programa04[n];
        Programa04[] vetorPar = new Programa04[n];
        
        for(int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            int Num = sc.nextInt();
            
            vetor[i] = new Programa04(Num);
        }
        
        System.out.println(" ");
        System.out.println("Numeros pares");
        
        for (int i = 0; i < n; i++){
            if (vetor[i].getNum() % 2 == 0){
                cont ++;
                vetorPar[i] = new Programa04(vetor[i].getNum());
                System.out.print(" " + vetorPar[i].getNum());
            }
        }
        
        System.out.println(" ");
        System.out.println("Quantidade de pares: " + cont);   
        
        sc.close();
    }
}
