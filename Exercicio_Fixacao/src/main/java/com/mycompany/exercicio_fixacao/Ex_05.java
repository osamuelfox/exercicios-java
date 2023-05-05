
package com.mycompany.exercicio_fixacao;

import entidade.Programa05;
import java.util.Scanner;


public class Ex_05 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        
        Programa05[] vetor = new Programa05[n];
        
        for(int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            int Num = sc.nextInt();
            
            vetor[i] = new Programa05(Num);
        }

        double maior = vetor[0].getNum();
        
        for(int i = 0; i < n; i++){
            if (vetor[i].getNum() > maior){
                maior = vetor[i].getNum(); 
            }
        }
        System.out.println("Maior valor: " + maior);
        
        for(int i = 0; i < n; i++) {
            if (vetor[i].getNum() == maior){
                System.out.println("Posicao do maior valor: " + i);
                
            }
        }
    }
}
