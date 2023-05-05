
package com.mycompany.aula03;

import entidades.Pensao;
import java.util.Scanner;


public class Ex_ficacao {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pensao[] vetor = new Pensao[10];
        
        System.out.println("Quantidade de quartos cobrados: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i ++){
            System.out.println("Cliente: #" + i);
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            
            System.out.println("Email: ");
            String email = sc.nextLine();
            
            System.out.println("Quarto: ");
            int room = sc.nextInt();
            vetor[room] = new Pensao(nome, email);
            
        }
        System.out.println("");
        System.out.println("Quartos Ocupados: ");
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] != null){
                System.out.println(i + ": " + vetor[i]);
            }
        }
    }
}
