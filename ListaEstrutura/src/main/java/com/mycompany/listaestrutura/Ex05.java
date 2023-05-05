/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaestrutura;

import java.util.Locale;
import java.util.Scanner;


public class Ex05 {
    public static void main(String[] args) {
        double  preco = 0, valor;
        int codigo,espec;
        
        Locale.setDefault(Locale.US);
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o codigo: ");
        codigo = teclado.nextInt();
        
        System.out.print("Digite a especificacao: ");
        espec = teclado.nextInt();
        
        switch(codigo) {
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
            }
        System.out.printf("TOTAL: R$ %.2f", preco * espec);
    }
    
}
