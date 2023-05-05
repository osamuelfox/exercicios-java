
package com.mycompany.exercicio_fixacao;

import java.util.Scanner;
import entidade.Programa01;


public class Ex_01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos numeros vc vai digitar: ");
        int n = sc.nextInt();
        
        Programa01[] vetor = new Programa01[n];
        
        for (int i = 0; i < n; i ++){
            System.out.println("Digite um numero: ");
            int num = sc.nextInt();
            vetor[i] = new Programa01(num);
        }
        
        System.out.println("");
        System.out.println("Valores Negativos: ");
        
        for (int i = 0; i < n; i ++){
            if (vetor[i].getNum() < 0){
                System.out.println(vetor[i].getNum());
            }
        }
    }
}

