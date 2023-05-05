
package com.mycompany.exercicio_fixacao;

import entidade.Programa07;
import java.util.Locale;
import java.util.Scanner;


public class Ex_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        double soma = 0;
        double media = 0;
        
        System.out.println("Quantos elementos vai ter o vetor: ");
        int n = sc.nextInt();
        
        Programa07[] vetor = new Programa07[n];
        
        for (int i = 0; i < n; i++){
            
            System.out.println("Digite um numero: ");
            double Num = sc.nextDouble();
            
            vetor[i] = new Programa07(Num);
            soma = Programa07.soma(soma, vetor[i].getNum());
        }
        
        System.out.println("");
        System.out.println("Media do vetor: ");
        media = Programa07.media(soma, n);
        System.out.println(media);
        
        System.out.println("");
        System.out.println("Elementos abaixo da media: ");
        
        for (int i = 0; i < n; i++){
            if(vetor[i].getNum() < media){
                System.out.println(vetor[i].getNum());
            }
        }
        
        sc.close();
    }
}
