
package com.mycompany.exercicio_fixacao;

import entidade.Programa10;
import java.util.Locale;
import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos alunos seram digitados: ");
        int n = sc.nextInt();
        
        Programa10[] vetor = new Programa10[n];
        
        for (int i = 0; i < n; i++){
            System.out.println("Digite Nome do " + (i+1) + "a aluno");
            String Nome = sc.next();
            
            System.out.println("Primeira nota: ");
            double Nota1b = sc.nextDouble();
            
            System.out.println("Segunda nota: ");
            double Nota2b = sc.nextDouble();
            
            vetor[i] = new Programa10(Nome, Nota1b, Nota2b);

        }
        
        System.out.println("Alunos Aprovados: ");
        for (int i = 0; i < n; i++){
            if (vetor[i].media(vetor[i].getNota1b(), vetor[i].getNota2b()) >= 6) {
                System.out.println(vetor[i].getNome());

            }
        }
 
    }
    
}
