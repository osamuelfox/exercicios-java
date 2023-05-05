
package com.mycompany.exercicio_fixacao;

import entidade.Programa03;
import java.util.Locale;
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double soma = 0;

        System.out.println("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();
        
        Programa03[] vetor = new Programa03[n];
        Programa03[] vetorNome = new Programa03[n];
        
        for (int i = 0; i < n; i++){
            System.out.println("Pessoa: " + (i+1));
            
            System.out.println("");
            System.out.println("Nome: ");
            String Nome = sc.next();
            
            System.out.println("Idade: ");
            int Idade = sc.nextInt();
            
            System.out.println("Altura: ");
            double Altura = sc.nextDouble();
            
            vetor[i] = new Programa03(Nome ,Idade, Altura);
 
        }
        
        for(int i = 0; i < n; i++){
            soma += vetor[i].getAltura();
        }
        double media = soma / n;
        System.out.println("");
        System.out.printf("Altura media: %.2f%n", media);
        
        double somaMenorIdade = 0;
        for(int i = 0; i < n; i++){
            if(vetor[i].getIdade() < 16){
                vetorNome[i] = new Programa03(vetor[i].getNome());
                somaMenorIdade++;
            }
        }
        
        double porcentagemIdade = Programa03.porcentagemIdade(somaMenorIdade,n);
        System.out.println("Pessoas com menor de 16 anos " + porcentagemIdade + "%");
        
        for(int i = 0; i < n; i++){
            if(vetor[i].getIdade()<16){
                System.out.println(vetorNome[i].getNome());
            }
        }
        sc.close();
    }
}
