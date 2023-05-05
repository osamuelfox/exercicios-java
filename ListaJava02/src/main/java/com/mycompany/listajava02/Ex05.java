
package com.mycompany.listajava02;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);     
        
        int codP1;
        int codP2;
        int qtdP1,qtdP2;
        double valP1, valP2;
        double Product1, Product2, valor;
        
        Scanner input = new Scanner(System.in);      
        
        System.out.println("Digite o codigo do primeiro produto: ");
        codP1 = input.nextInt();
     
        System.out.println("Digite a quantidade primeiro produto: ");
        qtdP1 = input.nextInt();
       
        System.out.println("Digite o valor do primeiro produto: ");
        valP1 = input.nextDouble();
   
        System.out.println("Digite o codigo do segundo produto: ");
        codP2 = input.nextInt();
   
        System.out.println("Digite a quantidade segundo produto: ");
        qtdP2 = input.nextInt();
 
        System.out.println("Digite o valor do segundo produto: ");
        valP2 = input.nextDouble();
  
        Product1 = (double) qtdP1*valP1;
        Product2 = (double) qtdP2*valP2;
        
        valor = Product1 + Product2;
        
        System.out.printf("Valor a Pagar: R$ %.2f %n", valor);
  
    }
    
}
