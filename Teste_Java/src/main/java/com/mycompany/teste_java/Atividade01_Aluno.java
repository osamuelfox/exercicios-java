
package com.mycompany.teste_java;

import entidade.Aluno01;
import java.util.Locale;
import java.util.Scanner;


public class Atividade01_Aluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade do aluno: ");
        int idade = sc.nextInt();

        double[] notas = new double[10];
        
        System.out.print("Digite as notas do aluno (no máximo 10): ");
        
        System.out.println("Digite um numero negativo para encerre");
        for (int i = 0; i < notas.length; i++) {
            
            double nota = sc.nextDouble();
            
            if (nota >= 0) {
                notas[i] = nota;
            } else {
                break;
            }
        }

        int[][] matriz = new int[3][3];
        
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        Aluno01 aluno = new Aluno01(nome, idade, notas, matriz);
        System.out.println(aluno);
        System.out.println("Média das notas: " + aluno.calcularMedia());
        System.out.println("Quantidade de números pares na matriz: " + aluno.contarNumerosPares());
    }
}
