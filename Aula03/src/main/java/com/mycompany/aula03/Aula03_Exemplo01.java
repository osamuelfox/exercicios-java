

package com.mycompany.aula03;

import java.util.Locale;
import java.util.Scanner;


public class Aula03_Exemplo01 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do vetor: ");
        int p = sc.nextInt();
        double[] vetor = new double[p];
        
        double soma = 0.0;
        
        for (int c = 0; c < p; c++){
            System.out.println("Altura: ");
            vetor[c] = sc.nextDouble();
            soma += vetor[c];
        }
       
        double media = soma / p;
        
        System.out.printf("A altura media e: %.2f%n", media);
                                         
    }
}
