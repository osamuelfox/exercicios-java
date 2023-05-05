
package com.mycompany.desafio;

import Cotacao.Cotacao;
import java.util.Scanner;


public class ExDolar {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Cotacao x = new Cotacao();
        
        System.out.println("Cotacao Dolar");
        x.Valor = teclado.nextDouble();
        
        System.out.println("Quantidade: ");
        x.Dolar = teclado.nextDouble();
        
        System.out.printf("Valor do Dolar em real: R$ %.2f ", x.DolarAtual());
   
    }
}
