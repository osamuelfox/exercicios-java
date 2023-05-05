package com.mycompany.dolar;

import Calculadora.Calculadora_V3;

import java.util.Scanner;
import java.util.Locale;

public class Dolar_V3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor em dolar: ");
        double precoDolar = sc.nextDouble();
        
        System.out.println("Digite quantos dolares deseja comprar: ");
        double quantidade = sc.nextDouble();
        
        double resultado = Calculadora_V3.dolarToReal(quantidade, precoDolar);
        
        System.out.printf("Voce ira pagar R$: %.2f%n", resultado);
        
        sc.close();
    }
}
