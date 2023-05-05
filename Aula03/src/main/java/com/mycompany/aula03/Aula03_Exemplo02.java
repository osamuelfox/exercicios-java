
package com.mycompany.aula03;

import entidades.Produtos;
import java.util.Locale;
import java.util.Scanner;


public class Aula03_Exemplo02 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantidade de produtos: ");
        int n = sc.nextInt();
        
        Produtos[] vetor = new Produtos[n];

        for (int i = 0; i < vetor.length; i ++){
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Preco: ");
            double preco = sc.nextDouble();
            vetor[i] = new Produtos(nome, preco);
        }
        
        double soma = 0;
        
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i].getPreco();
        }
        
        double media = soma / vetor.length;
        System.out.printf("Preco medio: %.2f%n", media);
        
        sc.close();
        
    }
    
}
