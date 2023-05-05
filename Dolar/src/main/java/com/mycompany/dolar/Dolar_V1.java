package com.mycompany.dolar;

import java.util.Locale;
import java.util.Scanner;

public class Dolar_V1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);        
        Scanner sc = new Scanner(System.in);
       
        //Declaracao Variaveis
        double taxa = 6;
        
        //Leitura dos Valore
        System.out.println("Cotacao Dolar: ");
        double CotacaoDolar = sc.nextDouble();
        
        System.out.println("Digite o valor em dolar: ");
        double dolar = sc.nextDouble();
        
        
        //Calculo Conversao de Dolar p/ Real
        double ValorDolar = CotacaoDolar / dolar;
        
        double ValorReal = CotacaoDolar * dolar;
        
        double rendimento = ValorReal * taxa / 100;
        
        double rendimentoTotal = rendimento + ValorReal;
        
        
        //Apresentacao Resultado Final
        System.out.printf("Dolar US$: %.2f%n", dolar);
        
        System.out.printf("Reais R$: %.2f", rendimentoTotal);
    }
}

