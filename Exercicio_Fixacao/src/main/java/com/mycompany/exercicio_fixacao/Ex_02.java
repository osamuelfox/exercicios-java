
package com.mycompany.exercicio_fixacao;

import entidade.Programa02;
import java.util.Locale;
import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double soma = 0;
        
        System.out.println("Quantos numeros vc vai digitar: ");
        int n = sc.nextInt();
        
        Programa02[] vetor = new Programa02[n];
        
        for (int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            double num = sc.nextDouble();
            
            vetor[i] = new Programa02(num);        
        }
        
        System.out.print("VALORES: ");
        for (int i = 0; i < n; i++){
        System.out.print(" " + vetor[i].getnum());
        
        soma += vetor[i].getnum();
        
        }
        System.out.println("");
        System.out.println("SOMA: " + soma);
        
        double media = soma / n;
        
        System.out.println("MEDIA: " + media);
        
    }
    
}
