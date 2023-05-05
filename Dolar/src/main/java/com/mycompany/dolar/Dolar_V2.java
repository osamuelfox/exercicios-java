
package com.mycompany.dolar;

import java.util.Locale;

import Calculadora.Calculardora_V2;
import java.util.Scanner;

public class Dolar_V2 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        Calculardora_V2 x = new Calculardora_V2();

        System.out.println("Digite a coitacao do dolar: ");
        x.dolar = sc.nextDouble();
        
        System.out.println("Digite o valor  em reais: ");
        x.reais = sc.nextDouble();
        
        x.cotacaoDolar = x.reais/x.dolar;
        x.cotacaoReal = x.reais*x.dolar;
        
        x.rendimento = x.cotacaoReal * x.taxa/100;
        x.rendimentoTotal = x.rendimento + x.cotacaoReal;
        
        System.out.printf("O valor total e R$: %.2f%n", x.rendimentoTotal());
        
        sc.close();
    
    }
}
