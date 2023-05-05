
package com.mycompany.exercicio_fixacao;

import entidade.Programa09;
import java.util.Scanner;


public class Ex_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas voce vai digitar: ");
        int n = sc.nextInt();
        
        Programa09[] vetorNome = new Programa09[n];
        Programa09[] vetorIdade = new Programa09[n];
        
        for (int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1)  + "a pessoa" );
            
            System.out.println("Nome: ");
            String Nome = sc.next();
            
            System.out.println("Idade: ");
            int Idade = sc.nextInt();
 
            vetorNome[i] = new Programa09(Nome);
            vetorIdade[i] = new Programa09(Idade);
            
        }
        int maisVelha = vetorIdade[0].getIdade();
        String velho = vetorNome[0].getNome();
        
        for (int i = 0; i < n; i++){
            if (vetorIdade[i].getIdade() > maisVelha){
                maisVelha = vetorIdade[i].getIdade();
                velho = vetorNome[i].getNome();
            }
        }
        
        System.out.println("Nome mais Velho: " + velho);
        
        sc.close();

    }
    
}
