
package com.mycompany.exercicio_fixacao;

import entidade.Programa11;
import java.util.Locale;
import java.util.Scanner;


public class Ex_11 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas seram digitadas: ");
        int n = sc.nextInt();
        
        Programa11[] vetor = new Programa11[n];
        
        for(int i = 0; i < n; i++){
            System.out.println("Altura da " + (i+1) + "a pessoa: ");
            double Altura = sc.nextDouble();
            
            System.out.println("Genero da " + (i+1) + "a pessoa: ");
            char Genero = sc.next().charAt(0);
            
            vetor[i] = new Programa11(Altura, Genero);
        }
        
        double maior = vetor[0].getAltura();
        double menor = vetor[0].getAltura();

        for(int i = 0; i < n; i++){
            if (vetor[i].getAltura() > maior){
                maior = vetor[i].getAltura();
            }
            
            if (vetor[i].getAltura() < menor){
                menor = vetor[i].getAltura();
            }
        }

        System.out.println("Maior altura: " +  maior); 
        System.out.println("Menor altura: " +  menor); 
        
        double media;
        double soma = 0; 
        
        int homem = 0;
        for (int i = 0; i < n; i++){
            if (vetor[i].getGenero() == 'f'){
                soma += vetor[i].getAltura();

            } else {
                homem++;
            }
        }
        media = soma / (n - homem);        

        System.out.println("Media das alturas das mulheres :" + media);
    }
}
