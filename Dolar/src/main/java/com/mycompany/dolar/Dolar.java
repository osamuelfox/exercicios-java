

package com.mycompany.dolar;

import java.util.Scanner;


public class Dolar {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cotacao Dolar");
        double Valor = teclado.nextDouble();
        
        System.out.println("Quantidade: ");
        double Dolar = teclado.nextDouble();
        
        System.out.printf("Valor do Dolar em real: R$ %.2f ", cotacao());
    }
    
    
    public static double cotacao(double Valor,double Dolar){
        return Valor * Dolar;

    }
}

