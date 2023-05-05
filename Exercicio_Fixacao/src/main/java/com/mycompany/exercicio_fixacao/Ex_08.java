
package com.mycompany.exercicio_fixacao;

import entidade.Programa08;
import java.util.Locale;
import java.util.Scanner;


public class Ex_08 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos elementos vai ter o vetor: ");
        int n = sc.nextInt();
        
        double soma = 0;
        double media;
        
        Programa08[] vetor = new Programa08[n];
        Programa08[] vetorPar = new Programa08[n];
        
        
        for (int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            double Num = sc.nextDouble();
            
            vetor[i] = new Programa08(Num);  
            
            soma = Programa08.soma(soma, vetor[i].getNum());
        }
        
        for(int i = 0; i < n; i++){
            if(vetor[i].getNum() % 2 == 0){
                
                vetorPar[i] = new Programa08(vetor[i].getNum());
                media = Programa08.media(soma, n);
                System.out.printf("Media dos Pares: %.1f ", media);
                break;
            } else {
                System.out.println("Nenhum numero par !!");
                break;
            }   
        }
        sc.close();
    }   
}
