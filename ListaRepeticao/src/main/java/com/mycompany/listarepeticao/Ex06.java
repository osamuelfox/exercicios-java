package com.mycompany.listarepeticao;

import java.util.Scanner;
import java.util.Locale;

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de repeticoes: ");
        int qtdVezes = sc.nextInt();
        for(int i = 0; i < qtdVezes; i++){
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();
            double media = ((n1*2) + (n2*3) + (n3*5)) / 10;
            System.out.println(String.format("%.1f",media));
        }
    }
}
